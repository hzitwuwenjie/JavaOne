package com.jc02.laimingfei;

import java.util.Scanner;

/**
 * Created by ${赖明飞} .
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("魔界饰品分发系统");
        System.out.println("1.登陆系统");
        System.out.println("0.退出 ");
        System.out.println("***************************");
        System.out.println("请选择，输入数字");
        int number1=input.nextInt();
        switch (number1){
            case 0:
                break;
                case 1:
                    System.out.println("魔界饰品分发系统");
                    System.out.println("**************");
                    System.out.println("1.会员信息管理");
                    System.out.println("2.购物结算");
                    System.out.println("3.装备返点");
                    System.out.println("4.注销");
                    System.out.println("************");
                    System.out.println("请选择，输入数字");
                    int number2=input.nextInt();
                    switch (number2){
                        case 1:
                            System.out.println("1.显示所有会员信息");
                            System.out.println("2.添加会员信息");
                            System.out.println("1.修改会员信息");
                            System.out.println("1.查询会员信息");
                            break;
                        case 2:
                            System.out.println("1.幸运大放送");
                            System.out.println("幸运大放送");
                            System.out.println("生日问候");
                            break;
                        case 3:
                            System.out.println("装备返点");
                            break;
                        case 4:
                            System.out.println("注销");
                            break;
                            default:
                                System.out.println("数字不正确，请输入1，2，3，4");
                                break;
                    }
                    break;
                    default:
                        System.out.println("数字不正确，请输入1和0");
                        break;
        }

    }
}
