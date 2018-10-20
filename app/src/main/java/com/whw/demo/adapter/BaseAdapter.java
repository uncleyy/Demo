package com.whw.demo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseAdapter<T> extends RecyclerView.Adapter {

    private List<T> mItems;
    protected Context mContext;
    protected LayoutInflater mInflater;

    public BaseAdapter(Context context) {
        mItems = new ArrayList<>();
        mContext = context;
        mInflater = LayoutInflater.from(context);
    }

    public void setItems(List<T> items) {
        if (items != null) {
            mItems = items;
        } else {
            mItems.clear();
        }
    }

    public List<T> getItems() {
        return mItems;
    }


    @Override
    public int getItemCount() {
        return mItems.size();
    }
}
