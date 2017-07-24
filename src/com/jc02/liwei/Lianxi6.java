package com.jc02.liwei;/**
 * Created by 熊不举 on 2017/7/21.
 */

import java.util.Scanner;

/**
 * 　　  　  　    \\\|///
 * 　　　 　 　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo----( _ )-----oOOo--------------------------------------------+
 * |　@author 李伟　　　　　　                                                                 　|
 * |　@author 学习                                                   |
 * |　@create 2017年07月21日 - 14:46
 * |    @description   　　　循环找零
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi6 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String j;
        double d = 245.0;
        double f = 570.0;
        double g = 320.0;
        int num;//商品数量
        int id;//商品编号
        double k;//实付金额
        double xiaoji;//商品价格小计
        double zongji=0;//商品总计
        System.out.println("**********************************");
        System.out.println("\t\t\t请选择购买的商品编号：");
        System.out.println("1.黄金战甲\t\t" + "2.冰杖\t\t" + "3.死亡之弩");
        System.out.println("**********************************");
        do {
            System.out.print("请输入商品编号：");
            id = a.nextInt();
            System.out.print("请输入购买数量：");
            num = a.nextInt();
            switch (id) {
                case 1:
                    xiaoji=d*num;
                    System.out.println("黄金战甲￥"+d +"\t数量："+num+"\t合计：￥"+xiaoji);
                    zongji+=xiaoji;
                    break;
                case 2:
                    xiaoji=f*num;
                    System.out.println("冰杖￥"+f+"\t数量："+num+"\t合计：￥"+xiaoji);
                    zongji+=xiaoji;
                    break;
                case 3:
                    xiaoji=g*num;
                    System.out.println("死亡之弩￥"+g+"\t数量："+num+"\t合计：￥"+xiaoji);
                    zongji+=xiaoji;
                    break;
                default:
                    System.out.println("没有这个东西");
            }
            System.out.println("是否继续（y/n）：");
            j = a.next();
            System.out.println();
        }
        while (j.equals("y"));
        System.out.println("折扣：\t\to.8");
        System.out.println("应付金额：\t\t"+zongji*0.8);
        System.out.println("实付金额：\t\t");
        k=a.nextInt();
        System.out.println("找钱："+(k-zongji*0.8));
    }

    }

