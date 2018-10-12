package np.com.rotaractnepalapp.rotaract.Activity;


import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import np.com.rotaractnepalapp.rotaract.Adapter.EventImageSliderAdapter;
import np.com.rotaractnepalapp.rotaract.Class.ClassEvents.ClubEventsClass;
import np.com.rotaractnepalapp.rotaract.Class.ClassEvents.DistrictEventsClass;
import np.com.rotaractnepalapp.rotaract.Adapter.EventsAdapter.MainEventsAdapter;
import np.com.rotaractnepalapp.rotaract.R;
import np.com.rotaractnepalapp.rotaract.Class.ClassEvents.ZonalEventsClass;

public class Events extends AppCompatActivity {

    private ViewPager imageSlider;
    LinearLayout sliderDotsPlaner;
    private int dotcount;
    private ImageView[] dots;

    private ArrayList<Object> objects = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs_events);
        this.setTitle("Events");
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        imageSlider = (ViewPager) findViewById(R.id.imageSlider);

        sliderDotsPlaner = (LinearLayout) findViewById(R.id.sliderDots);

        EventImageSliderAdapter imageSliderAdapter = new EventImageSliderAdapter(this);

        imageSlider.setAdapter(imageSliderAdapter);

        dotcount = imageSliderAdapter.getCount();

        dots = new ImageView[dotcount];

        for (int i = 0; i < dotcount; i++){
            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotsPlaner.addView(dots[i], params);
        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

        imageSlider.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

                for (int a = 0; a < dotcount; a++ ){
                    dots[a].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.nonactive_dot));
                }

                dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new ImageSliderTask(), 6000, 6000);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.eventsRecyclerView);
        MainEventsAdapter adapter = new MainEventsAdapter(this, getObject());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }

    private ArrayList<Object> getObject() {
        objects.add(getDistrictEventData().get(0));
        objects.add(getZonalEventData().get(0));
        objects.add(getClubEventData().get(0));
        return objects;
    }

    public static ArrayList<DistrictEventsClass> getDistrictEventData(){
        ArrayList<DistrictEventsClass> districtEventsClasses = new ArrayList<>();
        districtEventsClasses.add(new DistrictEventsClass("Month","Day","Year","Organizer","Event","Venue","Time","","",""));
        return districtEventsClasses;
    }

    public static ArrayList<ZonalEventsClass> getZonalEventData(){
        ArrayList<ZonalEventsClass> zonalEventsClasses = new ArrayList<>();
        zonalEventsClasses.add(new ZonalEventsClass("Month","Day","Year","Organizer","Event","Venue","Time","","",""));
        return zonalEventsClasses;
    }

    public static ArrayList<ClubEventsClass> getClubEventData(){
        ArrayList<ClubEventsClass> clubEventsClasses = new ArrayList<>();
        clubEventsClasses.add(new ClubEventsClass("Kartik","27","2075","RAC Bagmati","Dashain Greeting Exchange","Chakati-Grill & Bar Resturant, Bansbari","",
                "Dashain, our main festival is all about gathering with our loved ones, having a great time together and exchanging well wishes among one another. And with the festival just around the corner, we have planned a special “Dashain Greeting Exchange and Barbecue Program”. We believe that this gathering will strengthen the bond between our Rotaract fraternity and what better way to do it other than at a drool-worthy Barbecue Program? The program will consist of open mic session for that talent hidden inside you. Guitar, Cajon will be available and the floor will be open for all participating members. Do come prepared!",
                "9841166755","https://goo.gl/maps/j3f1LhefpL32"));
        clubEventsClasses.add(new ClubEventsClass("Kartik", "29", "2075", "RAC Patan Durbar Square", "Global Handwash Day", "Multiple Venues", "",
                "Global Hand washing Day is a campaign to motivate and mobilize people around the world to improve their handwashing habits. It is a global advocacy to increase the awareness and understand the importance of handwashing with soap as an easy, effective and affordable way to prevent diseases and save life. The 2018 Global Handwashing Day theme is “CLEAN HANDS – A RECIPE FOR HEALTH.” ",
                "", ""));
        clubEventsClasses.add(new ClubEventsClass("Mangsir", "22", "2075", "RAC Dhulikhel", "Plantation Program", "on the way to Dhulikhel Hospital", "",
                "Rotary Club of Dhulikhel, Rotaract Club of Dhulikhel and Rotaract Club of KUMS planted the Karbir plants, the ornamental plant on the way to Dhulikhel hospital on 11th August, 2018. The plantation was successfully accomplished with the presence of President of RC Dhulikhel Rtn. Laxmi Khanal, Assistant Governed and past president Rtn. Ranjeev Shrestha, Presidents of RAC Dhulikhel and KUMS along with members from the clubs.",
                "", ""));
        return clubEventsClasses;
    }

    public class ImageSliderTask extends TimerTask {

        @Override
        public void run() {
            Events.this.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    if (imageSlider.getCurrentItem() == 0){
                        imageSlider.setCurrentItem(1);
                    }else if (imageSlider.getCurrentItem() == 1){
                        imageSlider.setCurrentItem(2);
                    }else if (imageSlider.getCurrentItem() == 2){
                        imageSlider.setCurrentItem(3);
                    }else if (imageSlider.getCurrentItem() == 3){
                        imageSlider.setCurrentItem(4);
                    }else if (imageSlider.getCurrentItem() == 4){
                        imageSlider.setCurrentItem(5);
                    }else if (imageSlider.getCurrentItem() == 5){
                        imageSlider.setCurrentItem(6);
                    }else if (imageSlider.getCurrentItem() == 6){
                        imageSlider.setCurrentItem(7);
                    }else {
                        imageSlider.setCurrentItem(0);
                    }
                }
            });
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
