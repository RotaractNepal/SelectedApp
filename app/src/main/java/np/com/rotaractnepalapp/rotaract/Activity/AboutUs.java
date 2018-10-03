package np.com.rotaractnepalapp.rotaract.Activity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import np.com.rotaractnepalapp.rotaract.R;

public class AboutUs extends AppCompatActivity {

    ImageView call, email, close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_about_us);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        call = (ImageView) findViewById(R.id.aboutUscall);
        email = (ImageView) findViewById(R.id.aboutUsemail);
        close = (ImageView) findViewById(R.id.aboutUscancel);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                String contactNo = "9841803337";
                intent.setData(Uri.parse("tel:" + contactNo));
                v.getContext().startActivity(intent);
            }
        });

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenEmail=null, chooserEmail=null;
                intenEmail = new Intent(Intent.ACTION_SEND);
                intenEmail.setData(Uri.parse("mailto:"));
                String[] to = {"070bct515@ioe.edu.np"};
                intenEmail.putExtra(Intent.EXTRA_EMAIL, to);
                intenEmail.putExtra(Intent.EXTRA_SUBJECT, "Sent From Rotaract Nepal App");
                intenEmail.putExtra(Intent.EXTRA_TEXT, "Dear Sir/Madam;");
                intenEmail.setType("message/rfc822");
                chooserEmail = intenEmail.createChooser(intenEmail,"Send Email");
                v.getContext().startActivity(chooserEmail);
            }
        });

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
