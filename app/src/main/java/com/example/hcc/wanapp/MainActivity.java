package com.example.hcc.wanapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDate();
    }
private int value;
    private void initDate() {
        for (int i = 0; i <10 ; i++) {
            value=value+i;
        }
    }
}
