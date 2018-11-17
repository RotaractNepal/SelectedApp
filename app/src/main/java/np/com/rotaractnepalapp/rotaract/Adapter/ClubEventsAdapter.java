package np.com.rotaractnepalapp.rotaract.Adapter;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Class.ClassEvents.ClubEventsClass;
import np.com.rotaractnepalapp.rotaract.R;

public class ClubEventsAdapter extends RecyclerView.Adapter<ClubEventsAdapter.ClubEventsViewHolder> {

    Context context;
    ArrayList<ClubEventsClass> clubEventsClasses;

    public ClubEventsAdapter(Context context, ArrayList<ClubEventsClass> clubEventsClasses) {
        this.context = context;
        this.clubEventsClasses = clubEventsClasses;
    }

    @NonNull
    @Override
    public ClubEventsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new ClubEventsViewHolder(LayoutInflater.from(context).inflate(R.layout.upcoming_event_adapter, viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ClubEventsViewHolder clubEventsViewHolder, int i) {
        clubEventsViewHolder.month.setText(clubEventsClasses.get(i).getMonth());
        clubEventsViewHolder.day.setText(clubEventsClasses.get(i).getDay());
        clubEventsViewHolder.year.setText(clubEventsClasses.get(i).getYear());
        clubEventsViewHolder.organizer.setText(clubEventsClasses.get(i).getOrganizer());
        clubEventsViewHolder.event.setText(clubEventsClasses.get(i).getEvent());
        clubEventsViewHolder.venue.setText(clubEventsClasses.get(i).getVenue());
        clubEventsViewHolder.time.setText(clubEventsClasses.get(i).getTime());
    }

    @Override
    public int getItemCount() {
        return clubEventsClasses.size();
    }

    public class ClubEventsViewHolder extends RecyclerView.ViewHolder {

        TextView month, day, year, organizer, event, venue, time;
        ImageView call, googlemap;

        public ClubEventsViewHolder(@NonNull View itemView) {
            super(itemView);
            month = (TextView) itemView.findViewById(R.id.eventsMonth);
            day = (TextView) itemView.findViewById(R.id.eventsDay);
            year = (TextView) itemView.findViewById(R.id.eventsYear);
            organizer = (TextView) itemView.findViewById(R.id.eventsClubName);
            event = (TextView) itemView.findViewById(R.id.eventsProjectName);
            venue = (TextView) itemView.findViewById(R.id.eventsVenue);
            time = (TextView) itemView.findViewById(R.id.eventsTime);
            call = (ImageView) itemView.findViewById(R.id.eventCall);

            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    String contactNo = clubEventsClasses.get(getAdapterPosition()).getCall();
                    intent.setData(Uri.parse("tel:" + contactNo));
                    v.getContext().startActivity(intent);
                }
            });
            googlemap = (ImageView) itemView.findViewById(R.id.eventsLocation);
            googlemap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = clubEventsClasses.get(getAdapterPosition()).getGooglemap();
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                    intent.setPackage("com.google.android.apps.maps");
                    v.getContext().startActivity(intent);
                }
            });

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION){
                        final ClubEventsClass clickedDataItem = clubEventsClasses.get(position);
                        final Dialog Information;
                        Information = new Dialog(v.getContext());

                        Information.setContentView(R.layout.event_information);

                        TextView DialogTitle = (TextView) Information.findViewById(R.id.dialogNewsTitle);
                        DialogTitle.setText(clickedDataItem.getEvent());

                        JustifiedTextView Detail = (JustifiedTextView) Information.findViewById(R.id.dialogEventsDetails);
                        Detail.setText(clickedDataItem.getEventdetail());

                        TextView Highlights = (TextView) Information.findViewById(R.id.dialogEventsHighlights);
                        Highlights.setText(clickedDataItem.getEventhighlights());

                        TextView close = (TextView) Information.findViewById(R.id.closeDialog);
                        close.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Information.dismiss();
                            }
                        });


                        Information.setCanceledOnTouchOutside(false);
                        Information.setCancelable(false);
                        Information.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        Information.show();

                    }
                }
            });
        }
    }
}
