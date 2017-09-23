package zaadjava.com.fragmentintercom;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by zulup on 6/14/2017.
 */

public class FragmentA extends Fragment implements View.OnClickListener{
    Communicator communicator;
    Button button;
    int counter=0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        if(savedInstanceState!=null)
            counter=savedInstanceState.getInt("counter",0);

        return inflater.inflate(R.layout.fragment_layout_a,container,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        communicator= (Communicator) getActivity();
        button= (Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter",counter);
    }

    @Override
    public void onClick(View view) {
        counter+=1;
        communicator.respond("The incremented value become "+counter);

    }
}
