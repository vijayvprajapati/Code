package com.example.codder.logibox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ClaimMainActivity extends AppCompatActivity {

   Spinner spdd,spmm,spyy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claim_main);
        spdd=(Spinner)findViewById(R.id.dd);
        spmm=(Spinner)findViewById(R.id.mm);
        spyy=(Spinner)findViewById(R.id.yy);

        String []day=getResources().getStringArray(R.array.day);
        String []month=getResources().getStringArray(R.array.month);
        String []year=getResources().getStringArray(R.array.year);

        ArrayAdapter<String> d= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,day);
        spdd.setAdapter(d);

        ArrayAdapter<String> m= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,month);
        spmm.setAdapter(m);

        ArrayAdapter<String> y= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,year);
        spyy.setAdapter(y);

    }
}
