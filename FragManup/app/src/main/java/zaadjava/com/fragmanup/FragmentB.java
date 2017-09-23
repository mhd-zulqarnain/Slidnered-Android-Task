package zaadjava.com.fragmanup;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zulup on 6/19/2017.
 */

public class FragmentB extends Fragment {
    private  final static String TAG = "Statment";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG,"Fragment B added");
        return inflater.inflate(R.layout.fragment_layout_b,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG,"Fragment b ActivityCreated");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG,"Fragment B pause");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG,"Fragment B resume");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG,"Fragment B stop");

    }
}
