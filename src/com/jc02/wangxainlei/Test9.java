package com.jc02.wangxainlei;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;
public class Test9 {
    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        int a=100;// 黄金战甲
        int b=200;//水杖
        int c=300;//死亡之舞
        int spid=0;//商品编号
        int count=0;// 数量
        int xiaoji=0;
        int sum=0;
        int shifu=0;
        String flag=" ";
        System.out.println("-------------------------------------");
        System.out.println("+\t请选择要购买的商品编号:\t\t\t+");
        System.out.println("+\t1-黄金战甲\t2-水杖\t3-死亡之舞\t+");
        System.out.println("-------------------------------------");
        do {
            System.out.print("请输入商品编号：");
            spid = input.nextInt();
            System.out.print("请输入购买数量：");
            count = input.nextInt();
            switch(spid){
                case 1:
                    spid=a;
                    System.out.print("黄金战甲\t");
                    break;
                case 2:
                    spid=b;
                    System.out.print("水杖\t");
                    break;
                case 3:
                    spid=c;
                    System.out.print("死亡之舞\t");
                    break;
            }
            xiaoji=spid*count;
            System.out.print(count+"合计"+xiaoji);
            System.out.println("是否继续购买（Y/N）");
            flag= input.next();
            sum=sum+xiaoji;

        }while(flag.equals("Y"));

        System.out.println("折扣：8折");
        System.out.println("原价:"+sum);
        System.out.println("优惠价:"+sum*0.8);
        shifu= input.nextInt();
        System.out.println("实付金额:"+shifu);
        System.out.println("找零:"+(shifu-sum*0.8));





    }


}
