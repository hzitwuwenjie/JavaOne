package com.jc02.xiewenqiang;

import java.util.Scanner;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月21日 - 12:04
 * |  @description   消费单
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test8 {
    public static void main(String[] args) {
        int a = 245;
        int b = 570;
        int c = 370;
        int id;
        int count;
        int shifu;
        int xiaoji = 0;
        int heji = 0;
        String isContinue;
        Scanner input = new Scanner(System.in);
        System.out.println("*********************************************");
        System.out.println("请选择购买的商品编号：");
        System.out.println("1.黄金战甲\t\t2.水杖\t\t3.死亡之弩");
        System.out.println("*********************************************");
        System.out.println();
        do {
            System.out.print("请输入商品编号：");
            id = input.nextInt();
            System.out.print("请输入购买数量：");
            count = input.nextInt();
            switch (id) {
                case 1:
                    xiaoji = a * count;
                    System.out.println("黄金战甲¥" + a + "\t" + "数量" + count + "\t" + "合计¥" + xiaoji);
                    break;
                case 2:
                    xiaoji = b * count;
                    System.out.println("黄金战甲¥" + b + "\t" + "数量" + count + "\t" + "合计¥" + xiaoji);
                    break;
                case 3:
                    xiaoji = c * count;
                    System.out.println("黄金战甲¥" + c + "\t" + "数量" + count + "\t" + "合计¥" + xiaoji);
                    break;
                default:
                    System.out.println("没有该商品");
                    break;
            }

            heji = heji + xiaoji;
            System.out.print("是否继续（y/n）");
            isContinue = input.next();
            System.out.println();
        } while (isContinue.equals("y"));

        System.out.println("折扣:0.8");
        System.out.println("应付金额：¥" + heji * 0.8);
        System.out.print("请输入实付金额");
        shifu=input.nextInt();
        System.out.println("实付金额：¥" + shifu);
        System.out.println("找钱：¥" + (shifu - heji * 0.8));
    }
}

