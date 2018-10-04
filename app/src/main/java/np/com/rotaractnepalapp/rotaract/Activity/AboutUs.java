package np.com.rotaractnepalapp.rotaract.Activity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Adapter.AboutUsAdapter;
import np.com.rotaractnepalapp.rotaract.Class.AboutUsClass;
import np.com.rotaractnepalapp.rotaract.R;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_about_us);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.aboutUsRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(new AboutUsAdapter(this, getData()));
    }

    private ArrayList getData(){
        ArrayList<AboutUsClass> aboutUsClasses = new ArrayList<>();

        AboutUsClass aboutUS = new AboutUsClass();
        aboutUS.setName("Rtr. Keshab Bahadur Sunari");
        aboutUS.setProfession("Android App Developer");
        aboutUS.setAddress("Basantapur, Kathamandu, Nepal");
        aboutUS.setImage(R.drawable.keshab);
        aboutUS.setCall("9841803337");
        aboutUS.setEmail("070bct515@ioe.edu.np");
        aboutUsClasses.add(aboutUS);

        aboutUS = new AboutUsClass();
        aboutUS.setName("Mr. Suresh Khatri");
        aboutUS.setProfession("Android App Developer");
        aboutUS.setAddress("Kathamandu, Nepal");
        aboutUS.setImage(R.drawable.shresh);
        aboutUS.setCall("9849380632");
        aboutUS.setEmail("");
        aboutUsClasses.add(aboutUS);

        return aboutUsClasses;
    }
}
