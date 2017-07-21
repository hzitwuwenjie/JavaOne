package com.jc02.fankelei;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 17:38
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test13 {
    public static void san1() {
        for(int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
    public static void san2(){
        for(int i=10;i>=1;i--) {
            for (int j = 0; j < 10-i; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
                System.out.print("*");
            System.out.println("");
        }

    }
    public static void san3(){
        for(int i=9;i>=1;i--) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=9-i;k++)
                System.out.print("*");
            System.out.println("");
        }


    }
    public static void san4(){
        for(int i=9;i>=1;i--) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=((9-i)*2+1);k++)
                System.out.print("*");
            System.out.println("");
        }


    }
    public static void san5(){
        for (int i = 0; i < 8 ; i++) {

            for (int j = 0; j <(8 - i); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int b = 0; b < 2 * i - 1; b++) {
                System.out.print(" ");
            }
            if (i==0) {}
            else{
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<17;i++){
            System.out.print("*");
        }
    }

    public static void san6(){
        for(int i=10;i>=1;i--) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=((10-i)*2+1);k++)
                System.out.print("*");
            System.out.println("");
        }
        for(int h=8;h>=0;h--){
            for(int g=1;g<=(9-h);g++){
                System.out.print(" ");
            }
            for(int l=1;l<=(2*h+1);l++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {
        System.out.println("第一个三角形");
        san1();
        System.out.println("第二个三角形");
        san2();
        System.out.println("第三个三角形");
        san3();
        System.out.println("第四个三角形");
        san4();
        System.out.println("第五个三角形");
        san5();
        System.out.println("");
        System.out.println("第六个三角形");
        san6();

    }
}
