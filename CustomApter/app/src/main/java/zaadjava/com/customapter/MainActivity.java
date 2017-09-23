package zaadjava.com.customapter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //**1st step define the data source
    String memeTitle[];
    ListView list;
    String memeDescription[];
    int memeImages[]={R.drawable.meme1,R.drawable.meme2,R.drawable.meme3,R.drawable.meme4,R.drawable.meme4,R.drawable.meme5,R.drawable.meme6,R.drawable.meme7,R.drawable.meme8,R.drawable.meme9,R.drawable.meme10,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //*intialize array using string resources
        Resources rcs = getResources();
        memeTitle=rcs.getStringArray(R.array.title);
        memeDescription=rcs.getStringArray(R.array.description);

        list=(ListView)findViewById(R.id.listView);

        //******Last step is to initialize the apadter and add it to the listview
        AxeAdapter adapter = new AxeAdapter(this,memeTitle,memeDescription,memeImages);
        list.setAdapter(adapter);

    }
}
//*****2nd step defeine the adapter
class AxeAdapter extends ArrayAdapter{
    Context context;
    String titles[];
    String description[];
    int images[];
    public AxeAdapter(Context c,String title[],String description[],int images[]) {
        super(c, R.layout.single_row, R.id.mytitle,title);
//        super(c,0,title); can also be used
        this.context=c;
        this.images=images;
        this.description=description;
        this.titles=title;
    }
   //****Get view to set the indiviual layout of items Listview
    @Override
    public View getView(int position, View ConvertView, ViewGroup parent){ ///position starts from zero,one and goes on, parent would be the layout we want to display all elements
       View row=ConvertView;      //to optimize we inflate the item only first else we recycle the view using converterView
        if(row==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            //**View of which we want to convert to java view object
             row = inflater.inflate(R.layout.single_row, parent, false);
        }
        //*****From row view we can access the view items and populate it data
        ImageView imageView = (ImageView)row.findViewById(R.id.imageView);
        TextView myDiscription=(TextView)row.findViewById(R.id.myDescription);
        TextView myTitle=(TextView)row.findViewById(R.id.mytitle);

        imageView.setImageResource(images[position]);           //postion will incremented automaticlly as views will populate
        myDiscription.setText(description[position]);
        myTitle.setText(titles[position]);

        return row;
    }
}

