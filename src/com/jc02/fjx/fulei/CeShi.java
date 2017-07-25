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
        System.out.println(we.getMsgType());
        WenBenXiaoxi w=new WenBenXiaoxi();
        System.out.println(w.getMsgType());
        TuPian t=new TuPian();
        System.out.println(t.getMsgType());
        YuYin y=new YuYin();
        System.out.println(y.getMsgType());
        ShiPin s=new ShiPin("video");
        System.out.println(s.getMsgType());
        SaoMiaoShijian sh=new SaoMiaoShijian("subscribe");
        System.out.println(sh.getEvent());
        ShangBao sha=new ShangBao();
        System.out.println(sha.getEvent());
        ZiDingYi z=new ZiDingYi("view");
        System.out.println(z.getEvent() );
    }
}
