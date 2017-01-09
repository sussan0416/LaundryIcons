package com.busanekoworks.laundryicons;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.busanekoworks.laundryicons.databinding.ViewItemListBinding;

import java.util.List;

/**
 * Created by Busaneko Works on 2017/01/09.
 */
public class DetailListAdapter extends ArrayAdapter<Item> {
    public DetailListAdapter(Context context, List<Item> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            ViewItemListBinding binding = DataBindingUtil.inflate(LayoutInflater.from(getContext()), R.layout.view_item_list, parent, false);
            convertView = binding.getRoot();
        }
        ViewItemListBinding binding = DataBindingUtil.getBinding(convertView);
        binding.setItem(getItem(position));
        return convertView;
    }

    @BindingAdapter("app:image")
    public static void setImage(ImageView imageView, int resId) {
        imageView.setImageDrawable(ContextCompat.getDrawable(imageView.getContext(), resId));
    }

    @BindingAdapter("app:title")
    public static void setTitle(TextView textView, int resId) {
        textView.setText(resId);
    }

    @BindingAdapter("app:detail")
    public static void setDetail(TextView textView, int resId) {
        if (resId == 0) {
            textView.setVisibility(View.GONE);
            textView.setText("");
        } else {
            textView.setVisibility(View.VISIBLE);
            textView.setText(resId);
        }
    }
}
