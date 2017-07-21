package com.jc02.yangyoufeng;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author  xxxx                                              |
 * |　@create 2017年07月21日 - 10:15
 * |    @description   Switch选择结构
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("\t\t\t魔界饰品分发系统\t\t\t");
        System.out.println("\t\t\t\t\t1.登陆系统\t\t\t\t\t");
        System.out.println("\t\t\t\t\t2.退出\t\t\t\t\t");
        System.out.println("**********************************");
        System.out.println("请选择，输入数字：");
        int i=input.nextInt();
        switch (i){
            case 1:
                System.out.println("\t\t\t\t\t魔界饰品分发系统\t\t\t\t");
                System.out.println("**********************************");
                System.out.println("\t\t\t\t\t\t\t\t1.会员信息管理\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t2.购物结算\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t3.装逼返点\t\t\t\t");
                System.out.println("\t\t\t\t\t\t\t\t4.注销\t\t\t\t");
                int j=input.nextInt();
                switch(j){
                    case 1: System.out.println("\t\t\t\t\t\t\t\t会员信息管理\t\t\t\t");
                            System.out.println("\t\t\t 1,查询会员信息 \t\t\t\t");
                            System.out.println("\t\t\t 2,添加员信息 \t\t\t\t");
                            System.out.println("\t\t\t 3,会修改员信息\t\t\t\t");
                            System.out.println("\t\t\t 4,删除会员信息 \t\t\t\t");
                        int h=input.nextInt();
                    switch(h){
                        case 1:System.out.println("\t\t\t\t查询会员信息 \t\t\t\t");
                               System.out.println("**********************************");
                               System.out.println("\t\t\t 1,幸运大放送 \t\t\t\t");
                               System.out.println("\t\t\t 2,幸运抽奖 \t\t\t\t");
                               System.out.println("\t\t\t 3,生日问候 \t\t\t\t");
                               int k=input.nextInt();
                            switch(k){
                                case 1:System.out.println("\t\t\t 幸运大放送 \t\t\t\t");break;
                                case 2:System.out.println("\t\t\t 幸运抽奖 \t\t\t\t");break;
                                case 3:System.out.println("\t\t\t 生日问候 \t\t\t\t");break;
                            }
                        case 2:System.out.println("\t\t\t\t添加员信息 \t\t\t\t");break;
                        case 3:System.out.println("\t\t\t\t会修改员信息\t\t\t\t");break;
                        case 4:System.out.println("\t\t\t\t删除会员信息 \t\t\t\t");break;
                    }
                        break;
                    case 2: System.out.println("\t\t\t\t\t\t\t\t2.购物结算\t\t\t\t");break;
                    case 3: System.out.println("\t\t\t\t\t\t\t\t3.装逼返点\t\t\t\t");break;
                    case 4: System.out.println("\t\t\t\t\t\t\t\t4.注销\t\t\t\t");
                }
                break;
            case 2:
                System.out.println("\t\t\t\t\t退出\t\t\t\t");
                break;
        }

    }
}