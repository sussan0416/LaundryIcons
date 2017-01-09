package com.busanekoworks.laundryicons;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.busanekoworks.laundryicons.databinding.ActivityDetailBinding;

import java.util.ArrayList;
import java.util.List;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int category = getIntent().getIntExtra(IntentKey.CATEGORY, 0);
        ArrayList<Item> items = Detail.getItemsForCategory(category);

        ActivityDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
        binding.setItems(items);
    }

    @BindingAdapter("app:items")
    public static void setItems(ListView listView, List<Item> items){
        DetailListAdapter adapter = new DetailListAdapter(listView.getContext(), items);
        listView.setAdapter(adapter);
    }
}
