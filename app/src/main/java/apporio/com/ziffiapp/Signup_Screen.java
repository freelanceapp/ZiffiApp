package apporio.com.ziffiapp;

import com.androidnetworking.error.ANError;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import apporio.com.ziffiapp.Api_Manage.Api_Manager;
import apporio.com.ziffiapp.Api_Manage.Constants_api;

public class Signup_Screen extends AppCompatActivity implements Api_Manager.APIFETCHER{
    LinearLayout backfromlogin;
    Button next_signup_button;
    TextView name_text,email_text,passwrd_text,conact_text;
    Api_Manager api_manager ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup__screen);

        api_manager = new Api_Manager(Signup_Screen.this);
        init();


        //move to next and previous
        backfromlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent=new Intent(Signup_Screen.this,First_Screen.class);
               startActivity(intent);
            }
        });

        next_signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//


                signUpAftervalidation();

            }
        });




    }

    //method signup after valida

    private void signUpAftervalidation() {

        String name_tv,email_tv,phone_no, str_password;

        name_tv = name_text.getText().toString().trim();
        email_tv = email_text.getText().toString().trim();
        str_password  = passwrd_text.getText().toString().trim();
       phone_no = conact_text.getText().toString().trim();


        if(TextUtils.isEmpty(name_tv))
        {
            Toast.makeText(this, "Enter Name", Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(email_tv))
        {
            Toast.makeText(this,"Enter Email Id",Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(phone_no))
        {
            Toast.makeText(this,"Enter Phone Number",Toast.LENGTH_SHORT).show();
        }
        else if(TextUtils.isEmpty(str_password))
        {
            Toast.makeText(this,"Enter Password",Toast.LENGTH_SHORT).show();
        }
        else if(!emailValidator(email_tv))
        {
            Toast.makeText(this,"Enter valid email address",Toast.LENGTH_SHORT).show();

        }
        else if(phone_no.length()!=10)

        {
            Toast.makeText(this,"Mobile number not valid",Toast.LENGTH_SHORT).show();
        }
        else if(!isValidMobile(phone_no))
        {
            Toast.makeText(this,"Enter valid phon number",Toast.LENGTH_SHORT).show();

        }


        else{
            api_manager.getSignUpResponse(name_text.getText().toString().trim() , email_text.getText().toString().trim(),passwrd_text.getText().toString().trim(),conact_text.getText().toString().trim());
            Intent intent=new Intent(Signup_Screen.this,Navigation_Activity.class);
            startActivity(intent);

        }


    }

    //validation for mobile
    private boolean isValidMobile(String phone) {
        return android.util.Patterns.PHONE.matcher(phone).matches();
    }

    private boolean emailValidator(String email_tv) {

        Pattern pattern;
        Matcher matcher;


        pattern = Pattern.compile(Constants_api.validemail);
        matcher = pattern.matcher(email_tv);
        return matcher.matches();
    }

    private void init() {

        //find id of component
        backfromlogin= (LinearLayout) findViewById(R.id.backo_previous_login);
        next_signup_button= (Button) findViewById(R.id.next_btn);
        name_text= (TextView) findViewById(R.id.input_name);
        email_text= (TextView) findViewById(R.id.input_email);
        passwrd_text= (TextView) findViewById(R.id.input_password);
        conact_text= (TextView) findViewById(R.id.input_contact);

    }

    @Override
    public void onAPIRunningState(int a) {

    }

    @Override
    public void onFetchProgress(int progress) {

    }

    @Override
    public void onFetchComplete(Object script, String APINAME) {

    }

    @Override
    public void onFetchFailed(ANError error) {

    }

    @Override
    public void WhichApi(String APINAME) {

    }
}
