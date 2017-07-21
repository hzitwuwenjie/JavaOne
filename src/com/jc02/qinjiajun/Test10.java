package com.jc02.qinjiajun;

import java.util.Scanner;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月21日 - 15:36
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test10 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int num;
        int a=0;
        int b =0;
        for(int i=1;i<11;i++)
        {
            System.out.println("请输入第"+i+"位客人的年龄");
            num=scan.nextInt();
            if(num>30)
                a++;
            else
                b++;
        }
        System.out.println("年龄30以上的客人占比"+(a/10.0)*100+"%");
        System.out.println("年龄30以下的客人占比"+(b/10.0)*100+"%");
    }
}