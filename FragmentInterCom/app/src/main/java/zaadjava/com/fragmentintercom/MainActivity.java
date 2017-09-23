package zaadjava.com.fragmentintercom;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity  implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void respond(String string) {
        android.app.FragmentManager fm=getFragmentManager();

        FragmentB fragmentb= (FragmentB) fm.findFragmentById(R.id.fragment3);
        fragmentb.changeText(string);

    }
}
