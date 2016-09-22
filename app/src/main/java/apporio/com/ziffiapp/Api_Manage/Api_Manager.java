package apporio.com.ziffiapp.Api_Manage;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.AnalyticsListener;
import com.androidnetworking.interfaces.JSONObjectRequestListener;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

import android.util.Log;


/**
 * Created by apporio3 on 9/16/2016.
 */
public class Api_Manager {

    APIFETCHER apifetcher;
    public static String API_NAME="";
    public static String sub_catname;
    public static  String Prouctid_name;
    public static  String ViewStore;
    public static  String login_apiname;
    public static  String sinup_apiname;




    public Api_Manager(APIFETCHER apifetcher) {

        this.apifetcher = apifetcher;
    }



    //get category  api
    public void getCategoryList_Response() {

        API_NAME = Constants_api.Category_urls;

        apifetcher.onAPIRunningState(APIFETCHER.KEY_API_IS_STARTED);
        apifetcher.WhichApi("" + API_NAME);

        AndroidNetworking.post("" + Constants_api.Category_urls)
                .setTag(this)
                .setPriority(Priority.LOW)
                .build()
                .setAnalyticsListener(new AnalyticsListener() {
                    @Override
                    public void onReceived(long timeTakenInMillis, long bytesSent, long bytesReceived, boolean isFromCache) {
                    }
                }).getAsJSONObject(new JSONObjectRequestListener() {
            @Override
            public void onResponse(JSONObject response) {
                apifetcher.onAPIRunningState(APIFETCHER.KEY_API_IS_STARTED);
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                Category_setergeterResultcheck catResulCeck;
                catResulCeck = gson.fromJson(""+ response, Category_setergeterResultcheck.class);

                if (catResulCeck.status.equals("true")) {

                    Category_ser_getter responseBean = gson.fromJson( ""+response, Category_ser_getter.class);
                    apifetcher.onFetchComplete(responseBean , ""+API_NAME);

            }}

            @Override
            public void onError(ANError anError) {
                apifetcher.onAPIRunningState(APIFETCHER.KEY_API_IS_ERRORED);

            }
        });
    }


    //View Store method

    public void getViewStore() {

        ViewStore = Constants_api.View_sotore_urls;

        apifetcher.onAPIRunningState(APIFETCHER.KEY_API_IS_STARTED);
        apifetcher.WhichApi("" + ViewStore);

        AndroidNetworking.post("" + Constants_api.View_sotore_urls)
                .setTag(this)
                .setPriority(Priority.LOW)
                .build()
                .setAnalyticsListener(new AnalyticsListener() {
                    @Override
                    public void onReceived(long timeTakenInMillis, long bytesSent, long bytesReceived, boolean isFromCache) {
                    }
                }).getAsJSONObject(new JSONObjectRequestListener() {
            @Override
            public void onResponse(JSONObject response) {
apifetcher.onAPIRunningState(APIFETCHER.KEY_API_IS_STOPPED);
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                ViewStore_resultcheck viewStore_resultcheck;
                viewStore_resultcheck = gson.fromJson(""+ response, ViewStore_resultcheck.class);

                if (viewStore_resultcheck.result.equals("1")) {

                    ViewStrore_settergetter responseBean = gson.fromJson( ""+response, ViewStrore_settergetter.class);
                    apifetcher.onFetchComplete(responseBean , ""+ViewStore);

                }}

            @Override
            public void onError(ANError anError) {
                apifetcher.onAPIRunningState(APIFETCHER.KEY_API_IS_ERRORED);

            }
        });
    }




