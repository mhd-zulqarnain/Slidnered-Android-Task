package zaadjava.com.vivzdialogue;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyDialog.Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void showDialog(View v){
        MyDialog dialog = new MyDialog();
        FragmentManager manager= getFragmentManager();
        dialog.show(manager,"A");
    }

    @Override
    public void respond(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}
