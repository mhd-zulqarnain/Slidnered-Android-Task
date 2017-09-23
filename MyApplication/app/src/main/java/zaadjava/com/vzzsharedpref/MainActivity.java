package zaadjava.com.vzzsharedpref;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText eUname,ePass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eUname = (EditText) findViewById(R.id.tUname);
        ePass = (EditText) findViewById(R.id.tPassword);
    }
    public void save(View v){
        SharedPreferences sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("name",eUname.getText().toString());
        editor.putString("pass",ePass.getText().toString());
        editor.commit();
    }
    public void nextActivity(View v){
        Intent intent  = new Intent(this , ActivityB.class);
        startActivity(intent);

    }

}