    //getting subcategory_allproducts
    public void getSubCategoryList_Response(String parentcatid) {

        sub_catname = Constants_api.Subcatagory_urls+parentcatid;


        apifetcher.onAPIRunningState(APIFETCHER.KEY_API_IS_STARTED);
        apifetcher.WhichApi("" + sub_catname);

        AndroidNetworking.post("" + Constants_api.Subcatagory_urls+parentcatid)
                .setTag(this)
                .setPriority(Priority.LOW)
                .build()
                .setAnalyticsListener(new AnalyticsListener() {
                    @Override
                    public void onReceived(long timeTakenInMillis, long bytesSent, long bytesReceived, boolean isFromCache) {

                    }
                }).getAsJSONObject(new JSONObjectRequestListener() {
            @Override
            public void onResponse(JSONObject response) {

                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                AllProduct_Setter_getter_resultcheck subcatResulCeck;
                subcatResulCeck = gson.fromJson("" + response, AllProduct_Setter_getter_resultcheck.class);

                if (subcatResulCeck.result.equals("1")) {
                    AllProduct_setter_geter responseBean1 = gson.fromJson("" + response, AllProduct_setter_geter.class);

                    apifetcher.onFetchComplete(responseBean1 , ""+sub_catname);
                }
            }

            @Override
            public void onError(ANError anError) {

            }
        });


    }

    //getting productlist
    public void getProductList_Response(String sub_catid) {

        Prouctid_name = Constants_api.Products_urls;


        apifetcher.onAPIRunningState(APIFETCHER.KEY_API_IS_STARTED);
        apifetcher.WhichApi("" + Prouctid_name);

        AndroidNetworking.post("" + Constants_api.Products_urls+sub_catid)
                .setTag(this)
                .setPriority(Priority.LOW)
                .build()
                .setAnalyticsListener(new AnalyticsListener() {
                    @Override
                    public void onReceived(long timeTakenInMillis, long bytesSent, long bytesReceived, boolean isFromCache) {

                    }
                }).getAsJSONObject(new JSONObjectRequestListener() {
            @Override
            public void onResponse(JSONObject response) {

                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                Productlist_resulcheck prodcttcatResulCeck;
                prodcttcatResulCeck = gson.fromJson("" + response, Productlist_resulcheck.class);

                if (prodcttcatResulCeck.result.equals("1")) {
                    ProductList_settergetter responseBean2 = gson.fromJson("" + response, ProductList_settergetter.class);

                    apifetcher.onFetchComplete(responseBean2, ""+Prouctid_name);
                }
            }

            @Override
            public void onError(ANError anError) {

            }
        });


    }


    //login response

    public void getLoginUpResponse(String trim, String trim1) {

        login_apiname = Constants_api.login_urls;

        apifetcher.onAPIRunningState(APIFETCHER.KEY_API_IS_STARTED);
        apifetcher.WhichApi("" + login_apiname);

        AndroidNetworking.post("" + Constants_api.login_urls)
                .setTag(this)
                .setPriority(Priority.LOW)
                .build()
                .setAnalyticsListener(new AnalyticsListener() {
                    @Override
                    public void onReceived(long timeTakenInMillis, long bytesSent, long bytesReceived, boolean isFromCache) {
                    }
                })
                .getAsJSONObject(new JSONObjectRequestListener() {
            @Override
            public void onResponse(JSONObject response) {

                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
              //  Category_setergeterResultcheck catResulCeck;
               // catResulCeck = gson.fromJson(""+ response, Category_setergeterResultcheck.class);

               // if (catResulCeck.status.equals("true")) {

//                    Category_ser_getter responseBean = gson.fromJson( ""+response, Category_ser_getter.class);
//                    apifetcher.onFetchComplete(responseBean , ""+API_NAME);

            //   }
                }

            @Override
            public void onError(ANError anError) {
                apifetcher.onAPIRunningState(APIFETCHER.KEY_API_IS_ERRORED);

            }
        });
    }


    //signup response
    public void getSignUpResponse(String trim, String trim1, String trim2, String trim3) {
    }


    public interface APIFETCHER {

        public  static int KEY_API_IS_STARTED = 0 ;
        public  static int KEY_API_IS_RUNNING = 1 ;
        public  static int KEY_API_IS_STOPPED = 2 ;
        public  static int KEY_API_IS_ERRORED = 3 ;

        void onAPIRunningState(int a);  // state - API Starts(0) , API Running(1) , API Stops(2)  API Error(3)
        void onFetchProgress(int progress);  // This Will useful when downloading file
        void onFetchComplete(Object script, String APINAME); // This will give the full script
        void onFetchFailed(ANError error);  // This will give the cause of error if occurred
        void WhichApi(String APINAME);
    }
}