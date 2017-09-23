package zaadjava.com.vivzdialogue;

import android.app.Activity;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by zulup on 7/14/2017.
 */

public class MyDialog extends DialogFragment implements View.OnClickListener {

    Button mYes, mNo;
    Communicator communicator;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dilalog_layout, null); //doesn't be the part of main Activity or parent
        mYes = (Button) view.findViewById(R.id.yes);
        mNo = (Button) view.findViewById(R.id.no);
        communicator = (Communicator) getActivity();
        setCancelable(false);
        mYes.setOnClickListener(this);
        mNo.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.yes) {
            communicator.respond("Clicked the yes button");
            dismiss();
        } else {
            communicator.respond("Clicked the no button");
        dismiss();
        }
    }

    interface Communicator {
        void respond(String message);
    }
}
