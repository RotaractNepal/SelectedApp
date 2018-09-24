package np.com.rotaractnepalapp.rotaract.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Class.Club4Class;
import np.com.rotaractnepalapp.rotaract.R;

public class Club4Adapter extends RecyclerView.Adapter<Club4Adapter.ClubViewHolder>{

    ArrayList<Club4Class> data = new ArrayList<>();

    public Club4Adapter(ArrayList<Club4Class> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ClubViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemadapter, viewGroup, false);
        return new ClubViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClubViewHolder clubViewHolder, int i) {
        clubViewHolder.title.setText(data.get(i).getTitle());
        clubViewHolder.images.setImageResource(data.get(i).getImages());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ClubViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView images;
        public ClubViewHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.nameTextView);
            images = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}
