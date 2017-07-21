package com.jc02.yangyoufeng;
import java.util.Scanner;
/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author ×××                                                   |
 * |　@create 2017年07月21日 - 13:38
 * |    @description   自动结算
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test8 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            String name = "";
            double price = 0.0;
            int goodsNo = 0;
            int amount = 0;
            double discount = 0.8;
            double total = 0.0;
            double money = 0.0;
            System.out.println("*****************************************************");
            System.out.println("请选择购买的商品编号：");
            System.out.println("1.黄金战甲\t\t2.水杖\t\t3.死亡之弩");
            System.out.println("***************************************************\n");

            String answer = "y";
            while("y".equals(answer)){
                System.out.print("请输入商品编号：");
                goodsNo = input.nextInt();
                System.out.print("请输入购买数量：");
                amount = input.nextInt();
                switch(goodsNo){
                    case 1:
                        name = "黄金战甲";
                        price = 245.0;
                        break;
                    case 2:
                        name = "水杖";
                        price = 570.0;
                        break;
                    case 3:
                        name = "死亡之弩";
                        price =320.0;
                        break;
                }
                total = price * amount;
                System.out.println(name + "￥" + price + "\t" + "数量" + amount +
                        "\t合计￥" + total);
                System.out.println("是否继续(y/n)");
                answer = input.next();
                System.out.println();
                money += total;
            }
            System.out.println("折扣：" + discount);
            System.out.println("应付金额：" + (money * discount));
            System.out.print("实付金额：");
            double payment = input.nextDouble();
            System.out.println("找钱：" + (payment - money * discount));
        }
}