package com.busanekoworks.laundryicons;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CategoryActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        findViewById(R.id.card_washing).setOnClickListener(this);
        findViewById(R.id.card_bleaching).setOnClickListener(this);
        findViewById(R.id.card_drying).setOnClickListener(this);
        findViewById(R.id.card_iron).setOnClickListener(this);
        findViewById(R.id.card_cleaning).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, DetailActivity.class);
        Category category =  null;

        switch (v.getId()) {
            case R.id.card_washing:
                category = Category.WASHING;
                break;
            case R.id.card_bleaching:
                category = Category.BLEACHING;
                break;
            case R.id.card_drying:
                category = Category.DRYING;
                break;
            case R.id.card_iron:
                category = Category.IRON;
                break;
            case R.id.card_cleaning:
                category = Category.CLEANING;
                break;
            default:
                break;
        }

        intent.putExtra(IntentKey.CATEGORY, category);
        startActivity(intent);
    }
}
