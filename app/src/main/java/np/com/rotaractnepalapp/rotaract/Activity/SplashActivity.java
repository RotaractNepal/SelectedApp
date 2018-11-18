package np.com.rotaractnepalapp.rotaract.Activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.rey.material.widget.TextView;

import np.com.rotaractnepalapp.rotaract.R;

public class SplashActivity extends AppCompatActivity {

    ImageView image, image01, image02;
    Animation anim_01, anim_02, anim_delay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        image = (ImageView) findViewById(R.id.imgLogo);
        image02 = (ImageView) findViewById(R.id.txtLogo);
        image01 = (ImageView) findViewById(R.id.finalDelay);

        anim_01 = AnimationUtils.loadAnimation(SplashActivity.this, R.anim.anim_01);
        anim_02 = AnimationUtils.loadAnimation(SplashActivity.this, R.anim.anim_02);
        anim_delay = AnimationUtils.loadAnimation(SplashActivity.this, R.anim.final_delay);

        anim_01.setStartTime(Animation.START_ON_FIRST_FRAME);
        image.startAnimation(anim_01);

        anim_02.setStartTime(0);
        image02.startAnimation(anim_02);

        anim_delay.setStartTime(0);
        image01.startAnimation(anim_delay);

        anim_delay.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
                Toast.makeText(SplashActivity.this, "Welcome to Rotaract App Nepal", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });


    }
}
