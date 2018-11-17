package np.com.rotaractnepalapp.rotaract.Activity.ClubActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Class.ClassClubVIII.ClubVIII1Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVIII.ClubVIII2Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVIII.ClubVIII3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVIII.ClubVIII4Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVIII.ClubVIII5Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVIII.ClubVIII6Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVIII.ClubVIII7Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVIII.ClubVIII8Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVIII.ClubVIII9Class;
import np.com.rotaractnepalapp.rotaract.Adapter.ClubVIIIAdapter.MainClubVIIIAdapter;
import np.com.rotaractnepalapp.rotaract.R;

public class ClubVIIIReview extends AppCompatActivity {

    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_viiireview);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Zone VIII Club R.ID.NO. 3292");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_clubviii_View);
        MainClubVIIIAdapter adapter = new MainClubVIIIAdapter(this, getObject());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private ArrayList<Object> getObject() {
        objects.add(getClub1Data().get(0));
        objects.add(getClub2Data().get(0));
        objects.add(getClub3Data().get(0));
        objects.add(getClub4Data().get(0));
        objects.add(getClub5Data().get(0));
        objects.add(getClub6Data().get(0));
        objects.add(getClub7Data().get(0));
        objects.add(getClub8Data().get(0));
        objects.add(getClub9Data().get(0));
        return objects;
    }

    public static ArrayList<ClubVIII1Class> getClub1Data(){
        ArrayList<ClubVIII1Class> clubVIII1Classes = new ArrayList<>();
        clubVIII1Classes.add(new ClubVIII1Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVIII1Classes.add(new ClubVIII1Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVIII1Classes.add(new ClubVIII1Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVIII1Classes.add(new ClubVIII1Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVIII1Classes.add(new ClubVIII1Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVIII1Classes.add(new ClubVIII1Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVIII1Classes.add(new ClubVIII1Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVIII1Classes.add(new ClubVIII1Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVIII1Classes.add(new ClubVIII1Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVIII1Classes.add(new ClubVIII1Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVIII1Classes.add(new ClubVIII1Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVIII1Classes.add(new ClubVIII1Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVIII1Classes.add(new ClubVIII1Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVIII1Classes.add(new ClubVIII1Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVIII1Classes.add(new ClubVIII1Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVIII1Classes;

    }

    public static ArrayList<ClubVIII2Class> getClub2Data(){
        ArrayList<ClubVIII2Class> clubVIII2Classes = new ArrayList<>();
        clubVIII2Classes.add(new ClubVIII2Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVIII2Classes.add(new ClubVIII2Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVIII2Classes.add(new ClubVIII2Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVIII2Classes.add(new ClubVIII2Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVIII2Classes.add(new ClubVIII2Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVIII2Classes.add(new ClubVIII2Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVIII2Classes.add(new ClubVIII2Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVIII2Classes.add(new ClubVIII2Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVIII2Classes.add(new ClubVIII2Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVIII2Classes.add(new ClubVIII2Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVIII2Classes.add(new ClubVIII2Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVIII2Classes.add(new ClubVIII2Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVIII2Classes.add(new ClubVIII2Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVIII2Classes.add(new ClubVIII2Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVIII2Classes.add(new ClubVIII2Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVIII2Classes;

    }

    public static ArrayList<ClubVIII3Class> getClub3Data(){
        ArrayList<ClubVIII3Class> clubVIII3Classes = new ArrayList<>();
        clubVIII3Classes.add(new ClubVIII3Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVIII3Classes.add(new ClubVIII3Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVIII3Classes.add(new ClubVIII3Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVIII3Classes.add(new ClubVIII3Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVIII3Classes.add(new ClubVIII3Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVIII3Classes.add(new ClubVIII3Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVIII3Classes.add(new ClubVIII3Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVIII3Classes.add(new ClubVIII3Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVIII3Classes.add(new ClubVIII3Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVIII3Classes.add(new ClubVIII3Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVIII3Classes.add(new ClubVIII3Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVIII3Classes.add(new ClubVIII3Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVIII3Classes.add(new ClubVIII3Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVIII3Classes.add(new ClubVIII3Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVIII3Classes.add(new ClubVIII3Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVIII3Classes;

    }

    public static ArrayList<ClubVIII4Class> getClub4Data(){
        ArrayList<ClubVIII4Class> clubVIII4Classes = new ArrayList<>();
        clubVIII4Classes.add(new ClubVIII4Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVIII4Classes.add(new ClubVIII4Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVIII4Classes.add(new ClubVIII4Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVIII4Classes.add(new ClubVIII4Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVIII4Classes.add(new ClubVIII4Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVIII4Classes.add(new ClubVIII4Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVIII4Classes.add(new ClubVIII4Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVIII4Classes.add(new ClubVIII4Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVIII4Classes.add(new ClubVIII4Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVIII4Classes.add(new ClubVIII4Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVIII4Classes.add(new ClubVIII4Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVIII4Classes.add(new ClubVIII4Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVIII4Classes.add(new ClubVIII4Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVIII4Classes.add(new ClubVIII4Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVIII4Classes.add(new ClubVIII4Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVIII4Classes;

    }

    public static ArrayList<ClubVIII5Class> getClub5Data(){
        ArrayList<ClubVIII5Class> clubVIII5Classes = new ArrayList<>();
        clubVIII5Classes.add(new ClubVIII5Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVIII5Classes.add(new ClubVIII5Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVIII5Classes.add(new ClubVIII5Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVIII5Classes.add(new ClubVIII5Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVIII5Classes.add(new ClubVIII5Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVIII5Classes.add(new ClubVIII5Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVIII5Classes.add(new ClubVIII5Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVIII5Classes.add(new ClubVIII5Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVIII5Classes.add(new ClubVIII5Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVIII5Classes.add(new ClubVIII5Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVIII5Classes.add(new ClubVIII5Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVIII5Classes.add(new ClubVIII5Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVIII5Classes.add(new ClubVIII5Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVIII5Classes.add(new ClubVIII5Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVIII5Classes.add(new ClubVIII5Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVIII5Classes;

    }

    public static ArrayList<ClubVIII6Class> getClub6Data(){
        ArrayList<ClubVIII6Class> clubVIII6Classes = new ArrayList<>();
        clubVIII6Classes.add(new ClubVIII6Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVIII6Classes.add(new ClubVIII6Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVIII6Classes.add(new ClubVIII6Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVIII6Classes.add(new ClubVIII6Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVIII6Classes.add(new ClubVIII6Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVIII6Classes.add(new ClubVIII6Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVIII6Classes.add(new ClubVIII6Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVIII6Classes.add(new ClubVIII6Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVIII6Classes.add(new ClubVIII6Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVIII6Classes.add(new ClubVIII6Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVIII6Classes.add(new ClubVIII6Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVIII6Classes.add(new ClubVIII6Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVIII6Classes.add(new ClubVIII6Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVIII6Classes.add(new ClubVIII6Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVIII6Classes.add(new ClubVIII6Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVIII6Classes;

    }

    public static ArrayList<ClubVIII7Class> getClub7Data(){
        ArrayList<ClubVIII7Class> clubVIII7Classes = new ArrayList<>();
        clubVIII7Classes.add(new ClubVIII7Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVIII7Classes.add(new ClubVIII7Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVIII7Classes.add(new ClubVIII7Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVIII7Classes.add(new ClubVIII7Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVIII7Classes.add(new ClubVIII7Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVIII7Classes.add(new ClubVIII7Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVIII7Classes.add(new ClubVIII7Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVIII7Classes.add(new ClubVIII7Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVIII7Classes.add(new ClubVIII7Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVIII7Classes.add(new ClubVIII7Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVIII7Classes.add(new ClubVIII7Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVIII7Classes.add(new ClubVIII7Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVIII7Classes.add(new ClubVIII7Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVIII7Classes.add(new ClubVIII7Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVIII7Classes.add(new ClubVIII7Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVIII7Classes;

    }

    public static ArrayList<ClubVIII8Class> getClub8Data(){
        ArrayList<ClubVIII8Class> clubVIII8Classes = new ArrayList<>();
        clubVIII8Classes.add(new ClubVIII8Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVIII8Classes.add(new ClubVIII8Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVIII8Classes.add(new ClubVIII8Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVIII8Classes.add(new ClubVIII8Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVIII8Classes.add(new ClubVIII8Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVIII8Classes.add(new ClubVIII8Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVIII8Classes.add(new ClubVIII8Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVIII8Classes.add(new ClubVIII8Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVIII8Classes.add(new ClubVIII8Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVIII8Classes.add(new ClubVIII8Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVIII8Classes.add(new ClubVIII8Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVIII8Classes.add(new ClubVIII8Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVIII8Classes.add(new ClubVIII8Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVIII8Classes.add(new ClubVIII8Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVIII8Classes.add(new ClubVIII8Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVIII8Classes;

    }

    public static ArrayList<ClubVIII9Class> getClub9Data(){
        ArrayList<ClubVIII9Class> clubVIII9Classes = new ArrayList<>();
        clubVIII9Classes.add(new ClubVIII9Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVIII9Classes.add(new ClubVIII9Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVIII9Classes.add(new ClubVIII9Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVIII9Classes.add(new ClubVIII9Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVIII9Classes.add(new ClubVIII9Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVIII9Classes.add(new ClubVIII9Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVIII9Classes.add(new ClubVIII9Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVIII9Classes.add(new ClubVIII9Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVIII9Classes.add(new ClubVIII9Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVIII9Classes.add(new ClubVIII9Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVIII9Classes.add(new ClubVIII9Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVIII9Classes.add(new ClubVIII9Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVIII9Classes.add(new ClubVIII9Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVIII9Classes.add(new ClubVIII9Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVIII9Classes.add(new ClubVIII9Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVIII9Classes;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
