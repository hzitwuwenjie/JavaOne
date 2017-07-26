package com.jc02.fjx.fulei;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 　༺༺超༒神༻༻
 * |　@author 深圳合众艾特信息技术有限公司
 * |　@create 2017年07月24日 - 17:33
 * |    @description   普通消息
 * +---------------------------------Oooo---------------------------------------+
 */
public abstract class PuTongXiaoxi extends XiaoXi {
    private String msgid;
    public PuTongXiaoxi(String type){
        super(type);
    }
    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }



}
