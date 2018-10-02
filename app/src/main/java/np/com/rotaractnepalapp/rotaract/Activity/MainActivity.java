package np.com.rotaractnepalapp.rotaract.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;


import com.github.clans.fab.FloatingActionMenu;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import np.com.rotaractnepalapp.rotaract.Adapter.ImageSliderAdapter;
import np.com.rotaractnepalapp.rotaract.Adapter.IntroductionAdapter.MainIntroAdpater;
import np.com.rotaractnepalapp.rotaract.Class.ClassIntroduction.Intro1Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassIntroduction.Intro2Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassIntroduction.Intro3Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassIntroduction.Intro4Class;
import np.com.rotaractnepalapp.rotaract.Class.ClassIntroduction.Intro5Class;
import np.com.rotaractnepalapp.rotaract.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private com.github.clans.fab.FloatingActionButton fab_news, fab_events, fab_chat;
    private ViewPager imageSlider;
    LinearLayout sliderDotsPlaner;
    private int dotcount;
    private ImageView[] dots;

    private ArrayList<Object> objects = new ArrayList<>();

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


        fab_news = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.fab_news);
        fab_chat = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.fab_chat);
        fab_events = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.fab_events);

        fab_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, News.class);
                startActivity(intent);
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
                Intent intent = new Intent(MainActivity.this, Chat.class);
                startActivity(intent);
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
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
        intro1Classes.add(new Intro1Class(R.mipmap.ic_rotary,"Rotary", ""));
        intro1Classes.add(new Intro1Class(R.mipmap.ic_rotaract,"Rotaract", ""));
        intro1Classes.add(new Intro1Class(R.mipmap.ic_interact,"Interact", ""));
        intro1Classes.add(new Intro1Class(R.drawable.ic_join_us,"How to Join ?", ""));
        return intro1Classes;

    }

    public static ArrayList<Intro2Class> getIntro2Data(){
        ArrayList<Intro2Class> intro2Classes = new ArrayList<>();
        intro2Classes.add(new Intro2Class(R.drawable.ic_bod,"President", ""));
        intro2Classes.add(new Intro2Class(R.drawable.ic_bod,"Immediate Past", ""));
        intro2Classes.add(new Intro2Class(R.drawable.ic_bod,"Vice President", ""));
        intro2Classes.add(new Intro2Class(R.drawable.ic_bod,"Secretary", ""));
        intro2Classes.add(new Intro2Class(R.drawable.ic_bod,"Treasurer", ""));
        return intro2Classes;

    }

    public static ArrayList<Intro3Class> getIntro3Data(){
        ArrayList<Intro3Class> intro3Classes = new ArrayList<>();
        intro3Classes.add(new Intro3Class(R.drawable.ic_bod,"Club Service", ""));
        intro3Classes.add(new Intro3Class(R.drawable.ic_bod,"International Service", ""));
        intro3Classes.add(new Intro3Class(R.drawable.ic_bod,"Community Service", ""));
        intro3Classes.add(new Intro3Class(R.drawable.ic_bod,"Professional Development", ""));
        intro3Classes.add(new Intro3Class(R.drawable.ic_bod,"Finance", ""));
        return intro3Classes;

    }

    public static ArrayList<Intro4Class> getIntro4Data(){
        ArrayList<Intro4Class> intro4Classes = new ArrayList<>();
        intro4Classes.add(new Intro4Class(R.drawable.ic_bod,"Assistant Directors", ""));
        intro4Classes.add(new Intro4Class(R.drawable.ic_bod,"Sergeant", ""));
        intro4Classes.add(new Intro4Class(R.drawable.ic_bod,"Fundraising Chair", ""));
        intro4Classes.add(new Intro4Class(R.drawable.ic_bod,"Public Relations", ""));
        intro4Classes.add(new Intro4Class(R.drawable.ic_bod,"Information Technology", ""));
        return intro4Classes;

    }

    public static ArrayList<Intro5Class> getIntro5Data(){
        ArrayList<Intro5Class> intro5Classes = new ArrayList<>();
        intro5Classes.add(new Intro5Class(R.drawable.colorlogo_rotaractnepalapp,"District Conference", ""));
        intro5Classes.add(new Intro5Class(R.drawable.colorlogo_rotaractnepalapp,"DLTS", ""));
        intro5Classes.add(new Intro5Class(R.drawable.colorlogo_rotaractnepalapp,"PS-Meet", ""));
        intro5Classes.add(new Intro5Class(R.mipmap.ic_ryla,"RYLA", ""));
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
        if (id == R.id.action_settings) {
            Toast.makeText(MainActivity.this, "LogOut Pressed", Toast.LENGTH_LONG).show();
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
        } else if (id == R.id.nav_news) {
            intent = new Intent(this, News.class);
            startActivity(intent);
        } else if (id == R.id.nav_today_event) {
            intent = new Intent(this, Events.class);
            startActivity(intent);
        } else if (id == R.id.nav_club_review) {
            intent = new Intent(this, Club.class);
            startActivity(intent);
        } else if (id == R.id.nav_dcalender) {
            intent = new Intent(this, DCalendar.class);
            startActivity(intent);
        } else if (id == R.id.nav_chat) {
            intent = new Intent(this, Chat.class);
            startActivity(intent);
        } else if (id == R.id.nav_about_us){

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
