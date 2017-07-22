package com.jc02.fjx;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月21日 - 16:00
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi7 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("\t魔界饰品分发系统" + "\n" + "******************************");
        System.out.println("\t1.账号信息管理" + "\n" + "\t2.购物结算" + "\n" + "\t3.装备返点" + "\n" + "\t4.注销");
        System.out.println("******************************");
        System.out.print("请选择,输入数字：");
        int a = num.nextInt();
        while (a>4||a<1){
            System.out.print("输入错误，请重新输入数字：");
            a= num.nextInt();
        }
        System.out.println("******************************");
        switch (a) {
            case 1:
                System.out.println("\t1.显示所有会员信息");
                System.out.println("\t2.添加会员信息");
                System.out.println("\t3.修改会员信息");
                System.out.println("\t4.查询会员信息");
                break;
            case 2:
                System.out.println("买不起别碰，碰坏了你赔不起！");
                break;
            case 3:
                System.out.println("死肥宅，不充钱还想要返点，滚！");
                break;
            case 4:
                System.out.println("退出系统成功！");
                break;
        }
    }
}
