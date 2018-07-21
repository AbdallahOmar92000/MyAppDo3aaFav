package com.example.sarrawi.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sarrawi.myapplication.database.DatabaseHelper;
import com.example.sarrawi.myapplication.model.Adapter_zekr;
import com.example.sarrawi.myapplication.model.Product;

import java.util.List;

public class Text extends AppCompatActivity {
    private List<Adapter_zekr> mProductLists;
    private DatabaseHelper mDBHelper;
    int titleID;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
        Intent i=getIntent();
        if (i.getExtras()!=null) {
            titleID = i.getExtras().getInt("titleID");
        }
        else
        {
            titleID=1;
        }
        TextView tv= findViewById(R.id.textView);
//        Adapter_zekr m = new Adapter_zekr();
//
//         mDBHelper =new DatabaseHelper(this);
//        titleID=mDBHelper.getAllPrayerzekr(m.getDescription());
//        tv.setText(titleID);
//
//
//        mDBHelper = new DatabaseHelper(this);
//        //Get product list in db when db exists
//        mProductLists = mDBHelper.getAllPrayerzekr();
//        tv.setText(m.getDescription());


    }
}
