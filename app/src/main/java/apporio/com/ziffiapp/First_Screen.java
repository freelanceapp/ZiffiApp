package apporio.com.ziffiapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class First_Screen extends AppCompatActivity {
LinearLayout signup_layout,login_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__screen2);

        signup_layout= (LinearLayout) findViewById(R.id.signup_firstscreen_layout);
        login_layout= (LinearLayout) findViewById(R.id.logi_firsscreen_layout);

        signup_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(First_Screen.this,Signup_Screen.class);
                startActivity(intent);
            }
        });



        login_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(First_Screen.this,Login_Screen.class);
                startActivity(intent);
            }
        });
    }
}
