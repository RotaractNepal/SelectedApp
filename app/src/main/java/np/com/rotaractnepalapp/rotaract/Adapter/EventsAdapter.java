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

import np.com.rotaractnepalapp.rotaract.ClubEvents;
import np.com.rotaractnepalapp.rotaract.R;


public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.EventsViewHolder> {

    private ArrayList<String> CapitalLetter  = new ArrayList<>();
    private ArrayList<String> FullName = new ArrayList<>();
    private Context mContext;

    public EventsAdapter(Context mContext, ArrayList<String> capitalLetter, ArrayList<String> fullName) {
        CapitalLetter = capitalLetter;
        FullName = fullName;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public EventsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.clubitemadapter, viewGroup, false);
        return new EventsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EventsViewHolder eventsViewHolder, int i) {
        eventsViewHolder.CapitalLetter.setText(CapitalLetter.get(i));
        eventsViewHolder.FullName.setText(FullName.get(i));
    }

    @Override
    public int getItemCount() {
        return FullName.size();
    }

    public class EventsViewHolder extends RecyclerView.ViewHolder {

        TextView CapitalLetter;
        TextView FullName;

        public EventsViewHolder(@NonNull View itemView) {
            super(itemView);
            CapitalLetter = (TextView) itemView.findViewById(R.id.txtZoneCapitalNo);
            FullName = (TextView) itemView.findViewById(R.id.txtZoneNoFullDisplay);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    switch (getAdapterPosition()){
                        case 0:
                            Intent openClubEventActivity = new Intent(mContext, ClubEvents.class);
                            mContext.startActivity(openClubEventActivity);
                            break;
                        case 1:
                            Toast.makeText(mContext, "District Events Clicked", Toast.LENGTH_SHORT).show();
                            break;
                        case 2:
                            Toast.makeText(mContext, "Zonal Events Clicked", Toast.LENGTH_SHORT).show();
                            break;
                    }

                }
            });
        }
    }
}
