package com.jc02.qinjiajun;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月20日 - 17:32
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test2
{
    public static void main(String[] args) {
        int num1=245;
        int num2=570;
        int num3 = 320;
        double  num4=(num1*2+num2+num3)*0.8;
        int num5=(int) (num4/100)*3;
        System.out.println("************消费单**************");
        System.out.println("购买物品\t" + "单价\t"+"个数\t" +"金额");
        System.out.println("黄金战衣\t" + "$"+num1+"\t"+2+" $"  +  2*num1);
        System.out.println("死亡之杖\t" + "$"+num2+"\t"+1+"$"  +  1*num1);
        System.out.println("水杖\t" + "$"+num3+"\t"+1+"$"  +  1*num1);
        System.out.println("\n");
        System.out.println("折扣\t" + "8折 ");
        System.out.println("消费总金额\t " + "￥"+num4);
        System.out.println("实际缴费\t " + "￥"+1500);
        System.out.println("找零\t" +"￥"+(1500-num4));
        System.out.println("积分\t" +num5);
    }
}