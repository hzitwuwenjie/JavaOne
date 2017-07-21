package com.jc02.yankaixin;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月21日 - 11:55
 * |  @description  循环输入商品编号和购买数量，输入n结账，计算应付金额并找零
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = 245;
        int b = 570;
        int c = 320;
        int id;  //商品编号
        int num; //商品数量
        double total;  //商品小计
        double allTotal=0;  //商品总计
        int money;   //实付金额
        String s;   //是否继续
        System.out.println("********************************************");
        System.out.println("请选择购买的商品编号：");
        System.out.println("1.黄金战甲\t\t2.水杖\t\t3.死亡之弩");
        System.out.println("********************************************\n");
        do{
            System.out.print("请输入商品编号：");
            id = input.nextInt();
            System.out.print("请输入购买数量：");
            num = input.nextInt();
            switch(id){
                case 1:
                    total = a*num;
                    System.out.println("黄金战甲￥" + a +"\t\t数量" + num + "\t\t合计" + total);
                    allTotal += total;
                    break;
                case 2:
                    total = b*num;
                    System.out.println("水杖￥" + b +"\t\t数量" + num + "\t\t合计" + total);
                    allTotal += total;
                    break;
                case 3:
                    total = c*num;
                    System.out.println("死亡之弩￥" + c +"\t\t数量" + num + "\t\t合计" + total);
                    allTotal += total;
                    break;
                default:
                    System.out.println("对不起，没有该商品");
                    break;
            }
            System.out.print("是否继续(y/n)：");
            s = input.next();
            System.out.println();
        }while(s.equals("y"));
        System.out.println("折扣： 0.8");
        System.out.println("应付金额：" + allTotal * 0.8);
        System.out.print("实付金额：");
        money = input.nextInt();
        System.out.println("找钱：" + (money-allTotal*0.8));
    }
}
