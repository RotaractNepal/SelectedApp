package np.com.rotaractnepalapp.rotaract.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import np.com.rotaractnepalapp.rotaract.R;

public class EventImageSliderAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images = {R.drawable.district_conference,R.drawable.dlts,R.drawable.presidents_and_secretaries_meet,R.drawable.ryla,
            R.drawable.greeting_card_exchange,R.drawable.global_handwashing_day,R.drawable.plantation_program,};

    public EventImageSliderAdapter(Context context) {
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
                    Toast.makeText(context, "District Conference", Toast.LENGTH_LONG).show();
                }else if (position == 1){
                    Toast.makeText(context, "District Leadership Training Seminar", Toast.LENGTH_LONG).show();
                }else if (position == 2){
                    Toast.makeText(context, "President and Secretaries meet", Toast.LENGTH_LONG).show();
                }else if (position == 3){
                    Toast.makeText(context, "Rotary Youth Leadership Awards", Toast.LENGTH_LONG).show();
                }else if (position == 4){
                    Toast.makeText(context, "Greeting Card Exchange", Toast.LENGTH_LONG).show();
                }else if (position == 5){
                    Toast.makeText(context, "Global Hand Washing Day", Toast.LENGTH_LONG).show();
                }else if (position == 6){
                    Toast.makeText(context, "Plantation Program", Toast.LENGTH_LONG).show();
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
