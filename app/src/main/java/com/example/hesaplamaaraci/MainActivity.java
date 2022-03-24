package com.example.hesaplamaaraci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText s1,s2;
    Button b1,b2,b3,b4;
    TextView tv;
    int d1,d2,snc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s1 = (EditText) findViewById(R.id.sayi1);
        s2 = (EditText) findViewById(R.id.sayi2);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);

        tv = (TextView) findViewById(R.id.sonuc);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1 = Integer.parseInt(s1.getText().toString());
                d2 = Integer.parseInt(s2.getText().toString());
                snc = d1 + d2;
                tv.setText(Integer.toString(snc));
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1 = Integer.parseInt(s1.getText().toString());
                d2 = Integer.parseInt(s2.getText().toString());
                snc = d1 - d2;
                tv.setText(Integer.toString(snc));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1 = Integer.parseInt(s1.getText().toString());
                d2 = Integer.parseInt(s2.getText().toString());
                snc = d1 * d2;
                tv.setText(Integer.toString(snc));
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d1 = Integer.parseInt(s1.getText().toString());
                d2 = Integer.parseInt(s2.getText().toString());
                float fsnc = (float) d1 / d2;
                tv.setText(Float.toString(fsnc));
            }
        });

    }


}