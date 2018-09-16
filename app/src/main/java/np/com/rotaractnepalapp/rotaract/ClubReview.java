package np.com.rotaractnepalapp.rotaract;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;

import java.util.ArrayList;


public class ClubReview extends AppCompatActivity {
    private static final String TAG = "Clubs";

    private ArrayList<String> mItemDesignation = new ArrayList<>();
    private ArrayList<String> mItemImageUrls = new ArrayList<>();
    private ArrayList<String> mItemName = new ArrayList<>();
    private ArrayList<String> mItemRIDNo = new ArrayList<>();
    private ArrayList<String> mItemBackground = new ArrayList<>();
    private ArrayList<String> mItemContactNo = new ArrayList<>();
    private ArrayList<String> mItemEmailID = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_review);
        this.setTitle("Club Review");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        getImagesRACKNE();

    }


    private void getImagesRACKNE(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mItemImageUrls.add("https://drive.google.com/uc?id=1CSk3zi7v5q5duVM44Gk-gBTnafhowuhz");
        mItemDesignation.add("Rotract Club of Kathmandu North East");
        mItemName.add("Tangal Higher Secondary School");
        mItemRIDNo.add("Saturday, 11:00 am");
        mItemBackground.add("https://drive.google.com/uc?id=1CSk3zi7v5q5duVM44Gk-gBTnafhowuhz");
        mItemContactNo.add("9840062003");
        mItemEmailID.add("president1819rackne@gmail.com");

        mItemImageUrls.add("https://drive.google.com/uc?id=17N_zrsZTSDSJgpW43-BoklHGIKbqd56A");
        mItemDesignation.add("President");
        mItemName.add("Rtr. Aasish Wagle");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=17N_zrsZTSDSJgpW43-BoklHGIKbqd56A");
        mItemContactNo.add("9840062003");
        mItemEmailID.add("president1819rackne@gmail.com");

        mItemImageUrls.add("https://drive.google.com/uc?id=1oYD6_AYmclNxZih_zozPMzT0EVrGsyxy");
        mItemDesignation.add("Immediate Past President");
        mItemName.add("Rtr. Shrawan Bishowkarma");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1oYD6_AYmclNxZih_zozPMzT0EVrGsyxy");
        mItemContactNo.add("9841704762");
        mItemEmailID.add("bkshrawanbk@gmail.com");

        mItemImageUrls.add("https://drive.google.com/uc?id=1TddIDf4CVpQ5gPYtz3KGHKB_91p2rT_E");
        mItemDesignation.add("Vice President");
        mItemName.add("Rtr. Ashma Neupane");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1TddIDf4CVpQ5gPYtz3KGHKB_91p2rT_E");
        mItemContactNo.add("9849994917");
        mItemEmailID.add("Osimumashma@gmail.com");

        mItemImageUrls.add("https://drive.google.com/uc?id=1KC_eC_arrLgOH7kmKiLVx_yU5wFrmdSm");
        mItemDesignation.add("Secretary");
        mItemName.add("Rtr. Shrishti Maharjan");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1KC_eC_arrLgOH7kmKiLVx_yU5wFrmdSm");
        mItemContactNo.add("9849163469");
        mItemEmailID.add("shreshti.s@gmail.com");

        mItemImageUrls.add("https://drive.google.com/uc?id=1xu0OAKqSzOD_NKTfRtrXpAlzHhIaVsbz");
        mItemDesignation.add("Treasurer");
        mItemName.add("Rtr. Saroj Bishwakarma");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1xu0OAKqSzOD_NKTfRtrXpAlzHhIaVsbz");
        mItemContactNo.add("9813590712");
        mItemEmailID.add("Sarojorasbk@gmail.com");

        mItemImageUrls.add("https://drive.google.com/uc?id=1567tQFnHRv-nPhirt1MwUz_AadnFdRRw");
        mItemDesignation.add("Club Service Director");
        mItemName.add("Rtr. Sovit Sharma");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1567tQFnHRv-nPhirt1MwUz_AadnFdRRw");
        mItemContactNo.add("9849912730");
        mItemEmailID.add("sovitsharma33@gmail.com");

        mItemImageUrls.add("https://drive.google.com/uc?id=1gwkzjMmOoElQm3iHRa275lp8lnAclU1A");
        mItemDesignation.add("International Service Director");
        mItemName.add("Rtr. Susmita Adhikari");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1gwkzjMmOoElQm3iHRa275lp8lnAclU1A");
        mItemContactNo.add("9843172172");
        mItemEmailID.add("susmitaadhikari73@gmail.com");

        mItemImageUrls.add("https://drive.google.com/uc?id=13MOoNN9zwWkgC8JFitNigDBW0OXiwJ88");
        mItemDesignation.add("Community Service Director");
        mItemName.add("Rtr. Sagun Pudasaini");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=13MOoNN9zwWkgC8JFitNigDBW0OXiwJ88");
        mItemContactNo.add("9861041339");
        mItemEmailID.add("Shagoonpudasaini@gmail.com");

        mItemImageUrls.add("https://drive.google.com/uc?id=1Tt87Qd15UZiFtvtD9sWhCHS4SPlcg-hC");
        mItemDesignation.add("Professional Service Director");
        mItemName.add("Rtr. Monika Thapa Magar");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1Tt87Qd15UZiFtvtD9sWhCHS4SPlcg-hC");
        mItemContactNo.add("9867809727");
        mItemEmailID.add("");

        mItemImageUrls.add("https://drive.google.com/uc?id=1lC67XwP-lX4vBnYPFV33sgRC1ajrxtVA");
        mItemDesignation.add("Sergeant-at-Arms");
        mItemName.add("Rtr. Shrija Thapa");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1lC67XwP-lX4vBnYPFV33sgRC1ajrxtVA");
        mItemContactNo.add("9803922091");
        mItemEmailID.add("tshrija11@gmail.com");

        initRecyclerViewRACKNE();
    }

    private void initRecyclerViewRACKNE() {
        Log.d(TAG, "initRecyclerView: init recyclerview.");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerViewRACKNE = findViewById(R.id.clubRCKNERecyclerView);
        recyclerViewRACKNE.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mItemDesignation, mItemImageUrls,
                                                               mItemName, mItemRIDNo, mItemBackground,
                                                               mItemContactNo, mItemEmailID);
        recyclerViewRACKNE.setAdapter(adapter);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
