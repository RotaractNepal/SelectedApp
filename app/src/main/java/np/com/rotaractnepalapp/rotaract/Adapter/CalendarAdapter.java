package np.com.rotaractnepalapp.rotaract.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Class.CalendarClass;
import np.com.rotaractnepalapp.rotaract.R;

public class CalendarAdapter extends RecyclerView.Adapter<CalendarAdapter.CalendarViewHolder> {

    Context context;
    ArrayList<CalendarClass> calendarClasses;

    public CalendarAdapter(Context context, ArrayList<CalendarClass> calendarClasses) {
        this.context = context;
        this.calendarClasses = calendarClasses;
    }

    @NonNull
    @Override
    public CalendarViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new CalendarViewHolder(LayoutInflater.from(context).inflate(R.layout.calendar_item_adapter, viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull CalendarViewHolder calendarViewHolder, int i) {
        calendarViewHolder.Month.setText(calendarClasses.get(i).getMonth());
        calendarViewHolder.Day.setText(calendarClasses.get(i).getDay());
        calendarViewHolder.Event.setText(calendarClasses.get(i).getEvent());
        calendarViewHolder.Host.setText(calendarClasses.get(i).getHost());
        calendarViewHolder.Venue.setText(calendarClasses.get(i).getVenue());
        calendarViewHolder.Email.setText(calendarClasses.get(i).getEmail());

    }

    @Override
    public int getItemCount() {
        return calendarClasses.size();
    }

    public class CalendarViewHolder extends RecyclerView.ViewHolder {

        TextView Month, Day, Event, Host, Venue, Email;

        public CalendarViewHolder(@NonNull View itemView) {
            super(itemView);

            Month = (TextView) itemView.findViewById(R.id.calendarMonth);
            Day = (TextView) itemView.findViewById(R.id.calendarDay);
            Event = (TextView) itemView.findViewById(R.id.calendarEventName);
            Host = (TextView) itemView.findViewById(R.id.calendarEventHost);
            Venue = (TextView) itemView.findViewById(R.id.calendarEventVenue);
            Email = (TextView) itemView.findViewById(R.id.calendarEventEmail);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION){
                        final CalendarClass clickedDataItem = calendarClasses.get(position);

                        Intent intenEmail = null, chooserEmail = null;
                        intenEmail = new Intent(Intent.ACTION_SEND);
                        intenEmail.setData(Uri.parse("mailto:"));
                        String[] to = {clickedDataItem.getEmail()};
                        intenEmail.putExtra(Intent.EXTRA_EMAIL, to);
                        intenEmail.putExtra(Intent.EXTRA_SUBJECT, "Sent From Rotaract Nepal App");
                        intenEmail.putExtra(Intent.EXTRA_TEXT, "Dear Sir/Madam;");
                        intenEmail.setType("message/rfc822");
                        chooserEmail = intenEmail.createChooser(intenEmail,"Send Email");
                        v.getContext().startActivity(chooserEmail);
                    }
                }
            });
        }
    }
}
