package np.com.rotaractnepalapp.rotaract.Activity.ClubActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
        clubV1Classes.add(new ClubV1Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubV1Classes.add(new ClubV1Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubV1Classes;

    }
    public static ArrayList<ClubV2Class> getClub2Data(){
        ArrayList<ClubV2Class> clubV2Classes = new ArrayList<>();
        clubV2Classes.add(new ClubV2Class(R.mipmap.ic_app,"RACDK", R.mipmap.ic_app, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubV2Classes.add(new ClubV2Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubV2Classes;

    }
    public static ArrayList<ClubV3Class> getClub3Data(){
        ArrayList<ClubV3Class> clubV3Classes = new ArrayList<>();
        clubV3Classes.add(new ClubV3Class(R.mipmap.ic_app,"RACG", R.mipmap.ic_app, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubV3Classes.add(new ClubV3Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubV3Classes;

    }
    public static ArrayList<ClubV4Class> getClub4Data(){
        ArrayList<ClubV4Class> clubV4Classes = new ArrayList<>();
        clubV4Classes.add(new ClubV4Class(R.mipmap.ic_app,"RACKM", R.mipmap.ic_app, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubV4Classes.add(new ClubV4Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubV4Classes;

    }

    public static ArrayList<ClubV5Class> getClub5Data(){
        ArrayList<ClubV5Class> clubV5Classes = new ArrayList<>();
        clubV5Classes.add(new ClubV5Class(R.mipmap.ic_app,"RACK", R.mipmap.ic_app, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubV5Classes.add(new ClubV5Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubV5Classes;

    }


    public static ArrayList<ClubV6Class> getClub6Data(){
        ArrayList<ClubV6Class> clubV6Classes = new ArrayList<>();
        clubV6Classes.add(new ClubV6Class(R.mipmap.ic_app,"RACKS", R.mipmap.ic_app, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubV6Classes.add(new ClubV6Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubV6Classes;

    }

    public static ArrayList<ClubV7Class> getClub7Data(){
        ArrayList<ClubV7Class> clubV7Classes = new ArrayList<>();
        clubV7Classes.add(new ClubV7Class(R.mipmap.ic_app,"RACKYNE", R.mipmap.ic_app, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubV7Classes.add(new ClubV7Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubV7Classes;

    }

    public static ArrayList<ClubV8Class> getClub8Data(){
        ArrayList<ClubV8Class> clubV8Classes = new ArrayList<>();
        clubV8Classes.add(new ClubV8Class(R.mipmap.ic_app,"RACMBIOM", R.mipmap.ic_app, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubV8Classes.add(new ClubV8Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubV8Classes;

    }

    public static ArrayList<ClubV9Class> getClub9Data(){
        ArrayList<ClubV9Class> clubV9Classes = new ArrayList<>();
        clubV9Classes.add(new ClubV9Class(R.mipmap.ic_app,"RACP", R.mipmap.ic_app, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubV9Classes.add(new ClubV9Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubV9Classes;

    }

    public static ArrayList<ClubV10Class> getClub10Data(){
        ArrayList<ClubV10Class> clubV10Classes = new ArrayList<>();
        clubV10Classes.add(new ClubV10Class(R.mipmap.ic_app,"RACR", R.mipmap.ic_app, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubV10Classes.add(new ClubV10Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubV10Classes;

    }

    public static ArrayList<ClubV11Class> getClub11Data(){
        ArrayList<ClubV11Class> clubV11Classes = new ArrayList<>();
        clubV11Classes.add(new ClubV11Class(R.mipmap.ic_app,"RACS", R.mipmap.ic_app, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubV11Classes.add(new ClubV11Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubV11Classes;

    }

    public static ArrayList<ClubV12Class> getClub12Data(){
        ArrayList<ClubV12Class> clubV12Classes = new ArrayList<>();
        clubV12Classes.add(new ClubV12Class(R.mipmap.ic_app,"RACTIC", R.mipmap.ic_app, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubV12Classes.add(new ClubV12Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubV12Classes;

    }

    public static ArrayList<ClubV13Class> getClub13Data(){
        ArrayList<ClubV13Class> clubV13Classes = new ArrayList<>();
        clubV13Classes.add(new ClubV13Class(R.mipmap.ic_app,"RACTIC", R.mipmap.ic_app, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubV13Classes.add(new ClubV13Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
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
