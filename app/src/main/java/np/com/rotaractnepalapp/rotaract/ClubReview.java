package np.com.rotaractnepalapp.rotaract;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

public class ClubReview extends AppCompatActivity {

    private ImageView ITofficer;
    private ImageView memCall, memEmail, memClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_review);
        this.setTitle("Club Review");

        ITofficer = (ImageView) findViewById(R.id.clubITOfficer);


        ITofficer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ClubReview.this);

                LayoutInflater inflater = getLayoutInflater();
                View dialogView = inflater.inflate(R.layout.club_mem_info,null);

                builder.setView(dialogView);

                memCall = (ImageView) dialogView.findViewById(R.id.call);
                memEmail = (ImageView) dialogView.findViewById(R.id.email);
                memClose = (ImageView) dialogView.findViewById(R.id.cancel);

                final AlertDialog dialog = builder.create();

                memCall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // Toast.makeText(MainActivity.this, "Call Pressed", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        String contactNo = getString(R.string.itoffficerContact);
                        intent.setData(Uri.parse("tel:" + contactNo));
                        startActivity(intent);
                    }
                });

                memEmail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intenEmail=null, chooserEmail=null;
                        intenEmail = new Intent(Intent.ACTION_SEND);
                        intenEmail.setData(Uri.parse("mailto:"));
                        String[] to = {getString(R.string.itoffficerEmail)};
                        intenEmail.putExtra(Intent.EXTRA_EMAIL, to);
                        intenEmail.putExtra(Intent.EXTRA_SUBJECT, "Sent From Rotaract Nepal App");
                        intenEmail.putExtra(Intent.EXTRA_TEXT, "Hellow Sir");
                        intenEmail.setType("message/rfc822");
                        chooserEmail = intenEmail.createChooser(intenEmail,"Send Email");
                        startActivity(chooserEmail);
                    }
                });

                memClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });

                dialog.show();
            }
        });

    }

}
