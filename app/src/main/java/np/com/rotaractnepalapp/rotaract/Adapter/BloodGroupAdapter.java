package np.com.rotaractnepalapp.rotaract.Adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Class.BloodGroupClass;
import np.com.rotaractnepalapp.rotaract.R;

public class BloodGroupAdapter extends RecyclerView.Adapter<BloodGroupAdapter.BloodGroupViewHolder> {

    Context context;
    ArrayList<BloodGroupClass> bloodGroupClasses;

    public BloodGroupAdapter(Context context, ArrayList<BloodGroupClass> bloodGroupClasses) {
        this.context = context;
        this.bloodGroupClasses = bloodGroupClasses;
    }

    @NonNull
    @Override
    public BloodGroupViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.blood_group_item_adapter, viewGroup, false);
        return new BloodGroupViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BloodGroupViewHolder bloodGroupViewHolder, int i) {

        final BloodGroupClass bloodGroupClass = bloodGroupClasses.get(i);

        bloodGroupViewHolder.bloodgroup.setText(bloodGroupClass.getBloodgroup());
        bloodGroupViewHolder.name.setText(bloodGroupClass.getName());
        bloodGroupViewHolder.clubname.setText(bloodGroupClass.getClubname());
        bloodGroupViewHolder.address.setText(bloodGroupClass.getAddress());

        bloodGroupViewHolder.call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                String contactNo = bloodGroupClass.getContact();
                intent.setData(Uri.parse("tel:" + contactNo));
                v.getContext().startActivity(intent);
            }
        });

        bloodGroupViewHolder.email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenEmail=null, chooserEmail=null;
                intenEmail = new Intent(Intent.ACTION_SEND);
                intenEmail.setData(Uri.parse("mailto:"));
                String[] to = {bloodGroupClass.getEmail()};
                intenEmail.putExtra(Intent.EXTRA_EMAIL, to);
                intenEmail.putExtra(Intent.EXTRA_SUBJECT, "Blood"+ " " + bloodGroupClass.getBloodgroup()+ " " + "Need");
                intenEmail.putExtra(Intent.EXTRA_TEXT, "Dear Sir/Madam;");
                intenEmail.setType("message/rfc822");
                chooserEmail = intenEmail.createChooser(intenEmail,"Send Email");
                v.getContext().startActivity(chooserEmail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return bloodGroupClasses.size();
    }

    public class BloodGroupViewHolder extends RecyclerView.ViewHolder {
        TextView bloodgroup, name, clubname, address;
        ImageView call, email;
        public BloodGroupViewHolder(@NonNull View itemView) {
            super(itemView);
            bloodgroup = (TextView) itemView.findViewById(R.id.bloodGroupName);
            name = (TextView) itemView.findViewById(R.id.bloodDonorName);
            clubname = (TextView) itemView.findViewById(R.id.bloodDonorClubName);
            address = (TextView) itemView.findViewById(R.id.bloodDonorAddress);
            call = (ImageView) itemView.findViewById(R.id.bloodDonorCall);
            email = (ImageView) itemView.findViewById(R.id.bloodDonorEmail);
        }
    }
}
