package com.lenovohit.yuzhijun.ui.adapter.commonadapter;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by yuzhijun on 2016/4/25.
 */
public interface OnItemClickListener<T> {
    void onItemClick(ViewGroup parent, View view, T t, int position);
    boolean onItemLongClick(ViewGroup parent, View view, T t, int position);
}
