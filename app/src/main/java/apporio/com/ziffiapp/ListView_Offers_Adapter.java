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
 * Created by apporio3 on 9/8/2016.
 */
public class ListView_Offers_Adapter extends BaseAdapter{
    Context context;
    ArrayList<String> name=new ArrayList<>();
    ArrayList<String> name_2=new ArrayList<>();

    ArrayList<Integer> icons=new ArrayList<>();

    LayoutInflater layoutInflater;


    public ListView_Offers_Adapter(Context context, ArrayList<String> name_type,ArrayList<String> name_type1,ArrayList<Integer> icon) {
        this.name=name_type;
        this.context=context;
        this.name_2=name_type1;
        this.icons=icon;
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return name.size();
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

            view = layoutInflater.inflate(R.layout.custome_layout_offerlist, null);
            appholder=new AppViewHolder();

            appholder.type= (TextView) view.findViewById(R.id.type);
            appholder.offre= (TextView) view.findViewById(R.id.offer);
            appholder.icon= (ImageView) view.findViewById(R.id.imageView_backgrnd);


            view.setTag(appholder);
        }

        else {appholder = (AppViewHolder) view.getTag();}

        appholder.type.setText(name.get(i));
        appholder.offre.setText(name_2.get(i));
        appholder.icon.setImageResource(icons.get(i));


        return view;
    }
}
