package np.com.rotaractnepalapp.rotaract.Adapter.ClubXAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Class.ClassClubIX.ClubIX3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX10Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX1Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX2Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX4Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX5Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX6Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX7Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX8Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX9Class;
import np.com.rotaractnepalapp.rotaract.R;

import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubXReview.getClub10Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubXReview.getClub1Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubXReview.getClub2Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubXReview.getClub3Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubXReview.getClub4Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubXReview.getClub5Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubXReview.getClub6Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubXReview.getClub7Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubXReview.getClub8Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubXReview.getClub9Data;

public class MainClubXAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Object> items;
    private final int club1 = 1;
    private final int club2 = 2;
    private final int club3 = 3;
    private final int club4 = 4;
    private final int club5 = 5;
    private final int club6 = 6;
    private final int club7 = 7;
    private final int club8 = 8;
    private final int club9 = 9;
    private final int club10 = 10;

    public MainClubXAdapter(Context context, ArrayList<Object> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof ClubX1Class){
            return club1;
        }
        if (items.get(position) instanceof ClubX2Class){
            return club2;
        }
        if (items.get(position) instanceof ClubX3Class){
            return club3;
        }
        if (items.get(position) instanceof ClubX4Class){
            return club4;
        }
        if (items.get(position) instanceof ClubX5Class){
            return club5;
        }
        if (items.get(position) instanceof ClubX6Class){
            return club6;
        }
        if (items.get(position) instanceof ClubX7Class){
            return club7;
        }
        if (items.get(position) instanceof ClubX8Class){
            return club8;
        }
        if (items.get(position) instanceof ClubX9Class){
            return club9;
        }
        if (items.get(position) instanceof ClubX10Class){
            return club10;
        }
        return -1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view;
        TextView club1Name, club2Name, club3Name, club4Name, club5Name, club6Name, club7Name, club8Name, club9Name, club10Name, club11Name, club12Name;
        RecyclerView.ViewHolder holder = null;
        switch (i){
            case club1:
                view =  inflater.inflate(R.layout.club1, viewGroup, false);
                holder = new Club1ViewHolder(view);
                club1Name = (TextView) view.findViewById(R.id.club1Name);
                club1Name.setText("RAC Banepa");
                break;
            case club2:
                view = inflater.inflate(R.layout.club2, viewGroup, false);
                holder = new Club2ViewHolder(view);
                club2Name = (TextView) view.findViewById(R.id.club2Name);
                club2Name.setText("RAC Bhadgaon");
                break;
            case club3:
                view = inflater.inflate(R.layout.club3, viewGroup, false);
                holder = new Club3ViewHolder(view);
                club3Name = (TextView) view.findViewById(R.id.club3Name);
                club3Name.setText("RAC Bhaktapur");
                break;
            case club4:
                view = inflater.inflate(R.layout.club4, viewGroup, false);
                holder = new Club4ViewHolder(view);
                club4Name = (TextView) view.findViewById(R.id.club4Name);
                club4Name.setText("RAC Budol");
                break;
            case club5:
                view = inflater.inflate(R.layout.club5, viewGroup, false);
                holder = new Club5ViewHolder(view);
                club5Name = (TextView) view.findViewById(R.id.club5Name);
                club5Name.setText("RAC Dhulikhel");
                break;
            case club6:
                view = inflater.inflate(R.layout.club6, viewGroup, false);
                holder = new Club6ViewHolder(view);
                club6Name = (TextView) view.findViewById(R.id.club6Name);
                club6Name.setText("RAC Kathmandu University");
                break;
            case club7:
                view = inflater.inflate(R.layout.club7, viewGroup, false);
                holder = new Club7ViewHolder(view);
                club7Name = (TextView) view.findViewById(R.id.club7Name);
                club7Name.setText("RAC Kathmandu University Medical School");
                break;
            case club8:
                view = inflater.inflate(R.layout.club8, viewGroup, false);
                holder = new Club8ViewHolder(view);
                club8Name = (TextView) view.findViewById(R.id.club8Name);
                club8Name.setText("RAC Madhyapur");
                break;
            case club9:
                view = inflater.inflate(R.layout.club9, viewGroup, false);
                holder = new Club9ViewHolder(view);
                club9Name = (TextView) view.findViewById(R.id.club9Name);
                club9Name.setText("RAC Panauti");
                break;
            case club10:
                view = inflater.inflate(R.layout.club10, viewGroup, false);
                holder = new Club10ViewHolder(view);
                club10Name = (TextView) view.findViewById(R.id.club10Name);
                club10Name.setText("RAC Phulbari");
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
        if (viewHolder.getItemViewType() == club6)
            club6View((Club6ViewHolder) viewHolder);
        if (viewHolder.getItemViewType() == club7)
            club7View((Club7ViewHolder) viewHolder);
        if (viewHolder.getItemViewType() == club8)
            club8View((Club8ViewHolder) viewHolder);
        if (viewHolder.getItemViewType() == club9)
            club9View((Club9ViewHolder) viewHolder);
        if (viewHolder.getItemViewType() == club10)
            club10View((Club10ViewHolder) viewHolder);
    }

    private void club1View(Club1ViewHolder holder){
        ClubX1Adapter adapter1 = new ClubX1Adapter(getClub1Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter1);

    }

    private void club2View(Club2ViewHolder holder){
        ClubX2Adapter adapter2 = new ClubX2Adapter(getClub2Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter2);

    }

    private void club3View(Club3ViewHolder holder){
        ClubX3Adapter adapter3 = new ClubX3Adapter(getClub3Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter3);
    }

    private void club4View(Club4ViewHolder holder){
        ClubX4Adapter adapter4 = new ClubX4Adapter(getClub4Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter4);
    }

    private void club5View(Club5ViewHolder holder){
        ClubX5Adapter adapter5 = new ClubX5Adapter(getClub5Data());
        holder.recyclerView.setLayoutManager(new  LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter5);
    }

    private void club6View(Club6ViewHolder holder){
        ClubX6Adapter adapter6 = new ClubX6Adapter(getClub6Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter6);
    }

    private void club7View(Club7ViewHolder holder){
        ClubX7Adapter adapter7 = new ClubX7Adapter(getClub7Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter7);
    }

    private void club8View(Club8ViewHolder holder){
        ClubX8Adapter adapter8 = new ClubX8Adapter(getClub8Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter8);
    }

    private void club9View(Club9ViewHolder holder){
        ClubX9Adapter adapter9 = new ClubX9Adapter(getClub9Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter9);
    }

    private void club10View(Club10ViewHolder holder){
        ClubX10Adapter adapter10 = new ClubX10Adapter(getClub10Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter10);
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

    private class Club6ViewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        public Club6ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.inner_recyclerView);
        }
    }

    private class Club7ViewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        public Club7ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.inner_recyclerView);
        }
    }

    private class Club8ViewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        public Club8ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.inner_recyclerView);
        }
    }

    private class Club9ViewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        public Club9ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.inner_recyclerView);
        }
    }

    private class Club10ViewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        public Club10ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.inner_recyclerView);
        }
    }
}
