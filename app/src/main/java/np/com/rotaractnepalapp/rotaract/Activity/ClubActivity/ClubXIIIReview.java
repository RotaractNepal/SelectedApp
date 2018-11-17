package np.com.rotaractnepalapp.rotaract.Activity.ClubActivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Adapter.ClubXIIIAdapter.MainClubXIIIAdapter;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXIII.ClubXIII1Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXIII.ClubXIII2Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXIII.ClubXIII3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubXIII.ClubXIII4Class;
import np.com.rotaractnepalapp.rotaract.R;

public class ClubXIIIReview extends AppCompatActivity {

    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_xiiireview);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        this.setTitle("Zone XIII Club R.ID.NO. 3292");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_clubxiii_View);
        MainClubXIIIAdapter adapter = new MainClubXIIIAdapter(this, getObject());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private ArrayList<Object> getObject() {
        objects.add(getClub1Data().get(0));
        objects.add(getClub2Data().get(0));
        objects.add(getClub3Data().get(0));
        objects.add(getClub4Data().get(0));
        return objects;
    }

    public static ArrayList<ClubXIII1Class> getClub1Data(){
        ArrayList<ClubXIII1Class> clubXIII1Classes = new ArrayList<>();
        clubXIII1Classes.add(new ClubXIII1Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXIII1Classes.add(new ClubXIII1Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXIII1Classes;

    }

    public static ArrayList<ClubXIII2Class> getClub2Data(){
        ArrayList<ClubXIII2Class> clubXIII2Classes = new ArrayList<>();
        clubXIII2Classes.add(new ClubXIII2Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXIII2Classes.add(new ClubXIII2Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXIII2Classes;

    }

    public static ArrayList<ClubXIII3Class> getClub3Data(){
        ArrayList<ClubXIII3Class> clubXIII3Classes = new ArrayList<>();
        clubXIII3Classes.add(new ClubXIII3Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXIII3Classes.add(new ClubXIII3Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXIII3Classes;

    }

    public static ArrayList<ClubXIII4Class> getClub4Data(){
        ArrayList<ClubXIII4Class> clubXIII4Classes = new ArrayList<>();
        clubXIII4Classes.add(new ClubXIII4Class(R.mipmap.ic_app,"RACB", R.mipmap.ic_app, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.mipmap.ic_app,"President", R.mipmap.ic_app, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.mipmap.ic_app,"Immediate Past", R.mipmap.ic_app, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.mipmap.ic_app,"Vice President", R.mipmap.ic_app, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.mipmap.ic_app,"Secretary", R.mipmap.ic_app, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.mipmap.ic_app,"Treasurer", R.mipmap.ic_app, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.mipmap.ic_app,"Club Service Director", R.mipmap.ic_app, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.mipmap.ic_app,"International Service", R.mipmap.ic_app, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.mipmap.ic_app,"Community Service", R.mipmap.ic_app, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.mipmap.ic_app,"Profession Development", R.mipmap.ic_app, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.mipmap.ic_app,"Assistant Directors", R.mipmap.ic_app, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.mipmap.ic_app,"Sergeant-At-Arms", R.mipmap.ic_app, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.mipmap.ic_app,"Fundraising Chair", R.mipmap.ic_app, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.mipmap.ic_app,"Public Relations", R.mipmap.ic_app, "", "", "", ""));
        clubXIII4Classes.add(new ClubXIII4Class(R.mipmap.ic_app,"Information Technology", R.mipmap.ic_app, "", "", "", ""));
        return clubXIII4Classes;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
