package com.sandgaw.mycall;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etPhone;
    private Button btnCall;
    private Button btnSms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCall=(Button) findViewById(R.id.btnCall);
        btnCall.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                etPhone=(EditText) findViewById(R.id.etPhone);
                String number=etPhone.getText().toString();
                Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+number));
                startActivity(intent);
            }
        });

        btnSms=(Button) findViewById(R.id.btnSms);
        btnSms.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, sms.class);
                startActivity(intent);
            }
        });
    }

}


