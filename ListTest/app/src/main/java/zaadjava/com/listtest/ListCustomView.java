package zaadjava.com.listtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

//******This activity gonna show how to make custom apparence for the adapterView
public class ListCustomView extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView l;
    String[] days={"Sunday","Monday","Tuesday","Wednesday","Thuresday","Friday","Saturday"}; //2.then  define data source here we are using arrayAapter
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_custom_view);
        l=(ListView)findViewById(R.id.myListView);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,R.layout.single_row,R.id.textView,days);  //attach the custom layout and the view where the data source should display
        l.setAdapter(adapter);
        //l.setOnItemClickListener(this);


    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        TextView textView=(TextView)view;
        Toast.makeText(this,textView.getText(),Toast.LENGTH_SHORT).show();
    }
}
