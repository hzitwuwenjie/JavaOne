package com.jc02.huangkangming.message.eventmessage;

import com.jc02.huangkangming.message.type.FollowEventType;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 16:33
 * |  @description   关注/取消关注事件类
 * +---------------------------------Oooo---------------------------------------+
 */
public class FollowEventMessage extends EventMessage {

    public FollowEventMessage(FollowEventType event) {
        super(event.toString());
    }
}
