package np.com.rotaractnepalapp.rotaract.Activity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;


import com.rengwuxian.materialedittext.MaterialEditText;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

import np.com.rotaractnepalapp.rotaract.Adapter.ImageSliderAdapter;
import np.com.rotaractnepalapp.rotaract.Adapter.IntroductionAdapter.MainIntroAdpater;
import np.com.rotaractnepalapp.rotaract.Adapter.SpinnerAdapter;
import np.com.rotaractnepalapp.rotaract.Class.ClassIntroduction.Intro1Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassIntroduction.Intro2Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassIntroduction.Intro3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassIntroduction.Intro4Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassIntroduction.Intro5Class;
import np.com.rotaractnepalapp.rotaract.Class.SpinnerItem;
import np.com.rotaractnepalapp.rotaract.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

   /* private com.github.clans.fab.FloatingActionButton fab_news, fab_events, fab_chat;*/
    private ViewPager imageSlider;
    LinearLayout sliderDotsPlaner;
    private int dotcount;
    private ImageView[] dots;

    private ArrayList<Object> objects = new ArrayList<>();

    Dialog CreateNews;
    MaterialEditText title, description, location, startDate, programTime;
    TextView close, showNews;
    DatePickerDialog datePickerDialog;
    TimePickerDialog timePickerDialog;

    private ArrayList<SpinnerItem> mClubList;
    private SpinnerAdapter mAdapter;

    private int REQUEST_CODE = 1;
    ImageView newsSelectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imageSlider = (ViewPager) findViewById(R.id.imageSlider);

        sliderDotsPlaner = (LinearLayout) findViewById(R.id.sliderDots);

        ImageSliderAdapter imageSliderAdapter = new ImageSliderAdapter(this);

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

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.informationRecyclerView);
        MainIntroAdpater adapter = new MainIntroAdpater(this, getObject());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


       /* fab_news = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.fab_news);
        fab_chat = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.fab_chat);
        fab_events = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.fab_events);

        fab_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CreatNewNews(view);
            }
        });


        fab_events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Events.class);
                startActivity(intent);
            }
        });

        fab_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Upcoming Feature Under construction" , Toast.LENGTH_SHORT).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void CreatNewNews(View view) {
        CreateNews = new Dialog(this);
        CreateNews.setContentView(R.layout.add_news_adapter);

        title = (MaterialEditText) CreateNews.findViewById(R.id.newsTitleText);

        description = (MaterialEditText) CreateNews.findViewById(R.id.newsDescriptionText);

        location = (MaterialEditText) CreateNews.findViewById(R.id.newsLocationText);

        startDate = (MaterialEditText) CreateNews.findViewById(R.id.newsStartDateText);
        startDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                final int day = calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        startDate.setText(day + "-" + (month+1) + "-" + year);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });

        programTime = (MaterialEditText) CreateNews.findViewById(R.id.newsTimeText);
        programTime.setOnClickListener(new View.OnClickListener() {
            Calendar calendar = Calendar.getInstance();
            int hour = calendar.get(Calendar.HOUR);
            int minute = calendar.get(Calendar.MINUTE);
            @Override
            public void onClick(View v) {
                timePickerDialog = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        String am_pm;
                        if (hourOfDay < 12){
                            am_pm = "AM";
                            programTime.setText(hourOfDay + ":" + minute + " " + am_pm);
                        }else if (hourOfDay == 12){
                            am_pm = "PM";
                            programTime.setText(hourOfDay + ":" + minute + " " + am_pm);
                        }else {
                            am_pm = "PM";
                            programTime.setText(hourOfDay + ":" + minute + " " + am_pm);
                        }
                    }
                }, hour, minute, true);
                timePickerDialog.show();
            }
        });

        initList();

        Spinner spinnerClub = (Spinner) CreateNews.findViewById(R.id.spinner_club);
        mAdapter = new SpinnerAdapter(this, mClubList);
        spinnerClub.setAdapter(mAdapter);

        spinnerClub.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerItem clickedItem = (SpinnerItem) parent.getItemAtPosition(position);
                /*String clickedClubName = clickedItem.getmClubName();
                Toast.makeText(News.this, clickedClubName + " selected", Toast.LENGTH_SHORT).show();*/
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        newsSelectedImage = (ImageView) CreateNews.findViewById(R.id.newsImageSelect);
        newsSelectedImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivityForResult(Intent.createChooser(intent, "Selected Picture"), REQUEST_CODE );
            }
        });

        showNews = (TextView) CreateNews.findViewById(R.id.showNews);
        showNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, News.class);
                startActivity(intent);
                CreateNews.dismiss();
            }
        });

        close = (TextView) CreateNews.findViewById(R.id.txtCloseNewsCreate);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateNews.dismiss();
            }
        });


        CreateNews.setCanceledOnTouchOutside(false);
        CreateNews.setCancelable(false);
        CreateNews.show();

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null &&  data.getData() != null){
            Uri uri = data.getData();
            try{
                Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                newsSelectedImage.setImageBitmap(bitmap);

            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    private void initList(){
        mClubList = new ArrayList<>();
        mClubList.add(new SpinnerItem("Select your club", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Annapurna", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Baglung", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Bagmati", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Bajra Manasalu Gorkha", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Balaju", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Banepa", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Baneshwor", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Baneshwor Royal", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Bhadgaon", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Bhairahawa", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Bhaktapur", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Bharatpur", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Biratnagar", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Biratnagar Down Town", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Birgunj", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Birgunj Metropolis", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Birtamod Mid-Town", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Birtamode", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Budhanilkantha", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Budol", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Butwal", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Butwal Down Town", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Butwal South", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Butwal Synergy", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Central Butwal", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Central Lumbini", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Chandragiri", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Charumati", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Chitwan", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Damak", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Damauli", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Dang", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Dhangadhi", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Dharan", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Dharan Ghopa", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Dhulikhel", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Dillibazar-Kathmandu", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Durbarmarg", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Gongabu", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Gorkha", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Hemja", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Hetauda", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Himalaya Patan", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Itahari", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Jawalakhel", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Jawalakhel Manjushree", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Kakarvita", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Kantipur Dental College", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Kapilvastu", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Kapilvastu Mid-Town", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Kasthamandap", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Kathmandu", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Kathmandu Medical College", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Kathmandu Metro", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Kathmandu Metropolis", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Kathmandu Mid Town", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Kathmandu North", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Kathmandu North East", R.drawable.rackne));
        mClubList.add(new SpinnerItem("RAC Kathmandu Sunrise", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Kathmandu University", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Kathmandu University Medical School", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Kathmandu West", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Kathmandu Youth North East", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Khitiz Int'l College", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC KIST Medical College", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Kopundol", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Lalitpur", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Lalitpur Midtown", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Lamjung", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Lekhnath", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Liberty College", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Lumbini Banijya Campus", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Lumbini Siddhartha Nagar", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Madhyapur", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Mahabouddha", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Makwanpur", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Manipal College of Medical Sciences", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Manohara", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Matribhumi Baluwatar IOM", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Metro City", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Mount Everest, Lalitpur", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Narayangarh", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Narayani Mid Town", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC New Road City", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Newroad Pokhara", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Palpa Tansen", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Panauti", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Parbat", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Parbat Pokhara", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Pashupati", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Patan", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Patan Durbar Square", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Patan South", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Patan West", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC People Campus", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Phulbari", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Pokhara", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Pokhara Fishtail", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Pokhara GMC", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Pokhara Lakeside", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Pokhara Mid Town", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Rajdhani", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Ramapithecus", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Ratnanagar", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Reliance College", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Rudramati", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Rudramati- Babarmahal", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Rupandehi", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC SAIM College", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Sainamaina", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Sainbu Bhainsepati", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Sukedhara", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Swoyambhu", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Thames International College", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Tilottama Devdaha", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Tilottama Rupandehi", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Tinau Butwal", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Tinau City", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Tripureshwor", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Tulsipur", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("RAC Yala", R.drawable.colorlogo_rotaractnepalapp));
        mClubList.add(new SpinnerItem("Rotaract Club of Kantipur", R.drawable.colorlogo_rotaractnepalapp));


    }

    private ArrayList<Object> getObject() {
        objects.add(getIntro1Data().get(0));
        objects.add(getIntro2Data().get(0));
        objects.add(getIntro3Data().get(0));
        objects.add(getIntro4Data().get(0));
        objects.add(getIntro5Data().get(0));
        return objects;
    }

    public static ArrayList<Intro1Class> getIntro1Data(){
        ArrayList<Intro1Class> intro1Classes = new ArrayList<>();
        intro1Classes.add(new Intro1Class(R.mipmap.ic_rotary,R.drawable.rotary,"Rotary", "Rotary is an organization of business and professional person united worldwide, who provide humanitarian service, encourage high ethical standards in all vocations and help build goodwill and peace in the world which is open to all persons regardless of race, color, creed, religion, gender or political preference." +
                "Rotary’s principle motto is, “Service Above Self”." +
                "\nRotary members believe that we have a shared responsibility to take action on our world’s most persistent issues." +
                "\nThe object of Rotary is to encourage and foster the ideal of service as a basis of worthy enterprise and, in particular, to encourage and foster:" +
                "\n\n•The development of acquaintance as an opportunity for service" +
                "\n\n•High ethical standards in business and professions, the recognition of the worthiness of all useful occupations, and the dignifying of each Rotarian's occupation as an opportunity to serve society;" +
                "\n\n•The application of the ideal of service in each Rotarian's personal, business, and community life;" +
                "\n\n•The advancement of international understanding, goodwill, and peace through a world fellowship of business and professional persons united in the ideal of service." +
                "\n\n\nOur 35,000+ clubs work together to: " +
                "\nPromote peace, Fight disease, Provide clean water, sanitation, and hygiene, Save mothers and children, Support education, Grow local economies"));
        intro1Classes.add(new Intro1Class(R.mipmap.ic_rotaract, R.drawable.rotaract,"Rotaract", "Rotaract clubs bring together people ages 18-30 to exchange ideas with leaders in the community, develop leadership and professional skills, and have fun through service." +
                "Rotaract clubs decide how to organize and run their club, manage their own funds, and plan and carry out activities and service projects aligned with causes that are important to your community. Rotary club sponsors offer guidance and support and work with your club as partners in service." +
                "\nRotaract was founded in 1968 by Charlotte North Rotary Club,[citation needed] located in Charlotte, North Carolina." +
                "\nRotaract connects you with leaders in your community and around the world to:" +
                "\n\n•Take action locally and internationally to create sustainable change" +
                "\n\n•Expand your professional network and exchange ideas with proven leaders" +
                "\n\n•Develop your professional skills through leadership training" +
                "\n\n•Save money on travel, hotels, and supplies with Rotary’s member benefits program, Rotary Global Rewards" +
                "\n\n•Have fun and make new friends from around the world" +
                "\n\n•Connect with the global community of Rotaract at the annual Rotary International Convention and Rotaract Preconvention" +
                "\n\n\nIn communities worldwide, Rotary and Rotaract members work side by side to take action through service. From big cities to rural villages, Rotaract is changing communities like yours."));
        intro1Classes.add(new Intro1Class(R.mipmap.ic_interact, R.drawable.intaract,"Interact", "Interact is Rotary International’s service club for young people ages 12 to 18. Interact clubs are sponsored by individual Rotary clubs, which provide support and guidance, but they are self-governing and self-supporting." +
                "Club membership varies greatly. Clubs can be single gender or mixed, large or small. They can draw from the student body of a single school or from two or more schools in the same community." +
                "\nEach year, Interact clubs complete at least two community service projects, one of which furthers international understanding and goodwill. Through these efforts, Interactors develop a network of friendships with local and overseas clubs and learn the importance of:" +
                "\n\n•Developing leadership skills and personal integrity" +
                "\n\n•Demonstrating helpfulness and respect for others" +
                "\n\n•Understanding the value of individual responsibility and hard work" +
                "\n\n•Advancing international understanding and goodwill" +
                "\n\n\nAs one of the most significant and fastest-growing programs of Rotary service, with more than 33,000 clubs in more than 200 countries and geographical areas,[citation needed] Interact has become a worldwide phenomenon. Almost 340,000 young people are involved in Interact."));
        intro1Classes.add(new Intro1Class(R.drawable.ic_join_us, R.drawable.end_polio,"How to Join ?", "Please note that membership in a Rotary club is by invitation. Often, a person being considered for membership is invited by a club member, or sponsor, to attend one or more club meetings to learn more about Rotary. In this case, the sponsor submits the candidate's name to the club's membership committee." +
                "You may check with your university or contact a local Rotary club to find out if there’s a Rotaract club in your area. Contact the Rotaract club to find out how you can join its next meeting, service project, or social event." +
                "\nAs a club member, you will be asked to:" +
                "\n\n•Pay club dues" +
                "\n\n•Attend meetings and events" +
                "\n\n•Use your professional skills and talents to make a difference"));
        intro1Classes.add(new Intro1Class(R.drawable.ic_oath, R.drawable.rotaract,"Rotaract Oath", "OATH: Board Members" +
                "\n\nI DO SOLEMNLY SWEAR, THAT I WILL SINCERELY EXECUTE, THE OFFICE OF...THE ROTARACT CLUB OF ....AND SHALL DO MY BEST TO KEEP UP, THE DECORUM, OF OUR ROTARACT MOVEMENT, BY UPHOLDING, THE CONSTITUTION AND STATEMENT OF POLICY OF OUR ORGANIZATION" +
                "\n\nMembers" +
                "\n\nI DO SOLEMNLY PROMISE, THAT I WILL SINCERELY SERVE, AS A MEMBER OF THIS ROTARACT CLUB OF ...AND SHALL AT ALL TIMES UPHOLD THE IDEALS AND PRINCIPLES OF THIS ORGANISATION"));
        return intro1Classes;

    }

    public static ArrayList<Intro2Class> getIntro2Data(){
        ArrayList<Intro2Class> intro2Classes = new ArrayList<>();
        intro2Classes.add(new Intro2Class(R.drawable.ic_bod, R.drawable.end_polio,"President", "As the club leader, the president helps members develop as leaders and works to ensure that the club's professional and leadership development activities and community and international service projects are successfully promoted and completed." +
                "\nUnder the leadership of the Rotaract club president, club members plan professional development activities, leadership training, community and international service projects, fundraisers, and social events. " +
                "\n\nResponsibilities:" +
                "\n\n•Identifies members' skills and interests and puts them to work in club projects." +
                "\n\n•Maintains club operations, delegating responsibilities and establishing meeting schedules" +
                "\n\n•Develops a plan for the year as early as possible" +
                "\n\n•Presides over all meetings of the club and its board of directors (following parliamentary procedure may help to keep discussion relevant)" +
                "\n\n•Appoints all standing and special committees, with board approval, and follows up on committee progress with the help of the vice president" +
                "\n\nThe president should maintain regular communication with:" +
                "\n\n•Sponsoring Rotary club through joint activities and meetings" +
                "\n\n•District Rotaract representative through club participation in district activities and meetings" +
                "\n\n•Rotary International through participation in the Rotaract Preconvention Meeting and annual reporting" +
                "\n\n•To help facilitate communication, the above groups should also receive the club's bulletin or newsletter featuring the outstanding Rotaract club projects or activities."));
        intro2Classes.add(new Intro2Class(R.drawable.ic_bod, R.drawable.end_polio,"Immediate Past President", "The Immediate Past President (IPP) remains on the board the year immediately following their tenure as President to ensure continuity in leadership and act as an advisor to the new President and board. The IPP serves in this capacity even if they reach the age of 30 during their year as President." +
                "\nThe IPP must always support the actions of the President and the Board.The IPP’s role in the Board is to advice the Board and guide the Board in their decisions." +
                "\nAs an IPP, the club members will listen to him/her and the IPP must capitalise on this to diffuse any dissension." +
                "\n\nThe IPP can also play a vital role in the following club activities:" +
                "\n\n•club weekly meeting procedure" +
                "\n\n•club’s induction procedure" +
                "\n\n•board meeting procedure" +
                "\n\n•board budget and financial management" +
                "\n\n•annual and emergency general meeting" +
                "\n\n•club assembly" +
                "\n\n•governor’s official visit requirements" +
                "\n\n•club installation" +
                "\n\n•club bulletin" +
                "\n\n•use of district officer" +
                "\n\n•club culture" +
                "\n\n•general correspondence"));
        intro2Classes.add(new Intro2Class(R.drawable.ic_bod, R.drawable.end_polio,"Vice President", "The club vice president can serve more effectively by understanding the year's goals, projects, and activities, and being well versed in community and Rotary resources. To that end, it is important that the club president and vice president work together as a team. " +
                "\n\nResponsibilities:" +
                "\n\n•Presides at all meetings when the president is absent and serves on the board of directors and as an ex-officio member of all committees." +
                "\n\n•Acts as the officer at large, responsible for all assignments that are designated by the president." +
                "\n\n•Liaises with the district committees whenever required" +
                "\n\n•Assists the president in ensuring the club meets any required deadlines" +
                "\n\nA well-organized and responsible vice president is often the key to a successful Rota year. The vice president can reduce the administrative load, allowing time for the president to develop new and exciting club projects and activities."));
        intro2Classes.add(new Intro2Class(R.drawable.ic_bod, R.drawable.end_polio,"Secretary", "As club secretary you help your club run smoothly and effectively. You also monitor club trends to help identify strengths and areas for improvement, and share this information with club and district leaders." +
                "\n\nResponsibilities:" +
                "\n\n•Handles the club's communication with the public through correspondence to the Rotary club sponsor(s),  outside agencies, prospective members, Rotary International, and other Rotaract clubs" +
                "\n\n•Maintains all club records" +
                "\n\n•Takes the minutes for all board and club meetings (when necessary)" +
                "\n\n•Sends the Notice of Rotaract Alumnus (Potential Rotarian) form to the secretary of sponsoring Rotary club once members reach the Rotaract age limit of 30" +
                "\n\n•Assists the president in ensuring the club meets any required deadlines" +
                "\n\nSpecial requirements:" +
                "\n\n•Must be very detail oriented and organized" +
                "\n\n•Must have good communication skills" +
                "\n\n•Ability to multi-task and me"));
        intro2Classes.add(new Intro2Class(R.drawable.ic_bod, R.drawable.end_polio,"Treasurer", "As club treasurer you play an important role in your club’s ability to carry out service projects, fundraise, and support The Rotary Foundation. Being collector and disburser of club funds, the treasurer is responsible for the club's solvency and financial stability. In preparing for this assignment, the treasurer should meet with the previous treasurer and consult the sponsoring Rotary club treasurer and a certified accountant." +
                "\n\nResponsibilities:" +
                "\n\n•Chairs the finance committee" +
                "\n\n•Establish financial control" +
                "\n\n•Works with the board of directors to develop the annual budget" +
                "\n\n•Collects dues and all funds raised by the club" +
                "\n\n•Pays all club bills and reimbursements for club expenses" +
                "\n\n•Reports the club's financial status at meeting" +
                "\n\n•Help member submit contributions" +
                "\n\n•Has the books audited at the end of the fiscal Year"));
        return intro2Classes;

    }

    public static ArrayList<Intro3Class> getIntro3Data(){
        ArrayList<Intro3Class> intro3Classes = new ArrayList<>();
        intro3Classes.add(new Intro3Class(R.drawable.ic_bod, R.drawable.end_polio,"Club Service", "Responsibilities:" +
                "\n\n•strategies for membership development and retention" +
                "\n\n•Monitors attendance" +
                "\n\n•Oversees the productions and distribution of the club bulletin" +
                "\n\n•Plans fellowship activities for the membership" +
                "\n\n•Update club information" +
                "\n\n•Create and maintain club member database" +
                "\n\n•Encourage joint meeting and programs" +
                "\n\n•Be responsible towards guest and proposed/new member" +
                "\n\n•Maintain clubs by-laws and constitution"));
        intro3Classes.add(new Intro3Class(R.drawable.ic_bod, R.drawable.end_polio,"International Service", "Responsibilities:" +
                "\n\n•Primarily responsibility for seeking opportunities to enhance knowledge and understanding of worldwide needs and problems" +
                "\n\n•Promote rotary international events and calendar" +
                "\n\n•Inform on international events and encourage for application" +
                "\n\n•Promote rotaract event to international clubs via website, facebook" +
                "\n\n•Participating and hosting IDYEP team" +
                "\n\n•Try to make inter district twin club" +
                "\n\n•Try for joint project with international clubs" +
                "\n\n•Developing activities to give service for promoting international understanding and goodwill toward all people." +
                "\n\n•Responsible for initiating and planning one major activity each year which shall involve all or most of the club membership."));
        intro3Classes.add(new Intro3Class(R.drawable.ic_bod, R.drawable.end_polio,"Community Service", "Responsibilities:" +
                "\n\n•Primarily responsible for seeking opportunities to enhance knowledge and understanding of local community needs and problems" +
                "\n\n•Formulating and developing appropriate activities for serving the local community" +
                "\n\n•Focus on district theme project if any" +
                "\n\n•Promotion of Rotaract community project" +
                "\n\n•Special Area Project (SAP) is recommended to be adopted under this avenue. SAP co-ordinator may be assigned under this committee." +
                "\n\n•Identifying financial resources and development partners, INGOs" +
                "\n\n•Ensure that all focus areas of this committee are being effectively implemented and that strategic goals have been set for each focus area."));
        intro3Classes.add(new Intro3Class(R.drawable.ic_bod, R.drawable.end_polio,"Professional Development", "Responsibilities:" +
                "\n\n•Reviews suggestions and develops plans to provide opportunities for professional development for the club's membership" +
                "\n\n•Developing programs designed to provide information about a wide cross-section of businesses and professions" +
                "\n\n•Developing programs to stimulate awareness and acceptance of high ethical standards in business and professional life." +
                "\n\n•coordinating with other institutions on training and workshop" +
                "\n\n•Promoting career development programs and vocational programs" +
                "\n\n•Encouraging in house speaker in the meeting for the leadership development of the matter"));
        return intro3Classes;

    }

    public static ArrayList<Intro4Class> getIntro4Data(){
        ArrayList<Intro4Class> intro4Classes = new ArrayList<>();
        intro4Classes.add(new Intro4Class(R.drawable.ic_bod, R.drawable.end_polio,"Assistant Directors and officer", "Roles:" +
                "\n\n•reviewing suggestions and developing plans for the club's annual project(s)" +
                "\n\n•taking a leadership role in facilitating programs and projects related to their avenue" +
                "\n\n•coordinating all activities and project undertaken by his/her committee" +
                "\n\n•present the board with plans and objectives of all committee projects for approval" +
                "\n\n•preparing a budget for all projects to be presented to the board" +
                "\n\n•provide regular reports of all projects to the President and Secretary provide the Treasurer with receipts of all expenses incurred during a project" +
                "\n\n•act as a liaison between the President, and by extension the board, and the members of his/her committee"));
        intro4Classes.add(new Intro4Class(R.drawable.ic_bod, R.drawable.end_polio,"Sergeant at arms", "This role is allow the President to concentrate on conducting the weekly meeting by ensuring that all duties are fulfilled and the meeting is conducted smoothly and in a timely way. " +
                "\n\nIn particular:" +
                "\n\n•Help maintain orderly and effective weekly meetings and work to prevent any occurrence that might detract from the dignity or prestige of the Club." +
                "\n\n•Be constantly on the alert to prevent any occurrence that might detract from the dignity and prestige associated with Rotary clubs." +
                "\n\n•Before meeting arrange the things needed for the meeting or event." +
                "\n\n•Allow the President to conduct the meeting with confidence and a rule of order" +
                "\n\n•play an important role in overall following and maintaining a schedule of events and activity to provide for a pleasant and successful meeting." +
                "\n\n•Run a tight Sergeant's session that serves a dual purpose of educating Club members and takes account of the need not to visitors." +
                "\n\n•Ensure that, so far as possible, speakers know in advance the length of time they are expected to speak and take questions."));

        intro4Classes.add(new Intro4Class(R.drawable.ic_bod, R.drawable.end_polio,"Information Technology", "Responsibilities:" +
                "\n\n•To maintain and update website" +
                "\n\n•Update club roster online and maintain digital records" +
                "\n\n•Promote the club in digital and online platform" +
                "\n\n•Update links and online documents" +
                "\n\n•Maintain platform for social networking" +
                "\n\n•Create club promotional materials i.e. promotional videos, websites." +
                "\n\n•Maintaining logos and other designs"));
        intro4Classes.add(new Intro4Class(R.drawable.ic_bod, R.drawable.end_polio,"Fundraising Chair", "The major responsibility of the fundraising committee is to raise the amount needed to meet the proposed unit budget and to work cooperatively with the PTA president and treasurer in accounting for receipts and disbursements for the activity." +
                "\n\n•Ensure there’s a specific fundraising target." +
                "\n\n•Ensure prospect reseaR.id.nav_chatrch occurs to identify how much money might be raised from different types of resources" +
                "\n\n•identify specific, potential sources of funds from a diverse mix of sources" +
                "\n\n•Develop an action plan of approach" +
                "\n\n•Ensure effective administrative systems to track grants and donations"));
        intro4Classes.add(new Intro4Class(R.drawable.ic_bod, R.drawable.end_polio,"Public Relations officer", "\n\n•This role is to work with a variety of audiences, including civic dignitaries, to inform the community about the Club, its history, goals and accomplishments throughout the year. " +
                "\n\n•To work with the media to secure proper publicity and sharing news about the Club's service initiatives so as to improve Rotarians' ability to provide service. Concentrate on stories that have a strong human-interest element and are pertinent to the larger community such as helping a scholar, the elderly, disadvantaged youth, etc." +
                "\n\n•Keep RI and the DG informed about newsworthy Club projects and action photographs." +
                "\n\n•Keep the media informed of important Club events." +
                "\n\n•Communicate with key organizations and leaders within the community."));
        return intro4Classes;

    }

    public static ArrayList<Intro5Class> getIntro5Data(){
        ArrayList<Intro5Class> intro5Classes = new ArrayList<>();
        intro5Classes.add(new Intro5Class(R.drawable.colorlogo_rotaractnepalapp, R.drawable.end_polio,"District Conference", "A Rotaract district conference or DC as it is known is a meeting of all the Rotaract clubs in the given RI district" +
                "\n\nEach year, districts are asked to hold a conference for club members so they can learn about what's happening in club and their district and meet other Rotarians in the area. The conference usually lasts one to two days and includes:" +
                "\n\n•A visit from a president's representative, who gives an update on Rotary International and inspires and motivates participants" +
                "\n\n•A report on the district, including its successes and challenges" +
                "\n\n•An official business meeting to discuss and vote on important district matters" +
                "\n\n•Local and international speakers giving information on topics relevant to district members" +
                "\n\n•Time to network, reconnect with friends, and find inspiration for continuing service and community leadership" +
                "\n\n•elect a new district Rotaract representative or DRR. He or she is the head of the district committee of that district."));
        intro5Classes.add(new Intro5Class(R.drawable.colorlogo_rotaractnepalapp, R.drawable.end_polio,"DLTS", "District Leadership Training Seminar(DLTS) is organized annually where representatives from all Rotaract Clubs throughtout the Rotary International District are gathered with the motive of strengthening the role of leadership, conducting social service with more visibility to the society, networking and collaborating with parties to enhance the Rotaract Movement. This training educated and trained the principal incoming Rotaract club presidents, secretaries, treasurers and officers for better understanding of their responsibilities and for better club leadership."));
        intro5Classes.add(new Intro5Class(R.drawable.colorlogo_rotaractnepalapp, R.drawable.end_polio,"PS-Meet", ""));
        intro5Classes.add(new Intro5Class(R.drawable.colorlogo_rotaractnepalapp, R.drawable.end_polio,"RYLA", "Rotary Youth Leadership Awards (RYLA) is an intensive leadership experience organized by Rotary clubs and districts where you develop your skills as a leader while having fun and making connections." +
                "\n\nRYLA events are organized locally by Rotary clubs and districts for participants ages 14-30. Depending on community needs, RYLA may take the form of a one-day seminar, a three-day retreat, or a weeklong camp. Typically, events last 3-10 days and include presentations, activities, and workshops covering a variety of topics." +
                "\n\nRYLA participants are nominated by their local Rotary clubs" +
                "\n\nThe purpose of the program is to recognize young people who have demonstrated leadership skills or show the potential to be leaders, and provide them with an opportunity to explore and further develop these skills with other with similar capabilities." +
                "\n\nDuring the three-day conference held at Camp Tecumseh, Brookston, IN, participants will:" +
                "\n\n•Explore their own style and strengths" +
                "\n\n•Build connection" +
                "\n\n•Learn skills that will enable them to be aware of and to address community needs" +
                "\n\n•Interact with adult role models who are active in their professions and community" +
                "\n\n•Develop and learn leadership skills" +
                "\n\n•Have a lot of fun!"));
        return intro5Classes;

    }

    public class ImageSliderTask extends TimerTask{

        @Override
        public void run() {
            MainActivity.this.runOnUiThread(new Runnable() {
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
                    }else if (imageSlider.getCurrentItem() == 7){
                        imageSlider.setCurrentItem(8);
                    }else {
                        imageSlider.setCurrentItem(0);
                    }
                }
            });
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.bloodSearch) {
            Intent intent = new Intent(this, BloodSearch.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent intent=null, chooser =null;

        if (id == R.id.nave_home){
            intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_learning_material){
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/11yzjhoznhASyo6IXVgITgoRp5kF_t4Qz"));
            startActivity(intent);
        } else if (id == R.id.nav_news) {
            intent = new Intent(this, News.class);
            startActivity(intent);
        } else if (id == R.id.nav_club_review) {
            intent = new Intent(this, Club.class);
            startActivity(intent);
        } else if (id == R.id.nav_today_event) {
            intent = new Intent(this, Events.class);
            startActivity(intent);
        } else if (id == R.id.nav_about_us){
            intent = new Intent(this, AboutUs.class);
            startActivity(intent);
        } else if (id == R.id.nav_feed_back){
            intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] to = {"rotaractnepalapp@gmail.com"};
            intent.putExtra(Intent.EXTRA_EMAIL, to);
            intent.putExtra(Intent.EXTRA_SUBJECT, "Sent From Rotaract Nepal App");
            intent.putExtra(Intent.EXTRA_TEXT, "Your Feedback");
            intent.setType("message/rfc822");
            chooser = intent.createChooser(intent,"Send Feedback");
            startActivity(chooser);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



}
