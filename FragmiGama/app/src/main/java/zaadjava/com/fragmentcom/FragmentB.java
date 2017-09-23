package zaadjava.com.fragmentcom;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by zulup on 6/13/2017.
 */

public class FragmentB extends Fragment {
    TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.my_fragment_b,container,false);
        textView= (TextView) v.findViewById(R.id.textView);
        return v;
    }

    //***********to ensure that the main  activity done its tasks
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }
    public void changeText(int i){
        Resources rsc=getResources();
        String[] description= rsc.getStringArray(R.array.description);
        textView.setText(description[i]);
    }

}
