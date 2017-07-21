package com.jc02.lwj;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李文俊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 15:52
 * |    @description   1
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age; //存储客户年龄
        int max=0;
        int min=0;
        for (int i = 1; i<=10 ; i++) {
            System.out.println("请输入第"+i+"位顾客的年龄:");
            age=input.nextInt();
            if(age>30){
                max++;
            }else if(age<30){
                min++;
            }
        }
        System.out.println("30岁以下的比例是："+(min/10.0*100)+"%");//输出结果时应在循环外面运行
        System.out.println("30岁以上的比例是："+(max/10.0*100)+"%");
    }
}
