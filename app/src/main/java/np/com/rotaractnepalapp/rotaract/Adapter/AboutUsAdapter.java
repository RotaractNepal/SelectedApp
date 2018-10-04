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

import np.com.rotaractnepalapp.rotaract.Class.AboutUsClass;
import np.com.rotaractnepalapp.rotaract.Activity.AboutUs;
import np.com.rotaractnepalapp.rotaract.R;

public class AboutUsAdapter extends RecyclerView.Adapter<AboutUsAdapter.AboutUsViewHolder> {
    Context context;
    ArrayList<AboutUsClass> aboutUsClasses;

    public AboutUsAdapter(Context context, ArrayList<AboutUsClass> aboutUsClasses) {
        this.context = context;
        this.aboutUsClasses = aboutUsClasses;
    }

    @NonNull
    @Override
    public AboutUsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.about_us_adapter, viewGroup, false);
        return new AboutUsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AboutUsViewHolder aboutUsViewHolder, int i) {

        final AboutUsClass aboutUsClass =  aboutUsClasses.get(i);

        aboutUsViewHolder.name.setText(aboutUsClass.getName());
        aboutUsViewHolder.profession.setText(aboutUsClass.getProfession());
        aboutUsViewHolder.address.setText(aboutUsClass.getAddress());
        aboutUsViewHolder.image.setImageResource(aboutUsClass.getImage());

        aboutUsViewHolder.call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                String contactNo = aboutUsClass.getCall();
                intent.setData(Uri.parse("tel:" + contactNo));
                v.getContext().startActivity(intent);
            }
        });

        aboutUsViewHolder.email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenEmail=null, chooserEmail=null;
                intenEmail = new Intent(Intent.ACTION_SEND);
                intenEmail.setData(Uri.parse("mailto:"));
                String[] to = {aboutUsClass.getEmail()};
                intenEmail.putExtra(Intent.EXTRA_EMAIL, to);
                intenEmail.putExtra(Intent.EXTRA_SUBJECT, "Sent From Rotaract Nepal App");
                intenEmail.putExtra(Intent.EXTRA_TEXT, "Dear Sir/Madam;");
                intenEmail.setType("message/rfc822");
                chooserEmail = intenEmail.createChooser(intenEmail,"Send Email");
                v.getContext().startActivity(chooserEmail);
            }
        });

    }

    @Override
    public int getItemCount() {
        return aboutUsClasses.size();
    }

    public class AboutUsViewHolder extends RecyclerView.ViewHolder {
        TextView name, profession, address;
        ImageView image;
        ImageView call, email, close;
        public AboutUsViewHolder(@NonNull final View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.aboutUsName);
            profession =(TextView) itemView.findViewById(R.id.aboutUsProfession);
            address = (TextView) itemView.findViewById(R.id.aboutUsAddress);
            image = (ImageView) itemView.findViewById(R.id.aboutUsImage);
            call = (ImageView) itemView.findViewById(R.id.aboutUscall);
            email = (ImageView) itemView.findViewById(R.id.aboutUsemail);
            close = (ImageView) itemView.findViewById(R.id.aboutUscancel);

            close.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((AboutUs)context).finish();
                }
            });
        }
    }
}
