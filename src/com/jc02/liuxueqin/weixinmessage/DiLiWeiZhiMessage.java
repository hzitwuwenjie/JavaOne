package com.jc02.liuxueqin.weixinmessage;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月24日 - 16:23　                    
 *  |    @description   地理位置消息　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

public class DiLiWeiZhiMessage extends CommentMessage{
    private double location_X;//地理位置维度
    private double location_Y;//地理位置经度
    private String  scale;//地图缩放大小
    private String  label;//地理位置信息

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getLocation_Y() {
        return location_Y;
    }

    public void setLocation_Y(double location_Y) {
        this.location_Y = location_Y;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }

    public double getLocation_X() {
        return location_X;
    }

    public void setLocation_X(double location_X) {
        this.location_X = location_X;
    }
}
