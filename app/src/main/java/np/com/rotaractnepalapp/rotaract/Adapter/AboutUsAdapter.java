package np.com.rotaractnepalapp.rotaract.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Class.AboutUsClass;
import np.com.rotaractnepalapp.rotaract.R;

public class AboutUsAdapter extends RecyclerView.Adapter<AboutUsAdapter.AboutUsViewHolder> {

    ArrayList<AboutUsClass> data = new ArrayList<>();

    public AboutUsAdapter(ArrayList<AboutUsClass> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public AboutUsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.about_us_adapter, viewGroup, false);
        return new AboutUsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AboutUsViewHolder aboutUsViewHolder, int i) {
        aboutUsViewHolder.name.setText(data.get(i).getName());
        aboutUsViewHolder.profession.setText(data.get(i).getProfession());
        aboutUsViewHolder.profile.setImageResource(data.get(i).getImages());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class AboutUsViewHolder extends RecyclerView.ViewHolder {
        ImageView profile;
        TextView name;
        TextView profession;
        public AboutUsViewHolder(@NonNull View itemView) {
            super(itemView);

            profile = (ImageView) itemView.findViewById(R.id.profile);
            name = (TextView) itemView.findViewById(R.id.aboutUsName);
            profession = (TextView) itemView.findViewById(R.id.aboutUsProfession);
        }
    }
}
