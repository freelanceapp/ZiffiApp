package apporio.com.ziffiapp;

import com.androidnetworking.error.ANError;
import com.astuetz.PagerSlidingTabStrip;

import org.json.JSONObject;

import java.util.ArrayList;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.provider.CalendarContract;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import apporio.com.ziffiapp.Api_Manage.Api_Manager;
import apporio.com.ziffiapp.Api_Manage.Category_ser_getter;
import apporio.com.ziffiapp.Api_Manage.Category_setergeterResultcheck;

public class See_Service extends AppCompatActivity implements Api_Manager.APIFETCHER {

    PagerSlidingTabStrip tabs;
    public static TextView selectditem;
    ViewPager pager;
    public static ArrayList<String> cat_name1_arr= new ArrayList<>();
    public static ArrayList<String> cat_mainid_arr= new ArrayList<>();
    Api_Manager api_manager;
    String cat_name[];
    String cat_id[];
    ProgressDialog progressDialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see__service);


progressDialog=new ProgressDialog(this);
        //get data from api manger class
        api_manager=new Api_Manager(See_Service.this);
        api_manager.getCategoryList_Response();


        //back screen movement
         findViewById(R.id.back_service_layout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(See_Service.this,Main_Screen.class);
                startActivity(intent);
            }
        });

        //appoint ment time click
      findViewById(R.id.appointmentime_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(See_Service.this,Appointment_Time.class);
                startActivity(intent);
            }
        });



        //set item
        selectditem= (TextView) findViewById(R.id.selectedItem_textview);

    }

    @Override
    public void onAPIRunningState(int a) {
        if(a== Api_Manager.APIFETCHER.KEY_API_IS_RUNNING){
            // show progress bar
            progressDialog.show(this,"","pleasewait");

        }if (a == Api_Manager.APIFETCHER.KEY_API_IS_STARTED){
           // progressDialog.show(this,"","pleasewait");
        }if (a == Api_Manager.APIFETCHER.KEY_API_IS_ERRORED){
            // hide progress with text that error occured
           // progressDialog=ProgressDialog.show(this,"","error ocured");
            Toast.makeText(See_Service.this, "running wih error. . . ", Toast.LENGTH_SHORT).show();

        }if (a == Api_Manager.APIFETCHER.KEY_API_IS_STOPPED){
            // hide progress bat and show view in which we had to show data
            Toast.makeText(See_Service.this, "running .. ", Toast.LENGTH_SHORT).show();
           progressDialog.dismiss();
        }
    }

    @Override
    public void onFetchProgress(int progress) {

    }

    @Override
    public void onFetchComplete(Object script, String APINAME) {
        progressDialog.dismiss();
        if (APINAME.equals("" + Api_Manager.API_NAME)) {       // ie here we are fetching result

          Category_ser_getter status =(Category_ser_getter) script;


            cat_name1_arr.clear();
            cat_mainid_arr.clear();
             for (int i=0;i<((Category_ser_getter) script).getDetails().size();i++)
             {
                 cat_name1_arr.add(status.getDetails().get(i).getName());
                 cat_mainid_arr.add(status.getDetails().get(i).getCategory_id());

             }


            //convert to char for view pager
            cat_name=new String[status.getDetails().size()];
            cat_id=new String[status.getDetails().size()];


            cat_name=cat_name1_arr.toArray(cat_name);
            cat_id=cat_mainid_arr.toArray(cat_id);

             pager= (ViewPager) findViewById(R.id.pickup_viewpager);
            pager.setAdapter(new See_service_MyPagerAdapter(getSupportFragmentManager(),cat_name,cat_id));

            tabs = (PagerSlidingTabStrip) findViewById(R.id.tabs);
            tabs.setViewPager(pager);


        }

        else
        {Log.e("ppp","no screept");
        }
    }
    @Override
    public void onFetchFailed(ANError error) {

    }

    @Override
    public void WhichApi(String APINAME) {

    }
}
