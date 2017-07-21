package com.jc02.jiangzixu;

import java.util.Scanner;

/**
 * Created by 姜子旭 on 2017/7/21.
 */
public class Test4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("魔界饰品分发系统");
        System.out.println("1.登录系统"+"\n");
        System.out.println("2.退出");
        System.out.println("***********************************************************");
        System.out.println("请选择,输入数字：");

        int i = input.nextInt();

        switch (i) {
            case 1:
            {
                System.out.println("魔界饰品分发系统");
                System.out.println("***********************************************************");
                    System.out.println("1.会员信息管理");
                    System.out.println("2.购物结算");
                    System.out.println("3.装备返点");
                    System.out.println("4.注销"+"\n");
                System.out.println("请选择,输入数字：");
                int j = input.nextInt();
                switch (j){
                    case 1:
                        System.out.println("1.显示所有会员信息");
                        System.out.println("2.添加会员信息");
                        System.out.println("3.修改会员信息");
                        System.out.println("4.查询会员信息");
                    case 2:
                        System.out.println("1.幸运大放送");
                        System.out.println("2.幸运抽奖");
                        System.out.println("3.显生日问候");
                    case 3:break;
                    case 4:break;
                }
            }
            case 2:break;
        }
    }
}
