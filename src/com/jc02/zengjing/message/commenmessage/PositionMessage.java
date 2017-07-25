package com.jc02.zengjing.message.commenmessage;

import com.jc02.zengjing.message.ComMessage;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月24日 - 16:29
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class PositionMessage extends ComMessage {
    private String ocation_X;
    private String location_Y;
    private String scale;
    private String label;

    public PositionMessage() {
        super("localtion");
    }

    public String getOcation_X() {
        return ocation_X;
    }

    public void setOcation_X(String ocation_X) {
        this.ocation_X = ocation_X;
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