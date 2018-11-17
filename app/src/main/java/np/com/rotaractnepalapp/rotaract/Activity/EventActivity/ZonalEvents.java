package np.com.rotaractnepalapp.rotaract.Activity.EventActivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.R;
import np.com.rotaractnepalapp.rotaract.Class.ClassEvents.ZonalEventsClass;
import np.com.rotaractnepalapp.rotaract.Adapter.ZonalEventsAdapter;

public class ZonalEvents extends AppCompatActivity {

    DatabaseReference databaseReference;
    RecyclerView recyclerView;
    ZonalEventsAdapter zonalEventsAdapter;
    ArrayList<ZonalEventsClass> zonalEventsClasses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zonal_events);

        this.setTitle("District Events");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()){
            Toast.makeText(this, "Loading Data", Toast.LENGTH_SHORT).show();
            recyclerView = (RecyclerView) findViewById(R.id.zonalEventsRecyclerView);
            recyclerView.setHasFixedSize(true);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            linearLayoutManager.setReverseLayout(true);
            linearLayoutManager.setStackFromEnd(true);
            recyclerView.setLayoutManager(linearLayoutManager);

            databaseReference = FirebaseDatabase.getInstance().getReference().child("ZonalEvents");
            databaseReference.keepSynced(true);
            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if (dataSnapshot.exists()){
                        zonalEventsClasses = new ArrayList<ZonalEventsClass>();
                        for (DataSnapshot dataSnapshot1: dataSnapshot.getChildren()){
                            ZonalEventsClass zonalEventsClass = dataSnapshot1.getValue(ZonalEventsClass.class);
                            zonalEventsClasses.add(zonalEventsClass);
                        }
                        zonalEventsAdapter = new ZonalEventsAdapter(ZonalEvents.this, zonalEventsClasses);
                        recyclerView.setAdapter(zonalEventsAdapter);
                    } else {
                        Toast.makeText(ZonalEvents.this, "There is no Zonal Event Available now !!", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                    Toast.makeText(ZonalEvents.this,"Opsss.......something is wrong", Toast.LENGTH_SHORT).show();
                }
            });
        } else {
            Toast.makeText(this, "Check Your Internet Connection", Toast.LENGTH_SHORT).show();
        }

        TextView Back = (TextView) findViewById(R.id.Back);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
