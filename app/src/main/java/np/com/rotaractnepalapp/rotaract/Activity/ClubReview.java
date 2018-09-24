package np.com.rotaractnepalapp.rotaract.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Adapter.MainClubAdapter;
import np.com.rotaractnepalapp.rotaract.Class.Club10Class;
import np.com.rotaractnepalapp.rotaract.Class.Club11Class;
import np.com.rotaractnepalapp.rotaract.Class.Club12Class;
import np.com.rotaractnepalapp.rotaract.Class.Club13Class;
import np.com.rotaractnepalapp.rotaract.Class.Club1Class;
import np.com.rotaractnepalapp.rotaract.Class.Club2Class;
import np.com.rotaractnepalapp.rotaract.Class.Club3Class;
import np.com.rotaractnepalapp.rotaract.Class.Club4Class;
import np.com.rotaractnepalapp.rotaract.Class.Club5Class;
import np.com.rotaractnepalapp.rotaract.Class.Club6Class;
import np.com.rotaractnepalapp.rotaract.Class.Club7Class;
import np.com.rotaractnepalapp.rotaract.Class.Club8Class;
import np.com.rotaractnepalapp.rotaract.Class.Club9Class;
import np.com.rotaractnepalapp.rotaract.R;


public class ClubReview extends AppCompatActivity {

    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_review);
        this.setTitle("Zone VI Club R.ID.NO. 3292");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_View);
        MainClubAdapter adapter = new MainClubAdapter(this, getObject());
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

    public static ArrayList<Club1Class> getClub1Data(){
        ArrayList<Club1Class> club1Classes = new ArrayList<>();
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return club1Classes;

    }
    public static ArrayList<Club2Class> getClub2Data(){
        ArrayList<Club2Class> club2Classes = new ArrayList<>();
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"RACDK", R.mipmap.ic_app, "", "", "", ""));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return club2Classes;

    }
    public static ArrayList<Club3Class> getClub3Data(){
        ArrayList<Club3Class> club3Classes = new ArrayList<>();
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"RACG", R.mipmap.ic_app, "", "", "", ""));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return club3Classes;

    }
    public static ArrayList<Club4Class> getClub4Data(){
        ArrayList<Club4Class> club4Classes = new ArrayList<>();
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"RACKM", R.mipmap.ic_app, "", "", "", ""));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return club4Classes;

    }
    public static ArrayList<Club5Class> getClub5Data(){
        ArrayList<Club5Class> club5Classes = new ArrayList<>();
        club5Classes.add(new Club5Class(R.drawable.rackne,"RACKNE", R.drawable.rackne, "RAC Kathmandu North East", "Tangal Higher Secondary School @11:00 AM", "9840062003", "president1819rackne@gmail.com"));
        club5Classes.add(new Club5Class(R.drawable.rackne_president,"President", R.drawable.rackne_president, "Rtr. Aasish Wagle", "", "9840062003", "president1819rackne@gmail.com"));
        club5Classes.add(new Club5Class(R.drawable.rackne_ipp,"Immediate Past President", R.drawable.rackne_ipp, "Rtr. Shrawan Bishowkarma", "", "9841704762", "bkshrawanbk@gmail.com"));
        club5Classes.add(new Club5Class(R.drawable.rackne_vicepre,"Vice President", R.drawable.rackne_vicepre, "Rtr. Ashma Neupane", "", "9849994917", "Osimumashma@gmail.com"));
        club5Classes.add(new Club5Class(R.drawable.rackne_secretary,"Secretary", R.drawable.rackne_secretary, "Rtr. Shrishti Maharjan", "", "9849163469", "shreshti.s@gmail.com"));
        club5Classes.add(new Club5Class(R.drawable.rackne_treasurer,"Treasurer", R.drawable.rackne_treasurer, "Rtr. Saroj Bishwakarma", "", "9813590712", "Sarojorasbk@gmail.com"));
        club5Classes.add(new Club5Class(R.drawable.rackne_clubservice,"Club Service Director", R.drawable.rackne_clubservice, "Rtr. Sovit Sharma", "", "9849912730", "sovitsharma33@gmail.com"));
        club5Classes.add(new Club5Class(R.drawable.rackne_international,"International Service", R.drawable.rackne_international, "Rtr. Susmita Adhikari", "", "9843172172", "susmitaadhikari73@gmail.com"));
        club5Classes.add(new Club5Class(R.drawable.rackne_community,"Community Service", R.drawable.rackne_community, "Rtr. Sagun Pudasaini", "", "9861041339", "Shagoonpudasaini@gmail.com"));
        club5Classes.add(new Club5Class(R.drawable.rackne_professional,"Profession Development", R.drawable.rackne_professional, "Rtr. Monika Thapa Magar", "", "9867809727", ""));
        club5Classes.add(new Club5Class(R.drawable.rackne_sergeant,"Sergeant-At-Arms", R.drawable.rackne_sergeant, "Rtr. Shrija Thapa", "", "9803922091", "tshrija11@gmail.com"));
        return club5Classes;

    }

    public static ArrayList<Club6Class> getClub6Data(){
        ArrayList<Club6Class> club6Classes = new ArrayList<>();
        club6Classes.add(new Club6Class(R.mipmap.ic_app,"RACKS", R.mipmap.ic_app, "", "", "", ""));
        club6Classes.add(new Club6Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        club6Classes.add(new Club6Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        club6Classes.add(new Club6Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        club6Classes.add(new Club6Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        club6Classes.add(new Club6Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        club6Classes.add(new Club6Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        club6Classes.add(new Club6Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        club6Classes.add(new Club6Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        club6Classes.add(new Club6Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        club6Classes.add(new Club6Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        club6Classes.add(new Club6Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        club6Classes.add(new Club6Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        club6Classes.add(new Club6Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        club6Classes.add(new Club6Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return club6Classes;

    }

    public static ArrayList<Club7Class> getClub7Data(){
        ArrayList<Club7Class> club7Classes = new ArrayList<>();
        club7Classes.add(new Club7Class(R.mipmap.ic_app,"RACKYNE", R.mipmap.ic_app, "", "", "", ""));
        club7Classes.add(new Club7Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        club7Classes.add(new Club7Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        club7Classes.add(new Club7Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        club7Classes.add(new Club7Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        club7Classes.add(new Club7Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        club7Classes.add(new Club7Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        club7Classes.add(new Club7Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        club7Classes.add(new Club7Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        club7Classes.add(new Club7Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        club7Classes.add(new Club7Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        club7Classes.add(new Club7Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        club7Classes.add(new Club7Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        club7Classes.add(new Club7Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        club7Classes.add(new Club7Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return club7Classes;

    }

    public static ArrayList<Club8Class> getClub8Data(){
        ArrayList<Club8Class> club8Classes = new ArrayList<>();
        club8Classes.add(new Club8Class(R.mipmap.ic_app,"RACMBIOM", R.mipmap.ic_app, "", "", "", ""));
        club8Classes.add(new Club8Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        club8Classes.add(new Club8Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        club8Classes.add(new Club8Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        club8Classes.add(new Club8Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        club8Classes.add(new Club8Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        club8Classes.add(new Club8Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        club8Classes.add(new Club8Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        club8Classes.add(new Club8Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        club8Classes.add(new Club8Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        club8Classes.add(new Club8Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        club8Classes.add(new Club8Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        club8Classes.add(new Club8Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        club8Classes.add(new Club8Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        club8Classes.add(new Club8Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return club8Classes;

    }

    public static ArrayList<Club9Class> getClub9Data(){
        ArrayList<Club9Class> club9Classes = new ArrayList<>();
        club9Classes.add(new Club9Class(R.mipmap.ic_app,"RACP", R.mipmap.ic_app, "", "", "", ""));
        club9Classes.add(new Club9Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        club9Classes.add(new Club9Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        club9Classes.add(new Club9Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        club9Classes.add(new Club9Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        club9Classes.add(new Club9Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        club9Classes.add(new Club9Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        club9Classes.add(new Club9Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        club9Classes.add(new Club9Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        club9Classes.add(new Club9Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        club9Classes.add(new Club9Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        club9Classes.add(new Club9Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        club9Classes.add(new Club9Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        club9Classes.add(new Club9Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        club9Classes.add(new Club9Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return club9Classes;

    }

    public static ArrayList<Club10Class> getClub10Data(){
        ArrayList<Club10Class> club10Classes = new ArrayList<>();
        club10Classes.add(new Club10Class(R.mipmap.ic_app,"RACR", R.mipmap.ic_app, "", "", "", ""));
        club10Classes.add(new Club10Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        club10Classes.add(new Club10Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        club10Classes.add(new Club10Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        club10Classes.add(new Club10Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        club10Classes.add(new Club10Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        club10Classes.add(new Club10Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        club10Classes.add(new Club10Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        club10Classes.add(new Club10Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        club10Classes.add(new Club10Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        club10Classes.add(new Club10Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        club10Classes.add(new Club10Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        club10Classes.add(new Club10Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        club10Classes.add(new Club10Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        club10Classes.add(new Club10Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return club10Classes;

    }

    public static ArrayList<Club11Class> getClub11Data(){
        ArrayList<Club11Class> club11Classes = new ArrayList<>();
        club11Classes.add(new Club11Class(R.mipmap.ic_app,"RACS", R.mipmap.ic_app, "", "", "", ""));
        club11Classes.add(new Club11Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        club11Classes.add(new Club11Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        club11Classes.add(new Club11Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        club11Classes.add(new Club11Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        club11Classes.add(new Club11Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        club11Classes.add(new Club11Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        club11Classes.add(new Club11Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        club11Classes.add(new Club11Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        club11Classes.add(new Club11Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        club11Classes.add(new Club11Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        club11Classes.add(new Club11Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        club11Classes.add(new Club11Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        club11Classes.add(new Club11Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        club11Classes.add(new Club11Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return club11Classes;

    }

    public static ArrayList<Club12Class> getClub12Data(){
        ArrayList<Club12Class> club12Classes = new ArrayList<>();
        club12Classes.add(new Club12Class(R.mipmap.ic_app,"RACTIC", R.mipmap.ic_app, "", "", "", ""));
        club12Classes.add(new Club12Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        club12Classes.add(new Club12Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        club12Classes.add(new Club12Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        club12Classes.add(new Club12Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        club12Classes.add(new Club12Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        club12Classes.add(new Club12Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        club12Classes.add(new Club12Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        club12Classes.add(new Club12Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        club12Classes.add(new Club12Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        club12Classes.add(new Club12Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        club12Classes.add(new Club12Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        club12Classes.add(new Club12Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        club12Classes.add(new Club12Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        club12Classes.add(new Club12Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return club12Classes;

    }

    public static ArrayList<Club13Class> getClub13Data(){
        ArrayList<Club13Class> club13Classes = new ArrayList<>();
        club13Classes.add(new Club13Class(R.mipmap.ic_app,"RACK", R.mipmap.ic_app, "", "", "", ""));
        club13Classes.add(new Club13Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        club13Classes.add(new Club13Class(R.mipmap.ic_app,"Immediate Past President", R.mipmap.ic_app, "", "", "", ""));
        club13Classes.add(new Club13Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        club13Classes.add(new Club13Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        club13Classes.add(new Club13Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        club13Classes.add(new Club13Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        club13Classes.add(new Club13Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        club13Classes.add(new Club13Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        club13Classes.add(new Club13Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        club13Classes.add(new Club13Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        club13Classes.add(new Club13Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        club13Classes.add(new Club13Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        club13Classes.add(new Club13Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        club13Classes.add(new Club13Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return club13Classes;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
