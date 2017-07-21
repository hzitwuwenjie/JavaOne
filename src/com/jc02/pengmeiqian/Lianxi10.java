package com.jc02.pengmeiqian;

import java.util.Scanner;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年07月21日 - 15:58
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class Lianxi10 {
    public static void main(String[] args) {
        String name="";//登录用户名
        String pwd="";//登录密码
        Scanner input = new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
            System.out.print("请输入用户名：");
            name=input.next();
            System.out.print("请输入密码：");
            pwd=input.next();
            if(name.equals("pmq") && pwd.equals("123")){
                System.out.println("登陆成功！");
                System.exit(0);
            }else{
                if((2-i)==0){
                    System.out.println("超出登录权限！");
                }else{
                    System.out.println("账号或密码错误！请重新输入！您还有"+(2-i)+"次机会！");
                }
            }
        }
    }
}
//
