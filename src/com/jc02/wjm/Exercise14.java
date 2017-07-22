package com.jc02.wjm;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月22日 - 9:22
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Exercise14 {
    public static void main(String[] args) {
        int a[]=new int[6];
        int b,c;
        a[0]=82;
        a[1]=99;
        a[2]=85;
        a[3]=63;
        a[4]=60;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入新增成绩：");
        c=input.nextInt();
        a[5]=c;
        for(int i=0;i<a.length;i++)
            for(int j=i+1;j<a.length;j++)
                if(a[i]<a[j])
                {
                    b=a[i];
                    a[i]=a[j];
                    a[j]=b;
                }
        for(int l=0;l<a.length;l++)
            if (a[l]==88) System.out.println("插入后的下标为："+l);
        System.out.println("插入后的成绩信息为：");
        for(int k=0;k<a.length;k++)
            System.out.print(a[k] + "\t");


    }
}
