package com.jc02.qinjiajun;

import java.util.Scanner;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月21日 - 14:18
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test8 {
    public static void main(String[] args) {
        int a = 245, b = 570, c = 320, num, e, f = 0;
        int sum = 0;
        String s = "";
        int money;
        System.out.println("********************************");
        System.out.println("\t\t请选择购买的商品");
        System.out.println("1.黄金战甲\t2.冰杖\t3.死亡之弩");
        System.out.println("********************************");
        Scanner no = new Scanner(System.in);
        do {
            System.out.println("\t\t请选择购买的商品编号：\t");
            num = no.nextInt();
            switch (num) {
                case 1:
                    Scanner count1 = new Scanner(System.in);
                    System.out.println("请选择购买的商品数量：\t");
                    e = count1.nextInt();
                    f = a * e;
                    System.out.println("黄金战甲" + "￥" + a + "\t" + "数量" + e + "\t" + "小计" + "￥" + f);
                    break;
                case 2:
                    Scanner count2 = new Scanner(System.in);
                    System.out.println("请选择购买的商品数量：\t");
                    e = count2.nextInt();
                    f = b * e;
                    System.out.println("冰杖" + "￥" + b + "\t" + "数量" + e + "\t" + "小计" + "￥" + f);
                    break;
                case 3:
                    Scanner count3 = new Scanner(System.in);
                    System.out.println("请选择购买的商品数量：\t");
                    e = count3.nextInt();
                    f = c * e;
                    System.out.println("死亡之弩" + "￥" + c + "\t" + "数量" + e + "\t" + "小计" + "￥" + f);
                    break;

            }
          sum+= f;
            System.out.println("是否继续？Y/N");
            Scanner co = new Scanner(System.in);
            s = co.next();
        } while (s.equals("Y"));
        System.out.println("折扣:\t0.8");
        System.out.println("总计：\t" + sum);
        System.out.println("打折后价格:\t" + sum * 0.8);
        Scanner mo = new Scanner(System.in);
        System.out.println("实付金额:\t");
        money = mo.nextInt();
        System.out.println("找钱:\t" + (money - sum* 0.8));
    }
}