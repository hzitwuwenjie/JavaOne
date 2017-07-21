package com.jc02.zengjing;

import java.util.Scanner;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月21日 - 16:08
 * |  @description   用户验证登录
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi10 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String username ="";
        String pwd ="";
        for(int i=1;i<=3;i++){
            System.out.print("请输入账户名：");
            username =input.next();
            System.out.print("请输入密码：");
            pwd = input.next();
            if(username.equals("zj")&&pwd.equals("123")){
                System.out.println("登录成功");
                break;
            }else if(i==3){
                System.out.println("次数已超过限制，系统退出");
                System.exit(0);
            }else {
                System.out.println("输入错误，您还有"+(3-i)+"次机会！");
            }

        }
    }
}