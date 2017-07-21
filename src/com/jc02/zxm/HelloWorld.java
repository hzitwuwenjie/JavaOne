package com.jc02.zxm;
import java.util.Random;
import java.util.Scanner;
/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月20日 - 16:23
 * |    @description   HelloWorld
 * +---------------------------------Oooo---------------------------------------+
 */
public class HelloWorld {
    public static void main(String[] args) {

        System.out.println("please input a num:");
        Scanner input=new Scanner(System.in);
        Random rand=new Random(10);
        int b =input.nextInt();

        int c;
        for (int i=0;i<6;i++)
        {
            int a =rand.nextInt(100);
            c=a+b;
            System.out.println(c);
            System.out.println("Hello,My name is 曾宪明");
        }
    }
}

