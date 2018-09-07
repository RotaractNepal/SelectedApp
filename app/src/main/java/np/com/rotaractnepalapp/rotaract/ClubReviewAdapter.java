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
    int[] Logo, President, IPP, VicePre, Secetary, Treasurer, ClubSer, IntSer, ProDev, CommSer, AssDir, Sergeant, FundChair, PubRel, ITOfficer;
    Context clubContext;

    public ClubReviewAdapter(@NonNull Context context, String[] clubShortName, int[] clubLogo,
                             String[] clubFullName, String[] clubVenue, String[] clubMeetingTime,
                             String[] clubAddress, int[]  clubPresident, int[] clubIPP, int[] clubVicePre, int[] clubSecetary, int[] clubTreasurer,
                             int[] clubClubSer, int[] clubIntSer, int[] clubCommSer, int[] clubProDev, int[] clubAssDir, int[] clubSergeant, int[] clubFundChair,
                             int[] clubPubRel, int[] clubITOfficer) {
        super(context, R.layout.club_intro_layout);
        this.Name = clubShortName;
        this.Logo = clubLogo;
        this.FullName = clubFullName;
        this.Venue = clubVenue;
        this.MeetingTime = clubMeetingTime;
        this.Address = clubAddress;
        this.President = clubPresident;
        this.IPP = clubIPP;
        this.VicePre = clubVicePre;
        this.Secetary = clubSecetary;
        this.Treasurer = clubTreasurer;
        this.ClubSer = clubClubSer;
        this.IntSer = clubIntSer;
        this.ProDev = clubProDev;
        this.CommSer = clubCommSer;
        this.AssDir = clubAssDir;
        this.Sergeant = clubSergeant;
        this.FundChair = clubFundChair;
        this.PubRel = clubPubRel;
        this.ITOfficer = clubITOfficer;
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

            mViewHolder.clubPresident = (ImageView) convertView.findViewById(R.id.clubPresident);
            mViewHolder.clubIPP = (ImageView) convertView.findViewById(R.id.clubIPP);
            mViewHolder.clubVicePresident = (ImageView) convertView.findViewById(R.id.clubVicePresident);
            mViewHolder.clubSecretary = (ImageView) convertView.findViewById(R.id.clubSecretary);
            mViewHolder.clubTreasurer = (ImageView) convertView.findViewById(R.id.clubTreasurer);
            mViewHolder.clubClubService = (ImageView) convertView.findViewById(R.id.clubClubService);
            mViewHolder.clubInternationalService = (ImageView) convertView.findViewById(R.id.clubInternationalService);
            mViewHolder.clubCommunityService = (ImageView) convertView.findViewById(R.id.clubCommunityService);
            mViewHolder.clubProfesssionalDeveloper = (ImageView) convertView.findViewById(R.id.clubProfessionalDeveloper);
            mViewHolder.clubAssistantDirector = (ImageView) convertView.findViewById(R.id.clubAssistantDirector);
            mViewHolder.clubSergeant = (ImageView) convertView.findViewById(R.id.clubSergeant);
            mViewHolder.clubFundraisingChair = (ImageView) convertView.findViewById(R.id.clubFundraisingChair);
            mViewHolder.clubPublicRelationsOfficer = (ImageView) convertView.findViewById(R.id.clubPublicRelationsOfficer);
            mViewHolder.clubITOfficer = (ImageView) convertView.findViewById(R.id.clubITOfficer);

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

            mViewHolder.clubPresident.setImageResource(President[position]);
            mViewHolder.clubIPP.setImageResource(IPP[position]);
            mViewHolder.clubVicePresident.setImageResource(VicePre[position]);
            mViewHolder.clubSecretary.setImageResource(Secetary[position]);
            mViewHolder.clubTreasurer.setImageResource(Treasurer[position]);
            mViewHolder.clubClubService.setImageResource(ClubSer[position]);
            mViewHolder.clubInternationalService.setImageResource(IntSer[position]);
            mViewHolder.clubCommunityService.setImageResource(CommSer[position]);
            mViewHolder.clubProfesssionalDeveloper.setImageResource(ProDev[position]);
            mViewHolder.clubAssistantDirector.setImageResource(AssDir[position]);
            mViewHolder.clubSergeant.setImageResource(Sergeant[position]);
            mViewHolder.clubFundraisingChair.setImageResource(FundChair[position]);
            mViewHolder.clubPublicRelationsOfficer.setImageResource(PubRel[position]);
            mViewHolder.clubITOfficer.setImageResource(ITOfficer[position]);

        return convertView;
    }

    static class clubViewHolder{
        ImageView clubLogo;
        TextView clubShortName;
        TextView clubFullName;
        TextView clubVenue;
        TextView clubMeetingTime;
        TextView clubAddress;
        ImageView clubPresident;
        ImageView clubIPP;
        ImageView clubVicePresident;
        ImageView clubSecretary;
        ImageView clubTreasurer;
        ImageView clubClubService;
        ImageView clubInternationalService;
        ImageView clubCommunityService;
        ImageView clubProfesssionalDeveloper;
        ImageView clubAssistantDirector;
        ImageView clubSergeant;
        ImageView clubFundraisingChair;
        ImageView clubPublicRelationsOfficer;
        ImageView clubITOfficer;

    }
}
