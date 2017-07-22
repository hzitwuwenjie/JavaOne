package com.jc02.zoudongping;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 18:29
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test13 {
    public static void main(String[] args) {
        for(int i=0;i<9;i++){
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");;
            }
            for(int k=0;k<=9-i;k++){
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("--------------------------");
        for(int i=0;i<9;i++){
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");;
            }
            for(int k=0;k<9-i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("--------------------------");
        for(int i=0;i<9;i++){
            for(int j=1;j<9-i;j++)
            {
                System.out.print(" ");;
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("--------------------------");
        for(int i=0;i<=9;i++){
            for(int j=0;j<9-i;j++)
            {
                System.out.print(" ");;
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("--------------------------");
        for(int i=0;i<8;i++){

           for(int j=0;j<=15;j++){
               if (j==8-i||j==8+i) System.out.print("*");
               else System.out.print(" ");
           }
            System.out.println("");
            if(i==7){
                System.out.println("*****************");
            }
        }
        System.out.println("--------------------------");
        for(int i=0;i<=9;i++) {
            for (int j = 0; j <=9 - i; j++) {
                System.out.print(" ");
                ;
            }
            for (int k = 0; k < 2 * i - 1 ; k++) {
                System.out.print("*");
            }
                System.out.println("");
        }
        for(int i=0;i<=10;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=2*(9-i);k++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}