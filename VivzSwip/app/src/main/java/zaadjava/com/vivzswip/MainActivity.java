package zaadjava.com.vivzswip;

import android.app.FragmentTransaction;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NotificationCompat;
import android.support.v4.view.ViewPager;
import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends FragmentActivity implements android.app.ActionBar.TabListener {
    ViewPager pager;
   ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab1= actionBar.newTab();
       /* tab1.setText("Tab1");
        tab1.setTabListener(this);*/

        /*android.app.ActionBar.Tab tab2 = actionBar.newTab();
        tab2.setText("Tab2");
        tab2.setTabListener(this);


        android.app.ActionBar.Tab tab3 = actionBar.newTab();
        tab3.setText("Tab3");
        tab3.setTabListener(this);

        actionBar.addTab(tab1);
        actionBar.addTab(tab2);
        actionBar.addTab(tab3);
*/




    }

    @Override
    public void onTabSelected(android.app.ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        Log.d("Tab","Tabselected"+tab.getPosition()+" name "+ tab.getText());
    }

    @Override
    public void onTabUnselected(android.app.ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

            Log.d("TAB","Tab unselected "+tab.getPosition()+" named "+tab.getText());
    }

    @Override
    public void onTabReselected(android.app.ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        Log.d("TAB","Tab REselected "+tab.getPosition()+" named "+tab.getText());

    }
}
