package np.com.rotaractnepalapp.rotaract;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
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
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private com.github.clans.fab.FloatingActionButton fab_news, fab_events, fab_chat;
    private ViewPager imageSlider;
    LinearLayout sliderDotsPlaner;
    private int dotcount;
    private ImageView[] dots;
    private ImageView imgRotary, imgRotaract, imgIntaract, imgJoinUs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        imgRotary = (ImageView) findViewById(R.id.infoRotary);
        imgRotaract = (ImageView) findViewById(R.id.infoRotaract);
        imgIntaract = (ImageView) findViewById(R.id.infoIntaract);
        imgJoinUs = (ImageView) findViewById(R.id.infoJoinUs);

        imgRotary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Rotary Information", Toast.LENGTH_LONG).show();
            }
        });

        imgRotaract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Rotaract Information", Toast.LENGTH_LONG).show();
            }
        });

        imgIntaract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Intaract Information", Toast.LENGTH_LONG).show();
            }
        });

        imgJoinUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "How to Join ?", Toast.LENGTH_LONG).show();
            }
        });

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

        fab_news = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.fab_news);
        fab_chat = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.fab_chat);
        fab_events = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.fab_events);

        fab_news.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Add News", Toast.LENGTH_LONG).show();
            }
        });

        fab_events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Add Events", Toast.LENGTH_LONG).show();
            }
        });

        fab_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Open Chat", Toast.LENGTH_LONG).show();
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

        if (id == R.id.nav_news) {
            Toast.makeText(MainActivity.this, "News", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_today_event) {
            Toast.makeText(MainActivity.this, "Todays Event", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_club_review) {
            Toast.makeText(MainActivity.this, "Club Review", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_gallery) {
            Toast.makeText(MainActivity.this, "Gallery", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_chat) {
            Toast.makeText(MainActivity.this, "Chat", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_about_us){
            Toast.makeText(MainActivity.this, "About Us", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nav_feed_back){
            Toast.makeText(MainActivity.this, "Feedback", Toast.LENGTH_LONG).show();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
