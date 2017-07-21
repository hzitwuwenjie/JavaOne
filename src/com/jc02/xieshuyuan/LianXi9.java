package com.jc02.xieshuyuan;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月21日 - 14:23
 * |    @description   输入提示，可重复输入
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi9 {
    public static void main(String[] args) {
        System.out.println("-----------------------------------");
        System.out.println("魔界饰品分发系统");
        System.out.println("-----------------------------------");
        System.out.println("\t\t1.账号信息管理");
        System.out.println("\t\t2.购物结算");
        System.out.println("\t\t3.装备返点");
        System.out.println("\t\t4.注销");
        System.out.println("-----------------------------------");
        System.out.println("请输入数字");
        Scanner input=new Scanner(System.in);
        int flag=input.nextInt();
        while(flag>4 || flag<1){

        }
    }
}
