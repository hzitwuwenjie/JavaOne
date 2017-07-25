package com.jc02.xieshuyuan.lianxi.entity.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月24日 - 16:48
 * |    @description   普通消息父类
 * +---------------------------------Oooo---------------------------------------+
 */
public class CommMessage  extends Message{
    private long msgId; //    消息id，64位整型
    public CommMessage(String msgType){
        super(msgType);
    }
    public long getMsgId() {
        return msgId;
    }

    public void setMsgId(long msgId) {
        this.msgId = msgId;
    }
}
