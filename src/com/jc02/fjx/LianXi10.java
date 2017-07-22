package com.jc02.fjx;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月21日 - 16:44
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi10 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String id = a.next();
        System.out.print("请输入密码：");
        String mima = a.next();
            for (int i = 1; i < 3; i++) {
                if (id.equals("jc02") && mima.equals("123")) {
                    System.out.println("欢迎登录MyShopping系统！");
                }
                if (id != "jc02" || mima != "123") {
                    System.out.println("输入错误！您还有" + (3 - i) + "次机会！");
                    System.out.print("请输入用户名：");
                    id = a.next();
                    System.out.print("请输入密码：");
                    mima = a.next();
                }
   }
          }
  }


