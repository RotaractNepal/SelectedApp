package np.com.rotaractnepalapp.rotaract.Activity.ClubActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Class.ClassClubVII.ClubVII1Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVII.ClubVII2Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVII.ClubVII3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVII.ClubVII4Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVII.ClubVII5Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVII.ClubVII6Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVII.ClubVII7Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVII.ClubVII8Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVII.ClubVII9Class;
import np.com.rotaractnepalapp.rotaract.Adapter.ClubVIIAdapter.MainClubVIIAdapter;
import np.com.rotaractnepalapp.rotaract.R;

public class ClubVIIReview extends AppCompatActivity {

    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_viireview);
        this.setTitle("Zone VII Club R.ID.NO. 3292");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_clubvii_View);
        MainClubVIIAdapter adapter = new MainClubVIIAdapter(this, getObject());
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

    public static ArrayList<ClubVII1Class> getClub1Data(){
        ArrayList<ClubVII1Class> clubVII1Classes = new ArrayList<>();
        clubVII1Classes.add(new ClubVII1Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVII1Classes.add(new ClubVII1Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVII1Classes.add(new ClubVII1Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVII1Classes.add(new ClubVII1Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVII1Classes.add(new ClubVII1Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVII1Classes.add(new ClubVII1Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVII1Classes.add(new ClubVII1Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVII1Classes.add(new ClubVII1Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVII1Classes.add(new ClubVII1Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVII1Classes.add(new ClubVII1Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVII1Classes.add(new ClubVII1Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVII1Classes.add(new ClubVII1Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVII1Classes.add(new ClubVII1Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVII1Classes.add(new ClubVII1Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVII1Classes.add(new ClubVII1Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVII1Classes;

    }

    public static ArrayList<ClubVII2Class> getClub2Data(){
        ArrayList<ClubVII2Class> clubVII2Classes = new ArrayList<>();
        clubVII2Classes.add(new ClubVII2Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVII2Classes.add(new ClubVII2Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVII2Classes.add(new ClubVII2Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVII2Classes.add(new ClubVII2Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVII2Classes.add(new ClubVII2Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVII2Classes.add(new ClubVII2Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVII2Classes.add(new ClubVII2Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVII2Classes.add(new ClubVII2Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVII2Classes.add(new ClubVII2Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVII2Classes.add(new ClubVII2Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVII2Classes.add(new ClubVII2Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVII2Classes.add(new ClubVII2Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVII2Classes.add(new ClubVII2Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVII2Classes.add(new ClubVII2Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVII2Classes.add(new ClubVII2Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVII2Classes;

    }

    public static ArrayList<ClubVII3Class> getClub3Data(){
        ArrayList<ClubVII3Class> clubVII3Classes = new ArrayList<>();
        clubVII3Classes.add(new ClubVII3Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVII3Classes.add(new ClubVII3Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVII3Classes.add(new ClubVII3Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVII3Classes.add(new ClubVII3Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVII3Classes.add(new ClubVII3Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVII3Classes.add(new ClubVII3Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVII3Classes.add(new ClubVII3Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVII3Classes.add(new ClubVII3Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVII3Classes.add(new ClubVII3Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVII3Classes.add(new ClubVII3Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVII3Classes.add(new ClubVII3Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVII3Classes.add(new ClubVII3Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVII3Classes.add(new ClubVII3Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVII3Classes.add(new ClubVII3Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVII3Classes.add(new ClubVII3Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVII3Classes;

    }

    public static ArrayList<ClubVII4Class> getClub4Data(){
        ArrayList<ClubVII4Class> clubVII4Classes = new ArrayList<>();
        clubVII4Classes.add(new ClubVII4Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVII4Classes.add(new ClubVII4Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVII4Classes.add(new ClubVII4Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVII4Classes.add(new ClubVII4Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVII4Classes.add(new ClubVII4Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVII4Classes.add(new ClubVII4Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVII4Classes.add(new ClubVII4Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVII4Classes.add(new ClubVII4Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVII4Classes.add(new ClubVII4Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVII4Classes.add(new ClubVII4Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVII4Classes.add(new ClubVII4Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVII4Classes.add(new ClubVII4Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVII4Classes.add(new ClubVII4Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVII4Classes.add(new ClubVII4Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVII4Classes.add(new ClubVII4Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVII4Classes;

    }

    public static ArrayList<ClubVII5Class> getClub5Data(){
        ArrayList<ClubVII5Class> clubVII5Classes = new ArrayList<>();
        clubVII5Classes.add(new ClubVII5Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVII5Classes.add(new ClubVII5Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVII5Classes.add(new ClubVII5Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVII5Classes.add(new ClubVII5Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVII5Classes.add(new ClubVII5Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVII5Classes.add(new ClubVII5Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVII5Classes.add(new ClubVII5Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVII5Classes.add(new ClubVII5Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVII5Classes.add(new ClubVII5Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVII5Classes.add(new ClubVII5Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVII5Classes.add(new ClubVII5Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVII5Classes.add(new ClubVII5Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVII5Classes.add(new ClubVII5Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVII5Classes.add(new ClubVII5Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVII5Classes.add(new ClubVII5Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVII5Classes;

    }

    public static ArrayList<ClubVII6Class> getClub6Data(){
        ArrayList<ClubVII6Class> clubVII6Classes = new ArrayList<>();
        clubVII6Classes.add(new ClubVII6Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVII6Classes.add(new ClubVII6Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVII6Classes.add(new ClubVII6Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVII6Classes.add(new ClubVII6Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVII6Classes.add(new ClubVII6Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVII6Classes.add(new ClubVII6Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVII6Classes.add(new ClubVII6Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVII6Classes.add(new ClubVII6Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVII6Classes.add(new ClubVII6Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVII6Classes.add(new ClubVII6Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVII6Classes.add(new ClubVII6Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVII6Classes.add(new ClubVII6Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVII6Classes.add(new ClubVII6Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVII6Classes.add(new ClubVII6Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVII6Classes.add(new ClubVII6Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVII6Classes;

    }

    public static ArrayList<ClubVII7Class> getClub7Data(){
        ArrayList<ClubVII7Class> clubVII7Classes = new ArrayList<>();
        clubVII7Classes.add(new ClubVII7Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVII7Classes.add(new ClubVII7Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVII7Classes.add(new ClubVII7Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVII7Classes.add(new ClubVII7Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVII7Classes.add(new ClubVII7Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVII7Classes.add(new ClubVII7Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVII7Classes.add(new ClubVII7Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVII7Classes.add(new ClubVII7Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVII7Classes.add(new ClubVII7Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVII7Classes.add(new ClubVII7Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVII7Classes.add(new ClubVII7Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVII7Classes.add(new ClubVII7Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVII7Classes.add(new ClubVII7Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVII7Classes.add(new ClubVII7Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVII7Classes.add(new ClubVII7Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVII7Classes;

    }

    public static ArrayList<ClubVII8Class> getClub8Data(){
        ArrayList<ClubVII8Class> clubVII8Classes = new ArrayList<>();
        clubVII8Classes.add(new ClubVII8Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVII8Classes.add(new ClubVII8Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVII8Classes.add(new ClubVII8Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVII8Classes.add(new ClubVII8Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVII8Classes.add(new ClubVII8Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVII8Classes.add(new ClubVII8Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVII8Classes.add(new ClubVII8Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVII8Classes.add(new ClubVII8Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVII8Classes.add(new ClubVII8Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVII8Classes.add(new ClubVII8Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVII8Classes.add(new ClubVII8Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVII8Classes.add(new ClubVII8Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVII8Classes.add(new ClubVII8Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVII8Classes.add(new ClubVII8Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVII8Classes.add(new ClubVII8Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVII8Classes;

    }

    public static ArrayList<ClubVII9Class> getClub9Data(){
        ArrayList<ClubVII9Class> clubVII9Classes = new ArrayList<>();
        clubVII9Classes.add(new ClubVII9Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVII9Classes.add(new ClubVII9Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVII9Classes.add(new ClubVII9Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVII9Classes.add(new ClubVII9Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVII9Classes.add(new ClubVII9Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVII9Classes.add(new ClubVII9Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVII9Classes.add(new ClubVII9Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVII9Classes.add(new ClubVII9Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVII9Classes.add(new ClubVII9Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVII9Classes.add(new ClubVII9Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVII9Classes.add(new ClubVII9Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVII9Classes.add(new ClubVII9Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVII9Classes.add(new ClubVII9Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVII9Classes.add(new ClubVII9Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVII9Classes.add(new ClubVII9Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVII9Classes;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
