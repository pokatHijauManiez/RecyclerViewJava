package com.example.recyclerviewjava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewjava.MyViewHolder;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {


    Context context;
    List<Item> items;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.itemview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull  MyViewHolder holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.nimView.setText(items.get(position).getNim());
        holder.imageView.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
