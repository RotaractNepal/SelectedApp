package np.com.rotaractnepalapp.rotaract.Adapter.IntroductionAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Class.ClassIntroduction.Intro1Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassIntroduction.Intro2Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassIntroduction.Intro3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassIntroduction.Intro4Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassIntroduction.Intro5Class;
import np.com.rotaractnepalapp.rotaract.R;

import static np.com.rotaractnepalapp.rotaract.Activity.MainActivity.getIntro1Data;
import static np.com.rotaractnepalapp.rotaract.Activity.MainActivity.getIntro2Data;
import static np.com.rotaractnepalapp.rotaract.Activity.MainActivity.getIntro3Data;
import static np.com.rotaractnepalapp.rotaract.Activity.MainActivity.getIntro4Data;
import static np.com.rotaractnepalapp.rotaract.Activity.MainActivity.getIntro5Data;

public class MainIntroAdpater extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private ArrayList<Object> items;
    private final int intro1 = 1;
    private final int intro2 = 2;
    private final int intro3 = 3;
    private final int intro4 = 4;
    private final int intro5 = 5;

    public MainIntroAdpater(Context context, ArrayList<Object> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof Intro1Class){
            return intro1;
        }
        if (items.get(position) instanceof Intro2Class){
            return intro2;
        }
        if (items.get(position) instanceof Intro3Class){
            return intro3;
        }
        if (items.get(position) instanceof Intro4Class){
            return intro4;
        }
        if (items.get(position) instanceof Intro5Class){
            return intro5;
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
            case intro1:
                view =  inflater.inflate(R.layout.intro1, viewGroup, false);
                holder = new Club1ViewHolder(view);
                break;
            case intro2:
                view = inflater.inflate(R.layout.intro2, viewGroup, false);
                holder = new Club2ViewHolder(view);
                break;
            case intro3:
                view = inflater.inflate(R.layout.intro3, viewGroup, false);
                holder = new Club3ViewHolder(view);
                break;
            case intro4:
                view = inflater.inflate(R.layout.intro4, viewGroup, false);
                holder = new Club4ViewHolder(view);
                break;
            case intro5:
                view = inflater.inflate(R.layout.intro5, viewGroup, false);
                holder = new Club5ViewHolder(view);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder.getItemViewType() == intro1)
            club1View((Club1ViewHolder) viewHolder);
        if (viewHolder.getItemViewType() == intro2)
            club2View((Club2ViewHolder) viewHolder);
        if (viewHolder.getItemViewType() == intro3)
            club3View((Club3ViewHolder) viewHolder);
        if (viewHolder.getItemViewType() == intro4)
            club4View((Club4ViewHolder) viewHolder);
        if (viewHolder.getItemViewType() == intro5)
            club5View((Club5ViewHolder) viewHolder);
    }

    private void club1View(Club1ViewHolder holder){
        Intro1Adpater adapter1 = new Intro1Adpater(getIntro1Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter1);

    }

    private void club2View(Club2ViewHolder holder){
        Intro2Adpater adapter2 = new Intro2Adpater(getIntro2Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter2);

    }

    private void club3View(Club3ViewHolder holder){
        Intro3Adpater adapter3 = new Intro3Adpater(getIntro3Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter3);
    }

    private void club4View(Club4ViewHolder holder){
        Intro4Adpater adapter4 = new Intro4Adpater(getIntro4Data());
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.recyclerView.setAdapter(adapter4);
    }

    private void club5View(Club5ViewHolder holder){
        Intro5Adpater adapter5 = new Intro5Adpater(getIntro5Data());
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
