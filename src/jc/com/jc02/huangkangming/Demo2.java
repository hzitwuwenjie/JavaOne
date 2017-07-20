package jc.com.jc02.huangkangming;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月20日 - 15:58
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Demo2 {
    public static void main(String[] args) {
        int a = 380;
        int b = 1000;
        System.out.println("消费总金额："+((a+b)*0.8));
        System.out.println("我是黄康明");
        test();
    }
    public static void test(){
        int a=245;
        int b=570;
        int c=320;
        int d=1500;
        double x=(2*a+b+c)*0.8;
        System.out.println("*******购买清单*******");
        System.out.println("购买物品  "+"单价  "+"个数  "+"金额");
        System.out.println("黄金战衣  "+a+"     2     "+2*a);
        System.out.println("死亡之弩  "+b+"     1     "+b);
        System.out.println("水杖        "+c+"     1     " +c);
        System.out.println("折扣：          8折");
        System.out.println("消费总金额："+x);
        System.out.println("实际交费：   "+d);
        System.out.println("找钱：         "+(d-x));
        System.out.println("本次所获得积分："+((int)(x/100)*3));
    }
}
