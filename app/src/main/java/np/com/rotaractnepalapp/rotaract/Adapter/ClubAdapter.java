package np.com.rotaractnepalapp.rotaract.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubIReview;
import np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubVIReview;
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
    public void onBindViewHolder(@NonNull ClubViewHolder clubViewHolder, final int i) {
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

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    switch (getAdapterPosition()){
                        case 0:
                            Intent openClubIActivity = new Intent(mContext, ClubIReview.class);
                            mContext.startActivity(openClubIActivity);
                            break;
                        case 1:
                            Toast.makeText(mContext, "Zone II", Toast.LENGTH_LONG).show();
                            break;
                        case 2:
                            Toast.makeText(mContext, "Zone III", Toast.LENGTH_LONG).show();
                            break;
                        case 3:
                            Toast.makeText(mContext, "Zone IV", Toast.LENGTH_LONG).show();
                            break;
                        case 4:
                            Toast.makeText(mContext, "Zone V", Toast.LENGTH_LONG).show();
                            break;
                        case 5:
                            Intent openClubVIActivity = new Intent(mContext, ClubVIReview.class);
                            mContext.startActivity(openClubVIActivity);
                            break;
                        case 6:
                            Toast.makeText(mContext, "Zone VII", Toast.LENGTH_LONG).show();
                            break;
                        case 7:
                            Toast.makeText(mContext, "Zone VIII", Toast.LENGTH_LONG).show();
                            break;
                        case 8:
                            Toast.makeText(mContext, "Zone IX", Toast.LENGTH_LONG).show();
                            break;
                        case 9:
                            Toast.makeText(mContext, "Zone X", Toast.LENGTH_LONG).show();
                            break;
                        case 10:
                            Toast.makeText(mContext, "Zone XI", Toast.LENGTH_LONG).show();
                            break;
                        case 11:
                            Toast.makeText(mContext, "Zone XII", Toast.LENGTH_LONG).show();
                            break;
                        case 12:
                            Toast.makeText(mContext, "Zone XIII", Toast.LENGTH_LONG).show();
                            break;
                    }

                }
            });
        }
    }
}
