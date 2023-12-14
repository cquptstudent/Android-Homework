package com.example.myapplication4stableversion;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.InnerHolder> {
    private final ArrayList<Message> data;
    public Adapter(ArrayList<Message> data){
        this.data = data;
    }
    @NonNull
    @Override
    public InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InnerHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull InnerHolder holder, int position) {
        holder.tvNumber.setText(data.get(position).getNumber());
        holder.tvMessage.setText(data.get(position).getMessage());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class InnerHolder extends RecyclerView.ViewHolder {
        TextView tvNumber;
        TextView tvMessage;

        public InnerHolder(@NonNull View itemView) {
            super(itemView);
            tvNumber = itemView.findViewById(R.id.number);
            tvMessage = itemView.findViewById(R.id.message);
        }
    }
}
