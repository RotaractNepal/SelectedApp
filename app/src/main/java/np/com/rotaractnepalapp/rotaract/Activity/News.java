package np.com.rotaractnepalapp.rotaract.Activity;


import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Class.NewsClass;
import np.com.rotaractnepalapp.rotaract.Adapter.NewsAdapter;
import np.com.rotaractnepalapp.rotaract.R;

public class News extends AppCompatActivity {

    DatabaseReference databaseReference;
    RecyclerView recyclerView;
    ArrayList<NewsClass> newsClasses;
    NewsAdapter newsAdapter;

    private FloatingActionButton createProject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        this.setTitle("Recent Projects");
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        createProject = (FloatingActionButton) findViewById(R.id.creatNews);
        createProject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog creatproject;
                creatproject = new Dialog(v.getContext());
                creatproject.setContentView(R.layout.create_news);

                TextView close = (TextView) creatproject.findViewById(R.id.closeDialog);
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        creatproject.dismiss();
                    }
                });

                creatproject.setCanceledOnTouchOutside(false);
                creatproject.setCancelable(false);
                creatproject.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                creatproject.show();
            }
        });

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()) {
            Toast.makeText(this, "Loading Data", Toast.LENGTH_SHORT).show();
            recyclerView = (RecyclerView) findViewById(R.id.newsRecyclerView);
            recyclerView.setHasFixedSize(true);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            linearLayoutManager.setReverseLayout(true);
            linearLayoutManager.setStackFromEnd(true);
            recyclerView.setLayoutManager(linearLayoutManager);

            databaseReference = FirebaseDatabase.getInstance().getReference().child("RecentProject");
            databaseReference.keepSynced(true);
            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if (dataSnapshot.exists()){
                        newsClasses = new ArrayList<NewsClass>();
                        for (DataSnapshot dataSnapshot1: dataSnapshot.getChildren()){
                            NewsClass newsClass = dataSnapshot1.getValue(NewsClass.class);
                            newsClasses.add(newsClass);
                        }
                        newsAdapter = new NewsAdapter(News.this, newsClasses);
                        recyclerView.setAdapter(newsAdapter);
                    } else {
                        Toast.makeText(News.this,"There is no Recent Project Available now !!", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                    Toast.makeText(News.this,"Opsss.......something is wrong", Toast.LENGTH_SHORT).show();
                }
            });
        }else {
            Toast.makeText(this, "Check Your Internet Connection", Toast.LENGTH_SHORT).show();
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
