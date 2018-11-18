package np.com.rotaractnepalapp.rotaract.Activity.ClubActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Class.ClassClubIV.ClubIV10Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIV.ClubIV11Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIV.ClubIV12Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIV.ClubIV1Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIV.ClubIV2Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIV.ClubIV3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIV.ClubIV4Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIV.ClubIV5Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIV.ClubIV6Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIV.ClubIV7Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIV.ClubIV8Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIV.ClubIV9Class;
import np.com.rotaractnepalapp.rotaract.Adapter.ClubIVAdapter.MainClubIVAdapter;
import np.com.rotaractnepalapp.rotaract.R;

public class ClubIVReview extends AppCompatActivity {

    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_ivreview);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Zone IV Club R.ID.NO. 3292");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_clubiv_View);
        MainClubIVAdapter adapter = new MainClubIVAdapter(this, getObject());
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

    public static ArrayList<ClubIV1Class> getClub1Data(){
        ArrayList<ClubIV1Class> clubIV1Classes = new ArrayList<>();
        clubIV1Classes.add(new ClubIV1Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV1Classes.add(new ClubIV1Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV1Classes.add(new ClubIV1Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV1Classes.add(new ClubIV1Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV1Classes.add(new ClubIV1Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV1Classes.add(new ClubIV1Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV1Classes.add(new ClubIV1Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV1Classes.add(new ClubIV1Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV1Classes.add(new ClubIV1Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV1Classes.add(new ClubIV1Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV1Classes.add(new ClubIV1Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV1Classes.add(new ClubIV1Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV1Classes.add(new ClubIV1Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV1Classes.add(new ClubIV1Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV1Classes.add(new ClubIV1Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubIV1Classes;

    }
    public static ArrayList<ClubIV2Class> getClub2Data(){
        ArrayList<ClubIV2Class> clubIV2Classes = new ArrayList<>();
        clubIV2Classes.add(new ClubIV2Class(R.drawable.colorlogo_rotaractnepalapp,"RACDK", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV2Classes.add(new ClubIV2Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV2Classes.add(new ClubIV2Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV2Classes.add(new ClubIV2Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV2Classes.add(new ClubIV2Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV2Classes.add(new ClubIV2Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV2Classes.add(new ClubIV2Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV2Classes.add(new ClubIV2Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV2Classes.add(new ClubIV2Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV2Classes.add(new ClubIV2Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV2Classes.add(new ClubIV2Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV2Classes.add(new ClubIV2Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV2Classes.add(new ClubIV2Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV2Classes.add(new ClubIV2Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV2Classes.add(new ClubIV2Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubIV2Classes;

    }
    public static ArrayList<ClubIV3Class> getClub3Data(){
        ArrayList<ClubIV3Class> clubIV3Classes = new ArrayList<>();
        clubIV3Classes.add(new ClubIV3Class(R.drawable.colorlogo_rotaractnepalapp,"RACG", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV3Classes.add(new ClubIV3Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV3Classes.add(new ClubIV3Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV3Classes.add(new ClubIV3Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV3Classes.add(new ClubIV3Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV3Classes.add(new ClubIV3Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV3Classes.add(new ClubIV3Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV3Classes.add(new ClubIV3Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV3Classes.add(new ClubIV3Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV3Classes.add(new ClubIV3Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV3Classes.add(new ClubIV3Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV3Classes.add(new ClubIV3Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV3Classes.add(new ClubIV3Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV3Classes.add(new ClubIV3Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV3Classes.add(new ClubIV3Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubIV3Classes;

    }
    public static ArrayList<ClubIV4Class> getClub4Data(){
        ArrayList<ClubIV4Class> clubIV4Classes = new ArrayList<>();
        clubIV4Classes.add(new ClubIV4Class(R.drawable.colorlogo_rotaractnepalapp,"RACKM", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV4Classes.add(new ClubIV4Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV4Classes.add(new ClubIV4Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV4Classes.add(new ClubIV4Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV4Classes.add(new ClubIV4Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV4Classes.add(new ClubIV4Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV4Classes.add(new ClubIV4Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV4Classes.add(new ClubIV4Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV4Classes.add(new ClubIV4Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV4Classes.add(new ClubIV4Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV4Classes.add(new ClubIV4Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV4Classes.add(new ClubIV4Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV4Classes.add(new ClubIV4Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV4Classes.add(new ClubIV4Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV4Classes.add(new ClubIV4Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubIV4Classes;

    }

    public static ArrayList<ClubIV5Class> getClub5Data(){
        ArrayList<ClubIV5Class> clubIV5Classes = new ArrayList<>();
        clubIV5Classes.add(new ClubIV5Class(R.drawable.colorlogo_rotaractnepalapp,"RACK", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV5Classes.add(new ClubIV5Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV5Classes.add(new ClubIV5Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV5Classes.add(new ClubIV5Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV5Classes.add(new ClubIV5Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV5Classes.add(new ClubIV5Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV5Classes.add(new ClubIV5Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV5Classes.add(new ClubIV5Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV5Classes.add(new ClubIV5Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV5Classes.add(new ClubIV5Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV5Classes.add(new ClubIV5Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV5Classes.add(new ClubIV5Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV5Classes.add(new ClubIV5Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV5Classes.add(new ClubIV5Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV5Classes.add(new ClubIV5Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubIV5Classes;

    }


    public static ArrayList<ClubIV6Class> getClub6Data(){
        ArrayList<ClubIV6Class> clubIV6Classes = new ArrayList<>();
        clubIV6Classes.add(new ClubIV6Class(R.drawable.colorlogo_rotaractnepalapp,"RACKS", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV6Classes.add(new ClubIV6Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV6Classes.add(new ClubIV6Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV6Classes.add(new ClubIV6Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV6Classes.add(new ClubIV6Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV6Classes.add(new ClubIV6Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV6Classes.add(new ClubIV6Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV6Classes.add(new ClubIV6Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV6Classes.add(new ClubIV6Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV6Classes.add(new ClubIV6Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV6Classes.add(new ClubIV6Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV6Classes.add(new ClubIV6Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV6Classes.add(new ClubIV6Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV6Classes.add(new ClubIV6Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV6Classes.add(new ClubIV6Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubIV6Classes;

    }

    public static ArrayList<ClubIV7Class> getClub7Data(){
        ArrayList<ClubIV7Class> clubIV7Classes = new ArrayList<>();
        clubIV7Classes.add(new ClubIV7Class(R.drawable.colorlogo_rotaractnepalapp,"RACKYNE", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV7Classes.add(new ClubIV7Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV7Classes.add(new ClubIV7Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV7Classes.add(new ClubIV7Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV7Classes.add(new ClubIV7Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV7Classes.add(new ClubIV7Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV7Classes.add(new ClubIV7Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV7Classes.add(new ClubIV7Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV7Classes.add(new ClubIV7Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV7Classes.add(new ClubIV7Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV7Classes.add(new ClubIV7Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV7Classes.add(new ClubIV7Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV7Classes.add(new ClubIV7Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV7Classes.add(new ClubIV7Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV7Classes.add(new ClubIV7Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubIV7Classes;

    }

    public static ArrayList<ClubIV8Class> getClub8Data(){
        ArrayList<ClubIV8Class> clubIV8Classes = new ArrayList<>();
        clubIV8Classes.add(new ClubIV8Class(R.drawable.colorlogo_rotaractnepalapp,"RACMBIOM", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV8Classes.add(new ClubIV8Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV8Classes.add(new ClubIV8Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV8Classes.add(new ClubIV8Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV8Classes.add(new ClubIV8Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV8Classes.add(new ClubIV8Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV8Classes.add(new ClubIV8Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV8Classes.add(new ClubIV8Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV8Classes.add(new ClubIV8Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV8Classes.add(new ClubIV8Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV8Classes.add(new ClubIV8Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV8Classes.add(new ClubIV8Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV8Classes.add(new ClubIV8Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV8Classes.add(new ClubIV8Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV8Classes.add(new ClubIV8Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubIV8Classes;

    }

    public static ArrayList<ClubIV9Class> getClub9Data(){
        ArrayList<ClubIV9Class> clubIV9Classes = new ArrayList<>();
        clubIV9Classes.add(new ClubIV9Class(R.drawable.colorlogo_rotaractnepalapp,"RACP", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV9Classes.add(new ClubIV9Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV9Classes.add(new ClubIV9Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV9Classes.add(new ClubIV9Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV9Classes.add(new ClubIV9Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV9Classes.add(new ClubIV9Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV9Classes.add(new ClubIV9Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV9Classes.add(new ClubIV9Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV9Classes.add(new ClubIV9Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV9Classes.add(new ClubIV9Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV9Classes.add(new ClubIV9Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV9Classes.add(new ClubIV9Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV9Classes.add(new ClubIV9Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV9Classes.add(new ClubIV9Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV9Classes.add(new ClubIV9Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubIV9Classes;

    }

    public static ArrayList<ClubIV10Class> getClub10Data(){
        ArrayList<ClubIV10Class> clubIV10Classes = new ArrayList<>();
        clubIV10Classes.add(new ClubIV10Class(R.drawable.colorlogo_rotaractnepalapp,"RACR", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV10Classes.add(new ClubIV10Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV10Classes.add(new ClubIV10Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV10Classes.add(new ClubIV10Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV10Classes.add(new ClubIV10Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV10Classes.add(new ClubIV10Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV10Classes.add(new ClubIV10Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV10Classes.add(new ClubIV10Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV10Classes.add(new ClubIV10Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV10Classes.add(new ClubIV10Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV10Classes.add(new ClubIV10Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV10Classes.add(new ClubIV10Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV10Classes.add(new ClubIV10Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV10Classes.add(new ClubIV10Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV10Classes.add(new ClubIV10Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubIV10Classes;

    }

    public static ArrayList<ClubIV11Class> getClub11Data(){
        ArrayList<ClubIV11Class> clubIV11Classes = new ArrayList<>();
        clubIV11Classes.add(new ClubIV11Class(R.drawable.colorlogo_rotaractnepalapp,"RACS", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV11Classes.add(new ClubIV11Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV11Classes.add(new ClubIV11Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV11Classes.add(new ClubIV11Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV11Classes.add(new ClubIV11Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV11Classes.add(new ClubIV11Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV11Classes.add(new ClubIV11Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV11Classes.add(new ClubIV11Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV11Classes.add(new ClubIV11Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV11Classes.add(new ClubIV11Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV11Classes.add(new ClubIV11Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV11Classes.add(new ClubIV11Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV11Classes.add(new ClubIV11Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV11Classes.add(new ClubIV11Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV11Classes.add(new ClubIV11Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubIV11Classes;

    }

    public static ArrayList<ClubIV12Class> getClub12Data(){
        ArrayList<ClubIV12Class> clubIV12Classes = new ArrayList<>();
        clubIV12Classes.add(new ClubIV12Class(R.drawable.colorlogo_rotaractnepalapp,"RACTIC", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV12Classes.add(new ClubIV12Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV12Classes.add(new ClubIV12Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV12Classes.add(new ClubIV12Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV12Classes.add(new ClubIV12Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV12Classes.add(new ClubIV12Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV12Classes.add(new ClubIV12Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV12Classes.add(new ClubIV12Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV12Classes.add(new ClubIV12Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV12Classes.add(new ClubIV12Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV12Classes.add(new ClubIV12Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV12Classes.add(new ClubIV12Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV12Classes.add(new ClubIV12Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV12Classes.add(new ClubIV12Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIV12Classes.add(new ClubIV12Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubIV12Classes;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
