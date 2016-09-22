package apporio.com.ziffiapp;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import apporio.com.ziffiapp.Api_Manage.AlertDialog_Manager;
import apporio.com.ziffiapp.Api_Manage.Api_Manager;
import apporio.com.ziffiapp.Session_Manager.Session_Manager;

public class Navigation_Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    ActionBarDrawerToggle actionBarDrawerToggle;
    DrawerLayout drawerLayout;
    LinearLayout linearLayout_search_place,layout_salon,layout_spa,layout_athome,layou_getbeutytrearment;
    TextView place_text;
    ListView listof_image_service;



    //login data
    // Alert Dialog Manager
    AlertDialog_Manager alert = new AlertDialog_Manager();

    // Session Manager Class
    Session_Manager session;




    //default data
    ArrayList<String> name_type=new ArrayList<>();
    ArrayList<String> name_offer=new ArrayList<>();
    ArrayList<Integer> icon=new ArrayList<>();

    String name_default[]={"Happy Hours","Fabulous Deals","Best Salons for Hair Cut","Best Salons for Facials","Get a Relaxing Spa"};
    String price_default[]={"All Weak Long","Near You","This Manson","Near You","Rejuvenate Yourself"};
    int image_default[]={R.drawable.images0,R.drawable.images1,R.drawable.images,R.drawable.images3,R.drawable.images2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_);


        //login
        // Session class instance
        session = new Session_Manager(getApplicationContext());
        Toast.makeText(getApplicationContext(), "User Login Status: " + session.isLoggedIn(), Toast.LENGTH_LONG).show();
        session.checkLogin();
// get user data from session
        HashMap<String, String> user = session.getUserDetails();

        // name
        String name = user.get(Session_Manager.EMAIL);

        // email
        String email = user.get(Session_Manager.Password);

        Log.e("sesssn",""+name+email);



        //list item
        for (int i=0;i<price_default.length;i++)
        {
            name_type.add(name_default[i]);
            name_offer.add(price_default[i]);
            icon.add(image_default[i]);
        }


//click to salon
        layout_salon= (LinearLayout) findViewById(R.id.home_salon);
        layout_salon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Navigation_Activity.this,Saloon.class);
                startActivity(intent);
            }
        });


        //click to spa
        layout_spa= (LinearLayout) findViewById(R.id.home_spa);
        layout_salon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Navigation_Activity.this,Saloon.class);
                startActivity(intent);
            }
        });


        //click to athome
        layou_getbeutytrearment= (LinearLayout) findViewById(R.id.getbeauty_treatmens);
        layou_getbeutytrearment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Navigation_Activity.this,Saloon.class);
                startActivity(intent);
            }
        });


        //ge beuty treatments
        layout_athome= (LinearLayout) findViewById(R.id.home_Athome);
        layout_salon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Navigation_Activity.this,Saloon.class);
                startActivity(intent);
            }
        });


        //toset list

        listof_image_service= (ListView) findViewById(R.id.lisOfitem);
        List_image_Adaper list_image_adaper=new List_image_Adaper(Navigation_Activity.this,name_type,name_offer,icon);
        listof_image_service.setAdapter(list_image_adaper);
        //to set height
        setListViewHeightBasedOnItems(listof_image_service);
        listof_image_service.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                if (position == 0) {
                  Intent int0 = new Intent(getApplicationContext(), Happy_Hours.class);
                    startActivity(int0);
                }

                else if (position == 1) {
                    Intent int1 = new Intent(getApplicationContext(), BestSalons.class);
                    startActivity(int1);
               }
          }});


//menu drawer
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        linearLayout_search_place=(LinearLayout)toolbar.findViewById(R.id.search_plac_lay);
        place_text= (TextView) toolbar.findViewById(R.id.adress_tv);

        //set locaion on this text view

        linearLayout_search_place.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Navigation_Activity.this,Search_location.class);
                startActivity(intent);
            }
        });


        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);


         toolbar.setCollapsible(false);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.menu);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);


//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
//                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
//        drawer.setDrawerListener(toggle);
//        toggle.syncState();
//
       navigationView.setNavigationItemSelectedListener(this);

    }

    //to set item heigh
    public static boolean setListViewHeightBasedOnItems(ListView listof_image_service) {

        ListAdapter listAdapter = listof_image_service.getAdapter();
        if (listAdapter != null) {

            int numberOfItems = listAdapter.getCount();

            // Get total height of all items.
            int totalItemsHeight = 0;
            for (int itemPos = 0; itemPos < numberOfItems; itemPos++) {
                View item = listAdapter.getView(itemPos, null, listof_image_service);
                float px = 500 * (listof_image_service.getResources().getDisplayMetrics().density);
                item.measure(View.MeasureSpec.makeMeasureSpec((int)px, View.MeasureSpec.AT_MOST), View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));
                totalItemsHeight += item.getMeasuredHeight();
            }

            // Get total height of all item dividers.
            int totalDividersHeight = listof_image_service.getDividerHeight() *
                    (numberOfItems - 1);
            // Get padding
            int totalPadding = listof_image_service.getPaddingTop() + listof_image_service.getPaddingBottom();

            // Set list height.
            ViewGroup.LayoutParams params = listof_image_service.getLayoutParams();
            params.height = totalItemsHeight + totalDividersHeight + totalPadding;
            listof_image_service.setLayoutParams(params);
            listof_image_service.requestLayout();
            return true;

        } else {
            return false;
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main_menu, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    @SuppressWarnings("StatementWithEmptyBody")


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.home) {

              Intent intent=new Intent(Navigation_Activity.this,Navigation_Activity.class);
            startActivity(intent);
            // Handle the camera action
        }
        else if (id == R.id.myaccount) {
            Intent intent=new Intent(Navigation_Activity.this,Main_Screen.class);
           // Log.e("ffff","hello");
            startActivity(intent);

        } else if (id == R.id.offrs) {

//            Intent intent=new Intent(Navigation_Activity.this,Offeres_Activity.class);
//            startActivity(intent);

        } else if (id == R.id.mybookings) {

            Intent intent=new Intent(Navigation_Activity.this,My_Account.class);
            startActivity(intent);

        } else if (id == R.id.refer) {
            Intent intent=new Intent(Navigation_Activity.this,My_Account.class);
            startActivity(intent);

        } else if (id == R.id.notification) {
//            Intent intent=new Intent(Navigation_Activity.this,Appointment_Time.class);
//            startActivity(intent);

        }
        else if (id == R.id.help) {
//            Intent intent=new Intent(Navigation_Activity.this,See_Service.class);
//            startActivity(intent);

        }
        else if (id == R.id.logout) {
//            Intent intent=new Intent(Navigation_Activity.this,My_Account.class);
//            startActivity(intent);
            session.logoutUser();
       }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
