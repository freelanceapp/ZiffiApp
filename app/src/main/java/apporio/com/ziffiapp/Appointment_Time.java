package apporio.com.ziffiapp;

import com.astuetz.PagerSlidingTabStrip;

import java.util.ArrayList;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Appointment_Time extends AppCompatActivity {

   String addresstype[]={"09 AM - 12 PM","09 PM - 03 PM","03 PM - 06 PM","06 PM - 09 PM"};
    private TabLayout tabLayout;
    private ViewPager viewPager;
    TextView dateday_textview;
    int count=0;

    ArrayList<String> date_time=new ArrayList<>();
    String date[]={"Today","Tomorrow","Fri, Sep12","Fri, Sep13","Fri, Sep14","Fri, Sep17","Fri, Sep18","Fri, Sep19"};
    TextView tab_textView;

    LinearLayout layout_forwrd_Date,layout_backDate,apoointmentBackScreen,schedulemybooking;
    private int[] imageResId_Off = {R.drawable.ic_slot_morning, R.drawable.ic_slot_afternoon,R.drawable.ic_slot_evening,R.drawable.ic_slot_night };
    private int[] imageResId_On = {R.drawable.ic_slot_morning_on, R.drawable.ic_slot_afternoon_on,R.drawable.ic_slot_evening_on,R.drawable.ic_slot_night_on };
    int date_size;
    ImageView image_nextOn,image_nextoff,image_prevon,image_prevoff;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment__time);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        image_nextoff= (ImageView) findViewById(R.id.daynextimage_off);
        image_nextOn= (ImageView) findViewById(R.id.daynextimage_on);
        image_prevoff= (ImageView) findViewById(R.id.daybeforeimage_off);
        image_prevon= (ImageView) findViewById(R.id.daybeforeimage_on);
        dateday_textview= (TextView) findViewById(R.id.day_time_textview);
        layout_forwrd_Date= (LinearLayout) findViewById(R.id.forwod_layout);
        layout_backDate= (LinearLayout) findViewById(R.id.back_timelayout);
        apoointmentBackScreen= (LinearLayout) findViewById(R.id.backo_previous_fromappointmenttime);
        schedulemybooking= (LinearLayout) findViewById(R.id.schedule_mybooking_layout);

//setdate and time du,my data
for (int i=0;i<date.length;i++){

    date_time.add(date[i]);
}
   date_size =date_time.size();

        //for schedule my booking btn clickable
        schedulemybooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Appointment_Time.this,See_Service.class);
                startActivity(intent);
            }
        });

        //for back to previous acivity
        apoointmentBackScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Appointment_Time.this,See_Service.class);
                startActivity(intent);

            }
        });


//for forwrd
layout_forwrd_Date.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        if (count<(date_size-1))
        {
        count=count+1;
        dateday_textview.setText(date_time.get(count));
            image_prevon.setVisibility(View.VISIBLE);
            image_prevoff.setVisibility(View.GONE);
        }
        else{
            Toast.makeText(Appointment_Time.this,"no more date available",Toast.LENGTH_LONG).show();
            image_nextoff.setVisibility(View.VISIBLE);
            image_nextOn.setVisibility(View.GONE);
        }
    }
});
        //for backwrd
        layout_backDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (count>0)
                {
                    count=count-1;
                    dateday_textview.setText(date_time.get(count));
                    image_nextoff.setVisibility(View.GONE);
                    image_nextOn.setVisibility(View.VISIBLE);
                }
                else{
                    Toast.makeText(Appointment_Time.this,"no more date available",Toast.LENGTH_LONG).show();
                    image_prevon.setVisibility(View.GONE);
                    image_prevoff.setVisibility(View.VISIBLE);
                }
            }
        });





        //find page view change position
        viewPager.setOnPageChangeListener(
                new ViewPager.SimpleOnPageChangeListener() {
                    @Override
                    public void onPageSelected(int position) {
                      int  tabIndex = position;


                    }
                });
        // setupViewPager(viewPager);
        Appointment_Time_viewAdapter appoint=new Appointment_Time_viewAdapter(getSupportFragmentManager(),addresstype,imageResId_Off);
        viewPager.setAdapter(appoint);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        setupTabIcons();
    }


    //for setup tab icons
    private void setupTabIcons() {
        for (int a = 0; a < addresstype.length; a++) {

            View view=LayoutInflater.from(this).inflate(R.layout.custome_tab, null);
            tab_textView = (TextView) view.findViewById(R.id.tab_tv);
            tab_textView.setText(addresstype[a]);
            tab_textView.setCompoundDrawablesWithIntrinsicBounds(0, imageResId_Off[a], 0, 0);

            tabLayout.getTabAt(a).setCustomView(view);
        }
    }



    }

