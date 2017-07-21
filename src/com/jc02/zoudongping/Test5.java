package com.jc02.zoudongping;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 10:42
 * |    @description     循环
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test5 {
    public static void main(String[] args) {
        int a=245;
        int b=570;
        int c=320;
        int sum=0;
        int Sum=0;
        String flag;
        Scanner in=new Scanner(System.in);

        do {
            System.out.println("***********************");
            System.out.println("请输入需要购买的编号");
            System.out.println("1.黄金之翼");
            System.out.println("2.水杖");
            System.out.println("3.死亡之怒");
            System.out.println("***********************");
            System.out.println("输入商品编号");
            int i = in.nextInt();
            System.out.println("输入商品数量");
            int k = in.nextInt();
            switch (i)
            {
                case 1: sum=a*k;
                    System.out.println("黄金之翼"+a+"\t"+k+"\t"+sum);
                    break;
                case 2: sum=b*k;
                    System.out.println("水杖"+b+"\t"+k+"\t"+sum);
                    break;
                case 3: sum=c*k;
                    System.out.println("死亡之怒"+c+"\t"+k+"\t"+sum);
                    break;
            }
            Sum=Sum+sum;
            System.out.println("是否继续购买?(y/n)");
            flag=in.next();
        }while(flag.equals("y"));
        System.out.println("享受8折优惠!");
        System.out.println("应付金额：\t"+Sum*0.8);
        System.out.println("实收金额\t");
        int money=in.nextInt();
        System.out.println("找零\t"+(money-Sum*0.8));
    }
}




