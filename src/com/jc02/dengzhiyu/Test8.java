package com.jc02.dengzhiyu;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月21日 - 13:46　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        int a=245;
        int b=570;
        int c=320;
        int shopno;
        int shopnum;
        int xiaoji=0;
        int heji=0;
        int money;
        String flag;
        Scanner input = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("请选择购买的商品编号：");
        System.out.println("1.黄金战衣\t2.水仗\t3.死亡之弩");
        System.out.println("************************************");
        do{
            System.out.print("请输入商品编号：");
            shopno =input.nextInt();
            System.out.print("请输入购买数量：");
            shopnum =input.nextInt();

            switch (shopno) {
                case 1:
                    xiaoji=a*shopnum;
                    System.out.println("黄金战衣\t\t\t"+a+"\t\t"+shopnum+"\t\t"+xiaoji);
                    break;
                case 2:
                    xiaoji=b*shopnum;
                    System.out.println("水仗\t\t\t"+a+"\t\t"+shopnum+"\t\t"+xiaoji);
                    break;
                case 3:
                    xiaoji=c*shopnum;
                    System.out.println("死亡之弩\t\t\t"+a+"\t\t"+shopnum+"\t\t"+xiaoji);
                    break;

            }
            heji=heji+xiaoji;
            System.out.println("是否继续（y/n）");
            flag=input.next();

        }while(flag.equals("y"));

        System.out.println("折扣:8折");
        System.out.println("原价:\t\t"+heji);
        System.out.println("折后价格：\t\t"+heji*0.8);
        System.out.println("实付金额:\t\t");
        money=input.nextInt();
        System.out.println("找钱:\t\t"+(money-heji*0.8));


    }
}

