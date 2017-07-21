package com.jc02.yangyoufeng;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author ×××                                                   |
 * |　@create 2017年07月21日 - 13:45
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int zhengshu=0;
        int fushu=0;
        int number=0;
        do {
            number=input.nextInt();
            if (number<0)
                fushu++;
            else if(number>0)
                zhengshu++;
        }
        while(number!=0);
        System.out.println("输入正数的次数"+zhengshu);
        System.out.println("输入负数的次数"+fushu);

    }
}
