package com.example.admin.lactes;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button mlogin;
    private Button msignup;
    private EditText memail;
    private EditText mpassword;
    private TextView mforgotpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        EditText memail = (EditText) findViewById(R.id.txtemail);
        EditText mpassword = (EditText) findViewById(R.id.txtpassword);
        Button msignup = (Button) findViewById(R.id.createaccount);
        Button mlogin = (Button) findViewById(R.id.btnsignip);
        TextView mforgotpassword = (TextView) findViewById(R.id.txtforgotpassword);

        mlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, HomePage.class);
                boolean value = false;
                myIntent.putExtra("key", value); //Optional parameters
                MainActivity.this.startActivity(myIntent);

            }
        });
        msignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, registration.class);
                boolean value = false;
                myIntent.putExtra("key", value); //Optional parameters
                MainActivity.this.startActivity(myIntent);

            }
        });
    }
}
