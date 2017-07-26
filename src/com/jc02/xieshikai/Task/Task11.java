package com.jc02.xieshikai.Task;

import java.util.Scanner;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年07月21日 - 16:32
 * |  @description   十进制转二进制
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class Task11 {
    public static void main(String[] args) {
        System.out.println("请输入一个十进制数：");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        String a="";
        while(num!=0){
            a=a+num%2;
            num=num/2;
        }
        for (int i = a.length()-1; i >=0 ; i--) {
            System.out.print(a.charAt(i));
        }
    }
}
