package com.jc02.zoudongping.message;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月25日 - 10:00
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMain {
    public static void main(String[] args) {
        TextMessage tx=new TextMessage();
        System.out.println(tx.getTousername());
        TextMessage ax=new TextMessage("123124","ooo");
        System.out.println(ax.getTousername()+ax.getContent());
        ScanMessage scan=new ScanMessage("hhh","asd",123);
        System.out.println(scan.getTousername()+"\t\t"+scan.getEvent()+"\t\t"+"\t\t"+scan.getEventkey());
        ScanMessage sc=new ScanMessage();
        System.out.println(sc.getTousername()+"\t\t"+sc.getEvent()+"\t\t"+sc.getEventkey()+"\t\t"+sc.getTicket());
    }
}