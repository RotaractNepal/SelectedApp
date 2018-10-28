package np.com.rotaractnepalapp.rotaract.Activity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;

import np.com.rotaractnepalapp.rotaract.Models.FirebaseDAO;
import np.com.rotaractnepalapp.rotaract.R;
import np.com.rotaractnepalapp.rotaract.Services.DeviceTokenService;

public class loginActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnLogin;
    private TextView txtSignUp;
    private TextInputEditText email;
    private TextInputEditText pword;
    private View pbar;
    private FirebaseDAO firebaseDAO;
    private View mainView;


    public void initializeViews() {

        try {
            email = findViewById(R.id.email);
            pword = findViewById(R.id.password);

            btnLogin = findViewById(R.id.btnLogin);
            btnLogin.setOnClickListener(this);

            txtSignUp = findViewById(R.id.txtSignup);
            txtSignUp.setOnClickListener(this);

            pbar = findViewById(R.id.progressBarLoginActivity);
            mainView = findViewById(R.id.loginView);
        }
        catch (Exception e){
            Log.e("ERROR",e.getMessage());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Chat login");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initializeViews();
    }

    public boolean validateFields() {
        try{
            if(TextUtils.isEmpty(email.getText())){
                email.setError("email is required");
                return false;
            }
            else if(!email.getText().toString().contains("@")){
                email.setError("Invalid email");
                return false;
            }
            else if(TextUtils.isEmpty(pword.getText())) {
                pword.setError("password is required");
                return false;
            }
            else{
                return true;
            }}
        catch (Exception e){
            return false;
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btnLogin:
                if(validateFields()) {
                    mainView.setVisibility(View.GONE);
                    pbar.setVisibility(View.VISIBLE);

                    new AsyncTask<String, Void, Boolean>() {
                        @Override
                        protected Boolean doInBackground(String... strings) {

                            firebaseDAO = FirebaseDAO.getFirebaseDAOObject();
                            firebaseDAO.getAuthenticationObject()
                                    .signInWithEmailAndPassword(strings[0],strings[1])
                                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                        @Override
                                        public void onComplete(@NonNull Task<AuthResult> task) {
                                            if (task.isSuccessful()) {
                                                String token=(new DeviceTokenService()).getRefreshedToken();
                                                firebaseDAO.saveDeviceTokens(
                                                        getApplicationContext(),
                                                        firebaseDAO.getAuthenticationObject().getCurrentUser().getUid(),
                                                        token
                                                );

                                                FirebaseDAO.UID=firebaseDAO.getAuthenticationObject().getCurrentUser().getUid();
                                                firebaseDAO.getDbReference()
                                                        .child("users")
                                                        .child(FirebaseDAO.UID)
                                                        .child("online")
                                                        .addValueEventListener(FirebaseDAO.valueEventListener);

                                                Intent i = new Intent(loginActivity.this, Chat.class);
                                                i.putExtra("UID",firebaseDAO.getAuthenticationObject().getCurrentUser().getUid());
                                                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                                startActivity(i);
                                                finish();
                                            }
                                            else {
                                                mainView.setVisibility(View.VISIBLE);
                                                pbar.setVisibility(View.GONE);
                                                Toast.makeText(loginActivity.this,
                                                        "Some error occured, Please, try again later!",
                                                        Toast.LENGTH_SHORT
                                                ).show();
                                            }
                                        }
                                    });
                            return true;
                        }

                        @Override
                        protected void onPostExecute(Boolean aBoolean) {
                        }

                    }.execute(email.getText().toString().trim(), pword.getText().toString());
                }

                break;

            case R.id.txtSignup:
                Intent i=new Intent(this,SignUpActivity.class);
                startActivity(i);
                break;

                default:
                break;
        }
    }
}
