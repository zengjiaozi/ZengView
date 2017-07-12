package pieView;

import android.support.annotation.NonNull;

/**
 * @author
 * @time 2017/7/12  9:53
 * @desc ${TODD}
 */
public class PieDate {
//    对于一个饼状图来讲  对于用户有效的数据是  名称  百分比  和 数值
//     次重要的是 颜色 ，角度
//    用户关注的数据
//    private String name; //名字
//    private float value; //数值
//    private float precentage; //百分比
//
////    非用户关注的数据
//    private int color = 0; //颜色
//    private int angle = 0; //角度
//
//    public PieDate(String name, float value) {
//        this.name = name;
//        this.value = value;
//    }
//
//    public PieDate(String name, float value, float precentage, int color, int angle) {
//        this.name = name;
//        this.value = value;
//        this.precentage = precentage;
//        this.color = color;
//        this.angle = angle;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public float getValue() {
//        return value;
//    }
//
//    public void setValue(float value) {
//        this.value = value;
//    }
//
//    public float getPrecentage() {
//        return precentage;
//    }
//
//    public void setPrecentage(float precentage) {
//        this.precentage = precentage;
//    }
//
//    public int getColor() {
//        return color;
//    }
//
//    public void setColor(int color) {
//        this.color = color;
//    }
//
//    public int getAngle() {
//        return angle;
//    }
//
//    public void setAngle(int angle) {
//        this.angle = angle;
//    }

    // 用户关心数据
    private String name;        // 名字
    private float value;        // 数值
    private float percentage;   // 百分比

    // 非用户关心数据
    private int color = 0;      // 颜色
    private float angle = 0;    // 角度

    public PieDate(@NonNull String name, @NonNull float value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        this.angle = angle;
    }
}
