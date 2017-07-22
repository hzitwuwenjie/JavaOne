package com.jc02.wuwenjie;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 　༺༺超༒神༻༻
 * |　@author 深圳合众艾特信息技术有限公司
 * |　@create 2017年07月21日 - 15:05
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LX12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入您的账户");
            String name = input.next();
            System.out.println("请输入您的密码");
            String pwd = input.next();
            if (name.equals("jc02") && pwd.equals("123")) {
                System.out.println("登陆成功");
                break;
            } else {
                if (2 - i == 0) {
                    System.out.println("登陆次数超过限制！程序退出");
                    System.exit(0);  //系统退出
                } else {
                    System.out.println("账号或密码错误！请重新输入，您还剩 " + (2 - i) + "次登陆机会");
                }
            }
        }

    }
}
;
