package com.jc02.zoudongping;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月22日 - 9:04
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test14 {
    public static void main(String[] args) {
        int[] a = {60, 99, 63, 85, 83};
        System.out.println("排序前数组为：");
        for (int i:a) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] < a[j + 1]) {
                    int b = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = b;
                }
            }
        }
        System.out.println();
        System.out.println("排序后的数组为：");
        for (int i:a) {
            System.out.print(i + " ");
        }
        int[] c = new int[6];
        Scanner b = new Scanner(System.in);
        System.out.println(" ");
        System.out.print("请输入新增成绩：");
            int e = b.nextInt();
            for (int i = 0; i < a.length - 1; i++) {
                if ((a[i] > e && a[i + 1] < e)) {
                    for (int j = 0; j <= i; j++) {
                        c[j] = a[j];
                    }
                    c[i + 1] = e;
                    for (int m = i + 1; m < c.length - 1; m++) {
                        c[m + 1] = a[m];
                    }
                    System.out.println("插入成绩的下标为：" + (i + 1));
                    break;
                }

            }
            if (a[0] < e) {
                c[0] = e;
                for (int j = 1; j <= a.length; j++) {
                    c[j] = a[j - 1];
                }
                System.out.println("插入的下标是：" + 0);
            }
            if (a[4] > e) {
                c[5] = e;
                for (int j = 0; j < a.length; j++) {
                    c[j] = a[j];
                }
                System.out.println("插入的下标是：" + 5);
            }
            System.out.println("插入后的成绩信息是：");
            for (int i:c) {
                System.out.print(i+" ");
            }
        }
}