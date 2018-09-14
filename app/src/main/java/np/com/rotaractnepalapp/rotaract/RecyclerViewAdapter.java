package np.com.rotaractnepalapp.rotaract;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private static final String TAG = "RecyclerViewAdapter";

    private ArrayList<String> mItemDesignation = new ArrayList<>();
    private ArrayList<String> mItemImageUrls = new ArrayList<>();;
    private ArrayList<String> mItemName = new ArrayList<>();
    private ArrayList<String> mItemRIDNo = new ArrayList<>();
    private ArrayList<String> mItemBackground = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter(Context mContext, ArrayList<String> mItemDesignation, ArrayList<String> mItemImageUrls, ArrayList<String> mItemName, ArrayList<String> mItemRIDNo, ArrayList<String> mItemBackground) {
        this.mItemDesignation = mItemDesignation;
        this.mItemImageUrls = mItemImageUrls;
        this.mItemName = mItemName;
        this.mItemRIDNo = mItemRIDNo;
        this.mItemBackground = mItemBackground;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_listitem, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {


        Log.d(TAG, "onCreateViewHolder : called.");
        Glide.with(mContext)
                .asBitmap()
                .load(mItemImageUrls.get(i))
                .into(viewHolder.itemImage);
        viewHolder.itemDesignation.setText(mItemDesignation.get(i));
        viewHolder.itemImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d(TAG, "onClick: clicked on an image: " + mItemDesignation.get(i));
                //Toast.makeText(mContext, mItemDesignation.get(i), Toast.LENGTH_LONG).show();

                Dialog memInformation;
                memInformation = new Dialog(mContext);

                memInformation.setContentView(R.layout.mem_info_layout_recylerview);

                TextView memDesignation = memInformation.findViewById(R.id.memDesignationInfo);
                memDesignation.setText(mItemDesignation.get(i));

                CircleImageView memImage = memInformation.findViewById(R.id.memImageInfo);
                Glide.with(mContext)
                        .asBitmap()
                        .load(mItemImageUrls.get(i))
                        .into(memImage);

                ImageView memBackgroundImage = memInformation.findViewById(R.id.memImageBackground);
                Glide.with(mContext)
                        .asBitmap()
                        .load(mItemBackground.get(i))
                        .into(memBackgroundImage);

                TextView memName = memInformation.findViewById(R.id.memNameInfo);
                memName.setText(mItemName.get(i));

                TextView memRIDNo = memInformation.findViewById(R.id.memRIDNoInfo);
                memRIDNo.setText(mItemRIDNo.get(i));

                memInformation.show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return mItemImageUrls.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        CircleImageView itemImage;
        TextView itemDesignation;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemImage = itemView.findViewById(R.id.itemImage);
            itemDesignation = itemView.findViewById(R.id.itemDesignation);
        }
    }
}
