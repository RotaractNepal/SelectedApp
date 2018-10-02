package np.com.rotaractnepalapp.rotaract.Activity.ClubActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
        clubXII1Classes.add(new ClubXII1Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXII1Classes.add(new ClubXII1Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXII1Classes;

    }
    public static ArrayList<ClubXII2Class> getClub2Data(){
        ArrayList<ClubXII2Class> clubXII2Classes = new ArrayList<>();
        clubXII2Classes.add(new ClubXII2Class(R.mipmap.ic_app,"RACDK", R.mipmap.ic_app, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXII2Classes.add(new ClubXII2Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXII2Classes;

    }
    public static ArrayList<ClubXII3Class> getClub3Data(){
        ArrayList<ClubXII3Class> clubXII3Classes = new ArrayList<>();
        clubXII3Classes.add(new ClubXII3Class(R.mipmap.ic_app,"RACG", R.mipmap.ic_app, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXII3Classes.add(new ClubXII3Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXII3Classes;

    }
    public static ArrayList<ClubXII4Class> getClub4Data(){
        ArrayList<ClubXII4Class> clubXII4Classes = new ArrayList<>();
        clubXII4Classes.add(new ClubXII4Class(R.mipmap.ic_app,"RACKM", R.mipmap.ic_app, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXII4Classes.add(new ClubXII4Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXII4Classes;

    }

    public static ArrayList<ClubXII5Class> getClub5Data(){
        ArrayList<ClubXII5Class> clubXII5Classes = new ArrayList<>();
        clubXII5Classes.add(new ClubXII5Class(R.mipmap.ic_app,"RACK", R.mipmap.ic_app, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXII5Classes.add(new ClubXII5Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXII5Classes;

    }


    public static ArrayList<ClubXII6Class> getClub6Data(){
        ArrayList<ClubXII6Class> clubXII6Classes = new ArrayList<>();
        clubXII6Classes.add(new ClubXII6Class(R.mipmap.ic_app,"RACKS", R.mipmap.ic_app, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXII6Classes.add(new ClubXII6Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXII6Classes;

    }

    public static ArrayList<ClubXII7Class> getClub7Data(){
        ArrayList<ClubXII7Class> clubXII7Classes = new ArrayList<>();
        clubXII7Classes.add(new ClubXII7Class(R.mipmap.ic_app,"RACKYNE", R.mipmap.ic_app, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXII7Classes.add(new ClubXII7Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXII7Classes;

    }

    public static ArrayList<ClubXII8Class> getClub8Data(){
        ArrayList<ClubXII8Class> clubXII8Classes = new ArrayList<>();
        clubXII8Classes.add(new ClubXII8Class(R.mipmap.ic_app,"RACMBIOM", R.mipmap.ic_app, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXII8Classes.add(new ClubXII8Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXII8Classes;

    }

    public static ArrayList<ClubXII9Class> getClub9Data(){
        ArrayList<ClubXII9Class> clubXII9Classes = new ArrayList<>();
        clubXII9Classes.add(new ClubXII9Class(R.mipmap.ic_app,"RACP", R.mipmap.ic_app, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXII9Classes.add(new ClubXII9Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXII9Classes;

    }

    public static ArrayList<ClubXII10Class> getClub10Data(){
        ArrayList<ClubXII10Class> clubXII10Classes = new ArrayList<>();
        clubXII10Classes.add(new ClubXII10Class(R.mipmap.ic_app,"RACR", R.mipmap.ic_app, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXII10Classes.add(new ClubXII10Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXII10Classes;

    }

    public static ArrayList<ClubXII11Class> getClub11Data(){
        ArrayList<ClubXII11Class> clubXII11Classes = new ArrayList<>();
        clubXII11Classes.add(new ClubXII11Class(R.mipmap.ic_app,"RACS", R.mipmap.ic_app, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXII11Classes.add(new ClubXII11Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXII11Classes;

    }

    public static ArrayList<ClubXII12Class> getClub12Data(){
        ArrayList<ClubXII12Class> clubXII12Classes = new ArrayList<>();
        clubXII12Classes.add(new ClubXII12Class(R.mipmap.ic_app,"RACTIC", R.mipmap.ic_app, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXII12Classes.add(new ClubXII12Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
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
