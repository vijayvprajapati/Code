package com.example.codder.logibox;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class AddOrderMainActivity extends Activity {

    Spinner spTypeBox,spNoOfBox,spPackageMaterial;
    EditText etFrom,etTo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_order_main);

        spNoOfBox=(Spinner)findViewById(R.id.spnoofboxes);

        spPackageMaterial=(Spinner)findViewById(R.id.sppackmetrial);
        spTypeBox=(Spinner)findViewById(R.id.sptypeboxes);
        etFrom=(EditText)findViewById(R.id.editfrom);
        etTo=(EditText)findViewById(R.id.editto);

        String[] nBoxes=getResources().getStringArray(R.array.NoOfBoxes);
        String[] typeBoxes=getResources().getStringArray(R.array.TypeOfBoxes);
        String[] packageMaterial=getResources().getStringArray(R.array.PackagingMaterial);

        ArrayAdapter<String> noofbox=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,nBoxes);
        spNoOfBox.setAdapter(noofbox);

        ArrayAdapter<String> tpofbox=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,typeBoxes);
        spTypeBox.setAdapter(noofbox);

        ArrayAdapter<String> packmet=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,packageMaterial);
        spPackageMaterial.setAdapter(noofbox);



    }
}
