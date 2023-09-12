package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CategorieActivity extends AppCompatActivity {

    private TextView mCategoryName;
    private TextView mDesc;
    private TextView mCategoryMethodTitle;
    private TextView mCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.categorie_activity);

        mCategoryName = (TextView) findViewById(R.id.text_category);
        mDesc = (TextView) findViewById(R.id.desc);
        mCategoryMethodTitle= (TextView) findViewById(R.id.method);
        mCategory = (TextView) findViewById(R.id.category);

        Intent intent = getIntent();
        String Title = intent.getExtras().getString("CategoryName");
        String Desc = intent.getExtras().getString("Desc");
        String MethodTitle = intent.getExtras().getString("CategoryMethodTitle");
        String Category = intent.getExtras().getString("Category");

        mCategoryName.setText(Title);
        mDesc.setText(Desc);
        mCategoryMethodTitle.setText(MethodTitle);
        mCategory.setText(Category);
    }
}