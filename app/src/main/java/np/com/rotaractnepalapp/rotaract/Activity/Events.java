package np.com.rotaractnepalapp.rotaract.Activity;


import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.rengwuxian.materialedittext.MaterialEditText;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

import np.com.rotaractnepalapp.rotaract.Adapter.EventImageSliderAdapter;
import np.com.rotaractnepalapp.rotaract.Adapter.EventsAdapter;
import np.com.rotaractnepalapp.rotaract.R;

public class Events extends AppCompatActivity {

    private ArrayList<String> CapitalLetter  = new ArrayList<>();
    private ArrayList<String> FullName = new ArrayList<>();

    private FloatingActionButton createEvents;

    MaterialEditText Event, Date, Location, Organizer, Time, GoogleMap, Call, EventDetial, EventHighlights;
    Button SendEmail;

    private ViewPager imageSlider;
    LinearLayout sliderDotsPlaner;
    private int dotcount;
    private ImageView[] dots;

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

        createEvents = (FloatingActionButton) findViewById(R.id.createEvents);
        createEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog creatEvents;
                creatEvents = new Dialog(v.getContext());
                creatEvents.setContentView(R.layout.create_events);

                Event = (MaterialEditText) creatEvents.findViewById(R.id.Event);
                Date = (MaterialEditText) creatEvents.findViewById(R.id.Date);
                Location = (MaterialEditText) creatEvents.findViewById(R.id.Location);
                Organizer = (MaterialEditText) creatEvents.findViewById(R.id.Organizer);
                Time = (MaterialEditText) creatEvents.findViewById(R.id.Time);
                GoogleMap = (MaterialEditText) creatEvents.findViewById(R.id.GoogleMap);
                Call = (MaterialEditText) creatEvents.findViewById(R.id.Call);
                EventDetial = (MaterialEditText) creatEvents.findViewById(R.id.EventDetial);
                EventHighlights = (MaterialEditText) creatEvents.findViewById(R.id.EventHighlights);

                Event.addTextChangedListener(CreatEventProject);
                Date.addTextChangedListener(CreatEventProject);
                Location.addTextChangedListener(CreatEventProject);
                Organizer.addTextChangedListener(CreatEventProject);
                Time.addTextChangedListener(CreatEventProject);
                GoogleMap.addTextChangedListener(CreatEventProject);
                Call.addTextChangedListener(CreatEventProject);
                EventDetial.addTextChangedListener(CreatEventProject);
                EventHighlights.addTextChangedListener(CreatEventProject);

                GoogleMap.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 5.1, 2.1);
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                        startActivity(intent);
                    }
                });

                SendEmail = (Button) creatEvents.findViewById(R.id.SendEmail);
                SendEmail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent intenEmail=null, chooserEmail=null;
                        intenEmail = new Intent(Intent.ACTION_SEND);
                        intenEmail.setData(Uri.parse("mailto:"));
                        String[] to = {"bskeshab515@gmail.com"};
                        intenEmail.putExtra(Intent.EXTRA_EMAIL, to);
                        intenEmail.putExtra(Intent.EXTRA_SUBJECT, "Event Detail");
                        intenEmail.putExtra(Intent.EXTRA_TEXT, "Event : " + Event.getText().toString()
                                + "\n\nDate : " + Date.getText().toString()
                                + "\n\nLocation : " + Location.getText().toString()
                                + "\n\nOrganizer : " + Organizer.getText().toString()
                                + "\n\nTime : " + Time.getText().toString()
                                + "\n\nGoogleMap : " + GoogleMap.getText().toString()
                                + "\n\nCall : " + Call.getText().toString()
                                + "\n\nEventDetial : " + EventDetial.getText().toString()
                                + "\n\nEventHighlights : " + EventHighlights.getText().toString());
                        intenEmail.setType("message/rfc822");
                        chooserEmail = intenEmail.createChooser(intenEmail,"Send Email");
                        v.getContext().startActivity(chooserEmail);

                    }
                });


                TextView close = (TextView) creatEvents.findViewById(R.id.closeDialog);
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        creatEvents.dismiss();
                    }
                });

                creatEvents.setCanceledOnTouchOutside(false);
                creatEvents.setCancelable(false);
                creatEvents.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                creatEvents.show();
            }
        });

        events();

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

    private void events(){
        CapitalLetter.add("C");
        FullName.add("Club Events");

        CapitalLetter.add("D");
        FullName.add("District Events");

        CapitalLetter.add("Z");
        FullName.add("Zonal Events");

        initRecyclerView();
    }

    private void initRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.eventRecyclerView);
        recyclerView.setLayoutManager(linearLayoutManager);
        EventsAdapter eventsAdapter = new EventsAdapter(this, CapitalLetter, FullName);
        recyclerView.setAdapter(eventsAdapter);
    }

    private TextWatcher CreatEventProject = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String projectEvent  = Event.getText().toString();
            String projectDate  = Date.getText().toString();
            String projectLocation  = Location.getText().toString();
            String projectOrganizer  = Organizer.getText().toString();
            String projectTime  = Time.getText().toString();
            String projectGoogleMap  = GoogleMap.getText().toString();
            String projectCall  = Call.getText().toString();
            String projectEventDetial  = EventDetial.getText().toString();
            String projectEventHighlights  = EventHighlights.getText().toString();

            SendEmail.setEnabled(!projectEvent.isEmpty() && !projectDate.isEmpty() && !projectLocation.isEmpty() && !projectOrganizer.isEmpty()
                    && !projectTime.isEmpty() && !projectGoogleMap.isEmpty() && !projectCall.isEmpty() && !projectEventDetial.isEmpty() && !projectEventHighlights.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }


}
