package np.com.rotaractnepalapp.rotaract.Activity;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Adapter.EventsAdapter;
import np.com.rotaractnepalapp.rotaract.R;

public class Events extends AppCompatActivity {

    private ArrayList<String> CapitalLetter  = new ArrayList<>();
    private ArrayList<String> FullName = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs_events);
        this.setTitle("Events");
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        events();

    }

    private void events(){
        CapitalLetter.add("C");
        FullName.add("Club Events");

        CapitalLetter.add("D");
        FullName.add("District Events");

        CapitalLetter.add("Z");
        FullName.add("Zonal Events");

        initRecyclerView();
    }

    private void initRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.eventRecyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        EventsAdapter eventsAdapter = new EventsAdapter(this, CapitalLetter, FullName);
        recyclerView.setAdapter(eventsAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
