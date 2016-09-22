package apporio.com.ziffiapp;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;

/**
 * Created by apporio3 on 9/3/2016.
 */
public class MyAdapter extends BaseAdapter implements StickyListHeadersAdapter{
    Context contex;
   ArrayList<String> name=new ArrayList<>();
    ArrayList<String> contry=new ArrayList<>();

    private LayoutInflater inflater;


    public MyAdapter(Context ctx,ArrayList<String> name,ArrayList<String> country) {
        this.contex=ctx;
        this.name=name;
        this.contry=country;
        this.inflater=LayoutInflater.from(contex);
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

    private  static class AppHolder{
        TextView name,price;
        ImageView icons;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final AppHolder appholder;

        if (view==null) {

            view = inflater.inflate(R.layout.custome_layout_, null);
            appholder=new AppHolder();

           // appholder.name= (TextView) view.findViewById(R.id.pl_name_tv);
//            appholder.price= (TextView) view.findViewById(R.id.lv_price);
//            appholder.icons= (ImageView) view.findViewById(R.id.pl_icon);


            view.setTag(appholder);
        }

        else {appholder = (AppHolder) view.getTag();}

     //   appholder.name.setText(name_al.get(i));
//        appholder.price.setText(price.get(i));
//        appholder.icons.setImageResource(icons.get(i));



        return null;
    }

    @Override
    public View getHeaderView(int position, View convertView, ViewGroup parent) {

        HeaderViewHolder holder;
        if (convertView == null) {
            holder = new HeaderViewHolder();
           // convertView = inflater.inflate(R.layout.header, parent, false);
            holder.text = (TextView) convertView.findViewById(R.id.text);
            convertView.setTag(holder);
        } else {
            holder = (HeaderViewHolder) convertView.getTag();
        }
        //set header text as first char in name
      //  String headerText = "" + countries[position].subSequence(0, 1).charAt(0);
      //  holder.text.setText(headerText);
        return convertView;
    }

    @Override
    public long getHeaderId(int position) {
        return position;
    }
}


class HeaderViewHolder {
    TextView text;
}