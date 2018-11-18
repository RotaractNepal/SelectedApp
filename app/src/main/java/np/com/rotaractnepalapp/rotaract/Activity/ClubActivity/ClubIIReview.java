package np.com.rotaractnepalapp.rotaract.Activity.ClubActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Class.ClassClubII.ClubII1Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubII.ClubII2Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubII.ClubII3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubII.ClubII4Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubII.ClubII5Class;
import np.com.rotaractnepalapp.rotaract.Adapter.ClubIIAdapter.MainClubIIAdapter;
import np.com.rotaractnepalapp.rotaract.R;

public class ClubIIReview extends AppCompatActivity {

    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_iireview);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Zone II Club R.ID.NO. 3292");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_clubii_View);
        MainClubIIAdapter adapter = new MainClubIIAdapter(this, getObject());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }


    private ArrayList<Object> getObject() {
        objects.add(getClub1Data().get(0));
        objects.add(getClub2Data().get(0));
        objects.add(getClub3Data().get(0));
        objects.add(getClub4Data().get(0));
        objects.add(getClub5Data().get(0));
        return objects;
    }

    public static ArrayList<ClubII1Class> getClub1Data(){
        ArrayList<ClubII1Class> clubII1Classes = new ArrayList<>();
        clubII1Classes.add(new ClubII1Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII1Classes.add(new ClubII1Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII1Classes.add(new ClubII1Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII1Classes.add(new ClubII1Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII1Classes.add(new ClubII1Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII1Classes.add(new ClubII1Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII1Classes.add(new ClubII1Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII1Classes.add(new ClubII1Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII1Classes.add(new ClubII1Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII1Classes.add(new ClubII1Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII1Classes.add(new ClubII1Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII1Classes.add(new ClubII1Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII1Classes.add(new ClubII1Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII1Classes.add(new ClubII1Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII1Classes.add(new ClubII1Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubII1Classes;

    }

    public static ArrayList<ClubII2Class> getClub2Data(){
        ArrayList<ClubII2Class> clubII2Classes = new ArrayList<>();
        clubII2Classes.add(new ClubII2Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII2Classes.add(new ClubII2Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII2Classes.add(new ClubII2Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII2Classes.add(new ClubII2Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII2Classes.add(new ClubII2Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII2Classes.add(new ClubII2Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII2Classes.add(new ClubII2Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII2Classes.add(new ClubII2Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII2Classes.add(new ClubII2Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII2Classes.add(new ClubII2Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII2Classes.add(new ClubII2Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII2Classes.add(new ClubII2Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII2Classes.add(new ClubII2Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII2Classes.add(new ClubII2Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII2Classes.add(new ClubII2Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubII2Classes;

    }

    public static ArrayList<ClubII3Class> getClub3Data(){
        ArrayList<ClubII3Class> clubII3Classes = new ArrayList<>();
        clubII3Classes.add(new ClubII3Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII3Classes.add(new ClubII3Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII3Classes.add(new ClubII3Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII3Classes.add(new ClubII3Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII3Classes.add(new ClubII3Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII3Classes.add(new ClubII3Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII3Classes.add(new ClubII3Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII3Classes.add(new ClubII3Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII3Classes.add(new ClubII3Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII3Classes.add(new ClubII3Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII3Classes.add(new ClubII3Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII3Classes.add(new ClubII3Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII3Classes.add(new ClubII3Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII3Classes.add(new ClubII3Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII3Classes.add(new ClubII3Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubII3Classes;

    }

    public static ArrayList<ClubII4Class> getClub4Data(){
        ArrayList<ClubII4Class> clubII4Classes = new ArrayList<>();
        clubII4Classes.add(new ClubII4Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII4Classes.add(new ClubII4Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII4Classes.add(new ClubII4Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII4Classes.add(new ClubII4Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII4Classes.add(new ClubII4Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII4Classes.add(new ClubII4Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII4Classes.add(new ClubII4Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII4Classes.add(new ClubII4Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII4Classes.add(new ClubII4Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII4Classes.add(new ClubII4Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII4Classes.add(new ClubII4Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII4Classes.add(new ClubII4Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII4Classes.add(new ClubII4Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII4Classes.add(new ClubII4Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII4Classes.add(new ClubII4Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubII4Classes;

    }

    public static ArrayList<ClubII5Class> getClub5Data(){
        ArrayList<ClubII5Class> clubII5Classes = new ArrayList<>();
        clubII5Classes.add(new ClubII5Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII5Classes.add(new ClubII5Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII5Classes.add(new ClubII5Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII5Classes.add(new ClubII5Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII5Classes.add(new ClubII5Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII5Classes.add(new ClubII5Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII5Classes.add(new ClubII5Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII5Classes.add(new ClubII5Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII5Classes.add(new ClubII5Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII5Classes.add(new ClubII5Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII5Classes.add(new ClubII5Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII5Classes.add(new ClubII5Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII5Classes.add(new ClubII5Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII5Classes.add(new ClubII5Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubII5Classes.add(new ClubII5Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubII5Classes;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
