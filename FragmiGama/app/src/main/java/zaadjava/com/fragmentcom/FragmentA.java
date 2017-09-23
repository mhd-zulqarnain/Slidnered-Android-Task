package zaadjava.com.fragmentcom;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

/**
 * Created by zulup on 6/13/2017.
 */

public class FragmentA extends Fragment implements AdapterView.OnItemClickListener{
    ListView listView;
    int counter;
    Communicator communicator;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        listView= (ListView) getActivity().findViewById(R.id.listView);
        ArrayAdapter adapter= ArrayAdapter.createFromResource(getActivity(),R.array.title,android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        communicator= (Communicator) getActivity();
        listView.setOnItemClickListener(this);

    }
    public void setCommunicator(Communicator communicator){
        this.communicator=communicator;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        communicator.respond(i);
    }


    interface Communicator{
        public void respond(int index);
    }

    /*@Override
    public void onClick(View view) {
        counter+=1;
        communicator.respond("the incremented counter become "+counter);
    }*/
}
