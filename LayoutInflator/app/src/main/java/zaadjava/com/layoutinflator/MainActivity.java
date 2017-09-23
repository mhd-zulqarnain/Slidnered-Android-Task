package zaadjava.com.layoutinflator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LayoutInflater i= getLayoutInflater();
        View v=i.inflate(R.layout.activity_sublayout,null);
        RelativeLayout r= (RelativeLayout)findViewById(R.id.activity_main);
        LinearLayout L=(LinearLayout)findViewById(R.id.linearlayout);
        L.addView(v);
    }
}
