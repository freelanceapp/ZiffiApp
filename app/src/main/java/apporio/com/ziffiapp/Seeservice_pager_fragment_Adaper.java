package apporio.com.ziffiapp;

import com.androidnetworking.error.ANError;

import java.util.ArrayList;

import android.content.Context;

import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import apporio.com.ziffiapp.Api_Manage.AllProduct_setter_geter;
import apporio.com.ziffiapp.Api_Manage.Api_Manager;
import apporio.com.ziffiapp.Api_Manage.ProductList_settergetter;
import apporio.com.ziffiapp.Api_Manage.SubCatagory_settergetter;

/**
 * Created by apporio3 on 9/7/2016.
 */
public class Seeservice_pager_fragment_Adaper extends BaseAdapter{
    Context context;
    TextView Title;
    TextView price;

//    String my[] = {"12","23","53"};
//    String abc[] = {"mky","ygs","css"};


    boolean[] checkBoxState;
    public int checkAccumulator;
    final LayoutInflater layoutInflater;
    AllProduct_setter_geter subcatdata;


    public Seeservice_pager_fragment_Adaper(Context context, AllProduct_setter_geter subcatdata) {
        this.context = context;
        this.subcatdata=subcatdata;
        this.layoutInflater = LayoutInflater.from(context);

      // checkBoxState=new boolean[subcatdata.getDetails().size()];

    }

    @Override
    public int getCount() {
        return subcatdata.getData().size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }



    public static class AppViewHolder {
        public TextView textView;
       public LinearLayout linearLayout1;


    }


    @Override
    public View getView(final int position, View convertView, ViewGroup viewGroup) {

        final AppViewHolder holder;

        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.seeservice_custome_layout, null);
            holder = new AppViewHolder();

            holder.textView = (TextView) convertView.findViewById(R.id.lis_main_tv);
            holder.linearLayout1 = (LinearLayout) convertView.findViewById(R.id.addviewlayout);

            // doaddview(holder.linearLayout1,subcatdata.getData().get(position).getName().length());

       //
            convertView.setTag(holder);

        } else {
            holder = (AppViewHolder) convertView.getTag();


        }

        holder.textView.setText(subcatdata.getData().get(position).getName());

        return convertView;
    }



    private void doaddview(LinearLayout addviewLayout) {
        for (int i=0;i<subcatdata.getData().size();i++) {
            addviewLayout.addView(HorizontalList(R.layout.viewpager_cardview_custome_layout,subcatdata));

        //    Title.setText(product_data.getData().get(i).getName());
           // price.setText(""+prname);
}}

    public  View HorizontalList(final int layout_name,AllProduct_setter_geter product_data1) {
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View addView = layoutInflater.inflate(layout_name, null);

     //Log.e("mas",""+position);
        Title=(TextView)addView.findViewById(R.id.mainidmy);
         price=(TextView)addView.findViewById(R.id.price_rp);
      //  CheckBox checkBox= (CheckBox) addView.findViewById(R.id.checkBox_check);
//        final SparseBooleanArray mChecked = new SparseBooleanArray();


        CompoundButton.OnCheckedChangeListener checkListener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                countCheck(isChecked);


                if (isChecked)

                {
                    //mChecked.put(context.position,isChecked);
                }
                Log.e("MAIN", buttonView.getTag() +""+isChecked+ "");

                // Get the position that set for the checkbox using setTag.
             //   int getPosition = (Integer) buttonView.getTag();
               // Log.e("MN", getPosition + "");

                // Set the value of checkbox to maintain its state.
               // list.get(getPosition).setCheck(buttonView.isChecked());

            }
        };

       // checkBox.setOnCheckedChangeListener(checkListener);




        return addView ;
    }

    private void countCheck(boolean isChecked) {

        checkAccumulator += isChecked ? 1 : -1 ;
See_Service.selectditem.setText(checkAccumulator+"");

    }



}