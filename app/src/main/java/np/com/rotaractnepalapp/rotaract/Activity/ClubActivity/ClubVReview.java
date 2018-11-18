package np.com.rotaractnepalapp.rotaract.Activity.ClubActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Adapter.ClubVAdapter.MainClubVAdapter;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubV.ClubV10Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubV.ClubV11Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubV.ClubV12Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubV.ClubV13Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubV.ClubV1Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubV.ClubV2Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubV.ClubV3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubV.ClubV4Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubV.ClubV5Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubV.ClubV6Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubV.ClubV7Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubV.ClubV8Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubV.ClubV9Class;
import np.com.rotaractnepalapp.rotaract.R;

public class ClubVReview extends AppCompatActivity {

    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_vreview);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Zone V Club R.ID.NO. 3292");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_clubv_View);
        MainClubVAdapter adapter = new MainClubVAdapter(this, getObject());
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
        objects.add(getClub13Data().get(0));
        return objects;
    }

    public static ArrayList<ClubV1Class> getClub1Data(){
        ArrayList<ClubV1Class> clubV1Classes = new ArrayList<>();
        clubV1Classes.add(new ClubV1Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubV1Classes;

    }
    public static ArrayList<ClubV2Class> getClub2Data(){
        ArrayList<ClubV2Class> clubV2Classes = new ArrayList<>();
        clubV2Classes.add(new ClubV2Class(R.drawable.colorlogo_rotaractnepalapp,"RACDK", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubV2Classes;

    }
    public static ArrayList<ClubV3Class> getClub3Data(){
        ArrayList<ClubV3Class> clubV3Classes = new ArrayList<>();
        clubV3Classes.add(new ClubV3Class(R.drawable.colorlogo_rotaractnepalapp,"RACG", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubV3Classes;

    }
    public static ArrayList<ClubV4Class> getClub4Data(){
        ArrayList<ClubV4Class> clubV4Classes = new ArrayList<>();
        clubV4Classes.add(new ClubV4Class(R.drawable.colorlogo_rotaractnepalapp,"RACKM", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubV4Classes;

    }

    public static ArrayList<ClubV5Class> getClub5Data(){
        ArrayList<ClubV5Class> clubV5Classes = new ArrayList<>();
        clubV5Classes.add(new ClubV5Class(R.drawable.colorlogo_rotaractnepalapp,"RACK", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubV5Classes;

    }


    public static ArrayList<ClubV6Class> getClub6Data(){
        ArrayList<ClubV6Class> clubV6Classes = new ArrayList<>();
        clubV6Classes.add(new ClubV6Class(R.drawable.colorlogo_rotaractnepalapp,"RACKS", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubV6Classes;

    }

    public static ArrayList<ClubV7Class> getClub7Data(){
        ArrayList<ClubV7Class> clubV7Classes = new ArrayList<>();
        clubV7Classes.add(new ClubV7Class(R.drawable.colorlogo_rotaractnepalapp,"RACKYNE", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubV7Classes;

    }

    public static ArrayList<ClubV8Class> getClub8Data(){
        ArrayList<ClubV8Class> clubV8Classes = new ArrayList<>();
        clubV8Classes.add(new ClubV8Class(R.drawable.colorlogo_rotaractnepalapp,"RACMBIOM", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubV8Classes;

    }

    public static ArrayList<ClubV9Class> getClub9Data(){
        ArrayList<ClubV9Class> clubV9Classes = new ArrayList<>();
        clubV9Classes.add(new ClubV9Class(R.drawable.colorlogo_rotaractnepalapp,"RACP", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubV9Classes;

    }

    public static ArrayList<ClubV10Class> getClub10Data(){
        ArrayList<ClubV10Class> clubV10Classes = new ArrayList<>();
        clubV10Classes.add(new ClubV10Class(R.drawable.colorlogo_rotaractnepalapp,"RACR", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubV10Classes;

    }

    public static ArrayList<ClubV11Class> getClub11Data(){
        ArrayList<ClubV11Class> clubV11Classes = new ArrayList<>();
        clubV11Classes.add(new ClubV11Class(R.drawable.colorlogo_rotaractnepalapp,"RACS", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubV11Classes;

    }

    public static ArrayList<ClubV12Class> getClub12Data(){
        ArrayList<ClubV12Class> clubV12Classes = new ArrayList<>();
        clubV12Classes.add(new ClubV12Class(R.drawable.colorlogo_rotaractnepalapp,"RACTIC", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubV12Classes;

    }

    public static ArrayList<ClubV13Class> getClub13Data(){
        ArrayList<ClubV13Class> clubV13Classes = new ArrayList<>();
        clubV13Classes.add(new ClubV13Class(R.drawable.colorlogo_rotaractnepalapp,"RACTIC", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubV13Classes;

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
