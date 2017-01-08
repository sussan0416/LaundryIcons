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
        Intent intent = null;

        switch (v.getId()) {
            case R.id.card_washing:
                break;
            case R.id.card_bleaching:
                break;
            case R.id.card_drying:
                break;
            case R.id.card_iron:
                break;
            case R.id.card_cleaning:
                break;
            default:
                break;
        }
        
        startActivity(intent);
    }
}
