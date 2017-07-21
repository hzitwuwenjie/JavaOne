package com.jc02.zengjing;

import java.util.Scanner;

/**
 * 　　  　  　    \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　( .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾靖　　　　　　                                                                 　|
 * |　@author 江西财经大学软件与通信工程学院                                                  |
 * |　@create 2017年07月21日 - 13:25
 * |  @description   购买商品
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=245;
        int b=570;
        int c=280;
        int shopid=0;
        int shopcount=0;
        int xiaoji =0;
        int heji =0;
        int money=0;
        String flag=" ";
        System.out.println("**************");
        System.out.println("请选择购买的商品编号：");
        System.out.println("1.黄金战衣\\t2.水杖\\t3.死亡之弩");
        System.out.println("**************");
        do{
            System.out.print("请输入购买的商品编号：");
            shopid=input.nextInt();
            System.out.print("请输入购买数量：");
            shopcount=input.nextInt();

            switch (shopid){
                case 1:
                    xiaoji=a*shopcount;
                    System.out.println("1.黄金战衣"+a+"\t数量"+shopcount+"\t合计"+xiaoji);
                    break;
                case 2:
                    xiaoji=b*shopcount;
                    System.out.println("2.水杖"+b+"\t数量"+shopcount+"\t合计"+xiaoji);
                    break;
                case 3:
                    xiaoji=c*shopcount;
                    System.out.println("3.死亡之弩"+c+"\t数量"+shopcount+"\t合计"+xiaoji);
                    break;
                }
            heji=heji+xiaoji;
            System.out.print("是否继续（y/s）:");
            flag=input.next();
        }while(flag.equals("y"));
        System.out.println("折扣:\t0.8");
        System.out.println("总计：\t"+heji);
        System.out.println("打折后价格:\t"+heji*0.8);
        Scanner mo=new Scanner(System.in);
        System.out.println("实付金额:\t");
        money=mo.nextInt();
        System.out.println("找钱:\t"+(money-heji*0.8));
    }
}