package zaadjava.com.gridview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DialogActivity extends AppCompatActivity {

    ImageView flagImage;
    TextView flagName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        Intent intent=getIntent();
        flagImage= (ImageView) findViewById(R.id.imageView2);
        flagName= (TextView) findViewById(R.id.countryName);
        if(intent!=null){
            int imgid=intent.getIntExtra("countryImage",R.drawable.pk);
            String countryName=intent.getStringExtra("countryName");
            flagName.setText("This Flag belong to "+countryName);
            flagImage.setImageResource(imgid);
        }
    }
    public void closeDialog(View v){
        finish();
    }
}
