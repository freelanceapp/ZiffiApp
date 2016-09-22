package apporio.com.ziffiapp.Session_Manager;

import java.util.HashMap;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import apporio.com.ziffiapp.Login_Screen;

/**
 * Created by apporio3 on 9/16/2016.
 */
public class Session_Manager {


    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;
    int PRIVATE_MODE = 0;
    // Sharedpref file name
    private static final String PREF_NAME = "AndroidHivePref";
    private static final String IS_LOGIN = "IsLoggedIn";



//    public static String FIRST_NAME = "firstname";
    public static String EMAIL = "email";
    public static String Password = "password";
//    public static String Contac_no = "contactno";


    public Session_Manager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();

    }

    /**
     * Create login session
     */
    public void createLoginSession( String email, String password) {
// Storing login value as TRUE
        editor.putBoolean(IS_LOGIN, true);
//        editor.putString(FIRST_NAME, firstname);
        editor.putString(EMAIL, email);
        editor.putString(Password,password);
//        editor.putString(Contac_no, contac_no);
        editor.commit();

    }

    /**
     * Quick check for login
     * **/
    // Get Login State

    public void checkLogin(){
        // Check login status
        if(!this.isLoggedIn()){
            // user is not logged in redirect him to Login Activity
            Intent i = new Intent(_context, Login_Screen.class);
            // Closing all the Activities
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

            // Add new Flag to start new Activity
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

            // Staring Login Activity
            _context.startActivity(i);
        }

    }


    /**
     * Get stored session data
     * */
    public HashMap<String, String> getUserDetails(){
        HashMap<String, String> user = new HashMap<String, String>();

//        user.put(FIRST_NAME, pref.getString(FIRST_NAME, null));
        user.put(EMAIL, pref.getString(EMAIL, null));
        user.put(Password, pref.getString(Password, null));
//        user.put(Contac_no, pref.getString(Contac_no, null));
// return user
        return user;

    }

    public void logoutUser(){
        editor.clear();
        editor.commit();


        Intent i = new Intent(_context, Login_Screen.class);
        // Closing all the Activities
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        // Add new Flag to start new Activity
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        // Staring Login Activity
        _context.startActivity(i);
    }




    /**
     * Quick check for login
     * **/
    // Get Login State
    public boolean isLoggedIn(){
        return pref.getBoolean(IS_LOGIN, false);
    }



}