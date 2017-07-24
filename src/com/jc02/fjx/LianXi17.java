package com.jc02.fjx;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月22日 - 9:52
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi17 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[] a = new int[6];
        a[0] = 99;
        a[1] = 85;
        a[2] = 82;
        a[3] = 63;
        a[4] = 60;;
        for (int i = 0; i < 6; i++) {
            for(int j=0;j<5;j++) {
                if (a[j] > a[j+1]) {
                    int b = a[j];
                    a[j] = a[j+1];
                    a[j+1] = b;
                }
            }
        }
        System.out.println("排序后结果");
        for(int k=0;k<6;k++){
            System.out.print(a[k] + ",");
        }
        System.out.print("\n输入学生成绩：");
          a[5] =num.nextInt();
        System.out.println("a[5]="+a[5]);
        for (int i = 0; i < 6; i++) {
            for(int j=0;j<5;j++) {
                if (a[j] < a[j+1]) {
                    int b = a[j];
                    a[j] = a[j+1];
                    a[j+1] = b;
                }
            }
        }
        System.out.println("排序后结果");
        for(int k=0;k<6;k++){
            System.out.print(a[k] + ",");
        }
    }
}
/*
public class LianXi17 {
    public static void main(String[] args) {
        int a=53;
        int b=69;
        int c=57;
        int d=0;
        if(a<b){
            d=a;
            a=b;
            b=d;
        }
        if(b<c){
            d=b;
            b=c;
            c=d;
        }
        System.out.println("a="+a+"b="+b+"c="+c);
    }
}*/