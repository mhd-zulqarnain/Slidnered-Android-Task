package zaadjava.com.toggletest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity  {
    RelativeLayout relativeLayout;
    ToggleButton toggleButton;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relativeLayout=(RelativeLayout)findViewById(R.id.activity_main);
        toggleButton=(ToggleButton)findViewById(R.id.toggleButton);
        textView=(TextView) findViewById(R.id.textview);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b){
                    relativeLayout.setBackgroundColor(Color.BLACK);
                    textView.setTextColor(Color.WHITE);
                }else {
                    relativeLayout.setBackgroundColor(Color.WHITE);
                    textView.setTextColor(Color.BLACK);
                }
            }

        });
    }
}
