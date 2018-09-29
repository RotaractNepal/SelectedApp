package np.com.rotaractnepalapp.rotaract.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.R;

public class ClubAdapter extends RecyclerView.Adapter<ClubAdapter.ClubViewHolder> {

    private ArrayList<String> zoneCapitalLetter  = new ArrayList<>();
    private ArrayList<String> zoneFullName = new ArrayList<>();
    private Context mContext;

    public ClubAdapter(Context mContext, ArrayList<String> zoneCapitalLetter, ArrayList<String> zoneFullName) {
        this.zoneCapitalLetter = zoneCapitalLetter;
        this.zoneFullName = zoneFullName;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ClubViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.clubitemadapter, viewGroup, false);
        return new ClubViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClubViewHolder clubViewHolder, int i) {
        clubViewHolder.zoneCapitalLetter.setText(zoneCapitalLetter.get(i));
        clubViewHolder.zoneFullName.setText(zoneFullName.get(i));

    }

    @Override
    public int getItemCount() {
        return zoneFullName.size();
    }

    public class ClubViewHolder extends RecyclerView.ViewHolder {
        TextView zoneCapitalLetter;
        TextView zoneFullName;
        public ClubViewHolder(@NonNull View itemView) {
            super(itemView);
            zoneCapitalLetter = (TextView) itemView.findViewById(R.id.txtZoneCapitalNo);
            zoneFullName = (TextView) itemView.findViewById(R.id.txtZoneNoFullDisplay);
        }
    }
}
