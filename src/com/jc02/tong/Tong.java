package com.jc02.tong;

/*
 *
 * 　　  　  　     ***********
 * 　　　 　  　    \\　=_=　//
 * 　　　　　  　   (　 .@.@　)
 * +-------****-----( _ )-----****--------------------------------------------+
 * |　@author Tong　　　　　　                                                 |
 * |　@author 江西财经大学                                                     |
 * |　@create 2017年07月20日 - 14:39
 * |  @description   another
 * +---------------------------------Oooo---------------------------------------+
 */
public class Tong {

   /* public static void main(String[] args) {
        int a=10;
        int b=9;
        System.out.println('a'+a);
    }

    package com.beautiful.jxufe;



       public static void main(String[] args) {
           int a=380;
           int b=1000;
           double c=0.8*(a+b);
           System.out.println('c'+c);

       }
          */





        public static void main(String[] args) {
            int a = 1500;
            int b = 245 * 2;
            int c = 570;
            int d = 320;
            double e = (b + c + d) % 100 * 3;
            double f = (b + c + d) * 0.8;
            double g = 1500 - (b + c + d) * 0.8;

            System.out.println("-------" + "*消费单*" + "--------");
            System.out.println("购买物品" + "单价" + "个数" + "金额");
            System.out.println("黄金战衣" + "245"  + "2"   + "b");
            System.out.println("死亡之弩" + "570"  + "1"   + "c");
            System.out.println("水杖"     + "320"  + "1"   + "d");

            System.out.println("折扣"       + "8折");
            System.out.println("消费总金额" + 'f'    + f);
            System.out.println("实际交费"   + "1500");
            System.out.println("找钱"       + g);
            System.out.println("积分"       + e);
        }

}
