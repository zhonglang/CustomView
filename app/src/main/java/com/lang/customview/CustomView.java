package com.lang.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Administrator on 2016/6/21 0021.
 */
public class CustomView extends View {
    int length;
    Paint mCirclePaint=null;
    Paint mArcPaint=null;
    Paint mTextPaint=null;
    String text="Android Skills";
    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mCirclePaint = new Paint();
        mCirclePaint.setColor(getResources().getColor(android.R.color.holo_blue_dark));

        mArcPaint = new Paint();
        mArcPaint.setStyle(Paint.Style.STROKE);
        mArcPaint.setStrokeWidth(40);
        mArcPaint.setColor(getResources().getColor(android.R.color.holo_blue_dark));

        mTextPaint = new Paint();
        mTextPaint.setColor(Color.BLACK);
        mTextPaint.setTextSize(32);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //画圆
        length = getMeasuredWidth();
        int mCircleXY=length/2;
        int mRadius=length/5;
        canvas.drawCircle(mCircleXY,mCircleXY,mRadius,mCirclePaint);
        //绘制文字
        canvas.drawText(text,0,text.length(),mCircleXY-mRadius,mCircleXY+text.length(),mTextPaint);
        Log.d("CustomView", text.length()+"");
        //绘制圆弧
       RectF mRectF= new RectF(length / 10, length / 10, length * 9 / 10, length * 9 / 10);
        canvas.drawArc(mRectF,0,270,false,mArcPaint);


    }
}
