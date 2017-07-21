package com.jc02.jiangzixu;

import java.util.Scanner;

/**
 * Created by 姜子旭 on 2017/7/21.
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        int up=0;
        int low=0;
        for (int i = 1; i <=10; i++) {
            System.out.print("请输入第" + i + "位顾客的年龄:");
            age=input.nextInt();
            if (age>30){
                up++;
            }
            else  if(age<30){
                low++;
            }
        }
        System.out.println("30岁以上的比例是："+(up/10.0*100)+"%");
        System.out.println("30岁以下的比例是："+(low/10.0*100)+"%");
    }
}
