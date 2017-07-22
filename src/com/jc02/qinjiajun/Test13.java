package com.jc02.qinjiajun;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月21日 - 18:42
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test13 {
    public  void a(){
        for(int i=1;i<10;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
       public void  b(){
           for(int i=1;i<11;i++) {
               for (int j = 1; j <= i; j++) {
                   System.out.print(" ");
               }
               for(int l=10;l>i;l--)
               {
                   System.out.print("*");
               }
               System.out.println("");
           }
       }
    public void  d(){
        for(int i=1;i<11;i++) {
            for(int l=11;l>i;l--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            for(int l=11;l>i;l--)
            {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public void  c(){
        for(int i=1;i<11;i++) {
            for(int l=10;l>i;l--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void  f(){
        for(int i=1;i<11;i++) {
            for(int l=11;l>i;l--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            for(int l=11;l>i;l--)
            {
                System.out.print(" ");
            }

            System.out.println("");
        }
    }
    public void  g(){
        for(int i=1;i<11;i++) {
            for(int l=11;l>i;l--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            for(int l=11;l>i;l--)
            {
                System.out.print(" ");
            }
            System.out.println("");
        }

        for(int i=1;i<11;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int l=10;l>i;l--)
            {
                System.out.print("*");
            }

            for(int l=11;l>i;l--)
            {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public void  A1(){
        for(int i=1;i<11;i++) {
            for(int l=10;l>i;l--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if(i==j)
                System.out.print("*");
            }
            for (int j = 1; j <= i-2; j++) {
                    System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
            }
            for (int j = 2; j <= i; j++) {
                if(j==i)
                System.out.print("*");
            }
            for(int l=10;l>i;l--)
            {
                System.out.print(" ");
            }
            System.out.println("");
        }
        for(int j=1;j<11;j++)
            System.out.print("* ");
    }



    public static void main(String[] args) {
        Test13 as =new Test13();
        as.A1();
    }
}


