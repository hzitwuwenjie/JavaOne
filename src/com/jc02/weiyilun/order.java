package com.jc02.weiyilun;

import java.util.Scanner;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月22日 - 9:19
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class order
{
    public static void main(String[] args) {
        int a[]= new int[6];
        a[0]=82;
        a[1]=60;
        a[2]=63;
        a[3]=99;
        a[4]=85;
        int k=0;
        int i=0;
        int n=0;

        Scanner input = new Scanner(System.in);
        System.out.print("请输入要添加的值:");
        a[5]= input.nextInt();
        int m=a[5];
        for(i=0;i<a.length;i++) {
            for (int j = i+1; j < a.length; j++) {
                k=a[i];

                if (a[i] <= a[j]) {

                    a[i] = a[j];
                    a[j] = k;
                }
            }
            if(m==a[i])
            {
                n=i;
            }

        }

        System.out.println("插入成绩的下标为:" + n);
        for(i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
