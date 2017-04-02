package com.example.codder.logibox;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginMainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);

        final Button btnLogin=(Button)findViewById(R.id.buttonLogin);
        final TextView tvCreateAccount=(TextView)findViewById(R.id.textviewNoAccount);
        final TextView tvForgotPassword=(TextView)findViewById(R.id.textviewForgotPassword);
        tvCreateAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==tvCreateAccount.getId()) {
                    Intent i = new Intent(LoginMainActivity.this, RegisteruserMainActivity.class);
                    startActivity(i);
                }
            }
        });
        tvForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==tvForgotPassword.getId()) {
                    Intent i = new Intent(LoginMainActivity.this, ForgotPasswordActivity.class);
                    startActivity(i);
                }
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                ProgressDialog prpgress=new ProgressDialog(LoginMainActivity.this);
                prpgress.setTitle("Please wait a moment..");
                prpgress.show();



                Intent i = new Intent(LoginMainActivity.this, NavidationMainActivity.class);
                startActivity(i);

            }
        });

    }
}
