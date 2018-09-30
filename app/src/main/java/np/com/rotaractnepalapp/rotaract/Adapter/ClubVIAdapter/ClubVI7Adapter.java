package np.com.rotaractnepalapp.rotaract.Adapter.ClubVIAdapter;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;
import np.com.rotaractnepalapp.rotaract.Class.ClassClubVI.ClubVI7Class;
import np.com.rotaractnepalapp.rotaract.R;

public class ClubVI7Adapter extends RecyclerView.Adapter<ClubVI7Adapter.ClubViewHolder> {

    ArrayList<ClubVI7Class> data = new ArrayList<>();

    public ClubVI7Adapter(ArrayList<ClubVI7Class> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public ClubViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.itemadapter, viewGroup, false);
        return new ClubViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ClubViewHolder clubViewHolder, int i) {
        clubViewHolder.title.setText(data.get(i).getTitle());
        clubViewHolder.images.setImageResource(data.get(i).getImages());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ClubViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView images;
        public ClubViewHolder(@NonNull View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.nameTextView);
            images = (ImageView) itemView.findViewById(R.id.imageView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION){
                        final ClubVI7Class clickedDataItem = data.get(position);
                        final Dialog memInformation;
                        memInformation = new Dialog(v.getContext());

                        memInformation.setContentView(R.layout.mem_info_layout_recylerview);

                        ImageView memImageBackGround = (ImageView) memInformation.findViewById(R.id.memImageBackground);
                        memImageBackGround.setImageResource(clickedDataItem.getBimages());

                        CircleImageView memImage = (CircleImageView) memInformation.findViewById(R.id.memImageInfo);
                        memImage.setImageResource(clickedDataItem.getImages());

                        TextView memName = (TextView) memInformation.findViewById(R.id.memNameInfo);
                        memName.setText(clickedDataItem.getName());

                        TextView memDesignation = (TextView) memInformation.findViewById(R.id.memDesignationInfo);
                        memDesignation.setText(clickedDataItem.getTitle());

                        TextView memRIDNo = (TextView) memInformation.findViewById(R.id.memRIDNoInfo);
                        memRIDNo.setText(clickedDataItem.getRidno());

                        ImageView close = (ImageView) memInformation.findViewById(R.id.cancel);
                        close.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                memInformation.dismiss();
                            }
                        });

                        ImageView call = (ImageView) memInformation.findViewById(R.id.call);
                        call.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intent = new Intent(Intent.ACTION_DIAL);
                                String contactNo = clickedDataItem.getCall();
                                intent.setData(Uri.parse("tel:" + contactNo));
                                v.getContext().startActivity(intent);
                            }
                        });

                        ImageView email = (ImageView) memInformation.findViewById(R.id.email);
                        email.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent intenEmail=null, chooserEmail=null;
                                intenEmail = new Intent(Intent.ACTION_SEND);
                                intenEmail.setData(Uri.parse("mailto:"));
                                String[] to = {clickedDataItem.getEmail()};
                                intenEmail.putExtra(Intent.EXTRA_EMAIL, to);
                                intenEmail.putExtra(Intent.EXTRA_SUBJECT, "Sent From Rotaract Nepal App");
                                intenEmail.putExtra(Intent.EXTRA_TEXT, "Dear Sir/Madam;");
                                intenEmail.setType("message/rfc822");
                                chooserEmail = intenEmail.createChooser(intenEmail,"Send Email");
                                v.getContext().startActivity(chooserEmail);
                            }
                        });

                        memInformation.setCanceledOnTouchOutside(false);
                        memInformation.setCancelable(false);
                        memInformation.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                        memInformation.show();
                    }
                }
            });
        }
    }
}
