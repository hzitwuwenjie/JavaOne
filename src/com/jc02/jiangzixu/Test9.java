package com.jc02.jiangzixu;

import java.util.Scanner;
/**
 * Created by 姜子旭 on 2017/7/21.
 */
public class Test9 {
    public static void main(String[] args) {
        System.out.println("魔界饰品分发系统");
        System.out.println("------------------------------------");
        System.out.println("\t\t1.账号信息管理");
        System.out.println("\t\t2.购物结算");
        System.out.println("\t\t3.装备返点");
        System.out.println("\t\t4.注销");
        System.out.println("------------------------------------");
        System.out.print("请选择，输入数字: ");
        Scanner input = new Scanner(System.in);
        int in;
        do {
             in =input.nextInt();
            if (in>=1&&in<=4) {
                break;
            }
            System.out.println("输入错误，请重新输入数字");
        }while (in>4||in<1);
    }
}
