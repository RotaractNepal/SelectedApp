package np.com.rotaractnepalapp.rotaract.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Adapter.ClubAdapter;
import np.com.rotaractnepalapp.rotaract.R;

public class Club extends AppCompatActivity {

    private ArrayList<String> zoneCapitalLetter  = new ArrayList<>();
    private ArrayList<String> zoneFullName = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Zones And Clubs");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        zones();
    }

    private void zones(){
        zoneCapitalLetter.add("I");
        zoneFullName.add("Zone I");

        zoneCapitalLetter.add("II");
        zoneFullName.add("Zone II");

        zoneCapitalLetter.add("III");
        zoneFullName.add("Zone III");

        zoneCapitalLetter.add("IV");
        zoneFullName.add("Zone IV");

        zoneCapitalLetter.add("V");
        zoneFullName.add("Zone V");

        zoneCapitalLetter.add("VI");
        zoneFullName.add("Zone VI");

        zoneCapitalLetter.add("VII");
        zoneFullName.add("Zone VII");

        zoneCapitalLetter.add("VIII");
        zoneFullName.add("Zone VIII");

        zoneCapitalLetter.add("IX");
        zoneFullName.add("Zone IX");

        zoneCapitalLetter.add("X");
        zoneFullName.add("Zone X");

        zoneCapitalLetter.add("XI");
        zoneFullName.add("Zone XI");

        zoneCapitalLetter.add("XII");
        zoneFullName.add("Zone XII");

        zoneCapitalLetter.add("XIII");
        zoneFullName.add("Zone XIII");
        
        initRecyclerView();
    }

    private void initRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView  recyclerView = (RecyclerView) findViewById(R.id.zoneClubRecyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        ClubAdapter clubAdapter = new ClubAdapter(this, zoneCapitalLetter, zoneFullName);
        recyclerView.setAdapter(clubAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
