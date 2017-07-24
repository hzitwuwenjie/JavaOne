package com.jc02.zoudongping;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月22日 - 15:56
 * |    @description   搜索日历
 * +---------------------------------Oooo---------------------------------------+
 */
public class Chakan {
    public static void main(String[] args) {
        Calendar calendar=new Calendar();
        Scanner year=new Scanner(System.in);
        System.out.println("请输入年份：");
        int y=year.nextInt();
        calendar.yiyue(y);
        Scanner select=new Scanner(System.in);
        System.out.println(" ");
        System.out.println("P       N       All");
        String s=select.next();
        if(s=="P"){

        }
        if(s=="N"){

        }
        if(s=="All"){

        }
    }
}