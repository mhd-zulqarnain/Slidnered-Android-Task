package zaadjava.com.fragementuitest;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 *Step 1: Create the class extends fragemt
 *Step 2: Create the layout
 * Step 3:	Use inflator to link the layout in onCreate method
 * Attach it with main activity (using xml or java)
 */

public class MyFragment extends Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_fragement_layout,container,false);
    }
}
