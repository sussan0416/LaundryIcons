package com.busanekoworks.laundryicons;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ListView;

import com.busanekoworks.laundryicons.databinding.ActivityDetailBinding;

import java.util.List;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int categoryId = getIntent().getIntExtra(IntentKey.CATEGORY, 0);
        Detail detail = Detail.getDetailForCategory(categoryId);

        setTheme(detail.getStyleResId());
        setTitle(detail.getTitleResId());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActivityDetailBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_detail);
        binding.setItems(detail.getItems());
    }

    @BindingAdapter("app:items")
    public static void setItems(ListView listView, List<Item> items){
        DetailListAdapter adapter = new DetailListAdapter(listView.getContext(), items);
        listView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        this.finish();
        return true;
    }
}
