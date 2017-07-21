package com.jc02.xiongzairen;

import java.util.Scanner;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 15:18
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test9 {
    public static void main(String[] args) {
        System.out.println("魔界饰品分发系统");
        System.out.println("**************************");
        System.out.println("1.账号信息管理");
        System.out.println("2.购物结算");
        System.out.println("3.装备返点");
        System.out.println("4.注销");
        System.out.println("**************************");
        Scanner input=new Scanner(System.in);
        System.out.println("请选择，输入数字：");
        int flag=input.nextInt();
        while (flag>4||flag<1){
            System.out.println("输入错误，请重新输入数字：");
            flag=input.nextInt();
        }
        System.out.println("输入成功");
    }
}
