package zaadjava.com.vivzalertfragement;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by zulup on 7/15/2017.
 */

public class MyAlert extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
//        builder.setTitle("Do you like this? ");
        builder.setMultiChoiceItems(R.array.days, null, new DialogInterface.OnMultiChoiceClickListener() { //for selecting multiple items
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                Toast.makeText(getActivity(),i+" multiple item selected",Toast.LENGTH_LONG).show();
            }
        });

      /*  builder.setItems(R.array.days, new DialogInterface.OnClickListener() { //for selecting single items
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(),i+" item selected",Toast.LENGTH_LONG).show();
            }
        });*/

        builder.setNegativeButton(R.string.close, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(),"Closed",Toast.LENGTH_LONG).show();
            }
        });

        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getActivity(),"Closed",Toast.LENGTH_LONG).show();
            }
        });

        Dialog dialog = builder.create();
        return dialog;
    }
}
