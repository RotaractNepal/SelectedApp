package np.com.rotaractnepalapp.rotaract.Activity.ClubActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Class.ClassClubI.ClubI1Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubI.ClubI2Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubI.ClubI3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubI.ClubI4Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubI.ClubI5Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubI.ClubI6Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubI.ClubI7Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubI.ClubI8Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubI.ClubI9Class;
import np.com.rotaractnepalapp.rotaract.Adapter.ClubIAdapter.MainClubIAdapter;
import np.com.rotaractnepalapp.rotaract.R;

public class ClubIReview extends AppCompatActivity {

    private ArrayList<Object> objects = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_ireview);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Zone I Club R.ID.NO. 3292");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_clubi_View);
        MainClubIAdapter adapter = new MainClubIAdapter(this, getObject());
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

    public static ArrayList<ClubI1Class> getClub1Data(){
        ArrayList<ClubI1Class> clubI1Classes = new ArrayList<>();
        clubI1Classes.add(new ClubI1Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubI1Classes;

    }

    public static ArrayList<ClubI2Class> getClub2Data(){
        ArrayList<ClubI2Class> clubI2Classes = new ArrayList<>();
        clubI2Classes.add(new ClubI2Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubI2Classes;

    }

    public static ArrayList<ClubI3Class> getClub3Data(){
        ArrayList<ClubI3Class> clubI3Classes = new ArrayList<>();
        clubI3Classes.add(new ClubI3Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubI3Classes;

    }

    public static ArrayList<ClubI4Class> getClub4Data(){
        ArrayList<ClubI4Class> clubI4Classes = new ArrayList<>();
        clubI4Classes.add(new ClubI4Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubI4Classes;

    }

    public static ArrayList<ClubI5Class> getClub5Data(){
        ArrayList<ClubI5Class> clubI5Classes = new ArrayList<>();
        clubI5Classes.add(new ClubI5Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubI5Classes;

    }

    public static ArrayList<ClubI6Class> getClub6Data(){
        ArrayList<ClubI6Class> clubI6Classes = new ArrayList<>();
        clubI6Classes.add(new ClubI6Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubI6Classes;

    }

    public static ArrayList<ClubI7Class> getClub7Data(){
        ArrayList<ClubI7Class> clubI7Classes = new ArrayList<>();
        clubI7Classes.add(new ClubI7Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubI7Classes;

    }

    public static ArrayList<ClubI8Class> getClub8Data(){
        ArrayList<ClubI8Class> clubI8Classes = new ArrayList<>();
        clubI8Classes.add(new ClubI8Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubI8Classes;

    }

    public static ArrayList<ClubI9Class> getClub9Data(){
        ArrayList<ClubI9Class> clubI9Classes = new ArrayList<>();
        clubI9Classes.add(new ClubI9Class(R.drawable.colorlogo_rotaractnepalapp,"RACB", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.drawable.colorlogo_rotaractnepalapp,"President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.drawable.colorlogo_rotaractnepalapp,"Immediate Past", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.drawable.colorlogo_rotaractnepalapp,"Vice President", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.drawable.colorlogo_rotaractnepalapp,"Secretary", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.drawable.colorlogo_rotaractnepalapp,"Treasurer", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.drawable.colorlogo_rotaractnepalapp,"Club Service Director", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.drawable.colorlogo_rotaractnepalapp,"International Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.drawable.colorlogo_rotaractnepalapp,"Community Service", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.drawable.colorlogo_rotaractnepalapp,"Profession Development", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.drawable.colorlogo_rotaractnepalapp,"Assistant Directors", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.drawable.colorlogo_rotaractnepalapp,"Sergeant-At-Arms", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.drawable.colorlogo_rotaractnepalapp,"Fundraising Chair", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.drawable.colorlogo_rotaractnepalapp,"Public Relations", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.drawable.colorlogo_rotaractnepalapp,"Information Technology", R.drawable.colorlogo_rotaractnepalapp, "", "", "", ""));
        return clubI9Classes;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
