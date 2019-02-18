package com.ftmk.mhariznaim.firstapplecture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.txtvw_1);
        textView.setText(getResources().getString(R.string.myName));
        textView.setTextColor(getResources().getColor(R.color.colorPutih));

    }
}
