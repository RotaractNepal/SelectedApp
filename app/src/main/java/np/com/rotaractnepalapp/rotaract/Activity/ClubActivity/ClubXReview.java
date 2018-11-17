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
        clubX1Classes.add(new ClubX1Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubX1Classes.add(new ClubX1Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubX1Classes;

    }
    public static ArrayList<ClubX2Class> getClub2Data(){
        ArrayList<ClubX2Class> clubIX2Classes = new ArrayList<>();
        clubIX2Classes.add(new ClubX2Class(R.mipmap.ic_app,"RACDK", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubIX2Classes.add(new ClubX2Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubIX2Classes;

    }
    public static ArrayList<ClubX3Class> getClub3Data(){
        ArrayList<ClubX3Class> clubX3Classes = new ArrayList<>();
        clubX3Classes.add(new ClubX3Class(R.mipmap.ic_app,"RACG", R.mipmap.ic_app, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubX3Classes.add(new ClubX3Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubX3Classes;

    }
    public static ArrayList<ClubX4Class> getClub4Data(){
        ArrayList<ClubX4Class> clubX4Classes = new ArrayList<>();
        clubX4Classes.add(new ClubX4Class(R.mipmap.ic_app,"RACKM", R.mipmap.ic_app, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubX4Classes.add(new ClubX4Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubX4Classes;

    }

    public static ArrayList<ClubX5Class> getClub5Data(){
        ArrayList<ClubX5Class> clubX5Classes = new ArrayList<>();
        clubX5Classes.add(new ClubX5Class(R.mipmap.ic_app,"RACK", R.mipmap.ic_app, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubX5Classes.add(new ClubX5Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubX5Classes;

    }


    public static ArrayList<ClubX6Class> getClub6Data(){
        ArrayList<ClubX6Class> clubX6Classes = new ArrayList<>();
        clubX6Classes.add(new ClubX6Class(R.mipmap.ic_app,"RACKS", R.mipmap.ic_app, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubX6Classes.add(new ClubX6Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubX6Classes;

    }

    public static ArrayList<ClubX7Class> getClub7Data(){
        ArrayList<ClubX7Class> clubX7Classes = new ArrayList<>();
        clubX7Classes.add(new ClubX7Class(R.mipmap.ic_app,"RACKYNE", R.mipmap.ic_app, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubX7Classes.add(new ClubX7Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubX7Classes;

    }

    public static ArrayList<ClubX8Class> getClub8Data(){
        ArrayList<ClubX8Class> clubX8Classes = new ArrayList<>();
        clubX8Classes.add(new ClubX8Class(R.mipmap.ic_app,"RACMBIOM", R.mipmap.ic_app, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubX8Classes.add(new ClubX8Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubX8Classes;

    }

    public static ArrayList<ClubX9Class> getClub9Data(){
        ArrayList<ClubX9Class> clubX9Classes = new ArrayList<>();
        clubX9Classes.add(new ClubX9Class(R.mipmap.ic_app,"RACP", R.mipmap.ic_app, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubX9Classes.add(new ClubX9Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubX9Classes;

    }

    public static ArrayList<ClubX10Class> getClub10Data(){
        ArrayList<ClubX10Class> clubX10Classes = new ArrayList<>();
        clubX10Classes.add(new ClubX10Class(R.mipmap.ic_app,"RACR", R.mipmap.ic_app, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubX10Classes.add(new ClubX10Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
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
