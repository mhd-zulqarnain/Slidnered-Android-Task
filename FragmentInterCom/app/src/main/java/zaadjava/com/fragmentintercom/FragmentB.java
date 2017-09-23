package zaadjava.com.fragmentintercom;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by zulup on 6/14/2017.
 */

public class FragmentB extends Fragment {

    TextView textView;
    String data;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View v=inflater.inflate(R.layout.fragment_layout_b,container,false);
        if (savedInstanceState!=null){
            data=savedInstanceState.getString("text");
            TextView mytextView= (TextView) v.findViewById(R.id.textView);
            mytextView.setText(data);
        }
        return v;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        textView= (TextView) getActivity().findViewById(R.id.textView);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("text",data);
    }

    public void changeText(String s){
        this.data=s;
            textView.setText(data);
    }
}
