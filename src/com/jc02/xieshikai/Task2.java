package com.jc02.xieshikai;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年07月20日 - 17:26
 * |  @description   上机任务2
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class Task2 {
    public static void main(String[] args) {
        int clothes=245;
        int crossbow=570;
        int stick=320;
        int num1=2;
        int num2=1;
        int num3=1;
        String godclothes="黄金战衣";
        String deathcrossbow="死亡之弩";
        String waterstick="水杖";
        int discount=8;
        int money=1500;
        double consumption=(clothes*2+crossbow+stick)*0.8;
        double change=money-consumption;
        int credits=(int)(consumption/100);
        System.out.println("*********消费单********");
        System.out.println("购买物品    单价    个数      金额");
        System.out.println(godclothes+"    "+"¥"+clothes+"     "+num1+"        "+"¥"+clothes*num1);
        System.out.println(deathcrossbow+"    "+"¥"+crossbow+"     "+num2+"        "+"¥"+crossbow*num2);
        System.out.println(waterstick+"        "+"¥"+stick+"     "+num3+"        "+"¥"+stick*num3);
        System.out.println();
        System.out.println("折扣：      "+discount+"折");
        System.out.println("消费总金额："+"¥"+consumption);
        System.out.println("实际交费：  "+"¥"+money);
        System.out.println("找钱：      "+"¥"+change);
        System.out.println("本次购物所获的积分："+credits);
    }
}
