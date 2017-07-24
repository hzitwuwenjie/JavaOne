package com.jc02.xiongzairen.message;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:28
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class PositionMessage extends CommonMessage {
    private long location_X;
    private long location_Y;
    private String scale;
    private String label;
    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public long getLocation_Y() {
        return location_Y;
    }

    public void setLocation_Y(long location_Y) {
        this.location_Y = location_Y;
    }

    public long getLocation_X() {
        return location_X;
    }

    public void setLocation_X(long location_X) {
        this.location_X = location_X;
    }



}
