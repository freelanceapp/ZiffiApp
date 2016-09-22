package apporio.com.ziffiapp;

import com.androidnetworking.error.ANError;
import com.daimajia.slider.library.Animations.DescriptionAnimation;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import apporio.com.ziffiapp.Api_Manage.Api_Manager;
import apporio.com.ziffiapp.Api_Manage.ViewStrore_settergetter;

public class Main_Screen extends AppCompatActivity implements BaseSliderView.OnSliderClickListener,Api_Manager.APIFETCHER, ViewPagerEx.OnPageChangeListener {
    private SliderLayout mDemoSlider;
    Button bookSevice_btn;
    LinearLayout backfrommainscreen;
    TextView shopename,opentime,shpoe_address;
    Api_Manager api_manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__screen);

        //find id
        bookSevice_btn= (Button) findViewById(R.id.booksrvice_btn);
        backfrommainscreen= (LinearLayout) findViewById(R.id.backfrom_mainScreen);
        shopename= (TextView) findViewById(R.id.shopename_textview);
        opentime= (TextView) findViewById(R.id.time_openshope_textview);
        shpoe_address= (TextView) findViewById(R.id.adress_shope_textview);



        //backscreen
        backfrommainscreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main_Screen.this,First_Screen.class);
                startActivity(intent);
            }
        });


//call api manager getview methode
     api_manager=new Api_Manager(Main_Screen.this);
        api_manager.getViewStore();



        //book serevice btn

        bookSevice_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main_Screen.this,See_Service.class);
                startActivity(intent);
            }
        });


        //image slider

        mDemoSlider = (SliderLayout)findViewById(R.id.slider);
        HashMap<String, Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("Hannibal", R.drawable.images0);
        file_maps.put("Big Bang Theory", R.drawable.images1);
        file_maps.put("House of Cards", R.drawable.images2);
        file_maps.put("Game of Thrones", R.drawable.images3);


        for (String name : file_maps.keySet()) {
            TextSliderView textSliderView = new TextSliderView(this);
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);


            //add your extra information
            textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra",name);

            mDemoSlider.addSlider(textSliderView);

        }

        mDemoSlider.setPresetTransformer(SliderLayout.Transformer.Accordion);
        mDemoSlider.setPresetIndicator(SliderLayout.PresetIndicators.Center_Bottom);
        mDemoSlider.setCustomAnimation(new DescriptionAnimation());
        mDemoSlider.setDuration(4000);
        mDemoSlider.addOnPageChangeListener(this);
    }


    //overided method of image slider
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

    @Override
    public void onSliderClick(BaseSliderView slider) {


    }



    //overided method of api manger
    @Override
    public void onAPIRunningState(int a) {

    }

    @Override
    public void onFetchProgress(int progress) {

    }

    @Override
    public void onFetchComplete(Object script, String APINAME) {
        if (APINAME.equals("" + Api_Manager.ViewStore)) {       // ie here we are fetching result

            ViewStrore_settergetter status = (ViewStrore_settergetter) script;

           shopename.setText(status.getDetails().getName());
            opentime.setText(status.getDetails().getTime());
            shpoe_address.setText(status.getDetails().getAddress());
        }
    }
    @Override
    public void onFetchFailed(ANError error) {

    }

    @Override
    public void WhichApi(String APINAME) {

    }
}