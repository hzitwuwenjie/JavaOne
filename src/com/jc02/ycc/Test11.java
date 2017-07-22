package com.jc02.ycc;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　    (.@.@)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学软件143                                                   |
 * |　@create 2017年07月21日 - 15:04
 * |    @description   登陆验证
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {


        System.out.println("请输入您的账户：");
        String name=input.next();
        System.out.println("请输入您的密码：");
        String pwd=input.next();
        if(name.equals("jc02") && pwd.equals("123")){
            System.out.println(("登陆成功！"));
            break;

        }else {
            if (2-i==0){
                System.out.println("登陆次数超过限制！");
                System.exit(0);//系统推出
            }else
            System.out.println("您还剩"+(2-i)+"次登陆机会，请再次输入" );
        }
        }
    }
}
