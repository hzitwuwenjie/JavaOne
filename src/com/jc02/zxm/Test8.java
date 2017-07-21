package com.jc02.zxm;

import java.util.Scanner;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月21日 - 12:44　                           |
 * |    @description   循环输入商品编号和购买数量　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class Test8 {
    public static void main(String[] args) {
        int a=245;
        int b=570;
        int c=320;
        int A=0;
        int B=0;
        int scount=0;//每个商品合计
        int count=0;//总金额
        double money=0;//实付金额
        String flag=null;
        Scanner input=new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("请选择要购买的商品编号");
        System.out.println("1.黄金战甲\t2.水仗\t3.死亡之弩");
        System.out.println("*****************************");

        do {
            System.out.print("请输入要购买的商品编号：");
            A=input.nextInt();
            System.out.print("请输入要购买的商品数量：");
            B=input.nextInt();
            switch (A)
            {
                case 1:
                    scount=a*B;
                    System.out.println("黄金战甲:"+a +"\t"+"数量:"+B +"\t" +"合计:"+scount);
                    System.out.println("是否继续（y/n）:");
                    flag=input.next();
                    break;
                case 2:
                    scount=b*B;
                    System.out.println("水仗:"+b +"\t"+"数量:"+B +"\t" +"合计:"+scount);
                    System.out.println("是否继续（y/n）:");
                    flag=input.next();
                    break;
                case 3:
                    scount=c*B;
                    System.out.println("死亡之弩:"+c +"\t"+"数量:"+B +"\t" +"合计:"+scount);
                    System.out.println("是否继续（y/n）:");
                    flag=input.next();
                    break;
            }
            count=count+scount;

        }
        while (flag.equals("y"));
        System.out.println("商家折扣8折");
        System.out.println("应付金额："+(count*0.8));
        System.out.print("实付金额：");
        money=input.nextInt();
        System.out.println("找钱："+(money-count*0.8));

    }
}

