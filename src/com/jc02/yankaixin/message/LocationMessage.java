package com.jc02.yankaixin.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月24日 - 16:31
 * |  @description   地理位置消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class LocationMessage extends TextMessage{

    private double location_X;
    private double location_Y;
    private double scale;
    private String label;

    public LocationMessage(double location_X, double location_Y, double scale, String label) {
        this.location_X = location_X;
        this.location_Y = location_Y;
        this.scale = scale;
        this.label = label;
    }

    public double getLocation_X() {
        return location_X;
    }

    public void setLocation_X(double location_X) {
        this.location_X = location_X;
    }

    public double getLocation_Y() {
        return location_Y;
    }

    public void setLocation_Y(double location_Y) {
        this.location_Y = location_Y;
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
}
