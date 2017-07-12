package com.richinfo.zengview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * @author
 * @time 2017/7/12  14:40
 * @desc ${TODD}
 */
public class UIView extends View {


    private int mWidth, mHeight;
    private Paint mPaint;

    public UIView(Context context) {
        super(context, null);
    }

    public UIView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs, 0);
    }

    public UIView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;

    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setColor(Color.BLACK);
        mPaint.setStrokeWidth(10);
//        将坐标系远点移动到画布中心
        canvas.translate(mWidth / 2, mHeight / 2);
        Log.i("zeng", "mwidth = " + mWidth + "  height =" + mHeight);
        RectF rect = new RectF(-400,-400,400,400);   // 矩形区域

        for (int i=0; i<=20; i++)
        {
            canvas.scale(0.9f,0.9f);
            canvas.drawRect(rect,mPaint);
        }

    }
}
