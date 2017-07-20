package com.jc02.jiangzixu;

/**
 * Created by 姜子旭 on 2017/7/20.
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("购买物品    单价      个数   金额   ");
        double[] price = new double[]{245.0D, 570.0D, 320.0D};
        System.out.println("黄金战衣    ￥" + price[0] + "    " + 2 + "    ￥" + 2.0D * price[0]);
        System.out.println("死亡之弩    ￥" + price[1] + "    " + 1 + "    ￥" + price[1]);
        System.out.println("手杖        ￥" + price[2] + "    " + 1 + "    ￥" + price[2]);
        double total = 2.0D* price[0] + price[1] + price[2];
        double sum = 0.8D * total;
        int  num = (int)(3*sum/ 100);
        System.out.println("折扣:          8折");
        System.out.println("消费总金额： ￥" + sum);
        System.out.println("实际交费：   ￥1500.0");
        System.out.println("找钱：       ￥" + (1500.0D - sum));
        System.out.println("本次购物所获积分：" + num);
    }

}
