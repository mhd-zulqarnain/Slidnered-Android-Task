package zaadjava.com.vzzsharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {
    EditText eUname, ePass;
    final static String DEFAULT = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        eUname = (EditText) findViewById(R.id.tUname);
        ePass = (EditText) findViewById(R.id.tPassword);
    }

    public void load(View v) {
        SharedPreferences sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        String name = sharedPreferences.getString("name", DEFAULT);
        String pass = sharedPreferences.getString("pass", DEFAULT);

        if (name.equals(DEFAULT) || pass.equals(DEFAULT)){
            eUname.setText(name);
            ePass.setText(pass);
            Toast.makeText(this,"data"+name,Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this,"No data found",Toast.LENGTH_SHORT).show();
    }

}
