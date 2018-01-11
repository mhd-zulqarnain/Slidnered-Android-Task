package chatkit.stfalcon.com.nestedrecyler;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zul Qarnain on 12/23/2017.
 */

public class CourseRVAdapter extends RecyclerView.Adapter<CourseRVAdapter.SimpleViewHolder> {

    private final Context mContext;
    private static List<Nugget> mData;
    private static RecyclerView horizontalList;

    public static class SimpleViewHolder extends RecyclerView.ViewHolder {
        public final TextView title;
        private HorizontalRVAdapter horizontalAdapter;

        public SimpleViewHolder(View view) {
            super(view);
            Context context = itemView.getContext();
            title = (TextView) view.findViewById(R.id.course_item_name_tv);
            horizontalList = (RecyclerView) itemView.findViewById(R.id.horizontal_list);
            horizontalList.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
            horizontalAdapter = new HorizontalRVAdapter();
            horizontalList.setAdapter(horizontalAdapter);
        }
    }

    public CourseRVAdapter(Context context, List<Nugget> data) {
        mContext = context;
        if (data != null)
            mData = new ArrayList<>(data);
        else mData = new ArrayList<>();
    }

    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(mContext).inflate(R.layout.courses_item, parent, false);
        return new SimpleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SimpleViewHolder holder, final int position) {
        holder.title.setText(mData.get(position).getTitle());
        holder.horizontalAdapter.setData(mData.get(position).getTags()); // List of Strings
        holder.horizontalAdapter.setRowIndex(position);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

}