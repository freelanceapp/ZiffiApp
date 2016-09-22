//package apporio.com.ziffiapp;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import android.content.Context;
//import android.support.design.widget.TabLayout;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentPagerAdapter;
//import android.support.v4.view.ViewPager;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.support.v7.widget.Toolbar;
//import android.view.LayoutInflater;
//import android.widget.TextView;
//
//public class Offeres_Activity extends AppCompatActivity {
//
//    private TabLayout tabLayout;
//    private ViewPager viewPager;
//    Context context;
//    String addresstype[]={"OFFERS","HAIR CARE","FACE","NAIL"};
//    private int[] imageResId = {R.drawable.ic_slot_morning_on, R.drawable.ic_slot_afternoon,R.drawable.ic_slot_evening,R.drawable.ic_slot_night };
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_offeres_);
//
//
//        viewPager = (ViewPager) findViewById(R.id.viewpager);
//       // setupViewPager(viewPager);
//        Appointment_Time_viewAdapter appoint=new Appointment_Time_viewAdapter(getSupportFragmentManager(),addresstype,imageResId);
//        viewPager.setAdapter(appoint);
//
//        tabLayout = (TabLayout) findViewById(R.id.tabs);
//        tabLayout.setupWithViewPager(viewPager);
//        setupTabIcons();
//    }
//
//    private void setupTabIcons() {
//
//        for (int a = 0; a < addresstype.length; a++) {
//
//            TextView tabOne = (TextView) LayoutInflater.from(this).inflate(R.layout.custome_tab, null);
//            tabOne.setText(addresstype[a]);
//            tabOne.setCompoundDrawablesWithIntrinsicBounds(0, imageResId[a], 0, 0);
//            tabLayout.getTabAt(a).setCustomView(tabOne);
//        }
//
//    }
//
//    private void setupViewPager(ViewPager viewPager) {
//
//        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
//        adapter.addFragment(new Appointment_Time_viewAdapter_fragment(), "ONE");
////        adapter.addFragment(new TwoFragment(), "TWO");
////       adapter.addFragment(new ThreeFragment(), "THREE");
//        viewPager.setAdapter(adapter);
//    }
//
//
//    class ViewPagerAdapter extends FragmentPagerAdapter {
//        private final List<Fragment> mFragmentList = new ArrayList<>();
//        private final List<String> mFragmentTitleList = new ArrayList<>();
//
//        public ViewPagerAdapter(FragmentManager manager) {
//            super(manager);
//        }
//
//        @Override
//        public Fragment getItem(int position) {
//            return mFragmentList.get(position);
//        }
//
//        @Override
//        public int getCount() {
//            return mFragmentList.size();
//        }
//
//        public void addFragment(Fragment fragment, String title) {
//            mFragmentList.add(fragment);
//            mFragmentTitleList.add(title);
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            return mFragmentTitleList.get(position);
//        }
//    }
//}
