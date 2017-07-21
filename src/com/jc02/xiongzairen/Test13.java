package com.jc02.xiongzairen;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 18:25
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */

public class Test13 {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
    }


    //第一题
    public static void test1() {

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//第二题
public static void test2() {

        for (int i = 1;i<=10 ;i++ ){
            for (int m = 9;m>9-i;m-- ){
                System.out.print(" ");
            }
            for (int y =10;y>=i ;y-- ){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

}
//第三题
public static void test3() {

        for (int i = 1;i<10 ;i++ ) {
            for (int j = 10; j > 0; j--) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

}
//第四题
public static void test4() {

        for(int i=1;i<10;i++) {
            //打印空白
            for (int j = 9; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
                System.out.println();
            }
            System.out.println();



}
//第五题
public static void test5() {

    for(int i=1; i<10; i++) {
        //控制前面的空格
        for (int j = 1; j < 10 - i; j++) {
            System.out.print(" ");
        }
        //控制*的输出
        for (int k = 1; k <= 2 * i - 1; k++) {

            if (i == 1 || i == 9) {//控制第一行和最后一行打印*
                System.out.print("*");
            } else {
                //第一个位置和最后一个位置输出*
                if (k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();

    }

}

//第6题
public static void test6() {

        for(int i=1;i<=10;i++)
        {
            //将空格和*分开看，看" "的变化i=1时，他是4 ，2的时候是3找规律
            for(int j=1;j<=10-i;j++)
                System.out.print(" ");
            for(int k=1;k<=2*i-1;k++)//找规律，i是 1 3 5 7 基数嘛
                System.out.print('*');
            //换一行
            System.out.println();
        }
//打印下半部分
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=i;j++)//空格 1 2 3 4 so
                System.out.print(" ");
            for(int k=2*10;k>2*i+1;k--)//* 7 5 3 1倒着来的基数
                System.out.print('*');
            System.out.println();
        }

}
}

