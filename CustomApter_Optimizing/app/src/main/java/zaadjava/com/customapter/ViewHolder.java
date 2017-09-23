package zaadjava.com.customapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by zulup on 6/9/2017.
 */

public class ViewHolder {
    ImageView myImage;
    TextView myTitle;
    TextView myDescription;

    ViewHolder(View v){
        myImage= (ImageView) v.findViewById(R.id.imageView);
        myDescription= (TextView) v.findViewById(R.id.myDescription);
        myTitle= (TextView) v.findViewById(R.id.mytitle);

    }
}
