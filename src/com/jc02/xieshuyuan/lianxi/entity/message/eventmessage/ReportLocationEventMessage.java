package com.jc02.xieshuyuan.lianxi.entity.message.eventmessage;

import com.jc02.xieshuyuan.lianxi.entity.message.EventMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月24日 - 17:06
 * |    @description   上报地理位置事件消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class ReportLocationEventMessage extends EventMessage{
    private String latitude;	//地理位置纬度
    private String longitude;	//地理位置经度
    private String precision;	//地理位置精度

    public ReportLocationEventMessage(String msgType){
        super("event");
    }
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }
}
