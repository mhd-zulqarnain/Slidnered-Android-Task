package zaadjava.com.gridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=(GridView)findViewById(R.id.gridView);
        CustomAdapter adapter= new CustomAdapter(this);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(this,DialogActivity.class);
        ViewHolder holder= (ViewHolder) view.getTag();
        SingleView temp= (SingleView) holder.myImage.getTag();     //tag can be set in any view object here we store in myImage that we retrive

        //**here we access the object attribute
        intent.putExtra("countryName",temp.imageName);
        intent.putExtra("countryImage",temp.myImage);

        startActivity(intent);
    }
}
