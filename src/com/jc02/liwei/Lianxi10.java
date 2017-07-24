package com.jc02.liwei;/**
 * Created by 熊不举 on 2017/7/21.
 */

import java.util.Scanner;

/**
 * 　　  　  　    \\\|///
 * 　　　 　 　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo----( _ )-----oOOo--------------------------------------------+
 * |　@author 李伟　　　　　　                                                                 　|
 * |　@author 学习                                                   |
 * |　@create 2017年07月21日 - 19:48
 * |    @description   　　　用户登录，登录次数最多3次
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi10 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        String b;
        String c;
        for (int i = 1; i <=3 ; i++) {
            System.out.println("请输入用户名：");
            b = a.next();
            System.out.println("请输入密码：");
            c = a.next();
            if (b.equals("jc02") && c.equals("123")) {
                System.out.println("欢迎进入本系统！");
                break;
            }

            if (b != "jc02" && c != "123") {
                System.out.println("输入错误，你还有" + (3 - i) + "次机会！");
            }
        }
        }
    }

