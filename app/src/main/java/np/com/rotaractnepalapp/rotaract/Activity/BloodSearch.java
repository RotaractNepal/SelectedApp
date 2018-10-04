package np.com.rotaractnepalapp.rotaract.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.jaredrummler.materialspinner.MaterialSpinner;

import np.com.rotaractnepalapp.rotaract.R;

public class BloodSearch extends AppCompatActivity {

    MaterialSpinner bloodGroup, clubGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_search);
        this.setTitle("Blood Search");
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        bloodGroup = (MaterialSpinner) findViewById(R.id.bloodSpinner);
        bloodGroup.setItems("A(+ve)","A(-ve)","B(+ve)","B(-ve)","O(+)","O(-ve)","AB(+ve)","AB(-ve)");
        bloodGroup.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {

            }
        });

        clubGroup = (MaterialSpinner) findViewById(R.id.clubSpinner);
        clubGroup.setItems("All","RAC Annapurna\n",
                "RAC Baglung",
                "RAC Bagmati",
                "RAC Bajra Manasalu Gorkha",
                "RAC Balaju",
                "RAC Banepa",
                "RAC Baneshwor",
                "RAC Baneshwor Royal",
                "RAC Bhadgaon",
                "RAC Bhairahawa",
                "RAC Bhaktapur",
                "RAC Bharatpur",
                "RAC Biratnagar",
                "RAC Biratnagar Down Town",
                "RAC Birgunj",
                "RAC Birgunj Metropolis",
                "RAC Birtamod Mid-Town",
                "RAC Birtamode",
                "RAC Budhanilkantha",
                "RAC Budol",
                "RAC Butwal",
                "RAC Butwal Down Town",
                "RAC Butwal South",
                "RAC Butwal Synergy",
                "RAC Central Butwal",
                "RAC Central Lumbini",
                "RAC Chandragiri",
                "RAC Charumati",
                "RAC Chitwan",
                "RAC Damak",
                "RAC Damauli",
                "RAC Dang",
                "RAC Dhangadhi",
                "RAC Dharan",
                "RAC Dharan Ghopa",
                "RAC Dhulikhel",
                "RAC Dillibazar-Kathmandu",
                "RAC Durbarmarg",
                "RAC Gongabu",
                "RAC Gorkha",
                "RAC Hemja",
                "RAC Hetauda",
                "RAC Himalaya Patan",
                "RAC Itahari",
                "RAC Jawalakhel",
                "RAC Jawalakhel Manjushree",
                "RAC Kakarvita",
                "RAC Kantipur Dental College",
                "RAC Kapilvastu",
                "RAC Kapilvastu Mid-Town",
                "RAC Kasthamandap",
                "RAC Kathmandu",
                "RAC Kathmandu Medical College",
                "RAC Kathmandu Metro",
                "RAC Kathmandu Metropolis",
                "RAC Kathmandu Mid Town",
                "RAC Kathmandu North",
                "RAC Kathmandu North East",
                "RAC Kathmandu Sunrise",
                "RAC Kathmandu University",
                "RAC Kathmandu University Medical School",
                "RAC Kathmandu West",
                "RAC Kathmandu Youth North East",
                "RAC Khitiz Int'l College",
                "RAC KIST Medical College",
                "RAC Kopundol",
                "RAC Lalitpur",
                "RAC Lalitpur Midtown",
                "RAC Lamjung",
                "RAC Lekhnath",
                "RAC Liberty College",
                "RAC Lumbini Banijya Campus",
                "RAC Lumbini Siddhartha Nagar",
                "RAC Madhyapur",
                "RAC Mahabouddha",
                "RAC Makwanpur",
                "RAC Manipal College of Medical Sciences",
                "RAC Manohara",
                "RAC Matribhumi Baluwatar IOM",
                "RAC Metro City",
                "RAC Mount Everest, Lalitpur",
                "RAC Narayangarh",
                "RAC Narayani Mid Town",
                "RAC New Road City",
                "RAC Newroad Pokhara",
                "RAC Palpa Tansen",
                "RAC Panauti",
                "RAC Parbat",
                "RAC Parbat Pokhara",
                "RAC Pashupati",
                "RAC Patan",
                "RAC Patan Durbar Square",
                "RAC Patan South",
                "RAC Patan West",
                "RAC People Campus",
                "RAC Phulbari",
                "RAC Pokhara",
                "RAC Pokhara Fishtail",
                "RAC Pokhara GMC",
                "RAC Pokhara Lakeside",
                "RAC Pokhara Mid Town",
                "RAC Rajdhani",
                "RAC Ramapithecus",
                "RAC Ratnanagar",
                "RAC Reliance College",
                "RAC Rudramati",
                "RAC Rudramati- Babarmahal",
                "RAC Rupandehi",
                "RAC SAIM College",
                "RAC Sainamaina",
                "RAC Sainbu Bhainsepati",
                "RAC Sukedhara",
                "RAC Swoyambhu",
                "RAC Thames International College",
                "RAC Tilottama Devdaha",
                "RAC Tilottama Rupandehi",
                "RAC Tinau Butwal",
                "RAC Tinau City",
                "RAC Tripureshwor",
                "RAC Tulsipur",
                "RAC Yala",
                "Rotaract Club of Kantipur");
        clubGroup.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {

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
