package np.com.rotaractnepalapp.rotaract.Adapter.ClubVIAdapter;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI10Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI11Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI12Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI13Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI1Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI2Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI4Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI5Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI6Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI7Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI8Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI9Class;
import np.com.rotaractnepalapp.rotaract.R;

import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubVIReview.getClub10Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubVIReview.getClub11Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubVIReview.getClub12Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubVIReview.getClub13Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubVIReview.getClub1Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubVIReview.getClub2Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubVIReview.getClub3Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubVIReview.getClub4Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubVIReview.getClub5Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubVIReview.getClub6Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubVIReview.getClub7Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubVIReview.getClub8Data;
import static np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubVIReview.getClub9Data;

public class MainClubVIAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

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
    private final int club11 = 11;
    private final int club12 = 12;
    private final int club13 = 13;

    public MainClubVIAdapter(Context context, ArrayList<Object> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof ClubVI1Class){
            return club1;
        }
        if (items.get(position) instanceof ClubVI2Class){
            return club2;
        }
        if (items.get(position) instanceof ClubVI3Class){
            return club3;
        }
        if (items.get(position) instanceof ClubVI4Class){
            return club4;
        }
        if (items.get(position) instanceof ClubVI5Class){
            return club5;
        }
        if (items.get(position) instanceof ClubVI6Class){
            return club6;
        }
        if (items.get(position) instanceof ClubVI7Class){
            return club7;
        }
        if (items.get(position) instanceof ClubVI8Class){
            return club8;
        }
        if (items.get(position) instanceof ClubVI9Class){
            return club9;
        }
        if (items.get(position) instanceof ClubVI10Class){
            return club10;
        }
        if (items.get(position) instanceof ClubVI11Class){
            return club11;
        }
        if (items.get(position) instanceof ClubVI12Class){
            return club12;
        }
        if (items.get(position) instanceof ClubVI13Class){
            return club13;
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
            case club6:
                view = inflater.inflate(R.layout.club6, viewGroup, false);
                holder = new Club6ViewHolder(view);
                break;
            case club7:
                view = inflater.inflate(R.layout.club7, viewGroup, false);
                holder = new Club7ViewHolder(view);
                break;
            case club8:
                view = inflater.inflate(R.layout.club8, viewGroup, false);
                holder = new Club8ViewHolder(view);
                break;
            case club9:
                view = inflater.inflate(R.layout.club9, viewGroup, false);
                holder = new Club9ViewHolder(view);
                break;
            case club10:
                view = inflater.inflate(R.layout.club10, viewGroup, false);
                holder = new Club10ViewHolder(view);
                break;
            case club11:
                view = inflater.inflate(R.layout.club11, viewGroup, false);
                holder = new Club11ViewHolder(view);
                break;
            case club12:
                view = inflater.inflate(R.layout.club12, viewGroup, false);
                holder = new Club12ViewHolder(view);
                break;
            case club13:
                view = inflater.inflate(R.layout.club13, viewGroup, false);
                holder = new Club13ViewHolder(view);
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
        if (viewHolder.getItemViewType() == club11)
            club11View((Club11ViewHolder) viewHolder);
        if (viewHolder.getItemViewType() == club12)
            club12View((Club12ViewHolder) viewHolder);
        if (viewHolder.getItemViewType() == club13)
            club13View((Club13ViewHolder) viewHolder);

    }

    private void club1View(Club1ViewHolder holder){
        ClubVI1Adapter adapter1 = new ClubVI1Adapter(getClub1Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter1);

    }

    private void club2View(Club2ViewHolder holder){
        ClubVI2Adapter adapter2 = new ClubVI2Adapter(getClub2Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter2);

    }

    private void club3View(Club3ViewHolder holder){
        ClubVI3Adapter adapter3 = new ClubVI3Adapter(getClub3Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter3);
    }

    private void club4View(Club4ViewHolder holder){
        ClubVI4Adapter adapter4 = new ClubVI4Adapter(getClub4Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter4);
    }

    private void club5View(Club5ViewHolder holder){
        ClubVI5Adapter adapter5 = new ClubVI5Adapter(getClub5Data());
        holder.recyclerView.setLayoutManager(new  LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter5);
    }

    private void club6View(Club6ViewHolder holder){
        ClubVI6Adapter adapter6 = new ClubVI6Adapter(getClub6Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter6);
    }

    private void club7View(Club7ViewHolder holder){
        ClubVI7Adapter adapter7 = new ClubVI7Adapter(getClub7Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter7);
    }

    private void club8View(Club8ViewHolder holder){
        ClubVI8Adapter adapter8 = new ClubVI8Adapter(getClub8Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter8);
    }

    private void club9View(Club9ViewHolder holder){
        ClubVI9Adapter adapter9 = new ClubVI9Adapter(getClub9Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter9);
    }

    private void club10View(Club10ViewHolder holder){
        ClubVI10Adapter adapter10 = new ClubVI10Adapter(getClub10Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter10);
    }

    private void club11View(Club11ViewHolder holder){
        ClubVI11Adapter adapter11 = new ClubVI11Adapter(getClub11Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter11);
    }

    private void club12View(Club12ViewHolder holder){
        ClubVI12Adapter adapter12 = new ClubVI12Adapter(getClub12Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter12);
    }

    private void club13View(Club13ViewHolder holder){
        ClubVI13Adapter adapter13 = new ClubVI13Adapter(getClub13Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter13);
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

    private class Club11ViewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        public Club11ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.inner_recyclerView);
        }
    }

    private class Club12ViewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        public Club12ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.inner_recyclerView);
        }
    }

    private class Club13ViewHolder extends RecyclerView.ViewHolder{
        RecyclerView recyclerView;
        public Club13ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = (RecyclerView) itemView.findViewById(R.id.inner_recyclerView);
        }
    }

}
