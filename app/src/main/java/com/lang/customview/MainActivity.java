package com.lang.customview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lang.customview.com.lang.activity.CustomActivity;
import com.lang.customview.com.lang.activity.TrainActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private Button mBtnTrain,mBtnCustom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTrain = (Button) findViewById(R.id.btnTrain);
        mBtnCustom = (Button) findViewById(R.id.btnCustom);
        mBtnCustom.setOnClickListener(this);
        mBtnTrain.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnTrain:
                TrainActivity.actionActivity(MainActivity.this);
                break;
            case R.id.btnCustom:
                CustomActivity.actionActivity(MainActivity.this);
                break;
        }

    }
}
