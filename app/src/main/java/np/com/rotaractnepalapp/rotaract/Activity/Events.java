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
        districtEventsClasses.add(new DistrictEventsClass("Magh","12","2074","Rotaract Club of Kantipur","Rotaract District Conference","Venue","Time",
                "10th Rotaract District Conference was one of the major event of Rotaract Nepal which was held on 26th Jaunuary and 27th January 2018 at Chitwan, the beautiful city of Nepal. Rotaractors from all across nepal attended the event.Different program was presented.Personality Development and training workshops to enhance professional and leadership skills; Networking with other young professionals across the region; Inspirational addresses to excite and energise. To Develop better mutual understanding and friendship with other clubs\n" +
                        "The event was organized by Rotaract District Committee and jointly hosted by Rotaract Club of Bharatpur, Rotaract Club of Chitwan and Rotaract Club of Rudramati Babarmahal-Kathmadu.The theme for 10th Rotaract District Conference was \"Green Entrepreneurship\". ",
                "","https://goo.gl/maps/hYfnZLfy3rq"));
        districtEventsClasses.add(new DistrictEventsClass("Ashawan","6","2075","Rotaract Club","Presidents & Secretaries Meet","Ranjit Event Center, Pokhara","",
                "Presidents and Secretaries Meet is a meeting of Rotaract President & Rotaract Secretaries from all over the club of Rotaract District 3292. During Presidents & Secretaries meet, different agendas are discussed where Club Presidents & Secretaries voice the opinion on behalf of their respective clubs. Besides the Rotaract related it also provides a platform for networking with other Rotaract Clubs, learn and share new ideas.",
                "","https://goo.gl/maps/Vr5S8F9YR6k"));
        districtEventsClasses.add(new DistrictEventsClass("July","7","2018","Rotaract District 3292","District Assembly (DLTS)","Lalitpur","",
                "Rotaract District Assembly (11th DLTS) and 10th Recognition Ceremony was organized by Rotaract District 3292 and jointly hosted by Rotaract Club of Patan and Rotaract Club of Mount Everest, Lalitpur on 7th July 2018.\n" +
                           "District Leadership Training Seminar(DLTS) is organized annually where representatives from all Rotaract Clubs throughtout the Rotary International District are gathered with the motive of strengthening the role of leadership, conducting social service with more visibility to the society, networking and collaborating with parties to enhance the Rotaract Movement. This training educated and trained the principal incoming Rotaract club presidents, secretaries, treasurers and officers for better understanding of their responsibilities and for better club leadership. The event was organized at DAV College, Jawalakhel with parallel and plenary session like Branding Rotaract, Maintaining Public Relations, Networking and Collaborations along with Rotaract offerings.",
                "","https://goo.gl/maps/azTEqqiuYRE2"));
        return districtEventsClasses;
    }

    public static ArrayList<ZonalEventsClass> getZonalEventData(){
        ArrayList<ZonalEventsClass> zonalEventsClasses = new ArrayList<>();
        zonalEventsClasses.add(new ZonalEventsClass("March","31","2012","RAC Dillibazar-Kathmandu","Zonal Leadership Workshop (ZLW)","NEA Training Center, Kharipati, Bhaktapur","Time",
                " ZLW was hosted by the joint collaboration of RAC Dillibazaar-Ktm and RAC Swoyambu on 31st March, 2012 at NEA Training Center, Kharipati, Bhaktapur. The theme of the program was “Lets Lead Strong & United”. The workshop was conducted by Rtr. Dr. Leison Maharjan, Rtr. Pranay Raj Shakya, Rtr. Ashok Raj Wagle, Rtr. Nirajan Maharjan and Rtr, Bikesh Raj Bajracharya. The numbers of participants were 22 from various club of Zone VI.\n" +
                           "The workshop was held in different session starting from the group formation where 4 groups were formed to the introduction, then various trust building game were played to put light on the importance of trust between group members and leader in any group which was conducted by Rtr. Pranay Raj Shakya . Thereafter, next session was conducted by Rtr. Bikesh Raj Bajracharya who puts light on leadership and communication skill development. Rtr. Nirajan Maharjan took another session where he discussed on Rotaract and leadership. Finally, the session was wrapped up by Rtr. Pranay Raj Shakya where he allowed the leader from each group to deliver king's speech to convince other trainee on their future project they want to organize.\n" +
                           "The workshop was learning fill up with lots of fun which gave a broad understanding on the leadership.",
                "","https://goo.gl/maps/GyGm3YdrUVJ2"));
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
