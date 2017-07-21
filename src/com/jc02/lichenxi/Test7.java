package com.jc02.lichenxi;

import java.util.Scanner;

/**
 * Created by 李晨曦 2017年07月21日 - 12:09
 */
public class Test7 {
    public static void main(String[] args) {
        int a=245;
        int b=570;
        int c=320;
        int xiaoji=0;
        int zongji=0;
        String flag;
        Scanner in=new Scanner(System.in);

        do {
            System.out.println("*******************************");
            System.out.println("请输入需要购买的编号：");
            System.out.print("1.黄金战甲\t");
            System.out.print("2.水杖\t");
            System.out.println("3.死亡之弩\t");
            System.out.println("*******************************");
            System.out.print("输入商品编号：");
            int i = in.nextInt();
            System.out.print("输入商品数量：");
            int k = in.nextInt();
            switch (i)
            {
                case 1: xiaoji=a*k;
                    System.out.println("黄金战甲"+"￥"+a+"\t数量"+k+"\t"+"合计"+"￥"+xiaoji);
                    break;
                case 2: xiaoji=b*k;
                    System.out.println("水杖"+"￥"+b+"\t数量"+k+"\t"+"合计"+"￥"+xiaoji);
                    break;
                case 3: xiaoji=c*k;
                    System.out.println("死亡之弩"+"￥"+c+"\t数量"+k+"\t"+"合计"+"￥"+xiaoji);
                    break;
            }
            zongji=zongji+xiaoji;
            System.out.print("是否继续(y/n)");
            flag=in.next();
        }while(flag.equals("y"));
        System.out.println("折扣：0.8");
        System.out.println("应付金额：\t"+zongji*0.8);
        System.out.print("实付金额\t");
        int money=in.nextInt();
        System.out.println("找钱\t"+(money-zongji*0.8));
    }
}
