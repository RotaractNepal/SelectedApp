package np.com.rotaractnepalapp.rotaract.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import np.com.rotaractnepalapp.rotaract.Class.Club1Class;
import np.com.rotaractnepalapp.rotaract.R;

public class Club1Adapter extends RecyclerView.Adapter<Club1Adapter.ClubViewHolder> {

    ArrayList<Club1Class> data = new ArrayList<>();

    public Club1Adapter(ArrayList<Club1Class> data){
        this.data = data;
    }

    @NonNull
    @Override
    public Club1Adapter.ClubViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemadapter, viewGroup, false);
        return new ClubViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Club1Adapter.ClubViewHolder clubViewHolder, int i) {
        clubViewHolder.title.setText(data.get(i).getTitle());
        clubViewHolder.images.setImageResource(data.get(i).getImages());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ClubViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        CircleImageView images;
        public ClubViewHolder(View view){
            super(view);
            title = (TextView) view.findViewById(R.id.nameTextView);
            images = (CircleImageView) view.findViewById(R.id.imageView);
        }
    }
}

