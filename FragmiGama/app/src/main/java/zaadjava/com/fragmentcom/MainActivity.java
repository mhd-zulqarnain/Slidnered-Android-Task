package zaadjava.com.fragmentcom;

import android.app.Fragment;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentA.Communicator {

    FragmentA fragmentA;
    android.app.FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getFragmentManager();
        fragmentA = (FragmentA) manager.findFragmentById(R.id.fragment);
        fragmentA.setCommunicator(this);
    }

    @Override
    public void respond(int i) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentById(R.id.fragment2);

        if (fragmentB != null && fragmentB.isVisible()) {
            fragmentB.changeText(i);
        } else {
            Intent intent = new Intent(this, AnotherActivity.class);
            intent.putExtra("index", i);
            startActivity(intent);

        }

    }
}
