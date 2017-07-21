package com.jc02.zoudongping;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 15:05
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test11 {
    public static void main(String[] args) {
        int pwd=666666;
        int user=666666;
        for(int i=0;i<3;i++)
        {
            Scanner u =new Scanner(System.in);
            System.out.println("请输入账户：");
            int a=u.nextInt();
            System.out.println("请输入密码:");
            int b=u.nextInt();
            if(a==user&&b==pwd){
                System.out.println("登录成功");
                break;
            }
            else {
                if (2-i==0)
                    System.out.println("登录次数已无！您的用户将被锁定24小时");
                else
                System.out.println("账号密码错误!您还剩"+(2-i)+"次登录机会");
            }

        }

    }
}