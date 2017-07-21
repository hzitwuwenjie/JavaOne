package com.jc02.wuwenjie;

import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 　༺༺超༒神༻༻
 * |　@author 深圳合众艾特信息技术有限公司
 * |　@create 2017年07月21日 - 9:01
 * |    @description   抽奖规则：会员号的百位数字等于产生的随机数字即为幸运会员
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi1 {

    public static void main(String[] args) {
        //接手用户从键盘输入的值
        Scanner j = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(10);   //调用Random类的对象的产生随机数的方法，并赋值给了一个变量num
        System.out.println("请输入一个4位整数");
        int i = j.nextInt();   //接受键盘输入的整数
        if (i < 1000 || i > 9999) {
            System.out.println("输入输入的范围不正确。请输入1000到9999之前的数字");
            return;  //return 代表方法停止运行，退出了方法
        } else {
            //判断用户输入数字的百位和随机数字相等

            System.out.println("您输入的数字是" + i);
            System.out.println("随机数字" + num);
            if (i / 100 % 10 == num) {
                System.out.println("恭喜中奖了！");
            } else {
                System.out.println("谢谢参与！");
            }
        }




    }
}
