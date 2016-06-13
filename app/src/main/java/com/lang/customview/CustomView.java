package com.lang.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/6/13 0013.
 */
public class CustomView extends View {

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
       Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
        //绘制一个圆形

        canvas.drawCircle(100,100,50,paint);
        //去掉锯齿
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        //绘制椭圆
        paint.setColor(Color.YELLOW);
        canvas.drawOval(200,200,500,300,paint);
        paint.setColor(Color.BLUE);
        //绘制文本
        paint.setTextSize(50);
        canvas.drawText("zhuzhonglang",100,400,paint);
    }
}
