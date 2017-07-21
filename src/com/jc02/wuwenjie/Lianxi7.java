package com.jc02.wuwenjie;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 　༺༺超༒神༻༻
 * |　@author 深圳合众艾特信息技术有限公司
 * |　@create 2017年07月21日 - 11:15
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi7 {

    public static void main(String[] args) {
        int a = 245;  //黄金战衣的价格
        int b = 570;  //水仗价格
        int c = 320;  //死亡之弩的价格
        int shopno = 0;  //接受商品编号
        int shopcount = 0;
        int xiaoji=0;
        int heji=0;
        String flag="";
        int moeny=0;
        Scanner input = new Scanner(System.in);
        System.out.println("*************************************");
        System.out.println("请选择要购买的商品编号");
        System.out.println("1·黄金战衣\t2·水仗\t3·死亡之弩");
        System.out.println("*************************************");

        do {
            System.out.print("请输入商品编号:");
            shopno = input.nextInt();
            System.out.print("请输入购买数量:");
            shopcount = input.nextInt();
            switch (shopno){
                case 1:
                    xiaoji=    a*shopcount;
                    System.out.println("黄金战衣\t"+a+"\t\t"+shopcount+"\t"+xiaoji);
                    break;
                case 2:
                    xiaoji=b*shopcount;
                    System.out.println("水仗\t"+a+"\t\t"+shopcount+"\t"+xiaoji);
                    break;
                case 3:
                    xiaoji=c*shopcount;
                    System.out.println("死亡之弩\t"+a+"\t\t"+shopcount+"\t"+xiaoji);
                    break;
            }
            heji=heji+xiaoji;
            System.out.println("是否继续购买！(y/n)");
            flag= input.next();
        } while (flag.equals("y")   );

        System.out.println("享受折扣8折");
        System.out.println("原价:"+ heji);
        System.out.println("优惠价:"+ heji*0.8);
        System.out.println("实收金额");
        //接受用户输入的实付金额
        moeny=input.nextInt();
        System.out.println("找零:"+ (moeny-heji*0.8));
    }
}
