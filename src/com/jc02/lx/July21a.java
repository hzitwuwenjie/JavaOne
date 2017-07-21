package com.jc02.lx;/**
 * Created by 响 on 2017/7/21.
 */

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
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;
public class July21a {
    public static void main(String[] args) {
//        int[] vipn= new int[4];
        Random rand= new Random();
        int num= rand.nextInt(10);
        Scanner input= new Scanner(System.in);
        System.out.print("请输入一个四位数号码: ");
        int vipn= input.nextInt();
        if (vipn> 9999 || vipn< 1000)
            System.out.println("这并不是一个四位数！");
        else{
            if (vipn/100%10== num)
                System.out.println("Congratuation!U got the bonus!");
            else
                System.out.println("Sorry,you didn't got the number.");
        }
    }
}
