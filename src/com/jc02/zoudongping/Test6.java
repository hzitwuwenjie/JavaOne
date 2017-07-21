package com.jc02.zoudongping;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 11:38
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test6 {
    public static void main(String[] args) {
        for(int i=1;i<=150;i++)
        {
            System.out.println(i);
            if(i%3==0)
            {
                System.out.println("foo");
            }
            if(i%5==0)
            {
                System.out.println("biz");
            }
            if(i%7==0){
                System.out.println("baz");
            }
        }
    }
}