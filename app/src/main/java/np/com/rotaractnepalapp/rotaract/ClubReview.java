package np.com.rotaractnepalapp.rotaract;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ClubReview extends AppCompatActivity {

    private ImageView ITofficer,President;
    private ImageView clubBODProfile, bodClubLogo;
    private TextView clubBODName, clubBODDes;
    private ImageView memCall, memEmail, memClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_review);
        this.setTitle("Club Review");

        President = (ImageView) findViewById(R.id.clubPresident);
        ITofficer = (ImageView) findViewById(R.id.clubITOfficer);

        President.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ClubReview.this);

                LayoutInflater inflater = getLayoutInflater();
                View dialogView = inflater.inflate(R.layout.club_mem_info,null);

                builder.setView(dialogView);

                memCall = (ImageView) dialogView.findViewById(R.id.call);
                memEmail = (ImageView) dialogView.findViewById(R.id.email);
                memClose = (ImageView) dialogView.findViewById(R.id.cancel);

                clubBODProfile = (ImageView) dialogView.findViewById(R.id.clubBODprofile);
                clubBODProfile.setImageResource(R.drawable.rackne_president);

                bodClubLogo = (ImageView) dialogView.findViewById(R.id.bodClubLogo);
                bodClubLogo.setImageResource(R.drawable.ic_rckne);

                clubBODName = (TextView) dialogView.findViewById(R.id.clubBODname);
                clubBODName.setText(getString(R.string.preRACKNEName));

                clubBODDes = (TextView) dialogView.findViewById(R.id.clubBODdes);
                clubBODDes.setText(getString(R.string.preRACKNEDesignation));

                final AlertDialog dialog = builder.create();

                memCall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String contactNo = getString(R.string.preRACKNEContact);
                        clubMemCall(v, contactNo);

                    }
                });

                memEmail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String[] to = {getString(R.string.preRACKNEEmail)};
                        clubMemEmail(v, to);

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

                clubBODProfile = (ImageView) dialogView.findViewById(R.id.clubBODprofile);
                clubBODProfile.setImageResource(R.drawable.rackne_itofficer);

                bodClubLogo = (ImageView) dialogView.findViewById(R.id.bodClubLogo);
                bodClubLogo.setImageResource(R.drawable.ic_rckne);

                clubBODName = (TextView) dialogView.findViewById(R.id.clubBODname);
                clubBODName.setText(getString(R.string.itofficerRACKNEName));

                clubBODDes = (TextView) dialogView.findViewById(R.id.clubBODdes);
                clubBODDes.setText(getString(R.string.itofficerRACKNEDesignation));

                final AlertDialog dialog = builder.create();

                memCall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String contactNo = getString(R.string.itofficerRACKNEContact);
                        clubMemCall(v, contactNo);

                    }
                });

                memEmail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String[] to = {getString(R.string.itofficerRACKNEEmail)};
                        clubMemEmail(v, to);

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

    public void clubMemCall(View v, String contactNo){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + contactNo));
        startActivity(intent);
    }

    public void clubMemEmail(View v, String[] to){
        Intent intenEmail=null, chooserEmail=null;
        intenEmail = new Intent(Intent.ACTION_SEND);
        intenEmail.setData(Uri.parse("mailto:"));
        intenEmail.putExtra(Intent.EXTRA_EMAIL, to);
        intenEmail.putExtra(Intent.EXTRA_SUBJECT, "Sent From Rotaract Nepal App");
        intenEmail.putExtra(Intent.EXTRA_TEXT, "Hellow Sir");
        intenEmail.setType("message/rfc822");
        chooserEmail = intenEmail.createChooser(intenEmail,"Send Email");
        startActivity(chooserEmail);
    }

}
