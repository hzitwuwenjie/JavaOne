package com.jc02.yankaixin;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月21日 - 17:48
 * |  @description   使用for循环打印图形
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test12 {

    public static void main(String[] args) {

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < i+1; j++)
                System.out.print("*\t");
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int k = 0; k < i; k++)
                System.out.print("\t");
            for (int j = 10-i; j > 0; j--)
                System.out.print("*\t");
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 8-i; k++)
                System.out.print("\t");
            for (int j = 0; j < i+1; j++)
                System.out.print("*\t");
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 8-i; j++)
                System.out.print("\t");
            for (int k = 0; k < 2*(i+1)-1; k++)
                System.out.print("*\t");
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 8-i; j++)
                System.out.print("\t");
            if(i==0)
                System.out.print("*");
            else if(i==8){
                for (int k = 0; k < 17; k++)
                    System.out.print("*\t");
            }else{
                System.out.print("*\t");
                for (int m = 0; m < 2*i-1; m++)
                    System.out.print("\t");
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9-i; j++)
                System.out.print("\t");
            for (int k = 0; k < 2*(i+1)-1; k++)
                System.out.print("*\t");
            System.out.println();
        }
        for (int m = 0; m < 9; m++) {
            for (int n = 0; n < m+1; n++)
                System.out.print("\t");
            for (int l = 0; l < 17-2*m; l++)
                System.out.print("*\t");
            System.out.println();
        }
        
    }
}
