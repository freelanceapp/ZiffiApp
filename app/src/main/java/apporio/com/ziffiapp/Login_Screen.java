package apporio.com.ziffiapp;

import com.androidnetworking.error.ANError;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.provider.SyncStateContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import apporio.com.ziffiapp.Api_Manage.AlertDialog_Manager;
import apporio.com.ziffiapp.Api_Manage.Api_Manager;
import apporio.com.ziffiapp.Api_Manage.Constants_api;
import apporio.com.ziffiapp.Session_Manager.Session_Manager;

public class Login_Screen extends AppCompatActivity implements Api_Manager.APIFETCHER {

    LinearLayout backfrom_login;
    Button login_buton;
    TextView forgetpassword;
    EditText email_textTextView,passw_textview;

    // Session Manager Class
    Session_Manager session;
    // Alert Dialog Manager
    AlertDialog_Manager alert = new AlertDialog_Manager();
    Api_Manager api_manager ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__screen);

        api_manager = new Api_Manager(Login_Screen.this);
        init();


        // Session Manager
        session = new Session_Manager(getApplicationContext());

        Toast.makeText(getApplicationContext(), "User Login Status: " + session.isLoggedIn(), Toast.LENGTH_LONG).show();


        backfrom_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                // TODO Auto-generated method stub
//                Login_Screen.this.finish();
//                System.exit(0);


                Intent intent = new Intent(Login_Screen.this, First_Screen.class);
                startActivity(intent);
            }
        });


        //login
        login_buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Get username, password from EditText
                String username = email_textTextView.getText().toString();
                String password = passw_textview.getText().toString();


                if (TextUtils.isEmpty(username)) {

                    Toast.makeText(Login_Screen.this, "Enter Email Id", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(password)) {
                    Toast.makeText(Login_Screen.this, "Enter Password", Toast.LENGTH_SHORT).show();
                } else if (!emailValidator(username)) {
                    Toast.makeText(Login_Screen.this, "Enter valid email address", Toast.LENGTH_SHORT).show();
                } else {
                     api_manager.getLoginUpResponse(email_textTextView.getText().toString().trim() , passw_textview.getText().toString().trim());
//                    Intent intent=new Intent(Login_Screen.this,Main_Screen.class);
//             startActivity(intent);

                }



                // Check if username, password is filled

                if(username.trim().length() > 0 && password.trim().length() > 0) {

                    if(username.equals(username) && password.equals(password)){
                        session.createLoginSession("mky", "123");

                        // Staring MainActivity
                        Intent i = new Intent(getApplicationContext(), Main_Screen.class);
                        startActivity(i);
                        finish();

                    }else{
                        // username / password doesn't match
                        alert.showAlertDialog(Login_Screen.this, "Login failed..", "Username/Password is incorrect", false);
                    }
                }else{
                    // user didn't entered username or password
                    // Show alert asking him to enter the details
                    alert.showAlertDialog(Login_Screen.this, "Login failed..", "Please enter username and password", false);
                }


                }
//
        });


        //forgot password
        forgetpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent=new Intent(Login_Screen.this,ForgotPassword.class);
//                startActivity(intent);
            }
        });
    }


    //email validation
    private boolean emailValidator(String username) {
        Pattern pattern;
        Matcher matcher;

        pattern = Pattern.compile(Constants_api.validemail);
        matcher = pattern.matcher(username);
        return matcher.matches();
    }


    //init block for login
    private void init() {
        backfrom_login= (LinearLayout) findViewById(R.id.backo_previous_login);
        login_buton= (Button) findViewById(R.id.login_btn);
        email_textTextView= (EditText) findViewById(R.id.input_email_login);
        passw_textview= (EditText) findViewById(R.id.input_password_login);
        forgetpassword= (TextView) findViewById(R.id.forgetpasswrd);


    }

    @Override
    public void onAPIRunningState(int a) {
        Toast.makeText(Login_Screen.this, ""+a, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFetchProgress(int progress) {

    }

    @Override
    public void onFetchComplete(Object script, String APINAME) {
        Toast.makeText(Login_Screen.this, ""+script, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFetchFailed(ANError error) {

    }

    @Override
    public void WhichApi(String APINAME) {
        Toast.makeText(Login_Screen.this, ""+APINAME, Toast.LENGTH_SHORT).show();
    }
}
