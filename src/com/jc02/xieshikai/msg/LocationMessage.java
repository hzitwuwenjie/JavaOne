package com.jc02.xieshikai.msg;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年07月24日 - 16:35
 * |  @description   地理位置消息
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class LocationMessage extends CommonMessage{
    private double location_X;  //地理位置维度
    private double location_y;  //地理位置经度
    private double scale;       //地理缩放大小
    private String label;       //地理位置信息

    public LocationMessage() {
        super("location");
    }

    public double getLocation_X() {
        return location_X;
    }

    public void setLocation_X(double location_X) {
        this.location_X = location_X;
    }

    public double getLocation_y() {
        return location_y;
    }

    public void setLocation_y(double location_y) {
        this.location_y = location_y;
    }

    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public void showXml() {

    }
}
