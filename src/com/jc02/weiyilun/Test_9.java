package com.jc02.weiyilun;

import java.util.Scanner;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 15:22
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test_9
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a =0;
        int b =0;
        int num =0;
        for(int i=1;i<=10;i++)
        {
            System.out.println("请输入第"+i+"位客户的年龄");
            num = input.nextInt();
            if (num>30)
                a++;
            else if(num<30)
                b++;
        }
        System.out.println("30岁以下的比例是:"+a*10+"%");
        System.out.println("30岁以上的比例是:"+b*10+"%");

    }
}
