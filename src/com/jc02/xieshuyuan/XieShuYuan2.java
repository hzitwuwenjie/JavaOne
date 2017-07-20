package com.jc02.xieshuyuan;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月20日 - 14:35
 * |    @description    ‘消费单’
 * +---------------------------------Oooo---------------------------------------+
 */
public class XieShuYuan2 {
    public static void main(String[] args) {
        int a=245;
        int a_number=2;
        int a_totall=a*a_number;
        int b=570;
        int b_number=1;
        int b_totall=b*b_number;
        int c=320;
        int c_number=1;
        int c_totall=c*c_number;
        float totall=(a*a_number+b*b_number+c*c_number)*0.8f;
        float money=1500;
        float balance=money-totall;
        int sore=(int)totall/100*3;
        System.out.println("***********﹡消费单﹡***********");
        System.out.println("购买物品"+"    "+"单价"+"    "+"个数"+"    "+"个数");
        System.out.println("黄金战衣"+"    "+"￥245"+"   "+"2"+"       "+"￥"+a_totall);
        System.out.println("死亡之奴"+"    "+"￥570"+"   "+"1"+"       "+"￥"+b_totall);
        System.out.println("水杖    "+"    "+"￥320"+"   "+"1"+"       "+"￥"+c_totall);
        System.out.println("折扣："+"      "+"8折");
        System.out.println("消费总金额"+"  "+"￥"+totall);
        System.out.println("实际交费"+"    "+"￥"+money);
        System.out.println("找钱"+"        "+"￥"+balance);
        System.out.println("本次购物所获得的积分是："+sore);
    }
}
