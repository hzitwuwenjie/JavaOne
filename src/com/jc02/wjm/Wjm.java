package com.jc02.wjm;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月20日 - 16:59
 * |  @description   s
 * +---------------------------------Oooo---------------------------------------+
 */
public class Wjm {
    public static void main(String[] args) {
int e,f;
        Calander c=new Calander();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入年份");
        int y=input.nextInt();
        int m=1;
        do {
            c.showCalander(y,m);
            System.out.println("\n请选择n显示接下来一个月,p显示前一个月，all显示当年所有月：");
            String d=input.next();

           if(d.equalsIgnoreCase("n")) {
                m++;
                if(m>12)
                {y++;
                m=1;}
            }
           else if(d.equalsIgnoreCase("p")) {
                m--;
                if(m<1)
                {
                    y--;
                m=12;}
            }
            else if(d.equalsIgnoreCase("all")) {
               for(int k=1;k<=11;k++)
               c.showCalander(y,k);
                   m=12;
            }
            else {
                break;
            }

        }while (true);
    }
}