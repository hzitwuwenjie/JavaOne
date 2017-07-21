package com.jc02.jiangzixu;
import java.util.Scanner;
/**
 * Created by 姜子旭 on 2017/7/21.
 */
public class Test8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("请选择要购买商品的编号： ");
        System.out.println("1.黄金战甲"+"\t\t"+"2.水仗"+"\t\t"+"3.死亡之弩");
        System.out.println("************************************");
        String yn= "y" ;
        int id,num,price,shifu;
        int sum=0,total=0;
        do {
            System.out.print("请输入商品编号：");
            id = input.nextInt();
            switch (id){
                case 1:
                    price=245;
                    System.out.print("请输入购买的数量：");
                    num = input.nextInt();
                    sum=num*price;
                    System.out.println("黄金战甲￥245\t"+"数量:"+num+"\t"+"合计:"+sum);
                    break;
                case 2:
                    price=570;
                    System.out.print("请输入购买的数量：");
                    num = input.nextInt();
                    sum=num*price;
                    System.out.println("手杖￥570\t"+"数量:"+num+"\t"+"合计:"+sum);
                    break;
                case 3:
                    price=320;
                    System.out.print("请输入购买的数量：");
                    num = input.nextInt();
                    sum=num*price;
                    System.out.println("死亡之弩￥320\t"+"数量:"+num+"\t"+"合计:"+sum);
                    break;
                default: break;
            }
            total+=sum;
            System.out.print("是否继续购买(y/n)：");
            yn=input.next();
        }while (yn.equals("y"));


        System.out.println("折扣："+"8折");
        System.out.println("应付金额："+total);

        System.out.print("实付金额：");
        shifu=input.nextInt();
        System.out.println("找钱："+(shifu-total));
    }
}
