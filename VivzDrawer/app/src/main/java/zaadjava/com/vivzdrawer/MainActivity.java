package zaadjava.com.vivzdrawer;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    DrawerLayout drawerLayout;
    ListView listView;

    String days[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        days = getResources().getStringArray(R.array.days);
        listView = (ListView) findViewById(R.id.list);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        ArrayAdapter <String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,days);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
    {
        Toast.makeText(this,days[i]+" was selected",Toast.LENGTH_SHORT).show();
        selectItem(i);
    }

    public void selectItem(int position){
        listView.setItemChecked(position,true);
        setTitle(days[position]);
    }

    public void setTitle(String name){
        getSupportActionBar().setTitle(name);
    }
}
