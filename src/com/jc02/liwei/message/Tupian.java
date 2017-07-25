package com.jc02.liwei.message;/**
 * Created by 熊不举 on 2017/7/24.
 */

/**
 * 　　  　  　    \\\|///
 * 　　　 　 　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo----( _ )-----oOOo--------------------------------------------+
 * |　@author 李伟　　　　　　                                                                 　|
 * |　@author 学习                                                   |
 * |　@create 2017年07月24日 - 16:15
 * |    @description   　　　图片消息
 * +---------------------------------Oooo---------------------------------------+
 */
public class Tupian extends Fulei{
    private String picurl;
    private String mediald;
    public Tupian(){
        super("image");
    }

    public String getPicurl() {
        return picurl;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getMediald() {
        return mediald;
    }

    public void setMediald(String mediald) {
        this.mediald = mediald;
    }
}
