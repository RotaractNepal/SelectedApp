package np.com.rotaractnepalapp.rotaract.Activity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;

import com.rengwuxian.materialedittext.MaterialEditText;

import java.util.ArrayList;
import java.util.Calendar;

import np.com.rotaractnepalapp.rotaract.R;
import np.com.rotaractnepalapp.rotaract.Adapter.SpinnerAdapter;
import np.com.rotaractnepalapp.rotaract.Class.SpinnerItem;

public class News extends AppCompatActivity {

    private FloatingActionButton addNews;
    Dialog CreateNews;
    MaterialEditText title, description, location, startDate, endDate, programTime;
    TextView close;
    DatePickerDialog datePickerDialog;
    TimePickerDialog timePickerDialog;

    private ArrayList<SpinnerItem> mClubList;
    private SpinnerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        this.setTitle("News");
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        addNews = (FloatingActionButton) findViewById(R.id.createNews);
        addNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreatNewNews(v);
            }
        });
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
                datePickerDialog = new DatePickerDialog(News.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        startDate.setText(day + "-" + (month+1) + "-" + year);
                    }
                }, year, month, day);
                datePickerDialog.show();
            }
        });

        endDate = (MaterialEditText) CreateNews.findViewById(R.id.newsEndDateText);
        endDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                final int day = calendar.get(Calendar.DAY_OF_MONTH);
                datePickerDialog = new DatePickerDialog(News.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        endDate.setText(day + "-" + (month+1) + "-" + year);
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
                timePickerDialog = new TimePickerDialog(News.this, new TimePickerDialog.OnTimeSetListener() {
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
