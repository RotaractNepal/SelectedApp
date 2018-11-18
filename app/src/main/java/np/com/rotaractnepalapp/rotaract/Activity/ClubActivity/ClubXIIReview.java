package np.com.rotaractnepalapp.rotaract.Activity.ClubActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Adapter.ClubXIIAdapter.MainClubXIIAdapter;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXII.ClubXII10Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXII.ClubXII11Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXII.ClubXII12Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXII.ClubXII1Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXII.ClubXII2Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXII.ClubXII3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXII.ClubXII4Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXII.ClubXII5Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXII.ClubXII6Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXII.ClubXII7Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXII.ClubXII8Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXII.ClubXII9Class;
import np.com.rotaractnepalapp.rotaract.R;

public class ClubXIIReview extends AppCompatActivity {

    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_xiireview);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Zone XII Club R.ID.NO. 3292");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_clubxii_View);
        MainClubXIIAdapter adapter = new MainClubXIIAdapter(this, getObject());
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
        objects.add(getClub10Data().get(0));
        objects.add(getClub11Data().get(0));
        objects.add(getClub12Data().get(0));
        return objects;
    }

    public static ArrayList<ClubXII1Class> getClub1Data(){
        ArrayList<ClubXII1Class> clubXII1Classes = new ArrayList<>();
        clubXII1Classes.add(new ClubXII1Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubXII1Classes;

    }
    public static ArrayList<ClubXII2Class> getClub2Data(){
        ArrayList<ClubXII2Class> clubXII2Classes = new ArrayList<>();
        clubXII2Classes.add(new ClubXII2Class(R.drawable.colorlogo_rotaractnepalapp,"RACDK", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubXII2Classes;

    }
    public static ArrayList<ClubXII3Class> getClub3Data(){
        ArrayList<ClubXII3Class> clubXII3Classes = new ArrayList<>();
        clubXII3Classes.add(new ClubXII3Class(R.drawable.colorlogo_rotaractnepalapp,"RACG", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubXII3Classes;

    }
    public static ArrayList<ClubXII4Class> getClub4Data(){
        ArrayList<ClubXII4Class> clubXII4Classes = new ArrayList<>();
        clubXII4Classes.add(new ClubXII4Class(R.drawable.colorlogo_rotaractnepalapp,"RACKM", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubXII4Classes;

    }

    public static ArrayList<ClubXII5Class> getClub5Data(){
        ArrayList<ClubXII5Class> clubXII5Classes = new ArrayList<>();
        clubXII5Classes.add(new ClubXII5Class(R.drawable.colorlogo_rotaractnepalapp,"RACK", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubXII5Classes;

    }


    public static ArrayList<ClubXII6Class> getClub6Data(){
        ArrayList<ClubXII6Class> clubXII6Classes = new ArrayList<>();
        clubXII6Classes.add(new ClubXII6Class(R.drawable.colorlogo_rotaractnepalapp,"RACKS", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubXII6Classes;

    }

    public static ArrayList<ClubXII7Class> getClub7Data(){
        ArrayList<ClubXII7Class> clubXII7Classes = new ArrayList<>();
        clubXII7Classes.add(new ClubXII7Class(R.drawable.colorlogo_rotaractnepalapp,"RACKYNE", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubXII7Classes;

    }

    public static ArrayList<ClubXII8Class> getClub8Data(){
        ArrayList<ClubXII8Class> clubXII8Classes = new ArrayList<>();
        clubXII8Classes.add(new ClubXII8Class(R.drawable.colorlogo_rotaractnepalapp,"RACMBIOM", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubXII8Classes;

    }

    public static ArrayList<ClubXII9Class> getClub9Data(){
        ArrayList<ClubXII9Class> clubXII9Classes = new ArrayList<>();
        clubXII9Classes.add(new ClubXII9Class(R.drawable.colorlogo_rotaractnepalapp,"RACP", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubXII9Classes;

    }

    public static ArrayList<ClubXII10Class> getClub10Data(){
        ArrayList<ClubXII10Class> clubXII10Classes = new ArrayList<>();
        clubXII10Classes.add(new ClubXII10Class(R.drawable.colorlogo_rotaractnepalapp,"RACR", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubXII10Classes;

    }

    public static ArrayList<ClubXII11Class> getClub11Data(){
        ArrayList<ClubXII11Class> clubXII11Classes = new ArrayList<>();
        clubXII11Classes.add(new ClubXII11Class(R.drawable.colorlogo_rotaractnepalapp,"RACS", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubXII11Classes;

    }

    public static ArrayList<ClubXII12Class> getClub12Data(){
        ArrayList<ClubXII12Class> clubXII12Classes = new ArrayList<>();
        clubXII12Classes.add(new ClubXII12Class(R.drawable.colorlogo_rotaractnepalapp,"RACTIC", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubXII12Classes;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
