package pieView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

/**
 * @author
 * @time 2017/7/12  9:52
 * @desc ${TODD}
 */
public class PieView extends View {

    //    // 颜色表(注意: 此处定义颜色使用的是ARGB，带Alpha通道的)
//    private int[] mColors = {0xFFCCFF00, 0xFF6495ED, 0xFFE32636, 0xFF800000, 0xFF808000, 0xFFFF8C69, 0xFF808080, 0xFFE6B800, 0xFF7CFC00};
//    // 饼状图初始绘制角度
//    private int mStartAngle = 0;
//    private Paint mPaint;
//    private int mWidth, mHeight;
//    private ArrayList<PieDate> mDate = new ArrayList<>();
//
//
//    public PieView(Context context) {
//        this(context, null);
//        ininPaint();
//        setmDate(mDate);
//    }
//
//
//    public PieView(Context context, @Nullable AttributeSet attrs) {
//        super(context, attrs, 0);
//        ininPaint();
//    }
//
//    //    初始化画笔的操作
//    private void ininPaint() {
//        mPaint = new Paint();
//        mPaint.setColor(Color.BLACK);
//        mPaint.setStyle(Paint.Style.FILL);
//        mPaint.setAntiAlias(true);
//
//    }
//
//    @Override
//    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
//        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//    }
//
////    需要改变自定义控件的大小  需要重写onSizeChange方法
//
//
//    @Override
//    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
//        super.onSizeChanged(w, h, oldw, oldh);
//        mWidth = w;
//        mHeight = h;
//
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        super.onDraw(canvas);
////        绘画过程中 如果数据为空结束方法
////        if (mDate == null) {
////            return;
////        }
////      定义当前开始的角度
//        float currentStartAngle = mStartAngle;
////       将画布的起点移动到屏幕的中心
//        canvas.translate(mWidth / 2, mHeight / 2);
////        开始确定饼状图的半径
//        float r = (float) (Math.min(mWidth, mHeight) / 2 * 0.8);
////        开始画一个饼状图的绘制区域
//        RectF rect = new RectF(-r, -r, r, r);
//        for (int i = 0; i < mDate.size(); i++) {
//
//            PieDate pieDate = mDate.get(i);
//            mPaint.setColor(pieDate.getColor()); //确定颜色
//            canvas.drawArc(rect, mStartAngle, pieDate.getAngle(), true, mPaint);
////           设置当前的角度为画图完毕的角度
//            mStartAngle += pieDate.getAngle();
//        }
//    }
//
////     设置开始的角度
//
//
//    public void setmStartAngle(int mStartAngle) {
//        this.mStartAngle = mStartAngle;
//        invalidate();  // 重新的绘画刷新
//    }
//
//    public void setmDate(ArrayList<PieDate> mDate) {
//        this.mDate = mDate;
//        initDatas(mDate);
//        invalidate(); //刷新数据
//    }
//
//    //     添加数据的操作
//    private void initDatas(ArrayList<PieDate> mDate) {
////        对于数据的处理 一定要判断数据是否有异常
//
//        if (mDate == null || mDate.size() == 0) {
////            说明初始化数据异常
//            return;
//        }
//        float sumValues = 0;  //定义一个数据总和
//        for (int i = 0; i < mDate.size(); i++) {
//            PieDate pieDate = mDate.get(i);
//            float value = pieDate.getValue();
//            sumValues += value; //计算数值总和
////            定义颜色
//            int j = i % mColors.length;
//            pieDate.setColor(j);
//        }
//
//        float sumAngle = 0;
//        for (int i = 0; i < mDate.size(); i++) {
//            PieDate pie = mDate.get(i);
//
//            float percentage = pie.getValue() / sumValues;   // 百分比
//            float angle = percentage * 360;                 // 对应的角度
//
//            pie.setPrecentage(percentage);                  // 记录百分比
//            pie.setAngle((int) angle);                            // 记录角度大小
//            sumAngle += angle;
//
//            Log.i("angle", "" + pie.getAngle());
//        }
//    }
// 颜色表(注意: 此处定义颜色使用的是ARGB，带Alpha通道的)
    private int[] mColors = {0xFFCCFF00, 0xFF6495ED, 0xFFE32636, 0xFF800000, 0xFF808000, 0xFFFF8C69, 0xFF808080, 0xFFE6B800, 0xFF7CFC00};
    // 饼状图初始绘制角度
    private float mStartAngle = 0;
    // 数据
    private ArrayList<PieDate> mData;
    // 宽高
    private int mWidth, mHeight;
    // 画笔
    private Paint mPaint = new Paint();

    public PieView(Context context) {
        this(context, null);
    }

    public PieView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = w;
        mHeight = h;
        Log.i("tag", "mWidth = " + mWidth + ", height= " + mHeight);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float currentStartAngle = mStartAngle;                    // 当前起始角度
        canvas.translate(mWidth / 2, mHeight / 2);                // 将画布坐标原点移动到中心位置
//        float r = (float) (Math.min(mWidth, mHeight) / 2 * 0.8);
//        // 饼状图半径
//        Log.i("TAG", "r = " + r);
//        RectF rect = new RectF(-r, -r, r, r);                     // 饼状图绘制区域
//        for (int i = 0; i < 10; i++) {
//            PieDate pie = mData.get(i);
//            mPaint.setColor(pie.getColor());
//            canvas.drawArc(rect, currentStartAngle, pie.getAngle(), true, mPaint);
//            currentStartAngle += pie.getAngle();
//        }
        // 将坐标系原点移动到画布正中心
        canvas.translate(mWidth / 2, mHeight / 2);

        RectF rect = new RectF(0,-400,400,0);   // 矩形区域

        mPaint.setColor(Color.BLACK);           // 绘制黑色矩形
        canvas.drawRect(rect,mPaint);

        canvas.scale(0.5f,0.5f);                // 画布缩放

        mPaint.setColor(Color.BLUE);            // 绘制蓝色矩形
        canvas.drawRect(rect,mPaint);
    }

    // 设置起始角度
    public void setStartAngle(int mStartAngle) {
        this.mStartAngle = mStartAngle;
        invalidate();   // 刷新
    }

    // 设置数据
    public void setData(ArrayList<PieDate> mData) {
        this.mData = mData;
        initData(mData);
        invalidate();   // 刷新
    }

    // 初始化数据
    private void initData(ArrayList<PieDate> mData) {
        if (null == mData || mData.size() == 0)   // 数据有问题 直接返回
            return;

        float sumValue = 0;
        for (int i = 0; i < 10; i++) {
            PieDate pie = mData.get(i);

            sumValue += pie.getValue();       //计算数值和

            int j = i % mColors.length;       //设置颜色
            pie.setColor(mColors[j]);
        }

        float sumAngle = 0;
        for (int i = 0; i < 10; i++) {
            PieDate pie = mData.get(i);

            float percentage = pie.getValue() / sumValue;   // 百分比
            float angle = percentage * 360;                 // 对应的角度

            pie.setPercentage(percentage);                  // 记录百分比
            pie.setAngle(angle);                            // 记录角度大小
            sumAngle += angle;

            Log.i("angle", "" + pie.getAngle());
        }
    }
}
