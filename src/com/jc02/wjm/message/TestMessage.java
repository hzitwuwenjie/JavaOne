package com.jc02.wjm.message;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月25日 - 9:57
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMessage {
    public static void main(String[] args) {
        TextMessage tx=new TextMessage();
        System.out.println(tx.getMsgType());
        VideoMessage vi=new VideoMessage("video");
        System.out.println(vi.getMsgType());
        VoiceMessage vo=new VoiceMessage();
        System.out.println(vo.getMsgType());
        UrlMessage url=new UrlMessage();
        System.out.println(url.getMsgType());
        ImageMessage im=new ImageMessage();
        System.out.println(im.getMsgType());
        Location loc=new Location();
        System.out.println(loc.getMsgType());
    }
}
