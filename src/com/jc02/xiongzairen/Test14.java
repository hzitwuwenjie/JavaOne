package com.jc02.xiongzairen;

import java.util.Scanner;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月22日 - 9:24
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test14 {
    public static void main(String[] args) {
        int a[]=new int[6];
        a[0]=99;
        a[1]=85;
        a[2]=82;
        a[3]=63;
        a[4]=60;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入新增的成绩:");
        int score=input.nextInt();
        a[5]=score;
        //选择排序
        for(int i=0;i<a.length-1;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int num=a[i];
                    a[i]=a[j];
                    a[j]=num;
                }
            }

        }
        System.out.println("插入后的成绩为：");
        for(int c=0;c<a.length;c++){
            System.out.println(a[c]);
        }
    }

}
