package com.jc02.wjm;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 17:38
 * |  @description   打印三角形
 * +---------------------------------Oooo---------------------------------------+
 */
public class Exercise13 {
    /*public static void ff1(){
        for(int i=1;i<10;i++){
            for(int j=0;j<i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void ff2(){
        for(int i=10;i>0;i--){
            for(int j=1;j<=10-i;j++)
                System.out.print(" ");
            for(int k=0;k<i;k++)
                System.out.print("*");
            System.out.println();
        }

    }
    public static void ff3(){
        for(int i=10;i>0;i--){
            for(int j=0;j<=i;j++)
                System.out.print(" ");
            for(int k=0;k<10-i;k++)
                System.out.print("*");
            System.out.println();
        }

    }
    public static void ff4(){
        for(int i=9;i>0;i--){
            for(int j=0;j<=i;j++)
                System.out.print(" ");
            for(int k=0;k<=2*(9-i);k++)
                System.out.print("*");
            System.out.println();
        }
    }*/
    public static void ff5(){
        for(int i=8;i>0;i--){
            for(int j=0;j<=i;j++)
                System.out.print(" ");
            for(int k=0;k<=2*(8-i);k++)
                if(k==(i+7))
                System.out.print("*");
                else System.out.print(" ");

            System.out.println();
        }

    }

    public static void main(String[] args) {
        /*System.out.println("第一个三角形");
        ff1();
        System.out.println("第二个三角形");
        ff2();
        System.out.println("第三个三角形");
        ff3();
        System.out.println("第四个三角形");
        ff4();*/
        System.out.println("第五个三角形");
        ff5();


    }
}
