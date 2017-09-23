package zaadjava.com.listusingbaseadapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by zulup on 6/9/2017.
 */

public class CustomAdapter extends BaseAdapter {

    ArrayList<SingleRow> list;
    Context context;
    CustomAdapter(Context c){
        list= new ArrayList<SingleRow>();
        this.context=c;
        Resources res=c.getResources();
        String[] mytitle=res.getStringArray(R.array.title);
        String[] mydescription = res.getStringArray(R.array.description);
        int mymages[] = {R.drawable.meme1, R.drawable.meme2, R.drawable.meme3, R.drawable.meme4, R.drawable.meme4, R.drawable.meme5, R.drawable.meme6, R.drawable.meme7, R.drawable.meme8, R.drawable.meme9, R.drawable.meme10,};

        for (int i=0;i<10;i++){
            list.add(new SingleRow(mytitle[i],mydescription[i],mymages[i]));
        }
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.single_row,viewGroup,false);

        TextView title= (TextView) row.findViewById(R.id.mytitle);
        TextView description= (TextView) row.findViewById(R.id.mydesription);
        ImageView image=(ImageView)row.findViewById(R.id.imageView);

        SingleRow singleRow=(SingleRow)list.get(i);

        title.setText(singleRow.mytitle);
        description.setText(singleRow.mydescription);
        image.setImageResource(singleRow.myimage);
        return row;
    }
}
