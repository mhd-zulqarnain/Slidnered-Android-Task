package zaadjava.com.layoutinflator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.zip.Inflater;

public class InflateViaParent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inflate_via_par);
        LayoutInflater inflater = getLayoutInflater();
//        View v= inflater.inflate(R.layout.activity_sublayout,L);
    }
}
