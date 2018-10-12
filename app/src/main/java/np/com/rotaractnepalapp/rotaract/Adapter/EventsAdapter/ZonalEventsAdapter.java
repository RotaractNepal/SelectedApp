package np.com.rotaractnepalapp.rotaract.Adapter.EventsAdapter;

import android.app.Dialog;
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

import np.com.rotaractnepalapp.rotaract.Class.ClassEvents.ZonalEventsClass;
import np.com.rotaractnepalapp.rotaract.R;

public class ZonalEventsAdapter extends RecyclerView.Adapter<ZonalEventsAdapter.EventsViewHolder> {

    ArrayList<ZonalEventsClass> data = new ArrayList<>();

    public ZonalEventsAdapter(ArrayList<ZonalEventsClass> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public EventsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.upcoming_event_adapter, viewGroup, false);
        return new EventsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventsViewHolder eventsViewHolder, int i) {
        eventsViewHolder.organizer.setText(data.get(i).getOrganizer());
        eventsViewHolder.event.setText(data.get(i).getEvent());
        eventsViewHolder.venue.setText(data.get(i).getVenue());
        eventsViewHolder.time.setText(data.get(i).getTime());
        eventsViewHolder.month.setText(data.get(i).getMonth());
        eventsViewHolder.day.setText(data.get(i).getDay());
        eventsViewHolder.year.setText(data.get(i).getYear());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class EventsViewHolder extends RecyclerView.ViewHolder {
        TextView organizer, event, venue, time, month, day, year;
        ImageView call, googlemap;
        public EventsViewHolder(@NonNull View itemView) {
            super(itemView);
            organizer = (TextView) itemView.findViewById(R.id.eventsClubName);
            event = (TextView) itemView.findViewById(R.id.eventsProjectName);
            venue = (TextView) itemView.findViewById(R.id.eventsVenue);
            time = (TextView) itemView.findViewById(R.id.eventsTime);
            month = (TextView) itemView.findViewById(R.id.eventsMonth);
            day = (TextView) itemView.findViewById(R.id.eventsDay);
            year = (TextView) itemView.findViewById(R.id.eventsYear);
            call = (ImageView) itemView.findViewById(R.id.eventCall);
            call.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    String contactNo = data.get(getAdapterPosition()).getCall();
                    intent.setData(Uri.parse("tel:" + contactNo));
                    v.getContext().startActivity(intent);
                }
            });

            googlemap = (ImageView) itemView.findViewById(R.id.eventsLocation);
            googlemap.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String uri = data.get(getAdapterPosition()).getGooglemap();
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
                        final ZonalEventsClass clickedDataItem = data.get(position);
                        final Dialog Information;
                        Information = new Dialog(v.getContext());

                        Information.setContentView(R.layout.intro_item_adapter_layout);

                        ImageView Image = (ImageView) Information.findViewById(R.id.dialogImage);
                        Image.setImageResource(R.mipmap.ic_drr_theme_2018_19);

                        TextView Title = (TextView) Information.findViewById(R.id.dialogTitle);
                        Title.setText(clickedDataItem.getEvent());

                        JustifiedTextView Introduction = (JustifiedTextView) Information.findViewById(R.id.dialogInformation);
                        Introduction.setText(clickedDataItem.getInformation());

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
