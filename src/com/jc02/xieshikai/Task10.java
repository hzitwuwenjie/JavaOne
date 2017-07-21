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
 * |　@create 2017年07月21日 - 16:18
 * |  @description   统计商场顾客年龄，计算年龄层次分部
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class Task10 {
    public static void main(String[] args) {
        int older=0;
        int younger=0;
        Scanner input=new Scanner(System.in);
        for (int i=1;i<=10;i++) {
            System.out.print("请输入第" + i + "位顾客的年龄：");
            int age=input.nextInt();
            if(age>30)
                older++;
            else
                younger++;
        }
        System.out.println("30岁以下的比例是："+(older/10.0*100)+"%");
        System.out.println("30岁以下的比例是："+(younger/10.0*100)+"%");
    }
}
