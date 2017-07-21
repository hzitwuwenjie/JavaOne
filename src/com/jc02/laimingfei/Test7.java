package com.jc02.laimingfei;

import java.util.Scanner;

/**
 * Created by ${赖明飞} .
 */
public class Test7 {
    public static void main(String[] args) {
    int a=245;
    int b=570;
    int c=320;
        System.out.println("**********************************");
        System.out.println("请选择购买的商品编号：");
        System.out.println("1.黄金战甲\t\t\t2.水杖\t\t\t3.死亡之弩");
        System.out.println("***********************************");
    Scanner input=new Scanner(System.in);
    String flag="";
    int shopno=0;
    int shopcount=0;
    int xiaoji=0;
    int sum=0;
    int shifu=0;
        do{
        System.out.print("请输入商品编号 ：");
        shopno=input.nextInt();
        System.out.print("请输入商品数量：");
        shopcount=input.nextInt();
        if(shopno==1){
            xiaoji=shopcount*245;
            System.out.println("黄金战甲￥245.0\t\t"+"\t数量\t"+shopcount+"\t合计\t￥"+xiaoji);
        }
        if(shopno==2){
            xiaoji=shopcount*570;
            System.out.println("水杖￥570.0\t\t"+"\t数量\t"+shopcount+"\t合计\t￥"+xiaoji);

        }
        if(shopno==3){
            xiaoji=shopcount*320;
            System.out.println("死亡之弩￥320.0\t\t"+"\t数量\t"+shopcount+"\t合计\t￥"+xiaoji);

        }
        sum=sum+xiaoji;
        System.out.print("是否继续（y/n）");
        flag=input.next();
    }while(flag.equals("y"));
        System.out.println("折扣为：0.8");
        System.out.println("应付金额："+sum*0.8);
        System.out.print("实付金额：");
    shifu=input.nextInt();
        System.out.println("找钱："+(shifu-(sum*0.8)));

}
}

