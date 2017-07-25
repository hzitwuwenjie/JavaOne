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
 * |　@create 2017年07月24日 - 16:19
 * |    @description   　　　视频消息
 * +---------------------------------Oooo---------------------------------------+
 */
public class Shipin extends Fulei{
    private String mediald;
    private String thumbmediald;
    public Shipin(Meiju type){
        super(type.toString());
    }

    public String getMediald() {
        return mediald;
    }

    public void setMediald(String mediald) {
        this.mediald = mediald;
    }

    public String getThumbmediald() {
        return thumbmediald;
    }

    public void setThumbmediald(String thumbmediald) {
        this.thumbmediald = thumbmediald;
    }
}
