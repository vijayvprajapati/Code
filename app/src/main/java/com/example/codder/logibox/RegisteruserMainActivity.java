package com.example.codder.logibox;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class RegisteruserMainActivity extends AppCompatActivity {


    EditText firstname,lastname,emailid,pass,mobileno;
    RadioGroup gen;
    Button btnreset,btnsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeruser_main);




        firstname=(EditText)findViewById(R.id.fname);
        lastname=(EditText)findViewById(R.id.lname);
        emailid=(EditText)findViewById(R.id.emailid);
        pass=(EditText)findViewById(R.id.password);
        mobileno=(EditText)findViewById(R.id.mobileno);
        gen=(RadioGroup)findViewById(R.id.gender);

        btnreset=(Button)findViewById(R.id.btnreset);
        btnsignup=(Button)findViewById(R.id.btnsignup);


        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

               /* try
                {
                    firstname.setText("");
                    lastname.setText("");
                    emailid.setText("");
                    pass.setText("");
                    mobileno.setText("");
                    gen.clearCheck();
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }*/
                 try
                 {
                  Intent i=new Intent(getApplicationContext(),AddOrderMainActivity.class);
                  startActivity(i);
                 }
                 catch (Exception e)
                 {
                     e.printStackTrace();
                 }
            }
        });
    }





}
