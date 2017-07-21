package com.jc02.xieshuyuan;

import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月21日 - 9:02
 * |    @description   抽奖规则：会员的百位数字等于产生的随机数字即为幸运会员
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi1 {
    public static void main(String[] args) {
        Random rand=new Random();
        int num= rand.nextInt(10);
        Scanner input=new Scanner(System.in);
        System.out.println("请输入四位数字");
        int i=input.nextInt();
        if(i<1000||i>9999){
            System.out.println("输入的数字不在范围，不正确，请输入1000到9999之间的数字");
            return;
        }else {
                System.out.println("你输入的数字是："+i);
                System.out.println("随机数字为："+num);
            if(i/100%10==num){
                System.out.println("恭喜中奖了(❤ ω ❤)！");
            }else{
                System.out.println("抱歉幸运女神未眷顾你( ఠൠఠ )ﾉ！");
            }
        }
    }
}
