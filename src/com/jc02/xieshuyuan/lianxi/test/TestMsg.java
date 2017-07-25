package com.jc02.xieshuyuan.lianxi.test;

import com.jc02.xieshuyuan.lianxi.entity.message.Message;
import com.jc02.xieshuyuan.lianxi.entity.message.commmessage.ImageMessage;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月25日 - 14:00
 * |    @description   业务对象调用
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMsg {
    public static void main(String[] args) {
        //父类的引用，指向子类的对象
        Message msg=new ImageMessage();
        //msg就代表了父类的引用。在编码阶段msg都代表父类，在执行阶段代表子类对象
        //如果需要强制调用子类的方法。我们可以强制类型转换
        ((ImageMessage)msg).toString();
    }
}
