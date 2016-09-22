package apporio.com.ziffiapp;

import com.astuetz.PagerSlidingTabStrip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by apporio3 on 9/10/2016.
 */
public class Appointment_Time_viewAdapter extends FragmentPagerAdapter

{

    Context context;
    String addresstype[];
    private int[] imageResId ;

    public Appointment_Time_viewAdapter(FragmentManager supportFragmentManager,String[] addresstype,int imageResId[]) {
        super(supportFragmentManager);
        this.addresstype=addresstype;
        this.imageResId=imageResId;
    }


    @Override
    public int getCount() {
        return addresstype.length;
    }


    @Override
    public CharSequence getPageTitle(int position)
    {

        return addresstype[position];}



        @Override
        public Fragment getItem(int position) {
            return Appointment_Time_viewAdapter_fragment.newInstance(context,addresstype[position]);

    }
}
