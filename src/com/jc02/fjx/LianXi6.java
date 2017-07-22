package com.jc02.fjx;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月21日 - 15:16
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi6 {
    public static void main(String[] args) {
        Scanner num =new Scanner(System.in);
        int n=0;
        int y=0;
        int a=245;
        int b=570;
        int c=320;
        int xiaoji =0;
        int heji =0;
        int jine= 0;
        String yn="";
        System.out.println("**************************************");
        System.out.println("请选择购买的商品编号：");
        System.out.println("1.黄金战甲\t"+"2.水杖\t"+"3.死亡之弩");
        System.out.println("**************************************");
        do {
            System.out.print("请输入商品编号：");
            n = num.nextInt();
            switch (n){
                case 1:
                    System.out.print("请输入购买数量：");
                    y = num.nextInt();
                    System.out.println("黄金战甲¥"+"数量"+a+"\t\t"+y+"\t\t"+"合计¥"+ (a*y*1.0));
                    System.out.print("是否继续(y/n)：");
                    xiaoji=a*y;
                    break;
                case 2:
                    System.out.print("请输入购买数量：");
                    y = num.nextInt();
                    System.out.println("水杖¥"+"数量"+b+"\t\t"+y+"\t\t"+"合计¥"+ (b*y*1.0));
                    System.out.print("是否继续(y/n)：");
                    xiaoji=b*y;
                    break;
                case  3:
                    System.out.print("请输入购买数量：");
                    y = num.nextInt();
                    System.out.println("死亡之弩¥"+"数量"+"\t\t"+y+"\t\t"+"合计¥"+ (c*y*1.0));
                    System.out.print("是否继续(y/n)：");
                    xiaoji=c*y;
                    break;
            }
            heji=heji+xiaoji;
            yn=num.next();
        }while(yn.equals("y"));
        System.out.println("折扣：8折");
        System.out.println("应付金额："+(heji*0.8));
        System.out.print("实付金额：");
        jine=num.nextInt();
        System.out.println("找钱："+(jine-heji*0.8));
    }
}
