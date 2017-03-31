package activitytest.example.com.recyclerviewtest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by WangYong on 2017-3-29.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<ListView_item> listView;
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView item_image;
        TextView item_text;

        public ViewHolder(View view){
            super(view);
            item_image = (ImageView) view.findViewById(R.id.item_image);
            item_text = (TextView) view.findViewById(R.id.item_textview);
        }
    }

    public Adapter(List<ListView_item> listView){
        this.listView = listView;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.listview_item_layout,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ListView_item item = listView.get(position);
        holder.item_image.setImageResource(item.getImageId());
        holder.item_text.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return listView.size();
    }
}
