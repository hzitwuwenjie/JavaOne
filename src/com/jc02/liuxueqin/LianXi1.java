package com.jc02.liuxueqin;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月21日 - 9:23　                    
 *  |    @description   是否中奖　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;
public class LianXi1 {
    public static void main(String[] args) {
        Scanner i=new Scanner(System.in);
        Random rand=new Random();
        int num=rand.nextInt(10);
        System.out.println("请输入一个四位数：");
        int j=i.nextInt();
        if(j<1000||j>9999)
        {
            System.out.println("数字输入范围不正确，请重新输入。");
            return;
        }
        else
        {
            System.out.println("您输入的数字是："+j);
            System.out.println("随机数字："+num);
            if (j/100%10 ==num)
            {
                System.out.println("恭喜中奖！");
            }
            else
            {
                System.out.println("谢谢参与！");
            }
        }
    }
}
