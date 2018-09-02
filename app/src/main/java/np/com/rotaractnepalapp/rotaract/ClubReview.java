package np.com.rotaractnepalapp.rotaract;

import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class ClubReview extends AppCompatActivity {

    private ImageView bodITofficer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_review);
        this.setTitle("Club Review");

        bodITofficer = (ImageView) findViewById(R.id.clubITOfficer);
        bodITofficer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ClubReview.this);

                LayoutInflater inflater = getLayoutInflater();
                View dialogView = inflater.inflate(R.layout.club_bod_info,null);

                builder.setView(dialogView);

                AlertDialog dialog = builder.create();

                dialog.show();
            }
        });

    }

}
