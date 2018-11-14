package np.com.rotaractnepalapp.rotaract.Activity.ClubActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Adapter.ClubVIAdapter.MainClubVIAdapter;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI10Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI11Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI12Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI13Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI1Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI2Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI4Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI5Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI6Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI7Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI8Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI9Class;
import np.com.rotaractnepalapp.rotaract.R;


public class ClubVIReview extends AppCompatActivity {

    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_vireview);
        this.setTitle("Zone VI Club R.ID.NO. 3292");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_clubvi_View);
        MainClubVIAdapter adapter = new MainClubVIAdapter(this, getObject());
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

    public static ArrayList<ClubVI1Class> getClub1Data(){
        ArrayList<ClubVI1Class> clubVI1Classes = new ArrayList<>();
        clubVI1Classes.add(new ClubVI1Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubVI1Classes.add(new ClubVI1Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVI1Classes.add(new ClubVI1Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubVI1Classes.add(new ClubVI1Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVI1Classes.add(new ClubVI1Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVI1Classes.add(new ClubVI1Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVI1Classes.add(new ClubVI1Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVI1Classes.add(new ClubVI1Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI1Classes.add(new ClubVI1Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI1Classes.add(new ClubVI1Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVI1Classes.add(new ClubVI1Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVI1Classes.add(new ClubVI1Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVI1Classes.add(new ClubVI1Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVI1Classes.add(new ClubVI1Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVI1Classes.add(new ClubVI1Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVI1Classes;

    }
    public static ArrayList<ClubVI2Class> getClub2Data(){
        ArrayList<ClubVI2Class> clubVI2Classes = new ArrayList<>();
        clubVI2Classes.add(new ClubVI2Class(R.mipmap.ic_app,"RACDK", R.mipmap.ic_app, "", "", "", ""));
        clubVI2Classes.add(new ClubVI2Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVI2Classes.add(new ClubVI2Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubVI2Classes.add(new ClubVI2Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVI2Classes.add(new ClubVI2Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVI2Classes.add(new ClubVI2Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVI2Classes.add(new ClubVI2Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVI2Classes.add(new ClubVI2Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI2Classes.add(new ClubVI2Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI2Classes.add(new ClubVI2Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVI2Classes.add(new ClubVI2Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVI2Classes.add(new ClubVI2Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVI2Classes.add(new ClubVI2Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVI2Classes.add(new ClubVI2Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVI2Classes.add(new ClubVI2Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVI2Classes;

    }
    public static ArrayList<ClubVI3Class> getClub3Data(){
        ArrayList<ClubVI3Class> clubVI3Classes = new ArrayList<>();
        clubVI3Classes.add(new ClubVI3Class(R.mipmap.ic_app,"RACG", R.mipmap.ic_app, "", "", "", ""));
        clubVI3Classes.add(new ClubVI3Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVI3Classes.add(new ClubVI3Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubVI3Classes.add(new ClubVI3Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVI3Classes.add(new ClubVI3Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVI3Classes.add(new ClubVI3Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVI3Classes.add(new ClubVI3Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVI3Classes.add(new ClubVI3Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI3Classes.add(new ClubVI3Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI3Classes.add(new ClubVI3Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVI3Classes.add(new ClubVI3Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVI3Classes.add(new ClubVI3Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVI3Classes.add(new ClubVI3Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVI3Classes.add(new ClubVI3Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVI3Classes.add(new ClubVI3Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVI3Classes;

    }
    public static ArrayList<ClubVI4Class> getClub4Data(){
        ArrayList<ClubVI4Class> clubVI4Classes = new ArrayList<>();
        clubVI4Classes.add(new ClubVI4Class(R.mipmap.ic_app,"RACKM", R.mipmap.ic_app, "", "", "", ""));
        clubVI4Classes.add(new ClubVI4Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVI4Classes.add(new ClubVI4Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubVI4Classes.add(new ClubVI4Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVI4Classes.add(new ClubVI4Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVI4Classes.add(new ClubVI4Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVI4Classes.add(new ClubVI4Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVI4Classes.add(new ClubVI4Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI4Classes.add(new ClubVI4Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI4Classes.add(new ClubVI4Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVI4Classes.add(new ClubVI4Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVI4Classes.add(new ClubVI4Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVI4Classes.add(new ClubVI4Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVI4Classes.add(new ClubVI4Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVI4Classes.add(new ClubVI4Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVI4Classes;

    }
    public static ArrayList<ClubVI5Class> getClub5Data(){
        ArrayList<ClubVI5Class> clubVI5Classes = new ArrayList<>();
        clubVI5Classes.add(new ClubVI5Class(R.drawable.rackne,"RACKNE", R.drawable.rackne, "RAC Kathmandu North East", "Tangal Higher Secondary School @11:00 AM", "9840062003", "president1819rackne@gmail.com"));
        clubVI5Classes.add(new ClubVI5Class(R.drawable.rackne_president,"President", R.drawable.rackne_president, "Rtr. Aasish Wagle", "RTR8020", "9840062003", "president1819rackne@gmail.com"));
        clubVI5Classes.add(new ClubVI5Class(R.drawable.rackne_ipp,"Immediate Past President", R.drawable.rackne_ipp, "Rtr. Shrawan Bishowkarma", "RTR5770", "9841704762", "bkshrawanbk@gmail.com"));
        clubVI5Classes.add(new ClubVI5Class(R.drawable.rackne_vicepre,"Vice President", R.drawable.rackne_vicepre, "Rtr. Ashma Neupane", "", "9849994917", "Osimumashma@gmail.com"));
        clubVI5Classes.add(new ClubVI5Class(R.drawable.rackne_secretary,"Secretary", R.drawable.rackne_secretary, "Rtr. Shrishti Maharjan", "", "9849163469", "shreshti.s@gmail.com"));
        clubVI5Classes.add(new ClubVI5Class(R.drawable.rackne_treasurer,"Treasurer", R.drawable.rackne_treasurer, "Rtr. Saroj Bishwakarma", "RTR6986", "9813590712", "Sarojorasbk@gmail.com"));
        clubVI5Classes.add(new ClubVI5Class(R.drawable.rackne_clubservice,"Club Service Director", R.drawable.rackne_clubservice, "Rtr. Sovit Sharma", "RTR8481", "9849912730", "sovitsharma33@gmail.com"));
        clubVI5Classes.add(new ClubVI5Class(R.drawable.rackne_international,"International Service", R.drawable.rackne_international, "Rtr. Susmita Adhikari", "RTR7157", "9843172172", "susmitaadhikari73@gmail.com"));
        clubVI5Classes.add(new ClubVI5Class(R.drawable.rackne_community,"Community Service", R.drawable.rackne_community, "Rtr. Sagun Pudasaini", "", "9861041339", "Shagoonpudasaini@gmail.com"));
        clubVI5Classes.add(new ClubVI5Class(R.drawable.rackne_professional,"Profession Development", R.drawable.rackne_professional, "Rtr. Monika Thapa Magar", "", "9867809727", ""));
        clubVI5Classes.add(new ClubVI5Class(R.drawable.rackne_sergeant,"Sergeant-At-Arms", R.drawable.rackne_sergeant, "Rtr. Shrija Thapa", "RTR8480", "9803922091", "tshrija11@gmail.com"));
        clubVI5Classes.add(new ClubVI5Class(R.drawable.rackne_clubmember, "Club Member", R.drawable.rackne_clubmember, "Rtr. Keshab Bahadur Sunari", "Member ID: RTR5765", "9841803337", "070bct515@ioe.edu.np"));
        return clubVI5Classes;

    }

    public static ArrayList<ClubVI6Class> getClub6Data(){
        ArrayList<ClubVI6Class> clubVI6Classes = new ArrayList<>();
        clubVI6Classes.add(new ClubVI6Class(R.mipmap.ic_app,"RACKS", R.mipmap.ic_app, "", "", "", ""));
        clubVI6Classes.add(new ClubVI6Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVI6Classes.add(new ClubVI6Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubVI6Classes.add(new ClubVI6Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVI6Classes.add(new ClubVI6Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVI6Classes.add(new ClubVI6Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVI6Classes.add(new ClubVI6Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVI6Classes.add(new ClubVI6Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI6Classes.add(new ClubVI6Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI6Classes.add(new ClubVI6Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVI6Classes.add(new ClubVI6Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVI6Classes.add(new ClubVI6Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVI6Classes.add(new ClubVI6Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVI6Classes.add(new ClubVI6Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVI6Classes.add(new ClubVI6Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVI6Classes;

    }

    public static ArrayList<ClubVI7Class> getClub7Data(){
        ArrayList<ClubVI7Class> clubVI7Classes = new ArrayList<>();
        clubVI7Classes.add(new ClubVI7Class(R.mipmap.ic_app,"RACKYNE", R.mipmap.ic_app, "", "", "", ""));
        clubVI7Classes.add(new ClubVI7Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVI7Classes.add(new ClubVI7Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubVI7Classes.add(new ClubVI7Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVI7Classes.add(new ClubVI7Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVI7Classes.add(new ClubVI7Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVI7Classes.add(new ClubVI7Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVI7Classes.add(new ClubVI7Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI7Classes.add(new ClubVI7Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI7Classes.add(new ClubVI7Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVI7Classes.add(new ClubVI7Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVI7Classes.add(new ClubVI7Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVI7Classes.add(new ClubVI7Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVI7Classes.add(new ClubVI7Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVI7Classes.add(new ClubVI7Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVI7Classes;

    }

    public static ArrayList<ClubVI8Class> getClub8Data(){
        ArrayList<ClubVI8Class> clubVI8Classes = new ArrayList<>();
        clubVI8Classes.add(new ClubVI8Class(R.mipmap.ic_app,"RACMBIOM", R.mipmap.ic_app, "", "", "", ""));
        clubVI8Classes.add(new ClubVI8Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVI8Classes.add(new ClubVI8Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubVI8Classes.add(new ClubVI8Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVI8Classes.add(new ClubVI8Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVI8Classes.add(new ClubVI8Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVI8Classes.add(new ClubVI8Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVI8Classes.add(new ClubVI8Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI8Classes.add(new ClubVI8Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI8Classes.add(new ClubVI8Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVI8Classes.add(new ClubVI8Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVI8Classes.add(new ClubVI8Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVI8Classes.add(new ClubVI8Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVI8Classes.add(new ClubVI8Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVI8Classes.add(new ClubVI8Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVI8Classes;

    }

    public static ArrayList<ClubVI9Class> getClub9Data(){
        ArrayList<ClubVI9Class> clubVI9Classes = new ArrayList<>();
        clubVI9Classes.add(new ClubVI9Class(R.mipmap.ic_app,"RACP", R.mipmap.ic_app, "", "", "", ""));
        clubVI9Classes.add(new ClubVI9Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVI9Classes.add(new ClubVI9Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubVI9Classes.add(new ClubVI9Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVI9Classes.add(new ClubVI9Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVI9Classes.add(new ClubVI9Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVI9Classes.add(new ClubVI9Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVI9Classes.add(new ClubVI9Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI9Classes.add(new ClubVI9Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI9Classes.add(new ClubVI9Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVI9Classes.add(new ClubVI9Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVI9Classes.add(new ClubVI9Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVI9Classes.add(new ClubVI9Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVI9Classes.add(new ClubVI9Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVI9Classes.add(new ClubVI9Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVI9Classes;

    }

    public static ArrayList<ClubVI10Class> getClub10Data(){
        ArrayList<ClubVI10Class> clubVI10Classes = new ArrayList<>();
        clubVI10Classes.add(new ClubVI10Class(R.mipmap.ic_app,"RACR", R.mipmap.ic_app, "", "", "", ""));
        clubVI10Classes.add(new ClubVI10Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVI10Classes.add(new ClubVI10Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubVI10Classes.add(new ClubVI10Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVI10Classes.add(new ClubVI10Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVI10Classes.add(new ClubVI10Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVI10Classes.add(new ClubVI10Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVI10Classes.add(new ClubVI10Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI10Classes.add(new ClubVI10Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI10Classes.add(new ClubVI10Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVI10Classes.add(new ClubVI10Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVI10Classes.add(new ClubVI10Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVI10Classes.add(new ClubVI10Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVI10Classes.add(new ClubVI10Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVI10Classes.add(new ClubVI10Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVI10Classes;

    }

    public static ArrayList<ClubVI11Class> getClub11Data(){
        ArrayList<ClubVI11Class> clubVI11Classes = new ArrayList<>();
        clubVI11Classes.add(new ClubVI11Class(R.mipmap.ic_app,"RACS", R.mipmap.ic_app, "", "", "", ""));
        clubVI11Classes.add(new ClubVI11Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVI11Classes.add(new ClubVI11Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubVI11Classes.add(new ClubVI11Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVI11Classes.add(new ClubVI11Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVI11Classes.add(new ClubVI11Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVI11Classes.add(new ClubVI11Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVI11Classes.add(new ClubVI11Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI11Classes.add(new ClubVI11Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI11Classes.add(new ClubVI11Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVI11Classes.add(new ClubVI11Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVI11Classes.add(new ClubVI11Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVI11Classes.add(new ClubVI11Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVI11Classes.add(new ClubVI11Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVI11Classes.add(new ClubVI11Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVI11Classes;

    }

    public static ArrayList<ClubVI12Class> getClub12Data(){
        ArrayList<ClubVI12Class> clubVI12Classes = new ArrayList<>();
        clubVI12Classes.add(new ClubVI12Class(R.mipmap.ic_app,"RACTIC", R.mipmap.ic_app, "", "", "", ""));
        clubVI12Classes.add(new ClubVI12Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVI12Classes.add(new ClubVI12Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubVI12Classes.add(new ClubVI12Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVI12Classes.add(new ClubVI12Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVI12Classes.add(new ClubVI12Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVI12Classes.add(new ClubVI12Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVI12Classes.add(new ClubVI12Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI12Classes.add(new ClubVI12Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI12Classes.add(new ClubVI12Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVI12Classes.add(new ClubVI12Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVI12Classes.add(new ClubVI12Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVI12Classes.add(new ClubVI12Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVI12Classes.add(new ClubVI12Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVI12Classes.add(new ClubVI12Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVI12Classes;

    }

    public static ArrayList<ClubVI13Class> getClub13Data(){
        ArrayList<ClubVI13Class> clubVI13Classes = new ArrayList<>();
        clubVI13Classes.add(new ClubVI13Class(R.mipmap.ic_app,"RACK", R.mipmap.ic_app, "", "", "", ""));
        clubVI13Classes.add(new ClubVI13Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubVI13Classes.add(new ClubVI13Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        clubVI13Classes.add(new ClubVI13Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubVI13Classes.add(new ClubVI13Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubVI13Classes.add(new ClubVI13Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubVI13Classes.add(new ClubVI13Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubVI13Classes.add(new ClubVI13Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI13Classes.add(new ClubVI13Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubVI13Classes.add(new ClubVI13Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubVI13Classes.add(new ClubVI13Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubVI13Classes.add(new ClubVI13Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubVI13Classes.add(new ClubVI13Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubVI13Classes.add(new ClubVI13Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubVI13Classes.add(new ClubVI13Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubVI13Classes;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
