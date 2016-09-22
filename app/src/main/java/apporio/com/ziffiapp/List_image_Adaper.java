package apporio.com.ziffiapp;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by apporio3 on 9/6/2016.
 */
public class List_image_Adaper extends BaseAdapter{
    Context context;
    ArrayList<String> name_type;
    ArrayList<String> name_offer;
    ArrayList<Integer> icon;
    LayoutInflater layoutInflater;



    public List_image_Adaper(Context context, ArrayList<String> name_type, ArrayList<String> name_offer, ArrayList<Integer> icon) {
   this.context=context;
        this.name_type=name_type;
        this.name_offer=name_offer;
        this.icon=icon;
        this.layoutInflater=LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return name_offer.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    private  static  class AppViewHolder
    {
        TextView type,offre;
        ImageView icon;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
     final AppViewHolder appholder;

        if (view==null) {

            view = layoutInflater.inflate(R.layout.custome_layout_homelist, null);
            appholder=new AppViewHolder();

            appholder.type= (TextView) view.findViewById(R.id.type);
            appholder.offre= (TextView) view.findViewById(R.id.offer);
            appholder.icon= (ImageView) view.findViewById(R.id.imageView_backgrnd);


            view.setTag(appholder);
        }

        else {appholder = (AppViewHolder) view.getTag();}

        appholder.type.setText(name_type.get(i));
        appholder.offre.setText(name_offer.get(i));
        appholder.icon.setImageResource(icon.get(i));


        return view;
    }
}
