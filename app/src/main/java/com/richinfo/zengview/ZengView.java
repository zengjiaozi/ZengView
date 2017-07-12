package com.richinfo.zengview;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author
 * @time 2017/7/10  14:21
 * @desc ${TODD}
 */
public class ZengView extends View {
    Paint  mPaint = new Paint();
    Path path = new Path(); // 初始化 Path 对象

//        {
//        // 使用 path 对图形进行描述（这段描述代码不必看懂）
//        path.addArc(200, 200, 400, 400, -225, 225);
//        path.arcTo(400, 200, 600, 400, -180, 225, false);
//        path.lineTo(400, 542);
//    }
    public ZengView(Context context) {
        super(context);
    }

    public ZengView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ZengView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.RED);
        mPaint.setStrokeWidth(4);
//        通过path 来绘制2个圆形
//        path.setFillType( INVERSE_EVEN_ODD);
//        path.addCircle(300, 300, 200, Path.Direction.CW);
//        path.addCircle(500, 300, 200, Path.Direction.CW);
//        通过path绘图案
//        canvas.translate(0,0);
//        canvas.drawPath(path, paint);
//        canvas.translate(200,100);
//        paint.setColor(Color.GREEN);
//        canvas.drawPath(path, paint);
//        如何创建一个bitmap  第一种
//        Bitmap bmp = BitmapFactory.decodeResource(this.getResources(), R.drawable.ic_launcher_round);
//          第二种
//         Resources resources = this.getContext().getResources();
//        InputStream inputStream = resources.openRawResource(R.drawable.ic_launcher_round);
//        @SuppressLint("DrawAllocation")
//        BitmapDrawable  bitmapDrawable = new BitmapDrawable(inputStream);
//        Bitmap bitmap = bitmapDrawable.getBitmap();

////        第三种
//        InputStream inputStream = getResources().openRawResource(R.drawable.ic_launcher_round);
//        Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
//
//        canvas.drawBitmap(bitmap, 100, 200, paint);


////    化2条线段 通过path  通过moveTo  变换当前的起点位置
//        path.moveTo(100,100);
//        path.lineTo(200,700);
//        path.rLineTo(500,0);

//        通过path  画一个三角形
//        paint.setStyle(Style.STROKE);
 /*       path.moveTo(100, 100);
        path.lineTo(400, 100);
        path.lineTo(550, 550);
//        path.close(); // 使用 close() 封闭子图形。等价于 path.lineTo(100, 100)*/

//        canvas.drawPath(path,paint);


////  通过path 来绘制文字
//        paint.setTextSize(18);
//          String  text = "你好";
//        canvas.drawText(text, 100, 100, paint);
//        paint.setTextSize(36);
//        canvas.drawText(text, 100, 170, paint);
//        paint.setTextSize(60);
//        canvas.drawText(text, 100, 245, paint);
//        paint.setTextSize(84);
//        canvas.drawText(text, 100,340, paint);
//
//        RectF  rectF = new RectF(400,500,800,700);
//        canvas.drawOval(rectF,paint);


        // 在坐标原点绘制一个黑色圆形
        mPaint.setColor(Color.BLACK);
        canvas.translate(200,200);
        canvas.drawCircle(0,0,100,mPaint);

        // 在坐标原点绘制一个蓝色圆形
        mPaint.setColor(Color.YELLOW);
        canvas.translate(200,200);
        canvas.drawCircle(0,0,100,mPaint);

        // 在坐标原点绘制一个绿色圆形
        mPaint.setColor(Color.GREEN);
        canvas.translate(200,200);
        canvas.drawCircle(0,0,100,mPaint);

    }

}
