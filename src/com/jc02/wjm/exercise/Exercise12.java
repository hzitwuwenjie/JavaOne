package com.jc02.wjm.exercise;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 15:51
 * |  @description   验证身份
 * +---------------------------------Oooo---------------------------------------+
 */
public class Exercise12 {
    public static void main(String[] args) {
        int b;
        String a;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入用户名");
        a=input.next();
        System.out.println("请输入密码");
        b=input.nextInt();
        for(int i=0;i<3;i++){
        if(a.equals("wjm")&&b==1) {
            System.out.println("欢迎使用myshopping系统");
            break;
        }
        else
        {
            if((2-i)==0) {
                System.out.println("抱歉，机会用尽，程序将退出");
                System.exit(0);
            }
            System.out.println("输入错误，您还有"+(2-i)+"次机会");
            System.out.println("请输入用户名");
            a=input.next();
            System.out.println("请输入密码");
            b=input.nextInt();

        }
        }
    }
}
