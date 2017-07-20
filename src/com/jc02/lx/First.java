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
 * |    @description   sdfghjk
 * +---------------------------------Oooo---------------------------------------+
 */
public class First {
    public static void main(String[] args) {
            String[] menu= new String[2];
            menu[0]= "黄金战衣";
            menu[1]= "地狱咆哮的尖刀";
        double[] price=new double[2];
        price[0]= 380;
        price[1]= 1000;

        double count= 0;
        for(int i=0; i< price.length; i++){
            count+= price[i];
        }
        double finalcount= count* 0.8;
        System.out.println("消费总金额: "+ finalcount);
    }
}
