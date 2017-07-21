package com.jc02.lx;/**
 * Created by 响 on 2017/7/21.
 */

import java.util.Scanner;

/**
 * 　　  　  　     \\\|///
 * 　　　 　   　  \\ - -//
 * 　　　　　   　(　 @.@　)
 * +-------oOOo-----( v )-----oOOo--------------------------------------------+
 * |　@author Lee　　　　　　                                                                 　|
 * |　@author jxufe                                                   |
 * |　@create 2017年07月20日 - 10:23
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class July21g {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("魔界饰品分发系统\n************************\n1`账号信息管理\n2`购物结算\n3`装备返点\n4`注销\n************************\n请选择，输入数字：");
        int num= input.nextInt();
        while(num< 1|| num> 4){
            System.out.print("数字错误，请重新输入！");
            num= input.nextInt();
        }System.exit(0);
    }
}
