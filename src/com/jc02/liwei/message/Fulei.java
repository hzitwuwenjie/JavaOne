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
 * |　@create 2017年07月24日 - 16:09
 * |    @description   　　　父类
 * +---------------------------------Oooo---------------------------------------+
 */
public class Fulei {
    private String tousername;
    private String fromusername;
    private  int creattime;
    private String msgtype;
    private  long msgid;

    public String getTousername() {
        return tousername;
    }

    public void setTousername(String tousername) {
        this.tousername = tousername;
    }

    public String getFromusername() {
        return fromusername;
    }

    public void setFromusername(String fromusername) {
        this.fromusername = fromusername;
    }

    public int getCreattime() {
        return creattime;
    }

    public void setCreattime(int creattime) {
        this.creattime = creattime;
    }

    public String getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype;
    }

    public long getMsgid() {
        return msgid;
    }

    public void setMsgid(long msgid) {
        this.msgid = msgid;
    }
}
