package apporio.com.ziffiapp.Api_Manage;

/**
 * Created by apporio3 on 9/16/2016.
 */
public class Constants_api {

    public static String userImageUrl="";

    public static final String Category_urls = "http://apporio.in/salon-appointment-booking/api/category.php?parent_id=0";
    public static String Subcatagory_urls="http://apporio.in/salon-appointment-booking/api/product.php?allproduct=";


    public static String Products_urls="http://apporio.in/salon-appointment-booking/api/product.php?category_id=";
 //   View Store:
   public static String View_sotore_urls =" http://apporio.in/salon-appointment-booking/api/view_store.php";
//login response
    public static final String login_urls = "";

    //login response
    public static final String Signup_urls = "";



    public static String validemail= "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" + "\\@" +
            "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" + "(" + "\\." + "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
            ")+";

}
