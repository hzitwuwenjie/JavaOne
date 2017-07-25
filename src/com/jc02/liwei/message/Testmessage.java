package com.jc02.liwei.message;/**
 * Created by 熊不举 on 2017/7/25.
 */

/**
 * 　　  　  　    \\\|///
 * 　　　 　 　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo----( _ )-----oOOo--------------------------------------------+
 * |　@author 李伟　　　　　　                                                                 　|
 * |　@author 学习                                                   |
 * |　@create 2017年07月25日 - 10:48
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Testmessage {
    public static void main(String[] args) {
        Wenben w=new Wenben();
        System.out.println("文本消息类型："+w.getMsgtype());
        Tupian t=new Tupian();
        System.out.println("图片消息类型："+t.getMsgtype());
        Yuyin yu=new Yuyin(Meiju.voice);
        System.out.println("语言消息类型："+yu.getMsgtype());
        Shipin sp=new Shipin(Meiju.video);
        System.out.println("视频消息类型："+sp.getMsgtype());
        Xiaoshipin xsp=new Xiaoshipin(Meiju.video);
        System.out.println("小视频消息类型："+xsp.getMsgtype());
        Dili d=new Dili();
        System.out.println("地理位置消息类型："+d.getMsgtype());
        Lianjie l=new Lianjie();
        System.out.println("链接消息类型："+l.getMsgtype());
        Event e=new Event("event");
        System.out.println("事件消息类型："+e.getMsgtype());
        System.out.println("************************************");
        Huifu h=new Huifu(Mj.subscribe);
        System.out.println("扫描二维码未关注时事件类型："+h.getEvent());
        Shangbaodili sbdlwz=new Shangbaodili();
        System.out.println("上报地理位置时的事件类型;"+sbdlwz.getEvent());
        Zidingyi zdy=new Zidingyi(Mj.click);
        System.out.println("自定义菜单时的事件类型："+zdy.getEvent());
    }
}
