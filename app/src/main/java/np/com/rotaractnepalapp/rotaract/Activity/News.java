package np.com.rotaractnepalapp.rotaract.Activity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import com.rengwuxian.materialedittext.MaterialEditText;

import java.util.Calendar;

import np.com.rotaractnepalapp.rotaract.R;

public class News extends AppCompatActivity {

    private FloatingActionButton addNews;
    Dialog CreateNews;
    MaterialEditText title, description, location, startDate, endDate, programTime;
    TextView close;
    DatePickerDialog datePickerDialog;
    TimePickerDialog timePickerDialog;

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
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
