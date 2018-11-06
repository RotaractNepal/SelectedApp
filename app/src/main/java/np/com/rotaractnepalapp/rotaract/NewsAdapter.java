package np.com.rotaractnepalapp.rotaract;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import np.com.rotaractnepalapp.rotaract.Class.NewsClass;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    Context context;
    ArrayList<NewsClass> newsClasses;

    public NewsAdapter(Context context, ArrayList<NewsClass> newsClasses) {
        this.context = context;
        this.newsClasses = newsClasses;
    }

    @NonNull
    @Override
    public NewsAdapter.NewsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new NewsViewHolder(LayoutInflater.from(context).inflate(R.layout.news_adapter, viewGroup,false));
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.NewsViewHolder newsViewHolder, int i) {
        newsViewHolder.Beneficiaries.setText(newsClasses.get(i).getBeneficiaries());
        newsViewHolder.Date.setText(newsClasses.get(i).getDate());
        newsViewHolder.Location.setText(newsClasses.get(i).getLocation());
        newsViewHolder.Objective.setText(newsClasses.get(i).getObjective());
        newsViewHolder.Title.setText(newsClasses.get(i).getTitle());
        newsViewHolder.Type.setText(newsClasses.get(i).getType());
        newsViewHolder.ClubName.setText(newsClasses.get(i).getClubName());
        newsViewHolder.Description.setText(newsClasses.get(i).getDescription());
        Picasso.get().load(newsClasses.get(i).getImage()).into(newsViewHolder.Image);
        Picasso.get().load(newsClasses.get(i).getClub()).into(newsViewHolder.Club);
    }

    @Override
    public int getItemCount() {
        return newsClasses.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {
        TextView Beneficiaries, Date, Location, Objective, Title, Type, ClubName, Description;
        ImageView Image, Club;
        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            Beneficiaries = (TextView) itemView.findViewById(R.id.newsBeneficiaries);
            Date = (TextView) itemView.findViewById(R.id.newsDate);
            Location = (TextView) itemView.findViewById(R.id.newsLocation);
            Objective = (TextView) itemView.findViewById(R.id.newsObjectives);
            Title = (TextView) itemView.findViewById(R.id.newsTitle);
            Type = (TextView) itemView.findViewById(R.id.newsType);
            ClubName = (TextView) itemView.findViewById(R.id.newsClubName);
            Description = (TextView) itemView.findViewById(R.id.newsDescription);
            Image = (ImageView) itemView.findViewById(R.id.newsImage);
            Club = (ImageView) itemView.findViewById(R.id.newsClubLogo);
        }
    }
}
