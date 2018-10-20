package com.whw.demo.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.whw.demo.R;
import com.whw.demo.model.Aquafarm;

public class AquafarmAdapter extends BaseAdapter<Aquafarm> {

    public AquafarmAdapter(Context context) {
        super(context);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View root = mInflater.inflate(R.layout.item_aquafarm, viewGroup, false);
        return new AquafarmHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    public class AquafarmHolder extends RecyclerView.ViewHolder {

        public AquafarmHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
