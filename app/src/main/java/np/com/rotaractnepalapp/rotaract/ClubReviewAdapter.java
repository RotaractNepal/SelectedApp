package np.com.rotaractnepalapp.rotaract;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ClubReviewAdapter extends ArrayAdapter<String> {

    String[] Name, FullName, Venue, MeetingTime, Address;
    int[] Logo;
    Context clubContext;

    public ClubReviewAdapter(@NonNull Context context, String[] clubShortName, int[] clubLogo, String[] clubFullName, String[] clubVenue, String[] clubMeetingTime, String[] clubAddress) {
        super(context, R.layout.club_intro_layout);
        this.Name = clubShortName;
        this.Logo = clubLogo;
        this.FullName = clubFullName;
        this.Venue = clubVenue;
        this.MeetingTime = clubMeetingTime;
        this.Address = clubAddress;
        this.clubContext = context;
    }

    @Override
    public int getCount() {
        return Name.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        clubViewHolder mViewHolder = new clubViewHolder();
        if (convertView == null){
            LayoutInflater clubInflater = (LayoutInflater) clubContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView =  clubInflater.inflate(R.layout.club_intro_layout, parent, false);
            mViewHolder.clubLogo = (ImageView) convertView.findViewById(R.id.clubLogo);
            mViewHolder.clubShortName = (TextView) convertView.findViewById(R.id.clubShortName);
            mViewHolder.clubFullName = (TextView) convertView.findViewById(R.id.clubName);
            mViewHolder.clubVenue = (TextView) convertView.findViewById(R.id.clubVenue);
            mViewHolder.clubMeetingTime = (TextView) convertView.findViewById(R.id.clubMeetingTime);
            mViewHolder.clubAddress = (TextView) convertView.findViewById(R.id.clubAddress);
            convertView.setTag(mViewHolder);
        }else{
            mViewHolder = (clubViewHolder)convertView.getTag();
        }
            mViewHolder.clubLogo.setImageResource(Logo[position]);
            mViewHolder.clubShortName.setText(Name[position]);
            mViewHolder.clubFullName.setText(FullName[position]);
            mViewHolder.clubVenue.setText(Venue[position]);
            mViewHolder.clubMeetingTime.setText(MeetingTime[position]);
            mViewHolder.clubAddress.setText(Address[position]);

        return convertView;
    }

    static class clubViewHolder{
        ImageView clubLogo;
        TextView clubShortName;
        TextView clubFullName;
        TextView clubVenue;
        TextView clubMeetingTime;
        TextView clubAddress;
    }
}
