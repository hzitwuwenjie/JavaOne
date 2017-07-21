package com.jc02.fankelei;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 15:53
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test12 {

    public static void main(String[] args) {
        String name="fkl";
        String password="123456";
        Scanner input=new Scanner(System.in);
        String str1="";
        String str2="";
        for(int i=0;i<3;i++) {
            System.out.print("输入用户名:");
            str1=input.next();
            System.out.print("输入密码:");
            str2=input.next();
            if (str1.equals(name) && str2.equals(password)) {
                System.out.println("登录成功！");
                break;

            }
            else{
                System.out.println("输入错误，你还有" + (2-i) + "次机会");

            }
            if((2-i)==0){
                System.out.println("登陆失败");
                System.exit(0);


            }

        }
    }
}
