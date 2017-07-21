package com.jc02.lx;/**
 * Created by 响 on 2017/7/21.
 */

/**
 * 　　  　  　     \\\|///
 * 　　　 　   　  \\ - -//
 * 　　　　　   　(　 @.@　)
 * +-------oOOo-----( v )-----oOOo--------------------------------------------+
 * |　@author Lee　　　　　　                                                                 　|
 * |　@author jxufe                                                   |
 * |　@create 2017年07月20日 - 10:23
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
import java.util.Scanner;
public class July21f {
    public static void main(String[] args) {
        String[] menu = new String[3];
        double[] price = new double[3];
        menu[0] = "黄金战衣";
        menu[1] = "死亡之女";
        menu[2]= "水杖";
        price[0]= 245;
        price[1]= 570;
        price[2]= 320;
        Scanner input= new Scanner(System.in);
        String goodsnum;
        int amount;
        double money= 0;
        double moneyamount= 0;
        String string="";
        do{
            System.out.println("1`黄金战衣\t\t\t2`死亡之女\t\t\t3`水杖");
            System.out.println("ENTER THE GOODSNUMBER END BY N: ");
            int i =input.nextInt();
            System.out.println("ENTER THE AMOUNT: ");
            amount= input.nextInt();
             money=price[i-1] * amount;
            moneyamount+= money;
            System.out.println(menu[i-1]+" 数量 "+ amount+ "件\t\t\t\t\t\t价格 "+ money+ "元");
            System.out.println("continue? ");
            System.out.println("ENTER THE GOODSNUMBER END BY N: ");
            string= input.next();
        }while(!string.equals("n"));
        double finalmoney= 0.8* moneyamount;

        System.out.println("折扣：0.8\n应付金额 "+ finalmoney+"\n");
        System.out.print("实付金额：");
        double shifu= input.nextDouble();
        double change= shifu- finalmoney;
        System.out.println("找零"+ change);
    }
}
