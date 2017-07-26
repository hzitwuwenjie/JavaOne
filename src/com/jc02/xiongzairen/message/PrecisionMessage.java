package com.jc02.xiongzairen.message;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 16:39
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class PrecisionMessage extends EventMessage{
    private String latitude;
    private String longitude;
    private String precision;

    public PrecisionMessage() {
        super("LOCATION");
    }
    public void showxml(){


    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getPrecision() {
        return precision;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }


}
