package com.jc02.xieshikai;

import java.util.Scanner;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年07月21日 - 12:34
 * |  @description   购物明细
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int id=0;
        int num=0;
        int clothes=245;
        int stick=320;
        int crossbow=570;
        int subtotal=0;
        double money=0;
        String flag="";
        System.out.println("***************************************");
        System.out.println("请选择购买的商品编号：");
        System.out.println("1·黄金战衣\t2·水杖\t3·死亡之弩");
        System.out.println("***************************************");
        do {
            System.out.print("请输入商品编号：");
            id=input.nextInt();
            System.out.print("请输入购买数量：");
            num=input.nextInt();
            switch(id){
                case 1:
                    System.out.println("黄金战衣\t¥"+clothes+"\t¥"+(clothes*num));
                    subtotal=subtotal+clothes*num;
                    break;
                case 2:
                    System.out.println("水杖\t¥"+stick+"\t¥"+(stick*num));
                    subtotal=subtotal+stick*num;
                    break;
                case 3:
                    System.out.println("死亡之弩\t¥"+crossbow+"\t¥"+(crossbow*num));
                    subtotal=subtotal+crossbow*num;
                    break;
            }
            System.out.print("是否继续（y/n）：");
            flag=input.next();
            System.out.println();
        }while(flag.equals("y"));
        System.out.println("折扣：0.8");
        System.out.println("商品总价："+subtotal);
        System.out.println("优惠总价："+subtotal*0.8);
        System.out.println("应付金额："+subtotal*0.8);
        System.out.print("实收金额：");
        money=input.nextDouble();
        System.out.println("找钱："+(money-subtotal*0.8));
    }
}
