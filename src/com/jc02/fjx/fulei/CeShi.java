package com.jc02.fjx.fulei;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月25日 - 10:43
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class CeShi {
    public static void main(String[] args) {
        WeiZhi we = new WeiZhi();
        System.out.println("位置消息类型："+we.getMsgType());
        WenBenXiaoxi w=new WenBenXiaoxi();
        System.out.println("文本消息类型："+w.getMsgType());
        TuPian t=new TuPian();
        System.out.println("图片消息类型："+t.getMsgType());
        YuYin y=new YuYin();
        System.out.println("语音消息类型："+y.getMsgType());
        ShiPin s=new ShiPin(MeiJu.shortvideo);
        System.out.println("视频消息类型："+s.getMsgType());
        s=new ShiPin(MeiJu.video);
        System.out.println("视频消息类型："+s.getMsgType());
        System.out.println("*****************************");
        SaoMiaoShijian sh=new SaoMiaoShijian(MeiJv.SCAN);
        System.out.println("扫描消息类型："+sh.getEvent());
         sh=new SaoMiaoShijian(MeiJv.subscribe);
        System.out.println("关注消息类型："+sh.getEvent());
        sh=new SaoMiaoShijian(MeiJv.unsubscribe);
        System.out.println("取关消息类型："+sh.getEvent());
        ShangBao sha=new ShangBao();
        System.out.println("上报位置消息类型："+sha.getEvent());
        ZiDingYi z=new ZiDingYi("view");
        System.out.println("自定义菜单消息类型："+z.getEvent() );
    }
}
