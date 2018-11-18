package np.com.rotaractnepalapp.rotaract.Activity.ClubActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Adapter.ClubXIIIAdapter.MainClubXIIIAdapter;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXIII.ClubXIII1Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXIII.ClubXIII2Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXIII.ClubXIII3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXIII.ClubXIII4Class;
import np.com.rotaractnepalapp.rotaract.R;

public class ClubXIIIReview extends AppCompatActivity {

    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_xiiireview);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Zone XIII Club R.ID.NO. 3292");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_clubxiii_View);
        MainClubXIIIAdapter adapter = new MainClubXIIIAdapter(this, getObject());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private ArrayList<Object> getObject() {
        objects.add(getClub1Data().get(0));
        objects.add(getClub2Data().get(0));
        objects.add(getClub3Data().get(0));
        objects.add(getClub4Data().get(0));
        return objects;
    }

    public static ArrayList<ClubXIII1Class> getClub1Data(){
        ArrayList<ClubXIII1Class> clubXIII1Classes = new ArrayList<>();
        clubXIII1Classes.add(new ClubXIII1Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubXIII1Classes;

    }

    public static ArrayList<ClubXIII2Class> getClub2Data(){
        ArrayList<ClubXIII2Class> clubXIII2Classes = new ArrayList<>();
        clubXIII2Classes.add(new ClubXIII2Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubXIII2Classes;

    }

    public static ArrayList<ClubXIII3Class> getClub3Data(){
        ArrayList<ClubXIII3Class> clubXIII3Classes = new ArrayList<>();
        clubXIII3Classes.add(new ClubXIII3Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubXIII3Classes;

    }

    public static ArrayList<ClubXIII4Class> getClub4Data(){
        ArrayList<ClubXIII4Class> clubXIII4Classes = new ArrayList<>();
        clubXIII4Classes.add(new ClubXIII4Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubXIII4Classes;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
