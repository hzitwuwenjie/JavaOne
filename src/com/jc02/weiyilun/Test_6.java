package com.jc02.weiyilun;

import java.util.Scanner;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 13:22
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test_6
{
    public static void main(String[] args) {
        int a=0;
        int b=0;
        int c=0;
        int i=0;
        int sum=0;
        while(i<=100)
        {
            sum=sum+i;
            i=i+2;
        }
        System.out.println("和为" + sum);
        number(a,b);

    }
    public static void number(int zhengshu,int fushu)
    {
        zhengshu=0;
        fushu=0 ;
        int i=0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数字");
        do  {
             i = input.nextInt();
            if (i > 0) {
                zhengshu = zhengshu + 1;
            }
             else if(i<0) {
                fushu = fushu + 1;
            }
        }while (i != 0);
        System.out.println("整数个数为"+zhengshu+"负数个数为"+fushu);
    }

}

