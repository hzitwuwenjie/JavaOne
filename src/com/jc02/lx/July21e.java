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
import java.util.Scanner;
public class July21e {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Please enter a number end by 0: ");
        int num;
        int fu= 0;
        int zheng= 0;
        do {
            num= input.nextInt();
            if (num< 0)
            fu++;
            else
            zheng++;
        }while(num!= 0);
        System.out.println("正数的个数为 "+ zheng);
        System.out.println("负数的个数为 "+ fu );
    }
}
