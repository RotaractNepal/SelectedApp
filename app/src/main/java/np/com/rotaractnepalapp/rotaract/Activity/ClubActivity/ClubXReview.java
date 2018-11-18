package np.com.rotaractnepalapp.rotaract.Activity.ClubActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX10Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX1Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX2Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX4Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX5Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX6Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX7Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX8Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubX.ClubX9Class;
import np.com.rotaractnepalapp.rotaract.Adapter.ClubXAdapter.MainClubXAdapter;
import np.com.rotaractnepalapp.rotaract.R;

public class ClubXReview extends AppCompatActivity {

    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_xreview);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Zone X Club R.ID.NO. 3292");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

       RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_clubx_View);
       MainClubXAdapter adapter = new MainClubXAdapter(this, getObject());
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

    public static ArrayList<ClubX1Class> getClub1Data(){
        ArrayList<ClubX1Class> clubX1Classes = new ArrayList<>();
        clubX1Classes.add(new ClubX1Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubX1Classes;

    }
    public static ArrayList<ClubX2Class> getClub2Data(){
        ArrayList<ClubX2Class> clubIX2Classes = new ArrayList<>();
        clubIX2Classes.add(new ClubX2Class(R.drawable.colorlogo_rotaractnepalapp,"RACDK", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubIX2Classes;

    }
    public static ArrayList<ClubX3Class> getClub3Data(){
        ArrayList<ClubX3Class> clubX3Classes = new ArrayList<>();
        clubX3Classes.add(new ClubX3Class(R.drawable.colorlogo_rotaractnepalapp,"RACG", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubX3Classes;

    }
    public static ArrayList<ClubX4Class> getClub4Data(){
        ArrayList<ClubX4Class> clubX4Classes = new ArrayList<>();
        clubX4Classes.add(new ClubX4Class(R.drawable.colorlogo_rotaractnepalapp,"RACKM", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubX4Classes;

    }

    public static ArrayList<ClubX5Class> getClub5Data(){
        ArrayList<ClubX5Class> clubX5Classes = new ArrayList<>();
        clubX5Classes.add(new ClubX5Class(R.drawable.colorlogo_rotaractnepalapp,"RACK", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubX5Classes;

    }


    public static ArrayList<ClubX6Class> getClub6Data(){
        ArrayList<ClubX6Class> clubX6Classes = new ArrayList<>();
        clubX6Classes.add(new ClubX6Class(R.drawable.colorlogo_rotaractnepalapp,"RACKS", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubX6Classes;

    }

    public static ArrayList<ClubX7Class> getClub7Data(){
        ArrayList<ClubX7Class> clubX7Classes = new ArrayList<>();
        clubX7Classes.add(new ClubX7Class(R.drawable.colorlogo_rotaractnepalapp,"RACKYNE", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubX7Classes;

    }

    public static ArrayList<ClubX8Class> getClub8Data(){
        ArrayList<ClubX8Class> clubX8Classes = new ArrayList<>();
        clubX8Classes.add(new ClubX8Class(R.drawable.colorlogo_rotaractnepalapp,"RACMBIOM", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubX8Classes;

    }

    public static ArrayList<ClubX9Class> getClub9Data(){
        ArrayList<ClubX9Class> clubX9Classes = new ArrayList<>();
        clubX9Classes.add(new ClubX9Class(R.drawable.colorlogo_rotaractnepalapp,"RACP", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubX9Classes;

    }

    public static ArrayList<ClubX10Class> getClub10Data(){
        ArrayList<ClubX10Class> clubX10Classes = new ArrayList<>();
        clubX10Classes.add(new ClubX10Class(R.drawable.colorlogo_rotaractnepalapp,"RACR", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubX10Classes;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
