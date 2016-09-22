package apporio.com.ziffiapp;

import java.util.ArrayList;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Switch;

public class Happy_Hours extends AppCompatActivity {
    private Switch mySwitch;
    LinearLayout layou_back;
    ListView listView_offers;

    //default data
    ArrayList<String> name_type=new ArrayList<>();
    ArrayList<String> name_offer=new ArrayList<>();
    ArrayList<Integer> icon=new ArrayList<>();

    String name_default[]={"Happy Hours","Fabulous Deals","Best Salons for Hair Cut","Best Salons for Facials","Get a Relaxing Spa"};
    String price_default[]={"All Weak Long","Near You","This Manson","Near You","Rejuvenate Yourself"};
    int image_default[]={R.drawable.images0,R.drawable.images1,R.drawable.images,R.drawable.images3,R.drawable.images2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy__hours);

        //back
        layou_back= (LinearLayout) findViewById(R.id.backo_previous);
        layou_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Happy_Hours.this,Navigation_Activity.class);
                startActivity(intent);
            }
        });

//list set
        //list item
        for (int i=0;i<price_default.length;i++)
        {
            name_type.add(name_default[i]);
            name_offer.add(price_default[i]);
            icon.add(image_default[i]);
        }




        listView_offers= (ListView) findViewById(R.id.list_best_happyhours);
        ListView_Happyhours_Adapter listView_offers_adapter=new ListView_Happyhours_Adapter(this,name_type,name_offer,icon);
        listView_offers.setAdapter(listView_offers_adapter);

        setListViewHeightBasedOnItems(listView_offers);

    }


    //to set item heigh
    public static boolean setListViewHeightBasedOnItems(ListView listof_image_service) {

        ListAdapter listAdapter = listof_image_service.getAdapter();
        if (listAdapter != null) {

            int numberOfItems = listAdapter.getCount();

            // Get total height of all items.
            int totalItemsHeight = 0;
            for (int itemPos = 0; itemPos < numberOfItems; itemPos++) {
                View item = listAdapter.getView(itemPos, null, listof_image_service);
                float px = 500 * (listof_image_service.getResources().getDisplayMetrics().density);
                item.measure(View.MeasureSpec.makeMeasureSpec((int)px, View.MeasureSpec.AT_MOST), View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED));
                totalItemsHeight += item.getMeasuredHeight();
            }

            // Get total height of all item dividers.
            int totalDividersHeight = listof_image_service.getDividerHeight() *
                    (numberOfItems - 1);
            // Get padding
            int totalPadding = listof_image_service.getPaddingTop() + listof_image_service.getPaddingBottom();

            // Set list height.
            ViewGroup.LayoutParams params = listof_image_service.getLayoutParams();
            params.height = totalItemsHeight + totalDividersHeight + totalPadding;
            listof_image_service.setLayoutParams(params);
            listof_image_service.requestLayout();
            return true;


        }
        {
            return false;
        }
    }
}
