package np.com.rotaractnepalapp.rotaract.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Adapter.MainClubAdapter;
import np.com.rotaractnepalapp.rotaract.Class.Club1Class;
import np.com.rotaractnepalapp.rotaract.Class.Club2Class;
import np.com.rotaractnepalapp.rotaract.Class.Club3Class;
import np.com.rotaractnepalapp.rotaract.Class.Club4Class;
import np.com.rotaractnepalapp.rotaract.Class.Club5Class;
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
        return objects;
    }

    public static ArrayList<Club1Class> getClub1Data(){
        ArrayList<Club1Class> club1Classes = new ArrayList<>();
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"RACB"));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"President"));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Immediate Past"));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Vice President"));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Secretary"));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Treasurer"));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Club Service Director"));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"International Service"));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Community Service"));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Profession Development"));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Assistant Directors"));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Sergeant-At-Arms"));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Fundraising Chair"));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Public Relations"));
        club1Classes.add(new Club1Class(R.mipmap.ic_app,"Information Technology"));
        return club1Classes;

    }
    public static ArrayList<Club2Class> getClub2Data(){
        ArrayList<Club2Class> club2Classes = new ArrayList<>();
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"RACDK"));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"President"));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Immediate Past President"));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Vice President"));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Secretary"));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Treasurer"));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Club Service Director"));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"International Service"));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Community Service"));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Profession Development"));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Assistant Directors"));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Sergeant-At-Arms"));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Fundraising Chair"));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Public Relations"));
        club2Classes.add(new Club2Class(R.mipmap.ic_app,"Information Technology"));
        return club2Classes;

    }
    public static ArrayList<Club3Class> getClub3Data(){
        ArrayList<Club3Class> club3Classes = new ArrayList<>();
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"RACG"));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"President"));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Immediate Past President"));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Vice President"));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Secretary"));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Treasurer"));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Club Service Director"));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"International Service"));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Community Service"));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Profession Development"));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Assistant Directors"));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Sergeant-At-Arms"));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Fundraising Chair"));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Public Relations"));
        club3Classes.add(new Club3Class(R.mipmap.ic_app,"Information Technology"));
        return club3Classes;

    }
    public static ArrayList<Club4Class> getClub4Data(){
        ArrayList<Club4Class> club4Classes = new ArrayList<>();
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"RACG"));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"President"));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Immediate Past President"));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Vice President"));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Secretary"));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Treasurer"));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Club Service Director"));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"International Service"));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Community Service"));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Profession Development"));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Assistant Directors "));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Sergeant-At-Arms"));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Fundraising Chair"));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Public Relations"));
        club4Classes.add(new Club4Class(R.mipmap.ic_app,"Information Technology"));
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
