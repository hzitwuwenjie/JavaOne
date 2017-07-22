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
public class LX21 {
    public static void main(String[] args) {
        String count= "lx";
        String pswd= "123456";
        Scanner input= new Scanner(System.in);
        System.out.print("请输入用户名：");
        String ecount= input.next();
        System.out.print("请输入密码：");
        String epswd= input.next();
        int num= 0;
        for (int i= 0; i< 2; i++){
            if (count.equals(ecount)&& pswd.equals(epswd))
            {
                System.out.println("欢迎登陆系统！");
                System.exit(0);
            }
            else
                System.out.println("错误！您还有"+ (2-i)+ "次机会！" );
            System.out.print("请输入用户名：");
             ecount= input.next();
            System.out.print("请输入密码：");
             epswd= input.next();

        }
    }
}
