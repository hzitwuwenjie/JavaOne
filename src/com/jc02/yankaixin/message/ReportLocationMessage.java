package com.jc02.yankaixin.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月24日 - 16:44
 * |  @description   上报地理位置事件消息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class ReportLocationMessage extends EventMessage {

    private double latitude;
    private double longitude;
    private double precision;

    public ReportLocationMessage(){
        super("location");
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getPrecision() {
        return precision;
    }

    public void setPrecision(double precision) {
        this.precision = precision;
    }

    @Override
    public void showXml(){
        System.out.println("<xml>");
        System.out.println("\t<ToUserName>" + this.getToUserName() + "</ToUserName>");
        System.out.println("\t<FromUserName>" + this.getFromUserName() + "</FromUserName>");
        System.out.println("\t<CreateTime>" + this.getCreateTime() + "</CreateTime>");
        System.out.println("\t<MsgType>" + this.getMsgType() + "</MsgType>");
        System.out.println("\t<Event>" + this.getEvent() + "</Event>");
        System.out.println("\t<Latitude>" + this.getLatitude() + "</Latitude>");
        System.out.println("\t<Longitude>" + this.getLongitude() + "</Longitude>");
        System.out.println("\t<Precision>" + this.getPrecision() + "</Precision>");
        System.out.println("</xml>");
    }
}
