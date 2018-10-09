package np.com.rotaractnepalapp.rotaract.Activity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import np.com.rotaractnepalapp.rotaract.R;

public class DistrictEvents extends AppCompatActivity {

    ImageView openDetail;
    Dialog event;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dcalendar);


        this.setTitle("District 3292 Nepal-Bhutan Events");
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        openDetail = (ImageView) findViewById(R.id.lastYearEventImage);
        openDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                event = new Dialog(DistrictEvents.this);
                event.setContentView(R.layout.event_detail_popup);
                TextView close = (TextView) event.findViewById(R.id.closeDialog);
                close.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        event.dismiss();
                    }
                });

                event.setCanceledOnTouchOutside(false);
                event.setCancelable(false);
                event.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                event.show();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
