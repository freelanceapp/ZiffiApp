package apporio.com.ziffiapp;

import com.androidnetworking.error.ANError;

import java.util.ArrayList;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import apporio.com.ziffiapp.Api_Manage.Api_Manager;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

class MainActivity extends AppCompatActivity

//      implements   Api_Manager.APIFETCHER
{

 Api_Manager api_manager;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//       api_manager=new Api_Manager(MainActivity.this);
//       api_manager.getCategoryList_Response();
      // api_manager.getSubCategoryList_Response();
        //api_manager.getProductList_Response();



    }

//    @Override
//    public void onAPIRunningState(int a) {
//       Toast.makeText(MainActivity.this, ""+a, Toast.LENGTH_SHORT).show();
//
//    }

//    @Override
//    public void onFetchProgress(int progress) {
//
//    }

//    @Override
//
//    public void onFetchComplete(String script, String APINAME) {
//       Toast.makeText(MainActivity.this  , APINAME +"  " +script , Toast.LENGTH_SHORT).show();
//
//    }

//    @Override
//    public void onFetchFailed(ANError error) {
//       Toast.makeText(MainActivity.this  , "" +error , Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    public void WhichApi(String APINAME) {
//
//       Toast.makeText(MainActivity.this, ""+APINAME, Toast.LENGTH_SHORT).show();
//
//    }
}
