package np.com.rotaractnepalapp.rotaract.Activity.ClubActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Class.ClassClubIX.ClubIX10Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIX.ClubIX1Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIX.ClubIX2Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIX.ClubIX3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIX.ClubIX4Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIX.ClubIX5Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIX.ClubIX6Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIX.ClubIX7Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIX.ClubIX8Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubIX.ClubIX9Class;
import np.com.rotaractnepalapp.rotaract.Adapter.ClubIXAdapter.MainClubIXAdapter;
import np.com.rotaractnepalapp.rotaract.R;

public class ClubIXReview extends AppCompatActivity {

    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_ixreview);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Zone IX Club R.ID.NO. 3292");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_clubix_View);
        MainClubIXAdapter adapter = new MainClubIXAdapter(this, getObject());
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
        return objects;
    }

    public static ArrayList<ClubIX1Class> getClub1Data(){
        ArrayList<ClubIX1Class> clubIX1Classes = new ArrayList<>();
        clubIX1Classes.add(new ClubIX1Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubIX1Classes.add(new ClubIX1Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubIX1Classes.add(new ClubIX1Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubIX1Classes.add(new ClubIX1Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubIX1Classes.add(new ClubIX1Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubIX1Classes.add(new ClubIX1Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubIX1Classes.add(new ClubIX1Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubIX1Classes.add(new ClubIX1Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX1Classes.add(new ClubIX1Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX1Classes.add(new ClubIX1Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubIX1Classes.add(new ClubIX1Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubIX1Classes.add(new ClubIX1Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubIX1Classes.add(new ClubIX1Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubIX1Classes.add(new ClubIX1Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubIX1Classes.add(new ClubIX1Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubIX1Classes;

    }
    public static ArrayList<ClubIX2Class> getClub2Data(){
        ArrayList<ClubIX2Class> clubIX2Classes = new ArrayList<>();
        clubIX2Classes.add(new ClubIX2Class(R.mipmap.ic_app,"RACDK", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubIX2Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubIX2Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubIX2Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubIX2Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubIX2Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubIX2Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubIX2Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubIX2Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubIX2Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubIX2Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubIX2Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubIX2Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubIX2Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubIX2Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubIX2Classes;

    }
    public static ArrayList<ClubIX3Class> getClub3Data(){
        ArrayList<ClubIX3Class> clubIX3Classes = new ArrayList<>();
        clubIX3Classes.add(new ClubIX3Class(R.mipmap.ic_app,"RACG", R.mipmap.ic_app, "", "", "", ""));
        clubIX3Classes.add(new ClubIX3Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubIX3Classes.add(new ClubIX3Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubIX3Classes.add(new ClubIX3Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubIX3Classes.add(new ClubIX3Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubIX3Classes.add(new ClubIX3Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubIX3Classes.add(new ClubIX3Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX3Classes.add(new ClubIX3Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX3Classes.add(new ClubIX3Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubIX3Classes.add(new ClubIX3Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubIX3Classes.add(new ClubIX3Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubIX3Classes.add(new ClubIX3Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubIX3Classes.add(new ClubIX3Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubIX3Classes.add(new ClubIX3Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubIX3Classes;

    }
    public static ArrayList<ClubIX4Class> getClub4Data(){
        ArrayList<ClubIX4Class> clubIX4Classes = new ArrayList<>();
        clubIX4Classes.add(new ClubIX4Class(R.mipmap.ic_app,"RACKM", R.mipmap.ic_app, "", "", "", ""));
        clubIX4Classes.add(new ClubIX4Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubIX4Classes.add(new ClubIX4Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubIX4Classes.add(new ClubIX4Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubIX4Classes.add(new ClubIX4Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubIX4Classes.add(new ClubIX4Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubIX4Classes.add(new ClubIX4Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubIX4Classes.add(new ClubIX4Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX4Classes.add(new ClubIX4Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX4Classes.add(new ClubIX4Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubIX4Classes.add(new ClubIX4Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubIX4Classes.add(new ClubIX4Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubIX4Classes.add(new ClubIX4Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubIX4Classes.add(new ClubIX4Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubIX4Classes.add(new ClubIX4Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubIX4Classes;

    }

    public static ArrayList<ClubIX5Class> getClub5Data(){
        ArrayList<ClubIX5Class> clubIX5Classes = new ArrayList<>();
        clubIX5Classes.add(new ClubIX5Class(R.mipmap.ic_app,"RACK", R.mipmap.ic_app, "", "", "", ""));
        clubIX5Classes.add(new ClubIX5Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubIX5Classes.add(new ClubIX5Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubIX5Classes.add(new ClubIX5Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubIX5Classes.add(new ClubIX5Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubIX5Classes.add(new ClubIX5Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubIX5Classes.add(new ClubIX5Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubIX5Classes.add(new ClubIX5Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX5Classes.add(new ClubIX5Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX5Classes.add(new ClubIX5Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubIX5Classes.add(new ClubIX5Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubIX5Classes.add(new ClubIX5Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubIX5Classes.add(new ClubIX5Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubIX5Classes.add(new ClubIX5Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubIX5Classes.add(new ClubIX5Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubIX5Classes;

    }


    public static ArrayList<ClubIX6Class> getClub6Data(){
        ArrayList<ClubIX6Class> clubIX6Classes = new ArrayList<>();
        clubIX6Classes.add(new ClubIX6Class(R.mipmap.ic_app,"RACKS", R.mipmap.ic_app, "", "", "", ""));
        clubIX6Classes.add(new ClubIX6Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubIX6Classes.add(new ClubIX6Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubIX6Classes.add(new ClubIX6Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubIX6Classes.add(new ClubIX6Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubIX6Classes.add(new ClubIX6Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubIX6Classes.add(new ClubIX6Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubIX6Classes.add(new ClubIX6Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX6Classes.add(new ClubIX6Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX6Classes.add(new ClubIX6Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubIX6Classes.add(new ClubIX6Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubIX6Classes.add(new ClubIX6Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubIX6Classes.add(new ClubIX6Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubIX6Classes.add(new ClubIX6Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubIX6Classes.add(new ClubIX6Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubIX6Classes;

    }

    public static ArrayList<ClubIX7Class> getClub7Data(){
        ArrayList<ClubIX7Class> clubIX7Classes = new ArrayList<>();
        clubIX7Classes.add(new ClubIX7Class(R.mipmap.ic_app,"RACKYNE", R.mipmap.ic_app, "", "", "", ""));
        clubIX7Classes.add(new ClubIX7Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubIX7Classes.add(new ClubIX7Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubIX7Classes.add(new ClubIX7Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubIX7Classes.add(new ClubIX7Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubIX7Classes.add(new ClubIX7Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubIX7Classes.add(new ClubIX7Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubIX7Classes.add(new ClubIX7Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX7Classes.add(new ClubIX7Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX7Classes.add(new ClubIX7Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubIX7Classes.add(new ClubIX7Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubIX7Classes.add(new ClubIX7Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubIX7Classes.add(new ClubIX7Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubIX7Classes.add(new ClubIX7Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubIX7Classes.add(new ClubIX7Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubIX7Classes;

    }

    public static ArrayList<ClubIX8Class> getClub8Data(){
        ArrayList<ClubIX8Class> clubIX8Classes = new ArrayList<>();
        clubIX8Classes.add(new ClubIX8Class(R.mipmap.ic_app,"RACMBIOM", R.mipmap.ic_app, "", "", "", ""));
        clubIX8Classes.add(new ClubIX8Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubIX8Classes.add(new ClubIX8Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubIX8Classes.add(new ClubIX8Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubIX8Classes.add(new ClubIX8Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubIX8Classes.add(new ClubIX8Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubIX8Classes.add(new ClubIX8Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubIX8Classes.add(new ClubIX8Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX8Classes.add(new ClubIX8Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX8Classes.add(new ClubIX8Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubIX8Classes.add(new ClubIX8Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubIX8Classes.add(new ClubIX8Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubIX8Classes.add(new ClubIX8Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubIX8Classes.add(new ClubIX8Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubIX8Classes.add(new ClubIX8Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubIX8Classes;

    }

    public static ArrayList<ClubIX9Class> getClub9Data(){
        ArrayList<ClubIX9Class> clubIX9Classes = new ArrayList<>();
        clubIX9Classes.add(new ClubIX9Class(R.mipmap.ic_app,"RACP", R.mipmap.ic_app, "", "", "", ""));
        clubIX9Classes.add(new ClubIX9Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubIX9Classes.add(new ClubIX9Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubIX9Classes.add(new ClubIX9Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubIX9Classes.add(new ClubIX9Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubIX9Classes.add(new ClubIX9Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubIX9Classes.add(new ClubIX9Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubIX9Classes.add(new ClubIX9Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX9Classes.add(new ClubIX9Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX9Classes.add(new ClubIX9Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubIX9Classes.add(new ClubIX9Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubIX9Classes.add(new ClubIX9Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubIX9Classes.add(new ClubIX9Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubIX9Classes.add(new ClubIX9Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubIX9Classes.add(new ClubIX9Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubIX9Classes;

    }

    public static ArrayList<ClubIX10Class> getClub10Data(){
        ArrayList<ClubIX10Class> clubIX10Classes = new ArrayList<>();
        clubIX10Classes.add(new ClubIX10Class(R.mipmap.ic_app,"RACR", R.mipmap.ic_app, "", "", "", ""));
        clubIX10Classes.add(new ClubIX10Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubIX10Classes.add(new ClubIX10Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubIX10Classes.add(new ClubIX10Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubIX10Classes.add(new ClubIX10Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubIX10Classes.add(new ClubIX10Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubIX10Classes.add(new ClubIX10Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubIX10Classes.add(new ClubIX10Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX10Classes.add(new ClubIX10Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX10Classes.add(new ClubIX10Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubIX10Classes.add(new ClubIX10Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubIX10Classes.add(new ClubIX10Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubIX10Classes.add(new ClubIX10Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubIX10Classes.add(new ClubIX10Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubIX10Classes.add(new ClubIX10Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubIX10Classes;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
