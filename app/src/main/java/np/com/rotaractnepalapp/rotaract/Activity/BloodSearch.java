package np.com.rotaractnepalapp.rotaract.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;

import com.jaredrummler.materialspinner.MaterialSpinner;
import com.rengwuxian.materialedittext.MaterialEditText;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Adapter.BloodGroupAdapter;
import np.com.rotaractnepalapp.rotaract.Class.BloodGroupClass;
import np.com.rotaractnepalapp.rotaract.R;

public class BloodSearch extends AppCompatActivity {

    MaterialEditText editTextSearch;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    BloodGroupAdapter adapter;
    ArrayList<BloodGroupClass> bloodGroupClasses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_search);
        this.setTitle("Blood Search");
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        getBloodGroup();
        buildRecylerView();

        editTextSearch = (MaterialEditText) findViewById(R.id.editTextSearch);
        editTextSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });

    }

    private void filter(String text){
        ArrayList<BloodGroupClass> filteredList = new ArrayList<>();
        for (BloodGroupClass item : bloodGroupClasses){
            if (item.getBloodgroup().toLowerCase().contains(text.toLowerCase()) || item.getClubshortname().toUpperCase().contains(text.toUpperCase())){
                filteredList.add(item);
            }
        }
        adapter.filterList(filteredList);

    }

    private void getBloodGroup(){
        bloodGroupClasses = new ArrayList<>();

        bloodGroupClasses.add(new BloodGroupClass("Rtr. Monika Thapa Magar", "A+", "9867809727", "mthapamagar3@gmail.com", "Kathmandu Nepal", "Rotaract Club of Kathmandu North East", ""));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Pratiksha Adhikari", "A+", "9823051683", "pratikshaadhikari111@gmail.com", "Kathmandu Nepal", "Rotaract Club of Kathmandu North East", ""));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Amish Ratna Sthapit", "A+", "9841814774", "amishsthapit@hotmail.com", "Kathmandu Nepal", "Rotaract Club of Kathmandu North East", ""));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Anuj Singh", "A+", "9841529145", "anuzzsingh@gmail.com", "Kathmandu Nepal", "Rotaract Club of Kathmandu North East", ""));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Saroj Bishwakarma", "A+", "9813590712", "sarojorasbk@gmail.com", "Kathmandu Nepal", "Rotaract Club of Kathmandu North East", ""));

        bloodGroupClasses.add(new BloodGroupClass("Rtr. Aasish Wagle", "B+", "9840062003", "president1819rackne@gmail.com", "Kathmandu Nepal", "Rotaract Club of Kathmandu North East", "RACKNE"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Ashma Neupane", "B+", "9849994917", "secretary@rotaractkne.org.np", "Kathmandu Nepal", "Rotaract Club of Kathmandu North East", "RACKNE"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Keshab Bdr. Sunari", "B+", "9841803337", "070bct515@ioe.edu.np", "Kathmandu Nepal", "Rotaract Club of Kathmandu North East", "RACKNE"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Saurav Shrestha", "B+", "9860305485", "sauravshrestha13@gmail.com", "Kathmandu Nepal", "Rotaract Club of Kathmandu North East", "RACKNE"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Shrawan Bishowkarma", "B+", "9841704762", "president@rotaractkne.org.np", "Kathmandu Nepal", "Rotaract Club of Kathmandu North East", "RACKNE"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Sagun Pudasaini", "B+", "9861041339", "Shagoonpudasaini@gmail.com", "Kathmandu Nepal", "Rotaract Club of Kathmandu North East", "RACKNE"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Shrija Thapa", "B+", "9803922091", "tshrija11@gmail.com", "Kathmandu Nepal", "Rotaract Club of Kathmandu North East", "RACKNE"));

    }

    private void buildRecylerView(){
        recyclerView = (RecyclerView) findViewById(R.id.bloodGroupDonorRecyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new BloodGroupAdapter(bloodGroupClasses);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
