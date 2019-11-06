package com.sandgaw.mycall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sms extends AppCompatActivity {

    private EditText etSmsNumber;
    private EditText etSmsMessage;
    private Button btnSmsSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        btnSmsSend = (Button) findViewById(R.id.btnSmsSend);
        btnSmsSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etSmsNumber = (EditText) findViewById(R.id.etSmsNumber);
                String smsNumber = etSmsNumber.getText().toString();
                etSmsMessage = (EditText) findViewById(R.id.etSmsMessage);
                String smsMessage = etSmsMessage.getText().toString();

                //SmsManager smsManager=SmsManager.getDefault();
                //smsManager.sendTextMessage(smsNumber, null, smsMessage, null, null);
                Intent intentSms = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:"+smsNumber));
                startActivity(intentSms);
            }
        });
    }
}
