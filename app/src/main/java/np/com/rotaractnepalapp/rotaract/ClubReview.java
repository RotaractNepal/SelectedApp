package np.com.rotaractnepalapp.rotaract;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ClubReview extends AppCompatActivity {

    private ImageView ITofficer,President, IPP, VicePre, Secretary, Treasurer, ClubSer, IntSer, CommSer, ProDev, AssDir, Sergeant;
    private ImageView clubBODProfile, bodClubLogo;
    private TextView clubBODName, clubBODDes;
    private ImageView memCall, memEmail, memClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_review);
        this.setTitle("Club Review");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        President = (ImageView) findViewById(R.id.clubPresident);
        IPP = (ImageView) findViewById(R.id.clubIPP);
        ITofficer = (ImageView) findViewById(R.id.clubITOfficer);
        VicePre = (ImageView) findViewById(R.id.clubVicePresident);
        ClubSer = (ImageView) findViewById(R.id.clubClubService);
        Secretary = (ImageView) findViewById(R.id.clubSecretary);
        Treasurer = (ImageView) findViewById(R.id.clubTreasurer);
        IntSer = (ImageView) findViewById(R.id.clubInternationalService);
        CommSer = (ImageView) findViewById(R.id.clubCommunityService);
        ProDev = (ImageView) findViewById(R.id.clubProfessionalDeveloper);
        AssDir = (ImageView) findViewById(R.id.clubAssistantDirector);
        Sergeant = (ImageView) findViewById(R.id.clubSergeant);

        Sergeant.setOnClickListener(new View.OnClickListener() {
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
                clubBODProfile.setImageResource(R.drawable.rackne_sergeant);

                bodClubLogo = (ImageView) dialogView.findViewById(R.id.bodClubLogo);
                bodClubLogo.setImageResource(R.drawable.ic_rckne);

                clubBODName = (TextView) dialogView.findViewById(R.id.clubBODname);
                clubBODName.setText(getString(R.string.sergeantRACKNEName));

                clubBODDes = (TextView) dialogView.findViewById(R.id.clubBODdes);
                clubBODDes.setText(getString(R.string.sergeantRACKNEDesignation));

                final AlertDialog dialog = builder.create();

                memCall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String contactNo = getString(R.string.sergeantRACKNEContact);
                        clubMemCall(v, contactNo);

                    }
                });

                memEmail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String[] to = {getString(R.string.sergeantRACKNEEmail)};
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


        AssDir.setOnClickListener(new View.OnClickListener() {
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
                clubBODProfile.setImageResource(R.drawable.colorlogo_rotaractnepalapp);

                bodClubLogo = (ImageView) dialogView.findViewById(R.id.bodClubLogo);
                bodClubLogo.setImageResource(R.drawable.ic_rckne);

                clubBODName = (TextView) dialogView.findViewById(R.id.clubBODname);
                clubBODName.setText(getString(R.string.assistantDirectorRACKNEName));

                clubBODDes = (TextView) dialogView.findViewById(R.id.clubBODdes);
                clubBODDes.setText(getString(R.string.assistantDirectorRACKNEDesignation));

                final AlertDialog dialog = builder.create();

                memCall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String contactNo = getString(R.string.assistantDirectorRACKNEContact);
                        clubMemCall(v, contactNo);

                    }
                });

                memEmail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String[] to = {getString(R.string.assistantDirectorRACKNEEmail)};
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


        ProDev.setOnClickListener(new View.OnClickListener() {
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
                clubBODProfile.setImageResource(R.drawable.rackne_professional);

                bodClubLogo = (ImageView) dialogView.findViewById(R.id.bodClubLogo);
                bodClubLogo.setImageResource(R.drawable.ic_rckne);

                clubBODName = (TextView) dialogView.findViewById(R.id.clubBODname);
                clubBODName.setText(getString(R.string.professionalDeveloperRACKNEName));

                clubBODDes = (TextView) dialogView.findViewById(R.id.clubBODdes);
                clubBODDes.setText(getString(R.string.professionalDeveloperRACKNEDesignation));

                final AlertDialog dialog = builder.create();

                memCall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String contactNo = getString(R.string.professionalDeveloperRACKNEContact);
                        clubMemCall(v, contactNo);

                    }
                });

                memEmail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String[] to = {getString(R.string.professionalDeveloperRACKNEEmail)};
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


        CommSer.setOnClickListener(new View.OnClickListener() {
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
                clubBODProfile.setImageResource(R.drawable.rackne_community);

                bodClubLogo = (ImageView) dialogView.findViewById(R.id.bodClubLogo);
                bodClubLogo.setImageResource(R.drawable.ic_rckne);

                clubBODName = (TextView) dialogView.findViewById(R.id.clubBODname);
                clubBODName.setText(getString(R.string.communityServiceRACKNEName));

                clubBODDes = (TextView) dialogView.findViewById(R.id.clubBODdes);
                clubBODDes.setText(getString(R.string.communityServiceRACKNEDesignation));

                final AlertDialog dialog = builder.create();

                memCall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String contactNo = getString(R.string.communityServiceRACKNEContact);
                        clubMemCall(v, contactNo);

                    }
                });

                memEmail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String[] to = {getString(R.string.communityServiceRACKNEEmail)};
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


        IntSer.setOnClickListener(new View.OnClickListener() {
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
                clubBODProfile.setImageResource(R.drawable.rackne_international);

                bodClubLogo = (ImageView) dialogView.findViewById(R.id.bodClubLogo);
                bodClubLogo.setImageResource(R.drawable.ic_rckne);

                clubBODName = (TextView) dialogView.findViewById(R.id.clubBODname);
                clubBODName.setText(getString(R.string.internationalServiceRACKNEName));

                clubBODDes = (TextView) dialogView.findViewById(R.id.clubBODdes);
                clubBODDes.setText(getString(R.string.internationalServiceRACKNEDesignation));

                final AlertDialog dialog = builder.create();

                memCall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String contactNo = getString(R.string.internationalServiceRACKNEContact);
                        clubMemCall(v, contactNo);

                    }
                });

                memEmail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String[] to = {getString(R.string.internationalServiceRACKNEEmail)};
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

        Treasurer.setOnClickListener(new View.OnClickListener() {
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
                clubBODProfile.setImageResource(R.drawable.rackne_treasurer);

                bodClubLogo = (ImageView) dialogView.findViewById(R.id.bodClubLogo);
                bodClubLogo.setImageResource(R.drawable.ic_rckne);

                clubBODName = (TextView) dialogView.findViewById(R.id.clubBODname);
                clubBODName.setText(getString(R.string.treasurerRACKNEName));

                clubBODDes = (TextView) dialogView.findViewById(R.id.clubBODdes);
                clubBODDes.setText(getString(R.string.treasurerRACKNEDesignation));

                final AlertDialog dialog = builder.create();

                memCall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String contactNo = getString(R.string.treasurerRACKNEContact);
                        clubMemCall(v, contactNo);

                    }
                });

                memEmail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String[] to = {getString(R.string.treasurerRACKNEEmail)};
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

        Secretary.setOnClickListener(new View.OnClickListener() {
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
                clubBODProfile.setImageResource(R.drawable.rackne_secretary);

                bodClubLogo = (ImageView) dialogView.findViewById(R.id.bodClubLogo);
                bodClubLogo.setImageResource(R.drawable.ic_rckne);

                clubBODName = (TextView) dialogView.findViewById(R.id.clubBODname);
                clubBODName.setText(getString(R.string.secretaryRACKNEName));

                clubBODDes = (TextView) dialogView.findViewById(R.id.clubBODdes);
                clubBODDes.setText(getString(R.string.secretaryRACKNEDesignation));

                final AlertDialog dialog = builder.create();

                memCall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String contactNo = getString(R.string.secretaryRACKNEContact);
                        clubMemCall(v, contactNo);

                    }
                });

                memEmail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String[] to = {getString(R.string.secretaryRACKNEEmail)};
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

        ClubSer.setOnClickListener(new View.OnClickListener() {
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
                clubBODProfile.setImageResource(R.drawable.rackne_clubservice);

                bodClubLogo = (ImageView) dialogView.findViewById(R.id.bodClubLogo);
                bodClubLogo.setImageResource(R.drawable.ic_rckne);

                clubBODName = (TextView) dialogView.findViewById(R.id.clubBODname);
                clubBODName.setText(getString(R.string.clubServiceRACKNEName));

                clubBODDes = (TextView) dialogView.findViewById(R.id.clubBODdes);
                clubBODDes.setText(getString(R.string.clubServiceRACKNEDesignation));

                final AlertDialog dialog = builder.create();

                memCall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String contactNo = getString(R.string.clubServiceRACKNEContact);
                        clubMemCall(v, contactNo);

                    }
                });

                memEmail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String[] to = {getString(R.string.clubServiceRACKNEEmail)};
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

        VicePre.setOnClickListener(new View.OnClickListener() {
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
                clubBODProfile.setImageResource(R.drawable.rackne_vicepre);

                bodClubLogo = (ImageView) dialogView.findViewById(R.id.bodClubLogo);
                bodClubLogo.setImageResource(R.drawable.ic_rckne);

                clubBODName = (TextView) dialogView.findViewById(R.id.clubBODname);
                clubBODName.setText(getString(R.string.vicePreRACKNEName));

                clubBODDes = (TextView) dialogView.findViewById(R.id.clubBODdes);
                clubBODDes.setText(getString(R.string.vicePreRACKNEDesignation));

                final AlertDialog dialog = builder.create();

                memCall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String contactNo = getString(R.string.vicePreRACKNEContact);
                        clubMemCall(v, contactNo);

                    }
                });

                memEmail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String[] to = {getString(R.string.vicePreRACKNEEmail)};
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

        IPP.setOnClickListener(new View.OnClickListener() {
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
                clubBODProfile.setImageResource(R.drawable.rackne_ipp);

                bodClubLogo = (ImageView) dialogView.findViewById(R.id.bodClubLogo);
                bodClubLogo.setImageResource(R.drawable.ic_rckne);

                clubBODName = (TextView) dialogView.findViewById(R.id.clubBODname);
                clubBODName.setText(getString(R.string.ippRACKNEName));

                clubBODDes = (TextView) dialogView.findViewById(R.id.clubBODdes);
                clubBODDes.setText(getString(R.string.ippRACKNEDesignation));

                final AlertDialog dialog = builder.create();

                memCall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String contactNo = getString(R.string.ippRACKNEContact);
                        clubMemCall(v, contactNo);

                    }
                });

                memEmail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String[] to = {getString(R.string.ippRACKNEEmail)};
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
