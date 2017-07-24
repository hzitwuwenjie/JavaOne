package com.jc02.zoudongping.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:27
 * |    @description   地理位置信息
 * +---------------------------------Oooo---------------------------------------+
 */
public class PointMessage extends Message {
    private float location_x;
    private float location_y;
    private  String scale;
    private String label;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public float getLocation_x() {
        return location_x;
    }

    public void setLocation_x(float location_x) {
        this.location_x = location_x;
    }

    public float getLocation_y() {
        return location_y;
    }

    public void setLocation_y(float location_y) {
        this.location_y = location_y;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }
}