package np.com.rotaractnepalapp.rotaract;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ImageSliderAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images = {R.drawable.inter_school_oratory_competition,R.drawable.mero_sip
                                 ,R.drawable.mero_sip_certificate,R.drawable.nation_blood_donation,R.drawable.udaan,
                                  R.drawable.womensday,R.drawable.zlw,R.drawable.zonalpicnic};


    public ImageSliderAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.image_slide_layout,null);

        final ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (position == 0){
                    Toast.makeText(context, "Inter School Oratory Competition", Toast.LENGTH_LONG).show();
                }else if (position == 1){
                    Toast.makeText(context, "मेराे सिप", Toast.LENGTH_LONG).show();
                }else if (position == 2){
                    Toast.makeText(context, "मेराे सिप Certificate", Toast.LENGTH_LONG).show();
                }else if (position == 3){
                    Toast.makeText(context, "Nation Blood Donation", Toast.LENGTH_LONG).show();
                }else if (position == 4){
                    Toast.makeText(context, "Udaan", Toast.LENGTH_LONG).show();
                }else if (position == 5){
                    Toast.makeText(context, "Women's Day", Toast.LENGTH_LONG).show();
                }else if (position == 6){
                    Toast.makeText(context, "ZLW", Toast.LENGTH_LONG).show();
                }else if (position == 7){
                    Toast.makeText(context, "Zonal Picnic", Toast.LENGTH_LONG).show();
                }
            }
        });

        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;
        viewPager.removeView(view);
    }
}
