package np.com.rotaractnepalapp.rotaract;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.codesgood.views.JustifiedTextView;
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
        newsViewHolder.Title.setText(newsClasses.get(i).getTitle());
        newsViewHolder.Type.setText(newsClasses.get(i).getType());
        newsViewHolder.ClubName.setText(newsClasses.get(i).getClubName());
        Picasso.get().load(newsClasses.get(i).getImage()).into(newsViewHolder.Image);
        Picasso.get().load(newsClasses.get(i).getClub()).into(newsViewHolder.Club);
    }

    @Override
    public int getItemCount() {
        return newsClasses.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {
        TextView Beneficiaries, Date, Location, Title, Type, ClubName;
        ImageView Image, Club;
        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            Beneficiaries = (TextView) itemView.findViewById(R.id.newsBeneficiaries);
            Date = (TextView) itemView.findViewById(R.id.newsDate);
            Location = (TextView) itemView.findViewById(R.id.newsLocation);
            Title = (TextView) itemView.findViewById(R.id.newsTitle);
            Type = (TextView) itemView.findViewById(R.id.newsType);
            ClubName = (TextView) itemView.findViewById(R.id.newsClubName);
            Image = (ImageView) itemView.findViewById(R.id.newsImage);
            Club = (ImageView) itemView.findViewById(R.id.newsClubLogo);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION){
                        final NewsClass clickedDataItem = newsClasses.get(position);
                        final Dialog ProjectDetail;
                        ProjectDetail = new Dialog(v.getContext());
                        ProjectDetail.setContentView(R.layout.news_detail_layout);

                        ImageView DImage = (ImageView) ProjectDetail.findViewById(R.id.dialogNewsDefaultImage);
                        Picasso.get().load(newsClasses.get(position).getDImage()).into(DImage);

                        TextView DialogTitle = (TextView) ProjectDetail.findViewById(R.id.dialogNewsTitle);
                        DialogTitle.setText(clickedDataItem.getTitle());

                        JustifiedTextView Detail = (JustifiedTextView) ProjectDetail.findViewById(R.id.dialogNewsDetails);
                        Detail.setText(clickedDataItem.getDescription());

                        TextView Objective = (TextView) ProjectDetail.findViewById(R.id.dialogNewsObjectives);
                        Objective.setText(clickedDataItem.getObjective());

                        TextView close = (TextView) ProjectDetail.findViewById(R.id.closeDialog);
                        close.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                ProjectDetail.dismiss();
                            }
                        });

                        ProjectDetail.setCanceledOnTouchOutside(false);
                        ProjectDetail.setCancelable(false);
                        ProjectDetail.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        ProjectDetail.show();

                    }
                }
            });
        }
    }
}
