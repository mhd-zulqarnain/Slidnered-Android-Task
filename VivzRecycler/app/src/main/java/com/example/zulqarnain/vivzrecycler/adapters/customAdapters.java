package com.example.zulqarnain.vivzrecycler.adapters;


import  android.support.v7.widget.*;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.zulqarnain.vivzrecycler.adapters.*;
import com.example.zulqarnain.vivzrecycler.R;
import com.example.zulqarnain.vivzrecycler.Students;

import java.util.ArrayList;

/**
 * Created by Zul Qarnain on 7/31/2017.
 */

public class customAdapters extends  RecyclerView.Adapter<customAdapters.CustomViewholder>{

    ArrayList<Students> students;
    public customAdapters(ArrayList<Students> students){
        this.students=students;
    }
    @Override
    public CustomViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_view_recycler,parent,false);
        CustomViewholder customViewholder = new CustomViewholder(view);
        return customViewholder;
    }

    @Override
    public void onBindViewHolder(CustomViewholder holder, int position) {

            Students student = students.get(position);
            holder.stName.setText(student.getName());
            holder.stSubject.setText(student.getSubject());
    }

    public void delete(int position){
        students.remove(position);
        notifyItemRemoved(position);
    }
    @Override
    public int getItemCount() {
        return students.size();
    }

    class CustomViewholder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView stName;
        public TextView stSubject;
        final static String TAG="com.clicked";

        public CustomViewholder(View itemView) {
            super(itemView);
            stName = (TextView) itemView.findViewById(R.id.studentName);
            stSubject = (TextView) itemView.findViewById(R.id.studentSubject);
           itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {

            delete(getAdapterPosition());

            Log.d(TAG, "onClick activated: "+getLayoutPosition());

        }
    }

}
