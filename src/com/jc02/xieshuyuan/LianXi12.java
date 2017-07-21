package com.jc02.xieshuyuan;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月21日 - 16:44
 * |    @description   用户登录验证最多三次的程序
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi12 {
    public static void main(String[] args) {
        String[] user={"xie","li","wang"};
        String[] pwd={"123456","54321","8888"};
        System.out.print("请输入用户名：");
        Scanner input1=new Scanner(System.in);
        String touser=input1.next();
        System.out.print("请输入密码：");
        Scanner input2=new Scanner(System.in);
        String topwd=input2.next();
        for(int times=2; times>0; times--){
            for(int i = 0 ; i < user.length ; i++) {
                if(touser.equals(user[i]))
                {
                    int id=i;
                    if(topwd.equals(pwd[id])){
                        System.out.print("欢迎登录MyShoopping系统！"); return;
                    }else{
                    }
                }else{
                }
            }
            System.out.println("输入错误！你还有"+times+"次机会\n");
            System.out.print("请输入用户名：");
            Scanner input3=new Scanner(System.in);
            touser=input3.next();
            System.out.print("请输入用户名：");
            Scanner input4=new Scanner(System.in);
            topwd=input4.next();
        }
        System.out.print("输入错误！你还有" +0+ "次机会\n\n");
        System.out.print("对不起，你输入3次都错误！"); return;
    }
}
