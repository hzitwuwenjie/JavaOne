package com.jc02.pengmeiqian;

import java.util.Scanner;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年07月21日 - 12:54
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class Lianxi6 {
    public static void main(String[] args) {
        int a=245;
        int b=570;
        int c=320;
        int shopno;
        int shopcount;
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
            shopno=input.nextInt();
            System.out.print("请输入购买数量：");
            shopcount=input.nextInt();
            switch(shopno){
                case 1:
                    xiaoji=a*shopcount;
                    System.out.println("黄金战衣\t"+"￥"+a+"\t"+shopcount+"\t"+xiaoji);
                    break;
                case 2:
                    xiaoji=b*shopcount;
                    System.out.println("水仗\t"+"￥"+b+"\t"+shopcount+"\t"+xiaoji);
                    break;
                case 3:
                    xiaoji=c*shopcount;
                    System.out.println("死亡之弩\t"+"￥"+c+"\t"+shopcount+"\t"+xiaoji);
                    break;
            }
            heji=xiaoji+heji;
            System.out.println("是否继续（y/n）");
            flag=input.next();
        }while(flag.equals("y"));
        System.out.println("折扣：0.8");
        System.out.println("应付金额：\t"+heji*0.8);
        System.out.println("实付金额：");
        money=input.nextInt();
        System.out.println("找钱：\t"+(money-heji*0.8));
    }
}
