package zaadjava.com.fragmanup;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by zulup on 6/19/2017.
 */

public class FragmentA extends Fragment {
    private  final static String TAG = "Statment";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG,"Fragment A added");
        return inflater.inflate(R.layout.fragment_layout_a,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(TAG,"Fragment A ActivityCreated");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG,"Fragment A pause");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG,"Fragment A resume");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG,"Fragment A stop");

    }
}
