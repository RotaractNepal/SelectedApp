package np.com.rotaractnepalapp.rotaract.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.jaredrummler.materialspinner.MaterialSpinner;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Adapter.BloodGroupAdapter;
import np.com.rotaractnepalapp.rotaract.Class.BloodGroupClass;
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

        bloodGroup = (MaterialSpinner) findViewById(R.id.bloodGroupSpinner);
        bloodGroup.setItems("All","A(+ve)","A(-ve)","B(+ve)","B(-ve)","O(+)","O(-ve)","AB(+ve)","AB(-ve)");
        bloodGroup.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener() {
            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, Object item) {

            }
        });

        clubGroup = (MaterialSpinner) findViewById(R.id.clubBloodGroupSpinner);
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

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.bloodGroupDonorRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new BloodGroupAdapter(this, getBloodGroup()));

    }

    private ArrayList getBloodGroup(){
        ArrayList<BloodGroupClass> bloodGroupClasses = new ArrayList<>();

        BloodGroupClass bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("A+");
        bloodGroup.setName("Rtr. Monika Thapa Magar");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9867809727");
        bloodGroup.setEmail("mthapamagar3@gmail.com");
        bloodGroupClasses.add(bloodGroup);


        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("A+");
        bloodGroup.setName("Rtr. Pratiksha Adhikari");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9823051683");
        bloodGroup.setEmail("");
        bloodGroupClasses.add(bloodGroup);


        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("A+");
        bloodGroup.setName("Rtr. Amish Ratna Sthapit");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9841814774");
        bloodGroup.setEmail("amishsthapit@hotmail.com");
        bloodGroupClasses.add(bloodGroup);


        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("A+");
        bloodGroup.setName("Rtr. Anuj Singh");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9841529145");
        bloodGroup.setEmail("anuzzsingh@gmail.com");
        bloodGroupClasses.add(bloodGroup);


        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("A+");
        bloodGroup.setName("Rtr. Saroj Bishwakarma");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9813590712");
        bloodGroup.setEmail("sarojorasbk@gmail.com");
        bloodGroupClasses.add(bloodGroup);


        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("B+");
        bloodGroup.setName("Aasish Wagle");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9840062003");
        bloodGroup.setEmail("president1819rackne@gmail.com");
        bloodGroupClasses.add(bloodGroup);

        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("B+");
        bloodGroup.setName("Rtr. Ashma Neupane");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9849994917");
        bloodGroup.setEmail("secretary@rotaractkne.org.np");
        bloodGroupClasses.add(bloodGroup);

        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("B+");
        bloodGroup.setName("Rtr. Keshab Bdr. Sunari");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9841803337");
        bloodGroup.setEmail("bskeshab@hotmail.com");
        bloodGroupClasses.add(bloodGroup);

        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("B+");
        bloodGroup.setName("Rtr. Saurav Shrestha");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9860305485");
        bloodGroup.setEmail("sauravshrestha13@gmail.com");
        bloodGroupClasses.add(bloodGroup);

        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("B+");
        bloodGroup.setName("Rtr. Shrawan Bishowkarma");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9841704762");
        bloodGroup.setEmail("president@rotaractkne.org.np");
        bloodGroupClasses.add(bloodGroup);

        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("B+");
        bloodGroup.setName("Sagun Pudasaini");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9861041339");
        bloodGroup.setEmail("Shagoonpudasaini@gmail.com");
        bloodGroupClasses.add(bloodGroup);

        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("B+");
        bloodGroup.setName("Shrija Thapa");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9803922091");
        bloodGroup.setEmail("tshrija11@gmail.com");
        bloodGroupClasses.add(bloodGroup);

        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("O+");
        bloodGroup.setName("Rtr. Deepa Ghimire");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9869555743");
        bloodGroup.setEmail("ghimiredeepa10@gmail.com");
        bloodGroupClasses.add(bloodGroup);


        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("O+");
        bloodGroup.setName("Rtr. Monika Ranjit");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9841490571");
        bloodGroup.setEmail("m.ranjit2@hotmail.com");
        bloodGroupClasses.add(bloodGroup);


        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("O+");
        bloodGroup.setName("Rtr. Puneet Shakya");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9803017625");
        bloodGroup.setEmail("punshak@gmail.com");
        bloodGroupClasses.add(bloodGroup);


        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("O+");
        bloodGroup.setName("Rtr. Susmita Adhikari");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9843172172");
        bloodGroup.setEmail("susmitaadhikari73@gmail.com");
        bloodGroupClasses.add(bloodGroup);


        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("O+");
        bloodGroup.setName("Rtr. Sovit Sharma");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9849912730");
        bloodGroup.setEmail("sovitsharma33@gmail.com");
        bloodGroupClasses.add(bloodGroup);


        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("O-");
        bloodGroup.setName("Rtr. Shristi Maharjan");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9849163469");
        bloodGroup.setEmail("secretary1819rackne@gmail.com");
        bloodGroupClasses.add(bloodGroup);


        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("AB+");
        bloodGroup.setName("Rtr. Bikash Rana");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9849098979");
        bloodGroup.setEmail("bikashrana3@gmail.com");
        bloodGroupClasses.add(bloodGroup);


        bloodGroup = new BloodGroupClass();
        bloodGroup.setBloodgroup("AB+");
        bloodGroup.setName("Rtr. Pilinda Baniya");
        bloodGroup.setClubname("Rotaract Club of Kathmandu North East");
        bloodGroup.setAddress("");
        bloodGroup.setContact("9841759593");
        bloodGroup.setEmail("gpilinda@hotmail.com");
        bloodGroupClasses.add(bloodGroup);

        return bloodGroupClasses;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
