package com.jc02.yankaixin;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月21日 - 11:38
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class FooBizBaz {

    public static void main(String[] args) {

        for(int i=1;i<=150;i++){
            System.out.print(i);
            if(i%3==0)
                System.out.print(" foo ");
            if(i%5==0)
                System.out.print(" biz ");
            if(i%7==0)
                System.out.print(" baz ");
            System.out.println();
        }

    }
}
