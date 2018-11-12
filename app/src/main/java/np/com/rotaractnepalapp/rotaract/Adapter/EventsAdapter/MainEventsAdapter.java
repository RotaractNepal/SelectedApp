package np.com.rotaractnepalapp.rotaract.Adapter.EventsAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Class.ClassEvents.ClubEventsClass;
import np.com.rotaractnepalapp.rotaract.Class.ClassEvents.DistrictEventsClass;
import np.com.rotaractnepalapp.rotaract.Class.ClassEvents.ZonalEventsClass;
import np.com.rotaractnepalapp.rotaract.R;

import static np.com.rotaractnepalapp.rotaract.Activity.Events.getClubEventData;
import static np.com.rotaractnepalapp.rotaract.Activity.Events.getDistrictEventData;
import static np.com.rotaractnepalapp.rotaract.Activity.Events.getZonalEventData;

public class MainEventsAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Object> items;
    private final int district = 1;
    private final int zonal = 2;
    private final int club = 3;

    public MainEventsAdapter(Context context, ArrayList<Object> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof DistrictEventsClass){
            return district;
        }
        if (items.get(position) instanceof ZonalEventsClass){
            return zonal;
        }
        if (items.get(position) instanceof ClubEventsClass){
            return club;
        }
        return -1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view;
        RecyclerView.ViewHolder holder = null;
        switch (i){
            case district:
                view = inflater.inflate(R.layout.district_events, viewGroup, false);
                holder = new DistrictEventViewHolder(view);
                break;
            case zonal:
                view = inflater.inflate(R.layout.zonal_events, viewGroup, false);
                holder = new ZonalEventViewHolder(view);
                break;
            case club:
                view = inflater.inflate(R.layout.club_events, viewGroup, false);
                holder = new ClubEventViewHolder(view);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder.getItemViewType() == district)
            districtView((DistrictEventViewHolder) viewHolder);
        if (viewHolder.getItemViewType() == zonal)
            zonalView((ZonalEventViewHolder) viewHolder);
        if (viewHolder.getItemViewType() == club)
            clubView((ClubEventViewHolder) viewHolder);
    }

    private void districtView(DistrictEventViewHolder holder){
        DistrictEventsAdapter districtEventsAdapter = new DistrictEventsAdapter(getDistrictEventData());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(districtEventsAdapter);
    }

    private void zonalView(ZonalEventViewHolder holder){
        ZonalEventsAdapter zonalEventsAdapter = new ZonalEventsAdapter(getZonalEventData());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(zonalEventsAdapter);
    }

    private void clubView(ClubEventViewHolder holder){
        ClubEventsAdapter clubEventsAdapter = new ClubEventsAdapter(getClubEventData());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
        linearLayoutManager.setReverseLayout(true);
        linearLayoutManager.setStackFromEnd(true);
        holder.recyclerView.setLayoutManager(linearLayoutManager);
        holder.recyclerView.setAdapter(clubEventsAdapter);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    private class DistrictEventViewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        public DistrictEventViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.inner_recyclerView);
        }
    }

    private class ZonalEventViewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        public ZonalEventViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.inner_recyclerView);
        }
    }

    private class ClubEventViewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        public ClubEventViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.inner_recyclerView);
            recyclerView.setHasFixedSize(true);
        }
    }
}
