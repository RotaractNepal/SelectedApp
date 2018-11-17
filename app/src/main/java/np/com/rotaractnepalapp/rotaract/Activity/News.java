package np.com.rotaractnepalapp.rotaract.Activity;


import android.app.Dialog;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.rengwuxian.materialedittext.MaterialEditText;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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

    MaterialEditText Title, Date, Location, ClubName, Type, Objective, Description;
    Button SendEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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

                 Title = (MaterialEditText) creatproject.findViewById(R.id.Title);
                 Date = (MaterialEditText) creatproject.findViewById(R.id.Date);
                 Location = (MaterialEditText) creatproject.findViewById(R.id.Location);
                 ClubName = (MaterialEditText) creatproject.findViewById(R.id.ClubName);
                 Type = (MaterialEditText) creatproject.findViewById(R.id.Type);
                 Objective = (MaterialEditText) creatproject.findViewById(R.id.Objective);
                 Description = (MaterialEditText) creatproject.findViewById(R.id.Description);

                 Title.addTextChangedListener(CreatRecentProject);
                 Date.addTextChangedListener(CreatRecentProject);
                 Location.addTextChangedListener(CreatRecentProject);
                 ClubName.addTextChangedListener(CreatRecentProject);
                 Type.addTextChangedListener(CreatRecentProject);
                 Objective.addTextChangedListener(CreatRecentProject);
                 Description.addTextChangedListener(CreatRecentProject);

                SendEmail = (Button) creatproject.findViewById(R.id.SendEmail);
                SendEmail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                            Intent intenEmail=null, chooserEmail=null;
                            intenEmail = new Intent(Intent.ACTION_SEND);
                            intenEmail.setData(Uri.parse("mailto:"));
                            String[] to = {"bskeshab515@gmail.com"};
                            intenEmail.putExtra(Intent.EXTRA_EMAIL, to);
                            intenEmail.putExtra(Intent.EXTRA_SUBJECT, "Recent Project");
                            intenEmail.putExtra(Intent.EXTRA_TEXT, "Title : " + Title.getText().toString()
                                    + "\n\nDate : " + Date.getText().toString()
                                    + "\n\nLocation : " + Location.getText().toString()
                                    + "\n\nClub Name : " + ClubName.getText().toString()
                                    + "\n\nType : " + Type.getText().toString()
                                    + "\n\nObjective : " + Objective.getText().toString()
                                    + "\n\nDescription : " + Description.getText().toString()
                                    + "\n\nAttach your an Image (One Image Required) *");
                            intenEmail.setType("message/rfc822");
                            chooserEmail = intenEmail.createChooser(intenEmail,"Send Email");
                            v.getContext().startActivity(chooserEmail);

                    }
                });


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

    private TextWatcher CreatRecentProject = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String projectTitle  = Title.getText().toString();
            String projectDate  = Date.getText().toString();
            String projectLocation  = Location.getText().toString();
            String projectClubName  = ClubName.getText().toString();
            String projectType  = Type.getText().toString();
            String projectObjective  = Objective.getText().toString();
            String projectDescription  = Description.getText().toString();

            SendEmail.setEnabled(!projectTitle.isEmpty() && !projectDate.isEmpty() && !projectLocation.isEmpty() && !projectClubName.isEmpty()
                                 && !projectType.isEmpty() && !projectObjective.isEmpty() && !projectDescription.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
