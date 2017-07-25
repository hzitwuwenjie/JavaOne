package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:21　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

import java.util.UUID;

public class LocationMessage extends CommonMessage {
    private String location_X;//	地理位置维度
    private String location_Y;	//地理位置经度
    private String scale;	//地图缩放大小
    private String label;	//地理位置信息
    public LocationMessage(){
        super("Location");
    }
    public void showxml(){
        System.out.println("<xml>");
        System.out.println(" <ToUserName>"+getToUserName()+" </ToUserName>");
        System.out.println(" <FromUserName>"+getFromUserName()+" </ToUserName>");
        System.out.println(" <CreateTime>"+ System.currentTimeMillis()+" </CreateTime>");
        System.out.println(" <Location_X>"+getLocation_X()+" </Location_X>");
        System.out.println("< Location_Y>"+getLocation_Y()+" </Location_Y>");
        System.out.println(" <Scale>"+getScale()+" </Scale>");
        System.out.println("<Label> "+getLabel()+" </Label>");
        System.out.println(" <MagType>"+ getMsgType()+" </MagType>");
        System.out.println(" <MsgId>"+ UUID.randomUUID()+" </MsgId>");
        System.out.println("</xml>");

    }

    public String getLocation_X() {
        return location_X;
    }

    public void setLocation_X(String location_X) {
        this.location_X = location_X;
    }

    public String getLocation_Y() {
        return location_Y;
    }

    public void setLocation_Y(String location_Y) {
        this.location_Y = location_Y;
    }

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
}

