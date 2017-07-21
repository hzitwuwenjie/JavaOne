package com.jc02.xieshuyuan;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月21日 - 14:59
 * |    @description   统计所有输入的正数负数的数量，输入0时退出程序
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int znumber=0;
        int fnumber=0;
        int number=0;
        do{
            System.out.print("请输入整数（若要结束输入，则请输入0来结束程序）：" );
            number=input.nextInt(); //接受用户输入的整数
            if(number<0) {
                fnumber++;
            } else if(number>0){
                znumber++;
            }
        }while(number!=0);
        System.out.println("输入正数的次数为" +znumber);
        System.out.println("输入负数的次数为" +fnumber);
    }
}
