package com.jc02.liwei;/**
 * Created by 熊不举 on 2017/7/21.
 */

import java.util.Scanner;

/**
 * 　　  　  　    \\\|///
 * 　　　 　 　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo----( _ )-----oOOo--------------------------------------------+
 * |　@author 李伟　　　　　　                                                                 　|
 * |　@author 学习                                                   |
 * |　@create 2017年07月21日 - 19:46
 * |    @description   　　　将一个数以二进制形式输出
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi9 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("请输入一个整：");
            int i = input.nextInt();
            StringBuffer s = new StringBuffer("");
            while(i/2!=1){
                s.append(i%2);
                i /= 2;
            }
            s.append(i%2);
            s.append(1);
            System.out.println(s.reverse());
        }

    }

