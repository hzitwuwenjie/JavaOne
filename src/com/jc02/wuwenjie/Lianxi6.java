package com.jc02.wuwenjie;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 　༺༺超༒神༻༻
 * |　@author 深圳合众艾特信息技术有限公司
 * |　@create 2017年07月21日 - 11:08
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi6 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int zhengshu=0;
        int fushu=0;
        int number=0;
        do{
            number=input.nextInt(); //接受用户输入的整数
            if(number<0)
                fushu++;
            else if(number>0)
                zhengshu++;
        }while(number!=0);
        System.out.println("输入正数的次数为" +zhengshu);
        System.out.println("输入负数的次数为" +fushu);
    }
}
