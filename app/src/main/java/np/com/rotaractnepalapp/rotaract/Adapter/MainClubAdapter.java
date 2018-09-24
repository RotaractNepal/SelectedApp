package np.com.rotaractnepalapp.rotaract.Adapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Class.Club1Class;
import np.com.rotaractnepalapp.rotaract.Class.Club2Class;
import np.com.rotaractnepalapp.rotaract.Class.Club3Class;
import np.com.rotaractnepalapp.rotaract.Class.Club4Class;
import np.com.rotaractnepalapp.rotaract.Class.Club5Class;
import np.com.rotaractnepalapp.rotaract.R;

import static np.com.rotaractnepalapp.rotaract.Activity.ClubReview.getClub1Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubReview.getClub2Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubReview.getClub3Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubReview.getClub4Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubReview.getClub5Data;

public class MainClubAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Object> items;
    private final int club1 = 1;
    private final int club2 = 2;
    private final int club3 = 3;
    private final int club4 = 4;
    private final int club5 = 5;

    public MainClubAdapter(Context context, ArrayList<Object> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof Club1Class){
            return club1;
        }
        if (items.get(position) instanceof Club2Class){
            return club2;
        }
        if (items.get(position) instanceof Club3Class){
            return club3;
        }
        if (items.get(position) instanceof Club4Class){
            return club4;
        }
        if (items.get(position) instanceof Club5Class){
            return club5;
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
            case club1:
                view =  inflater.inflate(R.layout.club1, viewGroup, false);
                holder = new Club1ViewHolder(view);
                break;
            case club2:
                view = inflater.inflate(R.layout.club2, viewGroup, false);
                holder = new Club2ViewHolder(view);
                break;
            case club3:
                view = inflater.inflate(R.layout.club3, viewGroup, false);
                holder = new Club3ViewHolder(view);
                break;
            case club4:
                view = inflater.inflate(R.layout.club4, viewGroup, false);
                holder = new Club4ViewHolder(view);
                break;
            case club5:
                view = inflater.inflate(R.layout.club5, viewGroup, false);
                holder = new Club5ViewHolder(view);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder.getItemViewType() == club1)
            club1View((Club1ViewHolder) viewHolder);
        if (viewHolder.getItemViewType() == club2)
            club2View((Club2ViewHolder) viewHolder);
        if (viewHolder.getItemViewType() == club3)
            club3View((Club3ViewHolder) viewHolder);
        if (viewHolder.getItemViewType() == club4)
            club4View((Club4ViewHolder) viewHolder);
        if (viewHolder.getItemViewType() == club5)
            club5View((Club5ViewHolder) viewHolder);

    }

    private void club1View(Club1ViewHolder holder){
        Club1Adapter adapter1 = new Club1Adapter(getClub1Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter1);

    }

    private void club2View(Club2ViewHolder holder){
        Club2Adapter adapter2 = new Club2Adapter(getClub2Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter2);

    }

    private void club3View(Club3ViewHolder holder){
        Club3Adapter adapter3 = new Club3Adapter(getClub3Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter3);
    }

    private void club4View(Club4ViewHolder holder){
        Club4Adapter adapter4 = new Club4Adapter(getClub4Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter4);
    }

    private void club5View(Club5ViewHolder holder){
        Club5Adapter adapter5 = new Club5Adapter(getClub5Data());
        holder.recyclerView.setLayoutManager(new  LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter5);
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    private class Club1ViewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        public Club1ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.inner_recyclerView);
        }
    }

    private class Club2ViewHolder extends RecyclerView.ViewHolder {
        RecyclerView recyclerView;
        public Club2ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.inner_recyclerView);
        }
    }

    private class Club3ViewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        public Club3ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.inner_recyclerView);
        }
    }

    private class Club4ViewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        public Club4ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.inner_recyclerView);
        }
    }

    private class Club5ViewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;

        public Club5ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.inner_recyclerView);
        }
    }

}
