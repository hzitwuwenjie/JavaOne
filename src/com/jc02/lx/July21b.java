package com.jc02.lx;/**
 * Created by 响 on 2017/7/21.
 */

import java.util.Scanner;

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
public class July21b {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);

        System.out.print("1、系统登陆\n2、退出系统\n************************\nPlease enter a number(1/2): ");
        int num1= input.nextInt();
        switch(num1){
            case 1:
            System.out.println("摩羯军需处\n************************\n1、会员信息管理\n2、购物结算\n3、装备返点\n4、注销\n************************\n");
                System.out.print("Enter a chorice: ");
                int num2= input.nextInt();
                switch(num2){
                    case 1:
                        System.out.println("1、显示所有会员信息\n1、添加会员信息\n1、修改会员信息\n1、查询会员信息\n");
                        break;
                    case 2:
                        System.out.println("1、幸运大放送\n1、幸运抽奖\n1、生日问候\n");
                        break;
                    case 3:
                        System.out.println("null");
                        break;
                    case 4:
                        System.out.println("null");
                        break;
                }
                break;
            case 2:
                System.out.print("系统已退出");
                break;
            default:
                System.out.println("null");
                break;
        }

    }
}
