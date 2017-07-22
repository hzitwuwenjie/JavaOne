package com.jc02.fjx;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月21日 - 10:12
 * |    @description   登入界面
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi2 {
    public static void main(String[] args) {
        System.out.println("\tDNF勇士管理系统\t"+"\n"+"\t1.登录系统"+"\n"+"\t2.退出"+"\n"+"******************************");
        Scanner num = new Scanner(System.in);
        int i=0;
        System.out.print("请选择，输入数字:");
        i = num.nextInt();
        switch (i) {
            case 1:
                System.out.println("\tDNF勇士管理系统" + "\n" + "******************************");
                System.out.println("\t1.会员信息管理" + "\n" + "\t2.购物结算" + "\n" + "\t3.装备返点" + "\n" + "\t4.注销");
                System.out.print("请输入序号选择服务：");
                Scanner n = new Scanner(System.in);
                int g = n.nextInt();
                switch (g) {
                    case 1:
                        System.out.println("\t1.显示所有会员信息");
                        System.out.println("\t2.添加会员信息");
                        System.out.println("\t3.修改会员信息");
                        System.out.println("\t4.查询会员信息");
                        break;
                    case 2:
                        System.out.println("退出系统成功!");
                        break;
                    case 3:
                        System.out.println("死肥宅，不充钱还想要返点，滚！");
                        break;
                    case 4:
                        System.out.println("退出系统成功！");
                        break;
                        default:
                            System.out.println("数字输入错误！");
                }
                break;
            case 2:
                System.out.println("\t1.幸运大放送");
                System.out.println("\t2.幸运抽奖");
                System.out.println("\t3.生日问候");
                break;
            default:
                System.out.println("数字输入错误！");
        }
    }
}
