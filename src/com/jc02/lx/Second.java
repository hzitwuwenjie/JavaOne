package com.jc02.lx;/**
 * Created by 响 on 2017/7/20.
 */

/**
 * 　　  　  　     \\\|///
 * 　　　 　   　  \\ - -//
 * 　　　　　   　(　 @.@　)
 * +-------oOOo-----( v )-----oOOo--------------------------------------------+
 * |　@author Lee　　　　　　                                                                 　|
 * |　@author jxufe                                                   |
 * |　@create 2017年07月20日 - 10:23
 * |  @description   sdfghjk
 * +---------------------------------Oooo---------------------------------------+
 */
public class Second {
    public static void main(String[] args) {
        String[] menu = new String[3];
        double[] price = new double[3];
        int[] amount= new int[3];
        amount[0]= 2;
        amount[1]= 1;
        amount[2]= 1;
        menu[0] = "黄金战衣";
        menu[1] = "死亡之女";
        menu[2]= "水杖";
        price[0]= 245;
        price[1]= 570;
        price[2]= 320;
        double count= 0;
        System.out.println("**************消费清单*************");
        System.out.println("购买物品    单价    个数     金额");
        for(int i= 0; i< menu.length; i++){
            count= price[i]* amount[i];
            System.out.printf("%-5d %-5d %-5d￥ %-5d", menu[i], price[i], amount[i], count);
            count+= count;
        }

        double finalcount= count* 0.8;
        int jifen= (int)finalcount/ 100* 3;
        System.out.println("折扣：8折\n消费总金额：￥"+ finalcount+"\n实际交费：￥1500"+ "\n找钱：￥"+ (1500- finalcount)+"\n本次购物所获积分："+ jifen);


    }
}
