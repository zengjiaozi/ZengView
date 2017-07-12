package com.richinfo.zengview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author
 * @time 2017/7/11  16:07
 * @desc ${TODD}
 */
public class ImageButton  extends View{
    public ImageButton(Context context) {
        super(context,null);
    }

    public ImageButton(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs,0);
    }

    public ImageButton(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widethMode = MeasureSpec.getMode(widthMeasureSpec);
        int widethSize = MeasureSpec.getSize(widthMeasureSpec);


        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
//    如果要改变控件的大小  就不需要调用父类的 super.onMeasure()方法
//        调用setMeasureDimension()这个方法

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
//        只需要关注当前的控件的宽度和高度
        super.onSizeChanged(w, h, oldw, oldh);
    }
}
