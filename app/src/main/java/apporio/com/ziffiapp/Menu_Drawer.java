//package apporio.com.ziffiapp;
//
//import android.os.Bundle;
//import br.liveo.interfaces.OnItemClickListener;
//import br.liveo.model.HelpLiveo;
//import br.liveo.navigationliveo.NavigationLiveo;
//
///**
// * Created by apporio3 on 9/5/2016.
// */
//public class Menu_Drawer  extends NavigationLiveo implements OnItemClickListener {
//    private HelpLiveo mHelpLiveo;
//
//    @Override
//    public void onInt(Bundle savedInstanceState) {
//        // User Information
//        this.userName.setText("Rudson Lima");
//        this.userEmail.setText("rudsonlive@gmail.com");
//        this.userPhoto.setImageResource(R.drawable.ic_rudsonlive);
//        this.userBackground.setImageResource(R.drawable.ic_user_background_first);
//
//
//        // Creating items navigation
//        mHelpLiveo = new HelpLiveo();
//
//        mHelpLiveo.add(getString(R.string.home), R.drawable.home_icon, 7);
//        mHelpLiveo.addSubHeader(getString(R.string.myaccount)); //Item subHeader
//        mHelpLiveo.add(getString(R.string.offers), R.drawable.ic_star_black_24dp);
//        mHelpLiveo.add(getString(R.string.MyBookings), R.drawable.ic_send_black_24dp);
//        mHelpLiveo.add(getString(R.string.Refer), R.drawable.ic_drafts_black_24dp);
//        mHelpLiveo.add(getString(R.string.Notifications), R.drawable.ic_delete_black_24dp);
//        mHelpLiveo.add(getString(R.string.HelpCenter), R.drawable.ic_report_black_24dp, 120);
//        mHelpLiveo.add(getString(R.string.Logout), R.drawable.ic_report_black_24dp, 120);
//
//
//        mHelpLiveo.addSeparator(); // Item separator
//
//
//        with(this) // default theme is dark
//                .startingPosition(2) //Starting position in the list
//                .addAllHelpItem(mHelpLiveo.getHelp())
//                .footerItem(R.string.settings, R.drawable.ic_settings_black_24dp)
//                .setOnClickUser(onClickPhoto)
//                .setOnPrepareOptionsMenu(onPrepare)
//                .setOnClickFooter(onClickFooter)
//                .build();
//
//    }
//
//    @Override
//    public void onItemClick(int position) {
//
//    }
//}
