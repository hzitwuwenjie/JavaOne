package com.jc02.fankelei;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 12:04
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=245;
        int b=570;
        int c=320;
        int sum=0;
        int r=0;
        double z=0.8;
        String x="";
        System.out.println("***********************************");
        System.out.println("请选择购买的商品编号:");
        System.out.println("1.黄金战甲"+"\t2.水仗"+"\t3.死亡之弩");
        System.out.println("***********************************");


        do{
            System.out.print("输入商品编号:");
            int no=input.nextInt();
        switch (no) {
            case 1:
                System.out.print("输入购买数量:");
                int count=input.nextInt();
                sum=a*count;
                System.out.println("黄金战甲" + "¥" + a + "\t数量" + count + "\t合计" + sum);
                break;
            case 2:
                System.out.print("输入购买数量:");
                count=input.nextInt();
                sum=b*count;
                System.out.println("水仗" + "¥" + b + "\t数量" + count + "\t合计" + sum);
                break;
            case 3:
                System.out.print("输入购买数量:");
                count=input.nextInt();
                sum=c*count;
                System.out.println("死亡之弩" + "¥" + c + "\t数量" + count + "\t合计" + sum);
                break;
            default:
                System.out.println("商品不存在");
                break;



            }
            r=r+sum;
            System.out.print("是否继续(y/n)");
            x=input.next();

        } while (x.equals("y"));
        System.out.println("折扣:"+z);
        System.out.println("应付金额"+(r*z));
        System.out.print("实付金额");
        int w=input.nextInt();
        System.out.println("找钱"+(w-(r*z)));



    }
}
