package np.com.rotaractnepalapp.rotaract;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;

import java.util.ArrayList;


public class ClubReview extends AppCompatActivity {
    private static final String TAG = "ClubReview";

    private ArrayList<String> mItemDesignation = new ArrayList<>();
    private ArrayList<String> mItemImageUrls = new ArrayList<>();
    private ArrayList<String> mItemName = new ArrayList<>();
    private ArrayList<String> mItemRIDNo = new ArrayList<>();
    private ArrayList<String> mItemBackground = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_review);
        this.setTitle("Club Review");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        getImages();

    }

    private void getImages(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mItemImageUrls.add("https://drive.google.com/uc?id=1J13nhEYHGnLuz_9BCeVpYu1nxF_CUF7N");
        mItemDesignation.add("Rotaract Club of Kathmandu North East");
        mItemName.add("");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1J13nhEYHGnLuz_9BCeVpYu1nxF_CUF7N");

        mItemImageUrls.add("https://drive.google.com/uc?id=17N_zrsZTSDSJgpW43-BoklHGIKbqd56A");
        mItemDesignation.add("President");
        mItemName.add("");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=17N_zrsZTSDSJgpW43-BoklHGIKbqd56A");

        mItemImageUrls.add("https://drive.google.com/uc?id=1oYD6_AYmclNxZih_zozPMzT0EVrGsyxy");
        mItemDesignation.add("Immediate Past President");
        mItemName.add("");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1oYD6_AYmclNxZih_zozPMzT0EVrGsyxy");

        mItemImageUrls.add("https://drive.google.com/uc?id=1TddIDf4CVpQ5gPYtz3KGHKB_91p2rT_E");
        mItemDesignation.add("Vice President");
        mItemName.add("");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1TddIDf4CVpQ5gPYtz3KGHKB_91p2rT_E");

        mItemImageUrls.add("https://drive.google.com/uc?id=1KC_eC_arrLgOH7kmKiLVx_yU5wFrmdSm");
        mItemDesignation.add("Secretary");
        mItemName.add("");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1KC_eC_arrLgOH7kmKiLVx_yU5wFrmdSm");

        mItemImageUrls.add("https://drive.google.com/uc?id=1xu0OAKqSzOD_NKTfRtrXpAlzHhIaVsbz");
        mItemDesignation.add("Treasurer");
        mItemName.add("");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1xu0OAKqSzOD_NKTfRtrXpAlzHhIaVsbz");

        mItemImageUrls.add("https://drive.google.com/uc?id=1567tQFnHRv-nPhirt1MwUz_AadnFdRRw");
        mItemDesignation.add("Club Service Director");
        mItemName.add("");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1567tQFnHRv-nPhirt1MwUz_AadnFdRRw");

        mItemImageUrls.add("https://drive.google.com/uc?id=1gwkzjMmOoElQm3iHRa275lp8lnAclU1A");
        mItemDesignation.add("International Service Director");
        mItemName.add("");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1gwkzjMmOoElQm3iHRa275lp8lnAclU1A");

        mItemImageUrls.add("https://drive.google.com/uc?id=13MOoNN9zwWkgC8JFitNigDBW0OXiwJ88");
        mItemDesignation.add("Community Service Director");
        mItemName.add("");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=13MOoNN9zwWkgC8JFitNigDBW0OXiwJ88");

        mItemImageUrls.add("https://drive.google.com/uc?id=1Tt87Qd15UZiFtvtD9sWhCHS4SPlcg-hC");
        mItemDesignation.add("Professional Service Director");
        mItemName.add("");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1Tt87Qd15UZiFtvtD9sWhCHS4SPlcg-hC");

        mItemImageUrls.add("https://drive.google.com/uc?id=1Cn-MXuT3i0H4ziYazHqUil8mHeQ_q7US");
        mItemDesignation.add("Assistant Director and Officer");
        mItemName.add("");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1Cn-MXuT3i0H4ziYazHqUil8mHeQ_q7US");

        mItemImageUrls.add("https://drive.google.com/uc?id=1lC67XwP-lX4vBnYPFV33sgRC1ajrxtVA");
        mItemDesignation.add("Sergeant-at-Arms");
        mItemName.add("");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1lC67XwP-lX4vBnYPFV33sgRC1ajrxtVA");

        mItemImageUrls.add("https://drive.google.com/uc?id=1Cn-MXuT3i0H4ziYazHqUil8mHeQ_q7US");
        mItemDesignation.add("Fundraising Chair");
        mItemName.add("");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1Cn-MXuT3i0H4ziYazHqUil8mHeQ_q7US");

        mItemImageUrls.add("https://drive.google.com/uc?id=1Cn-MXuT3i0H4ziYazHqUil8mHeQ_q7US");
        mItemDesignation.add("Public Relations Officer");
        mItemName.add("");
        mItemRIDNo.add("");
        mItemBackground.add("https://drive.google.com/uc?id=1Cn-MXuT3i0H4ziYazHqUil8mHeQ_q7US");

        mItemImageUrls.add("https://drive.google.com/uc?id=1_jgOWyOWTdJG4MYjfJ2slSiUpKv244K6");
        mItemDesignation.add("Information Technology Officer");
        mItemName.add("Rtr. Keshab Bahadur Sunari");
        mItemRIDNo.add("9647197");
        mItemBackground.add("https://drive.google.com/uc?id=1_jgOWyOWTdJG4MYjfJ2slSiUpKv244K6");

        initRecyclerView();

    }

    private void initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview.");

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView recyclerView = findViewById(R.id.clubReviewRecyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mItemDesignation, mItemImageUrls, mItemName, mItemRIDNo, mItemBackground);
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
