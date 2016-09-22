package apporio.com.ziffiapp;


import com.androidnetworking.error.ANError;

import java.util.ArrayList;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import apporio.com.ziffiapp.Api_Manage.AllProduct_setter_geter;
import apporio.com.ziffiapp.Api_Manage.Api_Manager;
import apporio.com.ziffiapp.Api_Manage.ProductList_settergetter;
import apporio.com.ziffiapp.Api_Manage.SubCatagory_settergetter;


/**
 * A simple {@link Fragment} subclass.
 */
public class Seeservice_pager_MyFragmentData extends Fragment implements Api_Manager.APIFETCHER {
  // Context context;
    ListView listView;
    Api_Manager api_manager;
    String list_catid;


    public static  Seeservice_pager_MyFragmentData newInstance(Context context,String catid) {
           context=context;
        Seeservice_pager_MyFragmentData fragmentFirst = new Seeservice_pager_MyFragmentData();
        Bundle args = new Bundle();
        args.putString("someInt",catid);
        fragmentFirst.setArguments(args);
        return fragmentFirst;

    }

    //Store instance variables based on arguments passed

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //list_catid = getArguments().getString("someInt");

        api_manager=new Api_Manager(Seeservice_pager_MyFragmentData.this);
    }





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_see_service__mypager__my, container, false);
        listView= (ListView) view.findViewById(R.id.list_seemore_service);

        list_catid = getArguments().getString("someInt");
        api_manager.getSubCategoryList_Response(list_catid);

  return view;  }



    @Override
    public void onAPIRunningState(int a) {

    }

    @Override
    public void onFetchProgress(int progress) {

    }

    @Override
    public void onFetchComplete(Object script, String APINAME) {

        if (APINAME.equals("" + Api_Manager.sub_catname)) {       // ie here we are fetching result

            AllProduct_setter_geter status =(AllProduct_setter_geter) script;

            listView.setAdapter(new Seeservice_pager_fragment_Adaper(getActivity(),status));

          }




    }

    @Override
    public void onFetchFailed(ANError error) {

    }

    @Override
    public void WhichApi(String APINAME) {

    }
}
