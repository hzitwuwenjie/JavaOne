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
        System.out.println("购买物品\t单价\t个数\t金额");
        System.out.println(godclothes+"\t"+"¥"+clothes+"\t"+num1+"\t"+"¥"+clothes*num1);
        System.out.println(deathcrossbow+"\t"+"¥"+crossbow+"\t"+num2+"\t"+"¥"+crossbow*num2);
        System.out.println(waterstick+"\t\t"+"¥"+stick+"\t"+num3+"\t"+"¥"+stick*num3);
        System.out.println();
        System.out.println("折扣：\t\t"+discount+"折");
        System.out.println("消费总金额："+"¥"+consumption);
        System.out.println("实际交费：\t"+"¥"+money);
        System.out.println("找钱：\t\t"+"¥"+change);
        System.out.println("本次购物所获的积分："+credits);
    }
}
