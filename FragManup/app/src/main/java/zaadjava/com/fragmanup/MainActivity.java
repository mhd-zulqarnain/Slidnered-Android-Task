package zaadjava.com.fragmanup;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FragmentManager manager;
    FragmentA fragmentA;
    FragmentB fragmentB;
    FragmentTransaction transaction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getFragmentManager();
        fragmentA=new FragmentA();
        fragmentB=new FragmentB();
        transaction= manager.beginTransaction();
    }
    public void addA(View v){

        FragmentTransaction transaction= manager.beginTransaction();
        transaction.add(R.id.group,fragmentA,"A");
        transaction.commit();
    }
    public void addB(View v){

        FragmentTransaction transaction= manager.beginTransaction();
        transaction.add(R.id.group,fragmentB,"B");
        transaction.commit();
    }
    public void removeA(View v){
        FragmentA f1= (FragmentA) manager.findFragmentByTag("A");

        if(f1 != null){
            transaction.remove(f1);
            transaction.commit();
        }
        else
            Toast.makeText(this," Fragemnt is not added yet",Toast.LENGTH_LONG).show();
    }
    public void attachA(View v){
        FragmentA fragmentA= (FragmentA) manager.findFragmentByTag("A");
        FragmentTransaction transition = manager.beginTransaction();
        if(fragmentA!=null){
            transition.attach(fragmentA);
            transition.commit();
        }
        else
            Toast.makeText(this,"no fragement here to attach",Toast.LENGTH_LONG).show();
    }
}
