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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;
import java.util.HashMap;

import np.com.rotaractnepalapp.rotaract.Models.FirebaseDAO;
import np.com.rotaractnepalapp.rotaract.R;
import np.com.rotaractnepalapp.rotaract.Services.DeviceTokenService;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener{

    private TextInputEditText username,email,password1,password2;
    private TextView labelNotice;
    private Button btnSignUp;
    private ProgressBar progressBar;
    private View mainView;
    private FirebaseDAO firebaseDAO;
    private TextInputEditText txtFname;
    private TextInputEditText txtLname;
    private TextInputEditText txtstate;
    private TextInputEditText txtHomeAddress;
    private TextInputEditText txtPhone;
    private View regFrom;
    private String countyName;
    private String homeAddress;
    private String phone;
    private HashMap<String ,String> dataPart1;
    private Spinner countryList;
    private  Spinner dayList;
    private  Spinner monthList;
    private  Spinner yearList;

    private ArrayList<Integer> years;
    private ArrayList<Integer> days;

    private ArrayAdapter<Integer> adapter1;
    private ArrayAdapter<Integer> adapter2;


    public boolean validateFields() {

        try {
            if(TextUtils.isEmpty(txtFname.getText())) {
                txtFname.setError("First name is missing");
                return false;
            }
            else if(TextUtils.isEmpty(txtLname.getText()))
            {
                txtLname.setError("Last name is missing");
                return false;
            }
            else if(TextUtils.isEmpty(txtstate.getText()))
            {
                txtstate.setError("State name is missing");
                return false;
            }
            else if(TextUtils.isEmpty(txtHomeAddress.getText()))
            {
                txtHomeAddress.setError("Street address is missing");
                return false;
            }
            else if(TextUtils.isEmpty(txtPhone.getText()))
            {
                txtPhone.setError("Phone number is missing");
                return false;
            }
            else if (TextUtils.isEmpty(email.getText())) {
                email.setError("email is required");
                return false;
            } else if (!email.getText().toString().contains("@")) {
                email.setError("Invalid email");
                return false;
            } else if (TextUtils.isEmpty(password1.getText())) {
                password1.setError("Password is required");
                return false;
            } else if (TextUtils.isEmpty(password2.getText())) {
                password2.setError("Password is not confirmed");
                return false;
            } else if (!password1.getText().toString().equals(password2.getText().toString())) {
                labelNotice.setText("Password not matched!");
                return false;
            } else if (password1.getText().toString().equals(password2.getText().toString()) && !TextUtils.isEmpty(password1.getText())) {
                labelNotice.setText("");
                return true;
            }
            else
                return true;
        }
            catch (Exception e){
            return false;
        }
    }


    public void initializeViews() {

        try {
            email = findViewById(R.id.signUpEmail);
            username=findViewById(R.id.username);
            password1=findViewById(R.id.signUpPassword1);
            password2=findViewById(R.id.signUpPassword2);
            labelNotice=findViewById(R.id.textNotice);

            btnSignUp = findViewById(R.id.btnSignUp);
            btnSignUp.setOnClickListener(this);

            progressBar = findViewById(R.id.progressBarSignUpActivity);
            mainView = findViewById(R.id.SignUpView);

            txtFname=findViewById(R.id.firstName);
            txtLname=findViewById(R.id.lastName);
            dataPart1=new HashMap<>();
            countryList=findViewById(R.id.countryList);
            yearList=findViewById(R.id.spin_year);
            monthList=findViewById(R.id.spin_month);
            dayList=findViewById(R.id.spin_day);
            txtstate=findViewById(R.id.address);
            txtHomeAddress=findViewById(R.id.homeAddress);
            txtPhone=findViewById(R.id.phone);

            years=new ArrayList<>();
            //birth year generation
            for(int i=1975;i<=2010;i++)
            {
                years.add(i);
            }

            days=new ArrayList<>();
            //days generation using loop
            for(int i=1;i<=31;i++)
            {
                days.add(i);
            }

            adapter1=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,years);
            adapter2=new ArrayAdapter<>(this,R.layout.support_simple_spinner_dropdown_item,days);

            //adding year values to yearList spinner
            yearList.setAdapter(adapter1);

            //adding year values to dayList spinner
            dayList.setAdapter(adapter2);
        }
        catch (Exception e){
            Log.e("ERROR",e.getMessage());
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        getSupportActionBar().setTitle("Member Registration");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        initializeViews();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.btnSignUp:

                if(validateFields()){
                    mainView.setVisibility(View.GONE);
                    progressBar.setVisibility(View.VISIBLE);
                    new AsyncTask<String, Void, Boolean>() {
                        @Override
                        protected Boolean doInBackground(String... strings) {

                            firebaseDAO = FirebaseDAO.getFirebaseDAOObject();
                            firebaseDAO.getAuthenticationObject().createUserWithEmailAndPassword(
                                            email.getText().toString().trim(),
                                            password2.getText().toString().trim())
                                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {

                                        @Override
                                        public void onComplete(@NonNull Task<AuthResult> task) {
                                            if (task.isSuccessful()) {

                                                String token=(new DeviceTokenService()).getRefreshedToken();
                                                firebaseDAO.saveDeviceTokens(getApplicationContext(),
                                                        firebaseDAO.getAuthenticationObject().getCurrentUser().getUid(),
                                                        token
                                                );
                                                FirebaseDAO.UID=firebaseDAO.getAuthenticationObject().getCurrentUser().getUid();
                                                //establising reference to database
                                                DatabaseReference dbrf=firebaseDAO.getDbReference()
                                                        .child("users")
                                                        .child(firebaseDAO.getAuthenticationObject().getCurrentUser().getUid());

                                                //inserting user data



                                                dbrf.child("fName").setValue(txtFname.getText().toString().trim());
                                                dbrf.child("lName").setValue(txtLname.getText().toString().trim());
                                                dbrf.child("DOB").setValue(
                                                        yearList.getSelectedItem().toString()+"-" +
                                                        monthList.getSelectedItem().toString()+"-" +
                                                        dayList.getSelectedItem().toString()
                                                        );

                                                dbrf.child("country").setValue(countryList.getSelectedItem().toString());
                                                dbrf.child("state").setValue(txtstate.getText().toString().trim());
                                                dbrf.child("homeAddress").setValue(txtHomeAddress.getText().toString().trim());
                                                dbrf.child("phone").setValue(txtPhone.getText().toString().trim());
                                                dbrf.child("email").setValue(email.getText().toString().trim());
                                                dbrf.child("username").setValue(username.getText().toString().trim());
                                                dbrf.child("password").setValue(password2.getText().toString().trim());
                                                dbrf.child("pp_path").setValue("");
                                                dbrf.child("status").setValue("Hello All! I am using Mychat App!");
                                                dbrf.child("username").setValue(username.getText().toString().trim());
                                                dbrf.child("email").setValue(email.getText().toString().trim());
                                                dbrf.child("password").setValue(password2.getText().toString().trim());


                                                firebaseDAO.getDbReference()
                                                        .child("users")
                                                        .child(FirebaseDAO.UID)
                                                        .child("online")
                                                        .addValueEventListener(FirebaseDAO.valueEventListener);
                                                Intent i = new Intent(SignUpActivity.this, Chat.class);
                                                i.putExtra("UID",firebaseDAO.getAuthenticationObject().getCurrentUser().getUid());
                                                i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                                startActivity(i);
                                                finish();
                                            }
                                            else {
                                                progressBar.setVisibility(View.GONE);
                                                mainView.setVisibility(View.VISIBLE);
                                                firebaseDAO = null;
                                                Toast.makeText(SignUpActivity.this,
                                                        task.getException().toString(),
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
                    }.execute("start");


                    }
                break;


            default:
                break;
        }

    }
}
