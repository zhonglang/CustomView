package com.lang.customview.com.lang.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.lang.customview.R;

/**
 * Created by Administrator on 2016/6/21 0021.
 */
public class CustomActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
    }
    public  static void actionActivity(Context context){
        Intent intent = new Intent(context, CustomActivity.class);
        context.startActivity(intent);}
}
