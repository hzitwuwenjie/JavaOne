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
 * |　@create 2017年07月24日 - 16:55
 * |    @description   　　　自定义菜单
 * +---------------------------------Oooo---------------------------------------+
 */
public class Zidingyi extends Event{
    private String Eventkey;

    public Zidingyi(String event){
        super("CLICK");

    }

    public String getEventkey() {
        return Eventkey;
    }

    public void setEventkey(String eventkey) {
        Eventkey = eventkey;
    }
}
