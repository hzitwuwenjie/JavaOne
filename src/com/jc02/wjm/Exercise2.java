package com.jc02.wjm;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月20日 - 17:25
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Exercise2 {
    public static void main(String[] args) {
        int a=245,b=570,c=320,d=1500,e,f,g;
        e=2*a+b+c;
        f= (int) (d-(e*0.8));
        g= (int) (e*0.8/100*3);
        System.out.println("**********消费单**********");
        System.out.println("购买物品   单价   个数   金额 ");
        System.out.println("黄金战甲\t"+a+"\t2\t"+'￥'+2*a);
        System.out.println("死亡之奴\t"+b+"\t1\t"+'￥'+b);
        System.out.println("冰杖\t"+c+"\t1\t"+'￥'+c);
        System.out.println("折扣:  8折");
        System.out.println("消费总金额:"+'￥'+e*0.8);
        System.out.println("实缴金额："+'￥'+d);
        System.out.println("找钱:"+'￥'+f);
        System.out.println("消费积分："+g);

    }
}
