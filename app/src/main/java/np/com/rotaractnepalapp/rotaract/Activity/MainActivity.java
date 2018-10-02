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
        intro1Classes.add(new Intro1Class(R.mipmap.ic_rotary,R.drawable.rotary,"Rotary", "Rotary is an organization of business and professional person united worldwide, who provide humanitarian service, encourage high ethical standards in all vocations and help build goodwill and peace in the world which is open to all persons regardless of race, color, creed, religion, gender or political preference." +
                "Rotary’s principle motto is, “Service Above Self”." +
                "Rotary members believe that we have a shared responsibility to take action on our world’s most persistent issues." +
                "The object of Rotary is to encourage and foster the ideal of service as a basis of worthy enterprise and, in particular, to encourage and foster:" +
                "\n•The development of acquaintance as an opportunity for service" +
                "\n•High ethical standards in business and professions, the recognition of the worthiness of all useful occupations, and the dignifying of each Rotarian's occupation as an opportunity to serve society;" +
                "\n•The application of the ideal of service in each Rotarian's personal, business, and community life;" +
                "\n•The advancement of international understanding, goodwill, and peace through a world fellowship of business and professional persons united in the ideal of service." +
                "\nOur 35,000+ clubs work together to: " +
                "\nPromote peace, Fight disease, Provide clean water, sanitation, and hygiene, Save mothers and children, Support education, Grow local economies"));
        intro1Classes.add(new Intro1Class(R.mipmap.ic_rotaract, R.drawable.rotaract,"Rotaract", "Rotaract clubs bring together people ages 18-30 to exchange ideas with leaders in the community, develop leadership and professional skills, and have fun through service." +
                "Rotaract clubs decide how to organize and run their club, manage their own funds, and plan and carry out activities and service projects aligned with causes that are important to your community. Rotary club sponsors offer guidance and support and work with your club as partners in service." +
                "Rotaract was founded in 1968 by Charlotte North Rotary Club,[citation needed] located in Charlotte, North Carolina." +
                "Rotaract connects you with leaders in your community and around the world to:" +
                "\n•Take action locally and internationally to create sustainable change" +
                "\n•Expand your professional network and exchange ideas with proven leaders" +
                "\n•Develop your professional skills through leadership training" +
                "\n•Save money on travel, hotels, and supplies with Rotary’s member benefits program, Rotary Global Rewards" +
                "\n•Have fun and make new friends from around the world" +
                "\n•Connect with the global community of Rotaract at the annual Rotary International Convention and Rotaract Preconvention" +
                "\nIn communities worldwide, Rotary and Rotaract members work side by side to take action through service. From big cities to rural villages, Rotaract is changing communities like yours."));
        intro1Classes.add(new Intro1Class(R.mipmap.ic_interact, R.drawable.intaract,"Interact", "Interact is Rotary International’s service club for young people ages 12 to 18. Interact clubs are sponsored by individual Rotary clubs, which provide support and guidance, but they are self-governing and self-supporting." +
                "Club membership varies greatly. Clubs can be single gender or mixed, large or small. They can draw from the student body of a single school or from two or more schools in the same community." +
                "Each year, Interact clubs complete at least two community service projects, one of which furthers international understanding and goodwill. Through these efforts, Interactors develop a network of friendships with local and overseas clubs and learn the importance of:" +
                "\n•Developing leadership skills and personal integrity" +
                "\n•Demonstrating helpfulness and respect for others" +
                "\n•Understanding the value of individual responsibility and hard work" +
                "\n•Advancing international understanding and goodwill" +
                "As one of the most significant and fastest-growing programs of Rotary service, with more than 33,000 clubs in more than 200 countries and geographical areas,[citation needed] Interact has become a worldwide phenomenon. Almost 340,000 young people are involved in Interact."));
        intro1Classes.add(new Intro1Class(R.drawable.ic_join_us, R.drawable.end_polio,"How to Join ?", "Please note that membership in a Rotary club is by invitation. Often, a person being considered for membership is invited by a club member, or sponsor, to attend one or more club meetings to learn more about Rotary. In this case, the sponsor submits the candidate's name to the club's membership committee." +
                "You may check with your university or contact a local Rotary club to find out if there’s a Rotaract club in your area. Contact the Rotaract club to find out how you can join its next meeting, service project, or social event." +
                "As a club member, you will be asked to:" +
                "\n•Pay club dues" +
                "\n•Attend meetings and events" +
                "\n•Use your professional skills and talents to make a difference"));
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
