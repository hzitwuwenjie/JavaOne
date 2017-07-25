package com.jc02.wuwenjie.one;

import com.jc02.wuwenjie.one.Hello;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 　༺༺超༒神༻༻
 * |　@author 深圳合众艾特信息技术有限公司
 * |　@create 2017年07月22日 - 14:40
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestMain {
    //我是程序的入口方法。一个JAVA程序的启动必须依赖我。我是main。我为java代言
    public static void main(String[] args) {
        MyCalander m = new MyCalander();
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = input.nextInt();
        int month = 1;
        String msg = "";
        do {m.showCalander(year, month);
            System.out.println("\n请输入n继续显示下一个月。输入p显示上一个月。输入ALL显示今年全年日历,输入其他字符退出");
            msg = input.next();
            if (msg.equalsIgnoreCase("n")) {
                month++;
                if (month > 12) {
                    month = 1;year++;
                }
            } else if (msg.equalsIgnoreCase("p")) {
                month--;
                if (month < 1) {
                    month = 12;    year--;
                }
            } else if (msg.equalsIgnoreCase("all")) {
                for (int i = 1; i <= 11; i++) {
                    m.showCalander(year, i);
                }
                month = 12;
            } else {
                break;
            }
        } while (true);
    }
}
