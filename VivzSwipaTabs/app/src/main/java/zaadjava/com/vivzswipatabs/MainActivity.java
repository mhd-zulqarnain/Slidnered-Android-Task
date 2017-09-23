package zaadjava.com.vivzswipatabs;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends FragmentActivity {
    android.app.ActionBar actionbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actionbar= getActionBar();
        actionbar.setNavigationMode(android.app.ActionBar.NAVIGATION_MODE_TABS);



    }
}
