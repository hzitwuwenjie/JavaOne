package com.jc02.xieshikai.Task;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +--------------------人生一幸事Ψ(￣∀￣)Ψ睡醒有饭吃-----------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年07月21日 - 11:36
 * |  @description   按要求打印1-150行
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class Task5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 150; i++) {

            if(i%3==0&&i%5!=0&&i%7!=0)//3满足
                System.out.println(i+" foo");

            if(i%3!=0&&i%5==0&&i%7!=0)//5满足
                System.out.println(i+" biz");

            if(i%3!=0&&i%5!=0&&i%7==0)//7满足
                System.out.println(i+" baz");

            if(i%3==0&&i%5==0&&i%7!=0)//3、5满足
                System.out.println(i+" foo biz");

            if(i%3==0&&i%5!=0&&i%7==0)//3、7满足
                System.out.println(i+" foo baz");

            if(i%3!=0&&i%5==0&&i%7==0)//5、7满足
                System.out.println(i+" biz baz");

            if(i%3==0&&i%5==0&&i%7==0)//3、5、7满足
                System.out.println(i+" foo biz baz");

            if(i%3!=0&&i%5!=0&&i%7!=0)//3、5、7都不满足
                System.out.println(i+" ");
        }
    }
}
