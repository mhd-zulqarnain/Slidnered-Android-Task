package zaadjava.com.listtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;  //1st step define ListView
    String[] days={"Sunday","Monday","Tuesday","Wednesday","Thuresday","Friday","Saturday"}; //2.then  define data source here we are using arrayAapter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        listView=(ListView)findViewById(R.id.listview);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,days);//3.define what will be the view of single item and the data to view
        listView.setAdapter(adapter);      //4.set adapter in the list view
        listView.setOnItemClickListener(this);   //5.action on clicking the list items

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) { //i--index, l--id generated for item,view--the item(here textview)
        TextView textView=(TextView)view;
        Toast.makeText(this,textView.getText()+" "+i,Toast.LENGTH_SHORT).show();
    }
}
