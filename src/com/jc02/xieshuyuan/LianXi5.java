package com.jc02.xieshuyuan;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月21日 - 12:43
 * |    @description   循环语句操作商品购买付账
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi5 {
    public static void main(String[] args) {
        System.out.println("****************************************************");
        System.out.println("请选择购买的商品编号：");
        System.out.println("1.黄金战甲\t2.水杖\t3.死亡之奴");
        System.out.println("****************************************************");
        String menu="y";
        float pay=0;
        do {
            //输入商品编号
            System.out.print("请输入商品编号：");
            Scanner input1=new Scanner(System.in);
            int id=input1.nextInt();
            //输入该商品的数量
            System.out.print("请输入购买数量：");
            Scanner input2=new Scanner(System.in);
            int number=input2.nextInt();
            //商品名称价格数组
            String[] item={"","黄金战甲 ￥245.0","水杖 ￥570.0","死亡之奴￥320"};
            int[] price={0,245,570,320};
            //计算所选的商品购买总价格，并打印该商品账单
            float total=price[id]*number;
            System.out.println(item[id]+"\t\t数量"+number+"\t\t合计"+total);
            pay=+total;
            System.out.print("是否继续（y/n）");
            Scanner input3=new Scanner(System.in);
            menu=input3.nextLine();
            System.out.print(menu);
        }while(menu=="y");
        System.out.println("折扣：0.8");
        System.out.println("应付金额："+pay);
        float money=5000;
        System.out.println("实付金额："+money);
        System.out.println("找钱："+(money-pay));
    }
}
