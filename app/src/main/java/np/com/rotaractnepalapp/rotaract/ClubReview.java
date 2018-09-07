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
import android.widget.ListView;
import android.widget.TextView;



public class ClubReview extends AppCompatActivity {

    /*private ImageView rackne_ITofficer, rackne_President, rackne_IPP, rackne_VicePre, rackne_Secretary, rackne_Treasurer, rackne_ClubSer, rackne_IntSer, rackne_CommSer, rackne_ProDev, rackne_AssDir, rackne_Sergeant, rackne_FundChair, rackne_PubRel;
    private ImageView clubBODProfile, bodClubLogo;
    private TextView clubBODName, clubBODDes;
    private ImageView memCall, memEmail, memClose;*/

    private ListView mListView;
    String[] clubShortName ={"RACKNE", "RACGongabu"};
    int[] clubLogo = {R.drawable.ic_rackne,R.drawable.ic_rac_gongabu};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club_review);
       /* this.setTitle("Club Review");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }*/

        mListView = (ListView) findViewById(R.id.listview);
        ClubReviewAdapter clubReviewAdapter = new ClubReviewAdapter(ClubReview.this, clubShortName, clubLogo);
        mListView.setAdapter(clubReviewAdapter);
        // RotaractClubOfKathmanduNorthEast();

    }

    /*public void RotaractClubOfKathmanduNorthEast(){
        rackne_President = (ImageView) findViewById(R.id.clubPresident);
        rackne_IPP = (ImageView) findViewById(R.id.clubIPP);
        rackne_ITofficer = (ImageView) findViewById(R.id.clubITOfficer);
        rackne_VicePre = (ImageView) findViewById(R.id.clubVicePresident);
        rackne_ClubSer = (ImageView) findViewById(R.id.clubClubService);
        rackne_Secretary = (ImageView) findViewById(R.id.clubSecretary);
        rackne_Treasurer = (ImageView) findViewById(R.id.clubTreasurer);
        rackne_IntSer = (ImageView) findViewById(R.id.clubInternationalService);
        rackne_CommSer = (ImageView) findViewById(R.id.clubCommunityService);
        rackne_ProDev = (ImageView) findViewById(R.id.clubProfessionalDeveloper);
        rackne_AssDir = (ImageView) findViewById(R.id.clubAssistantDirector);
        rackne_Sergeant = (ImageView) findViewById(R.id.clubSergeant);
        rackne_FundChair = (ImageView) findViewById(R.id.clubFundraisingChair);
        rackne_PubRel = (ImageView) findViewById(R.id.clubPublicRelationsOfficer);

        rackne_PubRel.setOnClickListener(new View.OnClickListener() {
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
                clubBODName.setText(getString(R.string.publicRelationsOfficerRACKNEName));

                clubBODDes = (TextView) dialogView.findViewById(R.id.clubBODdes);
                clubBODDes.setText(getString(R.string.publicRelationsOfficerRACKNEDesignation));

                final AlertDialog dialog = builder.create();

                memCall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String contactNo = getString(R.string.publicRelationsOfficerRACKNEContact);
                        clubMemCall(v, contactNo);

                    }
                });

                memEmail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String[] to = {getString(R.string.publicRelationsOfficerRACKNEEmail)};
                        clubMemEmail(v, to);

                    }
                });

                memClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });
                dialog.setCanceledOnTouchOutside(false);
                dialog.setCancelable(false);

                dialog.show();
            }
        });

        rackne_FundChair.setOnClickListener(new View.OnClickListener() {
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
                clubBODName.setText(getString(R.string.fundraisingChairRACKNEName));

                clubBODDes = (TextView) dialogView.findViewById(R.id.clubBODdes);
                clubBODDes.setText(getString(R.string.fundraisingChairRACKNEDesignation));

                final AlertDialog dialog = builder.create();

                memCall.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String contactNo = getString(R.string.fundraisingChairRACKNEContact);
                        clubMemCall(v, contactNo);

                    }
                });

                memEmail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String[] to = {getString(R.string.fundraisingChairRACKNEEmail)};
                        clubMemEmail(v, to);

                    }
                });

                memClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                    }
                });
                dialog.setCanceledOnTouchOutside(false);
                dialog.setCancelable(false);

                dialog.show();
            }
        });

        rackne_Sergeant.setOnClickListener(new View.OnClickListener() {
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

                dialog.setCanceledOnTouchOutside(false);
                dialog.setCancelable(false);
                dialog.show();
            }
        });


        rackne_AssDir.setOnClickListener(new View.OnClickListener() {
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
                dialog.setCanceledOnTouchOutside(false);
                dialog.setCancelable(false);

                dialog.show();
            }
        });


        rackne_ProDev.setOnClickListener(new View.OnClickListener() {
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

                dialog.setCanceledOnTouchOutside(false);
                dialog.setCancelable(false);

                dialog.show();
            }
        });


        rackne_CommSer.setOnClickListener(new View.OnClickListener() {
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

                dialog.setCanceledOnTouchOutside(false);
                dialog.setCancelable(false);
                dialog.show();
            }
        });


        rackne_IntSer.setOnClickListener(new View.OnClickListener() {
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

                dialog.setCanceledOnTouchOutside(false);
                dialog.setCancelable(false);
                dialog.show();
            }
        });

        rackne_Treasurer.setOnClickListener(new View.OnClickListener() {
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

                dialog.setCanceledOnTouchOutside(false);
                dialog.setCancelable(false);
                dialog.show();
            }
        });

        rackne_Secretary.setOnClickListener(new View.OnClickListener() {
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

                dialog.setCanceledOnTouchOutside(false);
                dialog.setCancelable(false);
                dialog.show();
            }
        });

        rackne_ClubSer.setOnClickListener(new View.OnClickListener() {
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

                dialog.setCanceledOnTouchOutside(false);
                dialog.setCancelable(false);
                dialog.show();
            }
        });

        rackne_VicePre.setOnClickListener(new View.OnClickListener() {
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

                dialog.setCanceledOnTouchOutside(false);
                dialog.setCancelable(false);
                dialog.show();
            }
        });

        rackne_President.setOnClickListener(new View.OnClickListener() {
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

                dialog.setCanceledOnTouchOutside(false);
                dialog.setCancelable(false);
                dialog.show();
            }
        });

        rackne_IPP.setOnClickListener(new View.OnClickListener() {
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

                dialog.setCanceledOnTouchOutside(false);
                dialog.setCancelable(false);
                dialog.show();
            }
        });

        rackne_ITofficer.setOnClickListener(new View.OnClickListener() {
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

                dialog.setCanceledOnTouchOutside(false);
                dialog.setCancelable(false);
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
    }*/

   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }*/
}
