package apporio.com.ziffiapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class Splash_Screen extends AppCompatActivity {
//    Button but;
//    ToggleButton toggleBtn;

   // ImageView logoimage;
    private static int SPLASH_TIME_OUT = 1000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);

//logoimage= (ImageView) findViewById(R.id.splash_image);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Splash_Screen.this,First_Screen.class);

                Splash_Screen.this.startActivity(mainIntent);
                Splash_Screen.this.finish();
            }
        }, SPLASH_TIME_OUT);
//       but= (Button) findViewById(R.id.button);
//        but.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(Splash_Screen.this,First_Screen.class);
//                startActivity(intent);
//            }
//        });
//


//toggleBtn= (ToggleButton) findViewById(R.id.togle);

      //  toggleBtn.toggle();
       // toggleBtn.toggle(false);


//        ToggleButton toggle = (ToggleButton) findViewById(R.id.toggleButton);
//        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if (isChecked) {
//                    // The toggle is enabled
//                } else {
//                    // The toggle is disabled
//                }
//            }
//        });
    }
}
