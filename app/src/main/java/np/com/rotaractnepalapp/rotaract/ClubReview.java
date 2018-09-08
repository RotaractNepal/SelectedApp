package np.com.rotaractnepalapp.rotaract;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class ClubReview extends AppCompatActivity {

    private ListView mListView;
    String[] clubShortName ={"RACB", "RACDK", "RACG", "RACKM", "RACKNE", "RACKS", "RACYNE", "RACMBIOM", "RACP", "RACR", "RACS", "RACTIC", "RACK"};
    int[] clubLogo = {R.drawable.ic_racb, R.drawable.ic_racdk, R.drawable.ic_racg,
            R.drawable.ic_rackm, R.drawable.ic_rackne, R.drawable.ic_racks,
            R.drawable.ic_racyne, R.drawable.ic_racmbiom, R.drawable.ic_racp,
            R.drawable.ic_racr, R.drawable.ic_racs, R.drawable.ic_ractic,
            R.drawable.ic_rack,};
    String[] clubFullName = {"RAC Budhanilkantha","RAC Dillibazar-Kathmandu", "RAC Gongabu", "RAC Kathmandu Metro", "RAC Kathmandu North East",
                             "RAC Kathmandu Sunrise", "RAC Kathmandu Youth North East", "RAC Matribhumi Baluwatar IOM", "RAC Pashupati",
                             "RAC Rajdhani", "RAC Swoyambhu", "RAC Thames International College", "Rotaract Club of Kantipur"};
    String[] clubAddresss = {"Bal Bikash School, Budhanilkantha", "Dillibazar, Kathmandu", "Sky Restro & Banquets, Samakhusi Chowk", "Dhumbarahi, Kathmandu",
                             "Tangal, Naxal, Kathmandu", "Address", "Address", "IOM, Maharajgunj", "Address", "Kathmandu,Nepal", "Swoyambhu,Kathmandu",
                             "Thames Int. College, Surya Bikram Gyawali Marg, Battisputali, Old Banshwor","Old Baneshwor, Kathmandu"};
    String[] clubVenue = {"Bal Bikas Boarding School", "National Integrated College, Dillibazar- Kathmandu", "Sky Restro & Banquets, Samakhusi Chowk",
                          "National College, Dhumbarahi, Kathmandu", "Tangal Higher Secondary School", "College of Information Technology and Engineering",
                          "Techno Track Pvt. Ltd, Putalisadak", "IOM, Maharajgunj", "Puspalal Memorial College, Chabahil", "Shephard College, Baneshwor",
                          "School of Information Technologies", "Thames Int. College, Surya Bikram Gyawali Marg, Battisputali, Old Banshwor", "SAIM College, Mid Baneshwor"};
    String[] clubMeetingTime ={"04:00 PM", "08:00 AM", "03:00 PM", "10:30 AM", "Saturday, 11:00 AM", "Time", "Time", "04:30 PM", "Time", "03:00 PM", "09:00 AM", "10:00 AM", "11:00 AM"};
    int[] clubPresident = {R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.rackne_president, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp};
    int[] clubIPP = {R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.rackne_ipp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp};
    int[] clubVicePre = {R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.rackne_vicepre, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp};
    int[] clubSecretary = {R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.rackne_secretary, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp};
    int[] clubTreasurer = {R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.rackne_treasurer, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp};
    int[] clubClubSer = {R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.rackne_clubservice, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp};
    int[] clubIntSer = {R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.rackne_international, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp};
    int[] clubCommSer = {R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.rackne_community, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp};
    int[] clubProDev = {R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.rackne_professional, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp};
    int[] clubAssDir = {R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp};
    int[] clubSergeant = {R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.rackne_sergeant, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp};
    int[] clubFundChair = {R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp};
    int[] clubPubRel = {R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp};
    int[] clubITOfficer = {R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.rackne_itofficer, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp,
            R.drawable.colorlogo_rotaractnepalapp, R.drawable.colorlogo_rotaractnepalapp};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_review);
        this.setTitle("Club Review");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        mListView = (ListView) findViewById(R.id.listview);
        ClubReviewAdapter clubReviewAdapter = new ClubReviewAdapter(ClubReview.this, clubShortName, clubLogo, clubFullName, clubVenue, clubMeetingTime, clubAddresss,
                clubPresident, clubIPP, clubVicePre, clubSecretary, clubTreasurer, clubClubSer, clubIntSer, clubCommSer, clubProDev, clubAssDir, clubSergeant, clubFundChair,
                clubPubRel, clubITOfficer);
        mListView.setAdapter(clubReviewAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
