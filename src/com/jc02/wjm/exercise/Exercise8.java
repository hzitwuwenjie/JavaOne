package com.jc02.wjm.exercise;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 11:51
 * |  @description   商品
 * +---------------------------------Oooo---------------------------------------+
 */
public class Exercise8 {
    public static void main(String[] args) {
        int a=245,b=570,c=320,d,e,f=0;
        int g=0;
        String h="";
        int money;
        System.out.println("********************************");
        System.out.println("请选择购买的商品");
        System.out.println("1.黄金战甲\t2.冰杖\t3.死亡之弩");
        System.out.println("********************************");
        Scanner no=new Scanner(System.in);
        do{
        System.out.println("请选择购买的商品编号：\t");
        d=no.nextInt();
            switch (d) {
                case 1:
                    Scanner count1 = new Scanner(System.in);
                    System.out.println("请选择购买的商品数量：\t");
                    e = count1.nextInt();
                    f=a*e;
                    System.out.println("黄金战甲" + "￥" + a + "\t" + "数量" + e + "\t" + "小计" + "￥" + f);
                    break;
                case 2:
                    Scanner count2 = new Scanner(System.in);
                    System.out.println("请选择购买的商品数量：\t");
                    e = count2.nextInt();
                    f=b*e;
                    System.out.println("冰杖" + "￥" + b + "\t" + "数量" + e + "\t" + "小计" + "￥" + f);
                    break;
                case 3:
                    Scanner count3 = new Scanner(System.in);
                    System.out.println("请选择购买的商品数量：\t");
                    e = count3.nextInt();
                    f=c*e;
                    System.out.println("死亡之弩" + "￥" + c + "\t" + "数量" + e + "\t" + "小计" + "￥" + f);
                    break;

            }
            g=g+f;
            System.out.println("是否继续？y/n");
            Scanner co=new Scanner(System.in);
            h=co.next();
     }while(h.equals("y"));
        System.out.println("折扣:\t0.8");
        System.out.println("总计：\t"+g);
        System.out.println("打折后价格:\t"+g*0.8);
        Scanner mo=new Scanner(System.in);
        System.out.println("实付金额:\t");
        money=mo.nextInt();
        System.out.println("找钱:\t"+(money-g*0.8));
    }

}

