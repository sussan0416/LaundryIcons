package com.busanekoworks.laundryicons;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int category = getIntent().getIntExtra(IntentKey.CATEGORY, 0);
        ArrayList<Item> items = Detail.getItemsForCategory(category);
    }
}
