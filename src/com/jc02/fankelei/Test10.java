package com.jc02.fankelei;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 15:31
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner age=new Scanner(System.in);
        int maxage=0;
        int minage=0;
        for(int i=1;i<=10;i++)
        {
            System.out.print("输入第" + i + "个顾客的年龄");
            int a=age.nextInt();
            if(a<30)
                minage++;
            if(a>30)
                maxage++;
        }
        System.out.println("30岁以下比例是"+(minage/10.0)*100+"%");
        System.out.println("30岁以上比例是"+(maxage/10.0)*100+"%");
    }
}
