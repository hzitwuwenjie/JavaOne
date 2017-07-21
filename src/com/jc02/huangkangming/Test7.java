package com.jc02.huangkangming;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月21日 - 12:41
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=245; //黄金战衣价格
        int b=570;//水杖价格
        int c=320;//死亡之弩价格
        int shopno=0;//商品编号
        int purchaseCount=0;//购买数量
        int xiaoJi=0;
        int zongJi=0;
        int money;
        String flag;

        System.out.println("*****************************************");
        System.out.println("请选择购买商品的编号：");
        System.out.println("1.黄金战衣\t\t2.水杖\t\t3.死亡之弩");
        System.out.println("*****************************************");

        do{
            System.out.print("请输入商品编号：");
            shopno=in.nextInt();
            System.out.print("请输入购买数量：");
            purchaseCount=in.nextInt();
            if(shopno==1){
                xiaoJi=purchaseCount*a;
                System.out.println("黄金战衣￥"+a+"\t\t数量"+purchaseCount+"\t\t小计￥"+xiaoJi);
            }
            if(shopno==2){
                xiaoJi=purchaseCount*b;
                System.out.println("水杖￥"+b+"\t\t数量"+purchaseCount+"\t\t小计￥"+xiaoJi);
            }
            if(shopno==3){
                xiaoJi=purchaseCount*c;
                System.out.println("死亡之弩￥"+c+"\t\t数量"+purchaseCount+"\t\t小计￥"+xiaoJi);
            }
            zongJi+=xiaoJi;
            System.out.print("是否继续(y/n)");
            flag=in.next();
        }
        while(flag.equals("y"));
        System.out.println();

        System.out.println("享受折扣：0.8");
        System.out.println("原价："+zongJi);
        System.out.println("折扣价："+zongJi*0.8);
        System.out.print("实付金额：");
        money=in.nextInt();
        System.out.println("找钱："+(money-(zongJi*0.8)));

    }
}