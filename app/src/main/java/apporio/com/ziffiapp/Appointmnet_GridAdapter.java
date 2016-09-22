package apporio.com.ziffiapp;

import java.util.LinkedList;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by apporio3 on 9/12/2016.
 */
public class Appointmnet_GridAdapter extends BaseAdapter{
    String time[]={"08:00","10:00","11:00","12:00","01:00","02:00","03:00","04:00","05:00","6:00","07:00","09:00"};
    Context context;
    LayoutInflater layoutInflater;
  public static   TextView  time_slot;
    LinearLayout linearLayout_backtime;



    public Appointmnet_GridAdapter(Context context) {
    this.context=context;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }



    @Override
    public int getCount() {
        return time.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View MyView ;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        MyView = layoutInflater.inflate(R.layout.appointment_time_griditem_cusomelayout, viewGroup, false);

        time_slot = (TextView) MyView.findViewById(R.id.gridtime_cstm_textview);
        linearLayout_backtime= (LinearLayout) MyView.findViewById(R.id.backgrnd_layout);

        time_slot.setText(""+time[i]);

        if (i==Appointment_Time_viewAdapter_fragment.mSelectedItem)

        {
linearLayout_backtime.setBackgroundResource(R.drawable.ovelshape1);
time_slot.setTextColor(Color.WHITE);
        }

        return MyView;
    }
}
