package apporio.com.ziffiapp;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Appointment_Time_viewAdapter_fragment extends Fragment {
GridView gridView;
    Appointmnet_GridAdapter pgeradapter;
    public static int mSelectedItem=0;
   // TextView textView =Appointmnet_GridAdapter.time_slot;
TextView textView1;
    public Appointment_Time_viewAdapter_fragment() {
        // Required empty public constructor
    }




    public static Fragment newInstance(Context context, String s) {
        Appointment_Time_viewAdapter_fragment fragmentFirst = new Appointment_Time_viewAdapter_fragment();
        Bundle args = new Bundle();

        //args.putString("someInt",catid);
        //args.putString("someTitle", catid);

        fragmentFirst.setArguments(args);
        return fragmentFirst;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.appointment_time_cusomelayout, container, false);
        gridView= (GridView) view.findViewById(R.id.appointment_gridView);

         pgeradapter=new Appointmnet_GridAdapter(getActivity());

        gridView.setAdapter(pgeradapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                // Get the selected item text


                //String selectedItem = adapterView.getItemAtPosition(i).toString();

           //Log.e("xc",""+selectedItem);
                mSelectedItem = i;

                pgeradapter.notifyDataSetChanged();
//                Toast.makeText(getContext(), "" + i, Toast.LENGTH_SHORT).show();
//                Log.e("czczac",""+selectedItem);
//
//                view.setBackgroundResource(R.drawable.ovelshape1);
//
//                // Get the current selected view as a TextView
//              TextView  textView1 = (TextView) view;
////
//                // Set the current selected item background color
//                textView1.setBackgroundColor(Color.parseColor("#FF9AD082"));
////
//              //   Display the selected item text to app interface
//                textView1 .setText("Selected item : " + selectedItem);
//
//                // Set the current selected item text color
//                textView1.setTextColor(Color.BLUE);
            }
        });

        gridView.deferNotifyDataSetChanged();

        return view;  }


}
