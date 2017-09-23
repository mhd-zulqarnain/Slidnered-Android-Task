package zaadjava.com.gridview;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by zulup on 6/10/2017.
 */

public class CustomAdapter extends BaseAdapter {

    ArrayList<SingleView> list;
    Context context;
    CustomAdapter(Context context){
        this.context=context;
        list=new ArrayList<SingleView>();
        Resources rsc=context.getResources();
        String[] imageName=rsc.getStringArray(R.array.flag_name);
        int[] flagImage={R.drawable.pk,R.drawable.ind,R.drawable.bg,R.drawable.sri,R.drawable.ir,R.drawable.ch};

        for(int i=0;i<6;i++){
            list.add(new SingleView(imageName[i],flagImage[i]));
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
        View row=view;
        ViewHolder holder;
        if(row==null){
            LayoutInflater inflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row= inflater.inflate(R.layout.single_row,viewGroup,false);
            holder= new ViewHolder(row);
            row.setTag(holder);
        }
        else {
            holder= (ViewHolder) row.getTag();
        }

        SingleView singleView=(SingleView)list.get(i);
        holder.myImage.setImageResource(singleView.myImage);
        holder.myImage.setTag(singleView);

        return row;
    }
}
