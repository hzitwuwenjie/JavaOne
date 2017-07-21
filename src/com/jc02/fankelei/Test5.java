package com.jc02.fankelei;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 11:14
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test5 {
    public static void main(String[] args) {
        for(int i=0;i<150;i++)
        {
            System.out.print(i);
            if(i%3==0)
                System.out.print("\tfoo");
            if(i%5==0)
                System.out.print("\tbiz");
            if(i%7==0)
                System.out.print("\tbaz");
            System.out.println("");
        }
    }
}
