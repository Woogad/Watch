package com.example.watchshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

public class WatchAdapter extends RecyclerView.Adapter<WatchAdapter.ViewHolder> {

    private Context context;
    private List<Watch> watches;
    private ValueEventListener valueEventListener;

    public WatchAdapter (List<Watch> watches, Context context) {
        this.watches = watches;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_watch, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Watch upload = watches.get(position);
        holder.textViewName.setText(upload.getWatch_name());
        holder.textViewPrice.setText(upload.getWatch_price() + " บาท");
        Glide.with(context).load(upload.getUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return watches.size();
    }

    /*
       INNER class
     */
    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView textViewName, textViewPrice;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);

            textViewName = (TextView) itemView.findViewById(R.id.edName);
            textViewPrice = (TextView) itemView.findViewById(R.id.edPrice);
            imageView = (ImageView) itemView.findViewById(R.id.icon);
        }
    }
}