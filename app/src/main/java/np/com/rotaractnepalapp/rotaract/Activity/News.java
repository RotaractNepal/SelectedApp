package np.com.rotaractnepalapp.rotaract.Activity;


import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;
import np.com.rotaractnepalapp.rotaract.Class.NewsClass;
import np.com.rotaractnepalapp.rotaract.R;

public class News extends AppCompatActivity {

    private RecyclerView newsRecylcerView;
    private DatabaseReference mDataBase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        this.setTitle("Recent Projects");
        Toast.makeText(News.this,"Loading Recent Projects Data", Toast.LENGTH_SHORT).show();
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        mDataBase = FirebaseDatabase.getInstance().getReference().child("RecentProject");
        mDataBase.keepSynced(true);

        newsRecylcerView = (RecyclerView) findViewById(R.id.newsRecyclerView);
        newsRecylcerView.setHasFixedSize(true);
        LinearLayoutManager newsLayoutManager = new LinearLayoutManager(this);
        newsLayoutManager.setReverseLayout(true);
        newsLayoutManager.setStackFromEnd(true);
        newsRecylcerView.setLayoutManager(newsLayoutManager);

    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseRecyclerAdapter<NewsClass, NewsViewHolder> firebaseRecyclerAdapter = new FirebaseRecyclerAdapter<NewsClass, NewsViewHolder>(
                        NewsClass.class,
                        R.layout.news_adapter,
                        NewsViewHolder.class,
                        mDataBase) {
            @Override
            protected void populateViewHolder(NewsViewHolder viewHolder, NewsClass model, int position) {
                viewHolder.setTitle(model.getTitle());
                viewHolder.setBeneficiaries(model.getBeneficiaries());
                viewHolder.setClub(model.getClub());
                viewHolder.setDate(model.getDate());
                viewHolder.setDescription(model.getDescription());
                viewHolder.setImage(model.getImage());
                viewHolder.setObjective(model.getObjective());
                viewHolder.setType(model.getType());
                viewHolder.setLocation(model.getLocation());
                viewHolder.setClubName(model.getClubName());
            }
        };

        newsRecylcerView.setAdapter(firebaseRecyclerAdapter);
    }

    public static class NewsViewHolder extends RecyclerView.ViewHolder{
        View mView;
        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView;
        }

        public void setTitle( String Title ){
            TextView projectTitle = (TextView) mView.findViewById(R.id.newsTitle);
            projectTitle.setText(Title);
        }

        public void setDescription( String Description ){
            TextView projectDescription = (TextView) mView.findViewById(R.id.newsDescription);
            projectDescription.setText(Description);
        }

        public void setLocation( String Location ){
            TextView projectLocation = (TextView) mView.findViewById(R.id.newsLocation);
            projectLocation.setText(Location);
        }

        public void setBeneficiaries (String Beneficiaries ){
            TextView projectBeneficiaries = (TextView) mView.findViewById(R.id.newsBeneficiaries);
            projectBeneficiaries.setText(Beneficiaries);
        }

        public void setDate (String Date){
            TextView projectDate = (TextView) mView.findViewById(R.id.newsDate);
            projectDate.setText(Date);
        }

        public void setObjective(String Objective){
            TextView projectObjective = (TextView) mView.findViewById(R.id.newsObjectives);
            projectObjective.setText(Objective);
        }

        public void setType (String Type){
            TextView projectType = (TextView) mView.findViewById(R.id.newsType);
            projectType.setText(Type);
        }

        public void setClub (String Club){
            ImageView projectClubLogo = (ImageView) mView.findViewById(R.id.newsClubLogo);
            Picasso.get().load(Club).into(projectClubLogo);
        }

        public void setImage (String Image){
            ImageView projectImage = (ImageView) mView.findViewById(R.id.newsImage);
            Picasso.get().load(Image).into(projectImage);
        }

        public void setClubName (String ClubName){
            TextView projectClubName = (TextView) mView.findViewById(R.id.newsClubName);
            projectClubName.setText(ClubName);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
