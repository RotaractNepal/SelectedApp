package np.com.rotaractnepalapp.rotaract.Activity.EventActivity;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
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

import np.com.rotaractnepalapp.rotaract.Class.ClassEvents.DistrictEventsClass;
import np.com.rotaractnepalapp.rotaract.Adapter.DistrictEventsAdapter;
import np.com.rotaractnepalapp.rotaract.R;

public class DistrictEvents extends AppCompatActivity {

    DatabaseReference databaseReference;
    RecyclerView recyclerView;
    ArrayList<DistrictEventsClass> districtEventsClasses;
    DistrictEventsAdapter districtEventsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_district_events);

        this.setTitle("District Events");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(this.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected()){
            Toast.makeText(this, "Loading Data", Toast.LENGTH_SHORT).show();
            recyclerView = (RecyclerView) findViewById(R.id.districtEventsRecyclerView);
            recyclerView.setHasFixedSize(true);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            linearLayoutManager.setReverseLayout(true);
            linearLayoutManager.setStackFromEnd(true);
            recyclerView.setLayoutManager(linearLayoutManager);

            databaseReference = FirebaseDatabase.getInstance().getReference().child("DistrictEvents");
            databaseReference.keepSynced(true);
            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if (dataSnapshot.exists()){
                        districtEventsClasses = new ArrayList<DistrictEventsClass>();
                        for (DataSnapshot dataSnapshot1: dataSnapshot.getChildren()){
                            DistrictEventsClass districtEventsClass = dataSnapshot1.getValue(DistrictEventsClass.class);
                            districtEventsClasses.add(districtEventsClass);
                        }
                        districtEventsAdapter = new DistrictEventsAdapter(DistrictEvents.this, districtEventsClasses);
                        recyclerView.setAdapter(districtEventsAdapter);
                    } else {
                        Toast.makeText(DistrictEvents.this, "There is no District Event Available now !!", Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {
                    Toast.makeText(DistrictEvents.this,"Opsss.......something is wrong", Toast.LENGTH_SHORT).show();
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
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
