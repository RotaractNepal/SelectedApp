package np.com.rotaractnepalapp.rotaract.Activity.ClubActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Adapter.ClubXIAdapter.MainClubXIAdapter;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXI.ClubXI10Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXI.ClubXI11Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXI.ClubXI1Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXI.ClubXI2Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXI.ClubXI3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXI.ClubXI4Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXI.ClubXI5Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXI.ClubXI6Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXI.ClubXI7Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXI.ClubXI8Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXI.ClubXI9Class;
import np.com.rotaractnepalapp.rotaract.R;

public class ClubXIReview extends AppCompatActivity {

    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_xireview);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Zone XI Club R.ID.NO. 3292");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_clubxi_View);
        MainClubXIAdapter adapter = new MainClubXIAdapter(this, getObject());
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
        return objects;
    }

    public static ArrayList<ClubXI1Class> getClub1Data(){
        ArrayList<ClubXI1Class> clubXI1Classes = new ArrayList<>();
        clubXI1Classes.add(new ClubXI1Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubXI1Classes.add(new ClubXI1Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXI1Classes.add(new ClubXI1Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubXI1Classes.add(new ClubXI1Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXI1Classes.add(new ClubXI1Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXI1Classes.add(new ClubXI1Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXI1Classes.add(new ClubXI1Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXI1Classes.add(new ClubXI1Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI1Classes.add(new ClubXI1Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI1Classes.add(new ClubXI1Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXI1Classes.add(new ClubXI1Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXI1Classes.add(new ClubXI1Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXI1Classes.add(new ClubXI1Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXI1Classes.add(new ClubXI1Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXI1Classes.add(new ClubXI1Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXI1Classes;

    }
    public static ArrayList<ClubXI2Class> getClub2Data(){
        ArrayList<ClubXI2Class> clubXI2Classes = new ArrayList<>();
        clubXI2Classes.add(new ClubXI2Class(R.mipmap.ic_app,"RACDK", R.mipmap.ic_app, "", "", "", ""));
        clubXI2Classes.add(new ClubXI2Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXI2Classes.add(new ClubXI2Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXI2Classes.add(new ClubXI2Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXI2Classes.add(new ClubXI2Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXI2Classes.add(new ClubXI2Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXI2Classes.add(new ClubXI2Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXI2Classes.add(new ClubXI2Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI2Classes.add(new ClubXI2Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI2Classes.add(new ClubXI2Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXI2Classes.add(new ClubXI2Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXI2Classes.add(new ClubXI2Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXI2Classes.add(new ClubXI2Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXI2Classes.add(new ClubXI2Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXI2Classes.add(new ClubXI2Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXI2Classes;

    }
    public static ArrayList<ClubXI3Class> getClub3Data(){
        ArrayList<ClubXI3Class> clubXI3Classes = new ArrayList<>();
        clubXI3Classes.add(new ClubXI3Class(R.mipmap.ic_app,"RACG", R.mipmap.ic_app, "", "", "", ""));
        clubXI3Classes.add(new ClubXI3Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXI3Classes.add(new ClubXI3Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXI3Classes.add(new ClubXI3Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXI3Classes.add(new ClubXI3Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXI3Classes.add(new ClubXI3Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXI3Classes.add(new ClubXI3Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXI3Classes.add(new ClubXI3Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI3Classes.add(new ClubXI3Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI3Classes.add(new ClubXI3Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXI3Classes.add(new ClubXI3Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXI3Classes.add(new ClubXI3Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXI3Classes.add(new ClubXI3Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXI3Classes.add(new ClubXI3Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXI3Classes.add(new ClubXI3Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXI3Classes;

    }
    public static ArrayList<ClubXI4Class> getClub4Data(){
        ArrayList<ClubXI4Class> clubXI4Classes = new ArrayList<>();
        clubXI4Classes.add(new ClubXI4Class(R.mipmap.ic_app,"RACKM", R.mipmap.ic_app, "", "", "", ""));
        clubXI4Classes.add(new ClubXI4Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXI4Classes.add(new ClubXI4Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXI4Classes.add(new ClubXI4Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXI4Classes.add(new ClubXI4Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXI4Classes.add(new ClubXI4Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXI4Classes.add(new ClubXI4Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXI4Classes.add(new ClubXI4Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI4Classes.add(new ClubXI4Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI4Classes.add(new ClubXI4Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXI4Classes.add(new ClubXI4Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXI4Classes.add(new ClubXI4Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXI4Classes.add(new ClubXI4Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXI4Classes.add(new ClubXI4Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXI4Classes.add(new ClubXI4Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXI4Classes;

    }

    public static ArrayList<ClubXI5Class> getClub5Data(){
        ArrayList<ClubXI5Class> clubXI5Classes = new ArrayList<>();
        clubXI5Classes.add(new ClubXI5Class(R.mipmap.ic_app,"RACK", R.mipmap.ic_app, "", "", "", ""));
        clubXI5Classes.add(new ClubXI5Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXI5Classes.add(new ClubXI5Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXI5Classes.add(new ClubXI5Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXI5Classes.add(new ClubXI5Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXI5Classes.add(new ClubXI5Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXI5Classes.add(new ClubXI5Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXI5Classes.add(new ClubXI5Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI5Classes.add(new ClubXI5Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI5Classes.add(new ClubXI5Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXI5Classes.add(new ClubXI5Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXI5Classes.add(new ClubXI5Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXI5Classes.add(new ClubXI5Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXI5Classes.add(new ClubXI5Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXI5Classes.add(new ClubXI5Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXI5Classes;

    }


    public static ArrayList<ClubXI6Class> getClub6Data(){
        ArrayList<ClubXI6Class> clubXI6Classes = new ArrayList<>();
        clubXI6Classes.add(new ClubXI6Class(R.mipmap.ic_app,"RACKS", R.mipmap.ic_app, "", "", "", ""));
        clubXI6Classes.add(new ClubXI6Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXI6Classes.add(new ClubXI6Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXI6Classes.add(new ClubXI6Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXI6Classes.add(new ClubXI6Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXI6Classes.add(new ClubXI6Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXI6Classes.add(new ClubXI6Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXI6Classes.add(new ClubXI6Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI6Classes.add(new ClubXI6Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI6Classes.add(new ClubXI6Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXI6Classes.add(new ClubXI6Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXI6Classes.add(new ClubXI6Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXI6Classes.add(new ClubXI6Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXI6Classes.add(new ClubXI6Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXI6Classes.add(new ClubXI6Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXI6Classes;

    }

    public static ArrayList<ClubXI7Class> getClub7Data(){
        ArrayList<ClubXI7Class> clubXI7Classes = new ArrayList<>();
        clubXI7Classes.add(new ClubXI7Class(R.mipmap.ic_app,"RACKYNE", R.mipmap.ic_app, "", "", "", ""));
        clubXI7Classes.add(new ClubXI7Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXI7Classes.add(new ClubXI7Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXI7Classes.add(new ClubXI7Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXI7Classes.add(new ClubXI7Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXI7Classes.add(new ClubXI7Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXI7Classes.add(new ClubXI7Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXI7Classes.add(new ClubXI7Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI7Classes.add(new ClubXI7Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI7Classes.add(new ClubXI7Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXI7Classes.add(new ClubXI7Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXI7Classes.add(new ClubXI7Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXI7Classes.add(new ClubXI7Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXI7Classes.add(new ClubXI7Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXI7Classes.add(new ClubXI7Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXI7Classes;

    }

    public static ArrayList<ClubXI8Class> getClub8Data(){
        ArrayList<ClubXI8Class> clubXI8Classes = new ArrayList<>();
        clubXI8Classes.add(new ClubXI8Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXI8Classes.add(new ClubXI8Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXI8Classes.add(new ClubXI8Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXI8Classes.add(new ClubXI8Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXI8Classes.add(new ClubXI8Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXI8Classes.add(new ClubXI8Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXI8Classes.add(new ClubXI8Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI8Classes.add(new ClubXI8Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI8Classes.add(new ClubXI8Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXI8Classes.add(new ClubXI8Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXI8Classes.add(new ClubXI8Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXI8Classes.add(new ClubXI8Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXI8Classes.add(new ClubXI8Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXI8Classes.add(new ClubXI8Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXI8Classes;

    }

    public static ArrayList<ClubXI9Class> getClub9Data(){
        ArrayList<ClubXI9Class> clubXI9Classes = new ArrayList<>();
        clubXI9Classes.add(new ClubXI9Class(R.mipmap.ic_app,"RACP", R.mipmap.ic_app, "", "", "", ""));
        clubXI9Classes.add(new ClubXI9Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXI9Classes.add(new ClubXI9Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXI9Classes.add(new ClubXI9Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXI9Classes.add(new ClubXI9Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXI9Classes.add(new ClubXI9Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXI9Classes.add(new ClubXI9Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXI9Classes.add(new ClubXI9Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI9Classes.add(new ClubXI9Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI9Classes.add(new ClubXI9Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXI9Classes.add(new ClubXI9Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXI9Classes.add(new ClubXI9Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXI9Classes.add(new ClubXI9Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXI9Classes.add(new ClubXI9Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXI9Classes.add(new ClubXI9Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXI9Classes;

    }

    public static ArrayList<ClubXI10Class> getClub10Data(){
        ArrayList<ClubXI10Class> clubXI10Classes = new ArrayList<>();
        clubXI10Classes.add(new ClubXI10Class(R.mipmap.ic_app,"RACR", R.mipmap.ic_app, "", "", "", ""));
        clubXI10Classes.add(new ClubXI10Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXI10Classes.add(new ClubXI10Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXI10Classes.add(new ClubXI10Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXI10Classes.add(new ClubXI10Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXI10Classes.add(new ClubXI10Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXI10Classes.add(new ClubXI10Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXI10Classes.add(new ClubXI10Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI10Classes.add(new ClubXI10Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI10Classes.add(new ClubXI10Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXI10Classes.add(new ClubXI10Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXI10Classes.add(new ClubXI10Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXI10Classes.add(new ClubXI10Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXI10Classes.add(new ClubXI10Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXI10Classes.add(new ClubXI10Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXI10Classes;

    }

    public static ArrayList<ClubXI11Class> getClub11Data(){
        ArrayList<ClubXI11Class> clubXI11Classes = new ArrayList<>();
        clubXI11Classes.add(new ClubXI11Class(R.mipmap.ic_app,"RACS", R.mipmap.ic_app, "", "", "", ""));
        clubXI11Classes.add(new ClubXI11Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXI11Classes.add(new ClubXI11Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubXI11Classes.add(new ClubXI11Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXI11Classes.add(new ClubXI11Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXI11Classes.add(new ClubXI11Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXI11Classes.add(new ClubXI11Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXI11Classes.add(new ClubXI11Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI11Classes.add(new ClubXI11Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXI11Classes.add(new ClubXI11Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXI11Classes.add(new ClubXI11Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXI11Classes.add(new ClubXI11Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXI11Classes.add(new ClubXI11Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXI11Classes.add(new ClubXI11Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXI11Classes.add(new ClubXI11Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXI11Classes;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
