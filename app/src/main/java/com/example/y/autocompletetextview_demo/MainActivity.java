package com.example.y.autocompletetextview_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.auto_complete_text_view);
        List<String> datas = new ArrayList<>();
        datas.add("语文");
        datas.add("数学");
        datas.add("外语");
        datas.add("物理");
        datas.add("化学");
        datas.add("生物");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.activity_main,datas);
        autoCompleteTextView.setAdapter(adapter);
    }
}
