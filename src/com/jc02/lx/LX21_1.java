package com.jc02.lx;/**
 * Created by 响 on 2017/7/21.
 */

import java.util.Scanner;

/**
 * 　　  　  　     \\\|///
 * 　　　 　   　  \\ - -//
 * 　　　　　   　(　 @.@　)
 * +-------oOOo-----( v )-----oOOo--------------------------------------------+
 * |　@author Lee　　　　　　                                                                 　|
 * |　@author jxufe                                                   |
 * |　@create 2017年07月20日 - 10:23
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LX21_1 {
    public static void main(String[] args) {
        /**
         * 1`输入一个数，模2，
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num= input.nextInt();
        String string= "";
        while(num!= 0){
            string= string+ num% 2;
            num/= 2;
        }
        for (int i= string.length()- 1; i> 0; i--){
            System.out.print(string.charAt(i));
        }
        System.out.println(11%2);
//        Scanner input= new Scanner(System.in);
//        System.out.print("请输入一个正整数：");
//        int num= input.nextInt();
//        int n= 0;
//        int[] arr= new int[num];
//        while(num== 0){
//            System.out.print("请重新输入一个正整数：");
//            num= input.nextInt();
//        }
//        for (int i= 0; i< arr.length; i++){
//            if (num% 2== 0)
//                arr[i]= 0;
//            else
//                arr[i]= 1;
//            System.out.print(arr[i]);
//            num/= 2;
//        }
//        if(num% 2!= 1)
//        {
//            n= num% 2;
//        }
//        else
//        {
//            n= (num+ 1)% 2;
//        }
//        int count= 0;
//        int[] bri= new int[n];
//            for (int i= 0; i< num/ 2; i++){
//                if(num/ 2== 0)
//                {
//                    bri[i]= 0;
//                    num/= 2;
//                }
//                else
//                {
//                    bri[i]= 1;
//                    num= (num- 1)/ 2;
//                }
//
//            }
//        for (int i= 0; i< n; i++){
//            System.out.print(bri[i]);
//        }
    }
}
