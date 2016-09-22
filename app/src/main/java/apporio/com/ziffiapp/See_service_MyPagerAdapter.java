package apporio.com.ziffiapp;

import java.util.ArrayList;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

/**
 * Created by apporio3 on 9/7/2016.
 */
public class See_service_MyPagerAdapter extends FragmentPagerAdapter {
    Context context;
    String cat_name[];
    String[] catid;
    public static String cat;

    public See_service_MyPagerAdapter(FragmentManager supportFragmentManager,String cat_name[],String catid[]) {
        super(supportFragmentManager);
        this.cat_name=cat_name;
        this.catid=catid;
    }


    @Override
    public Fragment getItem(int position) {
        //cat = catid[position];
        return Seeservice_pager_MyFragmentData.newInstance(context, catid[position]);
    }


    @Override
    public int getCount() {
        return catid.length;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return cat_name[position];
    }
}
