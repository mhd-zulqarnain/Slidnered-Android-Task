package zaadjava.com.gridview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by zulup on 6/10/2017.
 */

public class ViewHolder {
    ImageView myImage;
    ViewHolder(View v){
         this.myImage=(ImageView)v.findViewById(R.id.imageView);

    }

}
