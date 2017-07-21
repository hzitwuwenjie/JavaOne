package com.jc02.xiongzairen;

import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 9:03
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test3 {
    public static void main(String[] args) {

        Scanner  j=new Scanner(System.in);
        Random rand=new Random();
        int num=rand.nextInt(10);//获得一个从0-10的随机数
        System.out.println("请输入一个四位数");
        int i=j.nextInt();//用户输入值
        if (i<1000||i>9999){
            System.out.println("输入值不正确，请输入1000到9999里面的数字");
            return;//终止程序，返回
        }else{
            System.out.println("你输入的是:"+i);
            System.out.println("幸运数字为:"+num);
            if(i/100%10==num){
                System.out.println("恭喜你中奖了！");//判断是否中奖
            }
            else {
                System.out.println("很遗憾，你没有中奖");
            }
        }


    }
}
