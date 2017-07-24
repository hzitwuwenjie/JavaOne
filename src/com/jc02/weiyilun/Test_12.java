package com.jc02.weiyilun;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　  \\　.-.-　//
 * 　　　　　  　  (　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 魏轶伦　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 18:42
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test_12
{
    public static void main(String[] args) {
        for (int i=1;i<=9;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
                System.out.print("\n");

        }
        System.out.print("\n");
        type_1();
        type_2();
        type_3();
        type_4();
        type_5();
    }
    public static void type_1()
    {
        for(int i=9;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
    public static void type_2()
    {
        for(int i=9;i>=1;i--) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=9-i;k++)
                System.out.print("*");
            System.out.println("");
        }
    }
    public static void type_3()
    {
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j <= 8-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void type_4()
    {
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
        System.out.println("\n");
    }
    public static void type_5()
    {
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
}
