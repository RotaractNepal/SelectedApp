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
import np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubIVReview;
import np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubIXReview;
import np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubVIIIReview;
import np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubVIIReview;
import np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubVIReview;
import np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubIIIReview;
import np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubIIReview;
import np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubVReview;
import np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubXIIIReview;
import np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubXIIReview;
import np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubXIReview;
import np.com.rotaractnepalapp.rotaract.Activity.ClubActivity.ClubXReview;
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
                            Intent openClubIIActivity = new Intent(mContext, ClubIIReview.class);
                            mContext.startActivity(openClubIIActivity);
                            break;
                        case 2:
                            Intent openClubIIIActivity = new Intent(mContext, ClubIIIReview.class);
                            mContext.startActivity(openClubIIIActivity);
                            break;
                        case 3:
                            Intent openClubIVActivity = new Intent(mContext, ClubIVReview.class);
                            mContext.startActivity(openClubIVActivity);
                            break;
                        case 4:
                            Intent openClubVActivity = new Intent(mContext, ClubVReview.class);
                            mContext.startActivity(openClubVActivity);
                            break;
                        case 5:
                            Intent openClubVIActivity = new Intent(mContext, ClubVIReview.class);
                            mContext.startActivity(openClubVIActivity);
                            break;
                        case 6:
                            Intent openClubVIIActivity = new Intent(mContext, ClubVIIReview.class);
                            mContext.startActivity(openClubVIIActivity);
                            break;
                        case 7:
                            Intent openClubVIIIActivity = new Intent(mContext, ClubVIIIReview.class);
                            mContext.startActivity(openClubVIIIActivity);
                            break;
                        case 8:
                            Intent openClubIXActivity = new Intent(mContext, ClubIXReview.class);
                            mContext.startActivity(openClubIXActivity);
                            break;
                        case 9:
                            Intent openClubXActivity = new Intent(mContext, ClubXReview.class);
                            mContext.startActivity(openClubXActivity);
                            break;
                        case 10:
                            Intent openClubXIActivity = new Intent(mContext, ClubXIReview.class);
                            mContext.startActivity(openClubXIActivity);
                            break;
                        case 11:
                            Intent openClubXIIActivity = new Intent(mContext, ClubXIIReview.class);
                            mContext.startActivity(openClubXIIActivity);
                            break;
                        case 12:
                            Intent openClubXIIIActivity = new Intent(mContext, ClubXIIIReview.class);
                            mContext.startActivity(openClubXIIIActivity);
                            break;
                    }

                }
            });
        }
    }
}
