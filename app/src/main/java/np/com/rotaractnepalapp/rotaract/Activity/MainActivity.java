package np.com.rotaractnepalapp.rotaract.Activity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
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
import android.widget.TextView;
import android.widget.Toast;

import com.codesgood.views.JustifiedTextView;
import com.rey.material.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

import np.com.rotaractnepalapp.rotaract.Adapter.ImageSliderAdapter;
import np.com.rotaractnepalapp.rotaract.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private com.github.clans.fab.FloatingActionButton fab_news, fab_events, fab_chat;
    private ViewPager imageSlider;
    LinearLayout sliderDotsPlaner;
    private int dotcount;
    private ImageView[] dots;
    private ImageView imgRotary, imgRotaract, imgIntaract, imgJoinUs, imgLogo;
    private ImageView imgPresident, imgIPP, imgVicePre, imgSec, imgTreas;
    private ImageView imgClubSer, imgIntSer, imgCommSer, imgProDev;
    private ImageView imgAssDir, imgSergeant, imgFundChair, imgPubRelOfficer, imgITOfficer;
    private ImageView imgAboutUs01, imgCusHeadLogo;
    Dialog Introduction;
    private TextView textClose, textTitle, textDistrictNo, textWebsite, textDesignation;
    private TextView textAlertClose, textCusHeadTitle;
    JustifiedTextView textIntroductionOne, textIndroductionDesOne;
    private Button submitBtn;
    private ImageView call, email, cancel;

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.Adapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Introduction = new Dialog(this);

        imgRotary = (ImageView) findViewById(R.id.infoRotary);
        imgRotaract = (ImageView) findViewById(R.id.infoRotaract);
        imgIntaract = (ImageView) findViewById(R.id.infoIntaract);
        imgJoinUs = (ImageView) findViewById(R.id.infoJoinUs);

        imgPresident = (ImageView) findViewById(R.id.infoPre);
        imgIPP = (ImageView) findViewById(R.id.infoIPP);
        imgVicePre = (ImageView) findViewById(R.id.infoVicePre);
        imgSec = (ImageView) findViewById(R.id.infoSec);
        imgTreas = (ImageView) findViewById(R.id.infoTre);

        imgClubSer = (ImageView) findViewById(R.id.infoClubSer);
        imgIntSer = (ImageView) findViewById(R.id.infoIntSer);
        imgCommSer = (ImageView) findViewById(R.id.infoComSer);
        imgProDev = (ImageView) findViewById(R.id.infoProDev);

        imgAssDir = (ImageView) findViewById(R.id.infoAssDirOff);
        imgSergeant = (ImageView) findViewById(R.id.infoSerg);
        imgFundChair = (ImageView) findViewById(R.id.infoFunCha);
        imgPubRelOfficer = (ImageView) findViewById(R.id.infoPubRelOff);
        imgITOfficer = (ImageView) findViewById(R.id.infoITOff);

        imgAssDir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                assDirOffIntroPopup(view);
            }
        });

        imgSergeant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sergIntroPopup(view);
            }
        });

        imgFundChair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                funRaiseChairIntroPopup(view);
            }
        });

        imgPubRelOfficer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pubRelOfficerIntroPopup(view);
            }
        });

        imgITOfficer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itOfficerIntroPopup(view);
            }
        });

        imgClubSer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clubSerIntroPopup(view);
            }
        });

        imgIntSer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intSerIntroPopup(view);
            }
        });

        imgCommSer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                commSerIntroPopup(view);
            }
        });

        imgProDev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                proDevIntroPopup(view);
            }
        });

        imgPresident.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presidentIntroPopup(view);
            }
        });

        imgIPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ippIntroPopup(view);
            }
        });

        imgVicePre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vicePreIntroPopup(view);
            }
        });

        imgSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secIntroPopup(view);
            }
        });

        imgTreas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                treIntroPopup(view);
            }
        });

        imgRotary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotaryIntroductionPopup(view);
            }
        });

        imgRotaract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotaractIntroductionPopup(view);
            }
        });

        imgIntaract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intaractIntroductionPopup(view);
            }
        });

        imgJoinUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                howDoIJoinPopup(view);
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

    public void rotaryIntroductionPopup(View v){
        Introduction.setContentView(R.layout.info_intro_layout);

        textClose = (TextView) Introduction.findViewById(R.id.txtClose);

        imgLogo = (ImageView) Introduction.findViewById(R.id.imgLogo);
        imgLogo.setImageResource(R.drawable.rotary);

        textTitle = (TextView) Introduction.findViewById(R.id.txtTitle);
        textTitle.setText(getString(R.string.rotarytitle));

        textDistrictNo = (TextView) Introduction.findViewById(R.id.txtDistNo);
        textDistrictNo.setText(getString(R.string.districtno));

        textWebsite = (TextView) Introduction.findViewById(R.id.txtWeblink);
        textWebsite.setText(getString(R.string.websiterotary));

        textIntroductionOne = (JustifiedTextView) Introduction.findViewById(R.id.txtIntroOne);
        textIntroductionOne.setText(getString(R.string.rotaryIntroduction));

        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Introduction.dismiss();
            }
        });
        Introduction.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Introduction.show();
    }

    public void rotaractIntroductionPopup(View v) {
        Introduction.setContentView(R.layout.info_intro_layout);

        textClose = (TextView) Introduction.findViewById(R.id.txtClose);

        imgLogo = (ImageView) Introduction.findViewById(R.id.imgLogo);
        imgLogo.setImageResource(R.drawable.rotaract);

        textTitle = (TextView) Introduction.findViewById(R.id.txtTitle);
        textTitle.setText(getString(R.string.rotaracttitle));

        textDistrictNo = (TextView) Introduction.findViewById(R.id.txtDistNo);
        textDistrictNo.setText(getString(R.string.districtno));

        textWebsite = (TextView) Introduction.findViewById(R.id.txtWeblink);
        textWebsite.setText(getString(R.string.websiterotary));

        textIntroductionOne = (JustifiedTextView) Introduction.findViewById(R.id.txtIntroOne);
        textIntroductionOne.setText(getString(R.string.rotaractIntroduction));

        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Introduction.dismiss();
            }
        });
        Introduction.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Introduction.show();
    }

    public void intaractIntroductionPopup(View v){
        Introduction.setContentView(R.layout.info_intro_layout);

        textClose = (TextView) Introduction.findViewById(R.id.txtClose);

        imgLogo = (ImageView) Introduction.findViewById(R.id.imgLogo);
        imgLogo.setImageResource(R.drawable.intaract);

        textTitle = (TextView) Introduction.findViewById(R.id.txtTitle);
        textTitle.setText(getString(R.string.intaracttitle));

        textDistrictNo = (TextView) Introduction.findViewById(R.id.txtDistNo);
        textDistrictNo.setText(getString(R.string.districtno));

        textWebsite = (TextView) Introduction.findViewById(R.id.txtWeblink);
        textWebsite.setText(getString(R.string.websiterotary));

        textIntroductionOne = (JustifiedTextView) Introduction.findViewById(R.id.txtIntroOne);
        textIntroductionOne.setText(getString(R.string.intaractIntroduction));

        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Introduction.dismiss();
            }
        });
        Introduction.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Introduction.show();
    }

    public void howDoIJoinPopup(View v){
        Introduction.setContentView(R.layout.info_intro_layout);

        textClose = (TextView) Introduction.findViewById(R.id.txtClose);

        imgLogo = (ImageView) Introduction.findViewById(R.id.imgLogo);
        imgLogo.setImageResource(R.drawable.end_polio);

        textTitle = (TextView) Introduction.findViewById(R.id.txtTitle);
        textTitle.setText(getString(R.string.joinus));

        textDistrictNo = (TextView) Introduction.findViewById(R.id.txtDistNo);
        textDistrictNo.setText(getString(R.string.districtno));

        textWebsite = (TextView) Introduction.findViewById(R.id.txtWeblink);
        textWebsite.setText(getString(R.string.websiterotary));

        textIntroductionOne = (JustifiedTextView) Introduction.findViewById(R.id.txtIntroOne);
        textIntroductionOne.setText(getString(R.string.howdoijoin));

        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Introduction.dismiss();
            }
        });
        Introduction.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Introduction.show();

    }

    public void presidentIntroPopup(View v){
        Introduction.setContentView(R.layout.designation_intro_layout);

        textClose = (TextView) Introduction.findViewById(R.id.txtClose01);

        imgLogo = (ImageView) Introduction.findViewById(R.id.imgPersonLogo);
        imgLogo.setImageResource(R.drawable.rotaractnepalapp);

        textDesignation = (TextView) Introduction.findViewById(R.id.txtDesignation);
        textDesignation.setText(getString(R.string.president));

        textIndroductionDesOne = (JustifiedTextView) Introduction.findViewById(R.id.txtIntroDesOne);
        textIndroductionDesOne.setText(getString(R.string.presidentIntroduction));

        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Introduction.dismiss();
            }
        });
        Introduction.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Introduction.show();

    }

    public void ippIntroPopup(View v){
        Introduction.setContentView(R.layout.designation_intro_layout);

        textClose = (TextView) Introduction.findViewById(R.id.txtClose01);

        imgLogo = (ImageView) Introduction.findViewById(R.id.imgPersonLogo);
        imgLogo.setImageResource(R.drawable.rotaractnepalapp);

        textDesignation = (TextView) Introduction.findViewById(R.id.txtDesignation);
        textDesignation.setText(getString(R.string.ipp));

        textIndroductionDesOne = (JustifiedTextView) Introduction.findViewById(R.id.txtIntroDesOne);
        textIndroductionDesOne.setText(getString(R.string.ippIntroduction));

        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Introduction.dismiss();
            }
        });
        Introduction.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Introduction.show();
    }

    public void vicePreIntroPopup(View v){
        Introduction.setContentView(R.layout.designation_intro_layout);

        textClose = (TextView) Introduction.findViewById(R.id.txtClose01);

        imgLogo = (ImageView) Introduction.findViewById(R.id.imgPersonLogo);
        imgLogo.setImageResource(R.drawable.rotaractnepalapp);

        textDesignation = (TextView) Introduction.findViewById(R.id.txtDesignation);
        textDesignation.setText(getString(R.string.vicepre));

        textIndroductionDesOne = (JustifiedTextView) Introduction.findViewById(R.id.txtIntroDesOne);
        textIndroductionDesOne.setText(getString(R.string.vicepreIntroduction));

        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Introduction.dismiss();
            }
        });
        Introduction.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Introduction.show();
    }

    public void secIntroPopup(View v){
        Introduction.setContentView(R.layout.designation_intro_layout);

        textClose = (TextView) Introduction.findViewById(R.id.txtClose01);

        imgLogo = (ImageView) Introduction.findViewById(R.id.imgPersonLogo);
        imgLogo.setImageResource(R.drawable.rotaractnepalapp);

        textDesignation = (TextView) Introduction.findViewById(R.id.txtDesignation);
        textDesignation.setText(getString(R.string.secretary));

        textIndroductionDesOne = (JustifiedTextView) Introduction.findViewById(R.id.txtIntroDesOne);
        textIndroductionDesOne.setText(getString(R.string.secIntroduction));

        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Introduction.dismiss();
            }
        });
        Introduction.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Introduction.show();
    }

    public void treIntroPopup(View v){
        Introduction.setContentView(R.layout.designation_intro_layout);

        textClose = (TextView) Introduction.findViewById(R.id.txtClose01);

        imgLogo = (ImageView) Introduction.findViewById(R.id.imgPersonLogo);
        imgLogo.setImageResource(R.drawable.rotaractnepalapp);

        textDesignation = (TextView) Introduction.findViewById(R.id.txtDesignation);
        textDesignation.setText(getString(R.string.treasurer));

        textIndroductionDesOne = (JustifiedTextView) Introduction.findViewById(R.id.txtIntroDesOne);
        textIndroductionDesOne.setText(getString(R.string.treasIntroduction));

        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Introduction.dismiss();
            }
        });
        Introduction.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Introduction.show();
    }

    public void clubSerIntroPopup(View v){
        Introduction.setContentView(R.layout.designation_intro_layout);

        textClose = (TextView) Introduction.findViewById(R.id.txtClose01);

        imgLogo = (ImageView) Introduction.findViewById(R.id.imgPersonLogo);
        imgLogo.setImageResource(R.drawable.rotaractnepalapp);

        textDesignation = (TextView) Introduction.findViewById(R.id.txtDesignation);
        textDesignation.setText(getString(R.string.clubservice));

        textIndroductionDesOne = (JustifiedTextView) Introduction.findViewById(R.id.txtIntroDesOne);
        textIndroductionDesOne.setText(getString(R.string.clubSerIntro));

        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Introduction.dismiss();
            }
        });
        Introduction.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Introduction.show();
    }

    public void intSerIntroPopup(View v){
        Introduction.setContentView(R.layout.designation_intro_layout);

        textClose = (TextView) Introduction.findViewById(R.id.txtClose01);

        imgLogo = (ImageView) Introduction.findViewById(R.id.imgPersonLogo);
        imgLogo.setImageResource(R.drawable.rotaractnepalapp);

        textDesignation = (TextView) Introduction.findViewById(R.id.txtDesignation);
        textDesignation.setText(getString(R.string.internationalservice));

        textIndroductionDesOne = (JustifiedTextView) Introduction.findViewById(R.id.txtIntroDesOne);
        textIndroductionDesOne.setText(getString(R.string.interSerIntro));

        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Introduction.dismiss();
            }
        });
        Introduction.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Introduction.show();
    }

    public void commSerIntroPopup(View v){
        Introduction.setContentView(R.layout.designation_intro_layout);

        textClose = (TextView) Introduction.findViewById(R.id.txtClose01);

        imgLogo = (ImageView) Introduction.findViewById(R.id.imgPersonLogo);
        imgLogo.setImageResource(R.drawable.rotaractnepalapp);

        textDesignation = (TextView) Introduction.findViewById(R.id.txtDesignation);
        textDesignation.setText(getString(R.string.communityservice));

        textIndroductionDesOne = (JustifiedTextView) Introduction.findViewById(R.id.txtIntroDesOne);
        textIndroductionDesOne.setText(getString(R.string.commSerIntro));

        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Introduction.dismiss();
            }
        });
        Introduction.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Introduction.show();
    }

    public void proDevIntroPopup(View v){
        Introduction.setContentView(R.layout.designation_intro_layout);

        textClose = (TextView) Introduction.findViewById(R.id.txtClose01);

        imgLogo = (ImageView) Introduction.findViewById(R.id.imgPersonLogo);
        imgLogo.setImageResource(R.drawable.rotaractnepalapp);

        textDesignation = (TextView) Introduction.findViewById(R.id.txtDesignation);
        textDesignation.setText(getString(R.string.professionaldevelopment));

        textIndroductionDesOne = (JustifiedTextView) Introduction.findViewById(R.id.txtIntroDesOne);
        textIndroductionDesOne.setText(getString(R.string.proDevIntro));

        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Introduction.dismiss();
            }
        });
        Introduction.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Introduction.show();
    }

    public void assDirOffIntroPopup(View v){
        Introduction.setContentView(R.layout.designation_intro_layout);

        textClose = (TextView) Introduction.findViewById(R.id.txtClose01);

        imgLogo = (ImageView) Introduction.findViewById(R.id.imgPersonLogo);
        imgLogo.setImageResource(R.drawable.rotaractnepalapp);

        textDesignation = (TextView) Introduction.findViewById(R.id.txtDesignation);
        textDesignation.setText(getString(R.string.assdirofficers));

        textIndroductionDesOne = (JustifiedTextView) Introduction.findViewById(R.id.txtIntroDesOne);
        textIndroductionDesOne.setText(getString(R.string.assDirectorIntro));

        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Introduction.dismiss();
            }
        });
        Introduction.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Introduction.show();
    }

    public void sergIntroPopup(View v){
        Introduction.setContentView(R.layout.designation_intro_layout);

        textClose = (TextView) Introduction.findViewById(R.id.txtClose01);

        imgLogo = (ImageView) Introduction.findViewById(R.id.imgPersonLogo);
        imgLogo.setImageResource(R.drawable.rotaractnepalapp);

        textDesignation = (TextView) Introduction.findViewById(R.id.txtDesignation);
        textDesignation.setText(getString(R.string.sergeantatarms));

        textIndroductionDesOne = (JustifiedTextView) Introduction.findViewById(R.id.txtIntroDesOne);
        textIndroductionDesOne.setText(getString(R.string.sergeantIntro));

        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Introduction.dismiss();
            }
        });
        Introduction.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Introduction.show();
    }

    public void funRaiseChairIntroPopup(View v){
        Introduction.setContentView(R.layout.designation_intro_layout);

        textClose = (TextView) Introduction.findViewById(R.id.txtClose01);

        imgLogo = (ImageView) Introduction.findViewById(R.id.imgPersonLogo);
        imgLogo.setImageResource(R.drawable.rotaractnepalapp);

        textDesignation = (TextView) Introduction.findViewById(R.id.txtDesignation);
        textDesignation.setText(getString(R.string.fundchair));

        textIndroductionDesOne = (JustifiedTextView) Introduction.findViewById(R.id.txtIntroDesOne);
        textIndroductionDesOne.setText(getString(R.string.fundChairIntro));

        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Introduction.dismiss();
            }
        });
        Introduction.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Introduction.show();
    }

    public void pubRelOfficerIntroPopup(View v){
        Introduction.setContentView(R.layout.designation_intro_layout);

        textClose = (TextView) Introduction.findViewById(R.id.txtClose01);

        imgLogo = (ImageView) Introduction.findViewById(R.id.imgPersonLogo);
        imgLogo.setImageResource(R.drawable.rotaractnepalapp);

        textDesignation = (TextView) Introduction.findViewById(R.id.txtDesignation);
        textDesignation.setText(getString(R.string.publicrelationofficer));

        textIndroductionDesOne = (JustifiedTextView) Introduction.findViewById(R.id.txtIntroDesOne);
        textIndroductionDesOne.setText(getString(R.string.pubRelOffIntro));

        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Introduction.dismiss();
            }
        });
        Introduction.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Introduction.show();
    }

    public void itOfficerIntroPopup(View v){
        Introduction.setContentView(R.layout.designation_intro_layout);

        textClose = (TextView) Introduction.findViewById(R.id.txtClose01);

        imgLogo = (ImageView) Introduction.findViewById(R.id.imgPersonLogo);
        imgLogo.setImageResource(R.drawable.rotaractnepalapp);

        textDesignation = (TextView) Introduction.findViewById(R.id.txtDesignation);
        textDesignation.setText(getString(R.string.itofficers));

        textIndroductionDesOne = (JustifiedTextView) Introduction.findViewById(R.id.txtIntroDesOne);
        textIndroductionDesOne.setText(getString(R.string.itOfficerIntro));

        textClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Introduction.dismiss();
            }
        });
        Introduction.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        Introduction.show();
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
        } else if (id == R.id.nav_gallery) {
            intent = new Intent(this, Gallery.class);
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
