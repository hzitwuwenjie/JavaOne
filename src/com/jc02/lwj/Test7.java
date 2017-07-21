package com.jc02.lwj;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 李文俊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 13:31
 * |    @description   买装备
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test7 {
    public static void main(String[] args) {
        int a=245;
        int b=570;
        int c=320;
        int no;
        int count;
        int xiaoji=0;
        int heji=0;
        String flag;
        int money;
        Scanner input=new Scanner(System.in);
        System.out.println("***************");
        System.out.println("请选择购买的商品编号：");
        System.out.println("1.黄金战甲\t\t2.水杖\t\t3.死亡之弩");
        do{
            System.out.println("请输入商品编号：");
            no=input.nextInt();
            System.out.println("请输入购买数量：");
            count=input.nextInt();
            switch (no){
                case 1:
                    xiaoji=a*count;
                    System.out.println("黄金战甲\t"+"¥"+a+"\t"+count+"\t"+xiaoji);
                    break;
                case 2:
                    xiaoji=b*count;
                    System.out.println("水杖\t"+"¥"+b+"\t"+count+"\t"+xiaoji);
                    break;
                case 3:
                    xiaoji=c*count;
                    System.out.println("死亡之弩\t"+"¥"+c+"\t"+count+"\t"+xiaoji);
                    break;
            }
            heji=heji+xiaoji;
            System.out.println("是否继续购买？(y/n)");
            flag=input.next();//字符型是用next()
        }while(flag.equals("y"));
        System.out.println("享受8折优惠");
        System.out.println("应付金额"+heji);
        System.out.println("实收金额:");
        money=input.nextInt();
        System.out.println("找零"+(money-heji*0.8));
    }
}
