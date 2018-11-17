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
        clubI1Classes.add(new ClubI1Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubI1Classes.add(new ClubI1Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubI1Classes;

    }

    public static ArrayList<ClubI2Class> getClub2Data(){
        ArrayList<ClubI2Class> clubI2Classes = new ArrayList<>();
        clubI2Classes.add(new ClubI2Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubI2Classes.add(new ClubI2Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubI2Classes;

    }

    public static ArrayList<ClubI3Class> getClub3Data(){
        ArrayList<ClubI3Class> clubI3Classes = new ArrayList<>();
        clubI3Classes.add(new ClubI3Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubI3Classes.add(new ClubI3Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubI3Classes;

    }

    public static ArrayList<ClubI4Class> getClub4Data(){
        ArrayList<ClubI4Class> clubI4Classes = new ArrayList<>();
        clubI4Classes.add(new ClubI4Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubI4Classes.add(new ClubI4Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubI4Classes;

    }

    public static ArrayList<ClubI5Class> getClub5Data(){
        ArrayList<ClubI5Class> clubI5Classes = new ArrayList<>();
        clubI5Classes.add(new ClubI5Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubI5Classes.add(new ClubI5Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubI5Classes;

    }

    public static ArrayList<ClubI6Class> getClub6Data(){
        ArrayList<ClubI6Class> clubI6Classes = new ArrayList<>();
        clubI6Classes.add(new ClubI6Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubI6Classes.add(new ClubI6Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubI6Classes;

    }

    public static ArrayList<ClubI7Class> getClub7Data(){
        ArrayList<ClubI7Class> clubI7Classes = new ArrayList<>();
        clubI7Classes.add(new ClubI7Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubI7Classes.add(new ClubI7Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubI7Classes;

    }

    public static ArrayList<ClubI8Class> getClub8Data(){
        ArrayList<ClubI8Class> clubI8Classes = new ArrayList<>();
        clubI8Classes.add(new ClubI8Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubI8Classes.add(new ClubI8Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubI8Classes;

    }

    public static ArrayList<ClubI9Class> getClub9Data(){
        ArrayList<ClubI9Class> clubI9Classes = new ArrayList<>();
        clubI9Classes.add(new ClubI9Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubI9Classes.add(new ClubI9Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
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
