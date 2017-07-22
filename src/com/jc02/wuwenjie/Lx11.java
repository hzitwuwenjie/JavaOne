package com.jc02.wuwenjie;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 　༺༺超༒神༻༻
 * |　@author 深圳合众艾特信息技术有限公司
 * |　@create 2017年07月21日 - 14:35
 * |    @description  将用户输入的进制数字转换成二进制
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lx11 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个十进制的数字");
        int num=input.nextInt();
        String bin="";
        //采用面向对象的做法。就是直接调用别人的方法
      //String msg=  Integer.toBinaryString(num);
        //System.out.println(msg);
        //采用面向过程的做法。自己实现
        while(num!=0){
          //  System.out.print(num % 2);
            bin=bin+num % 2;
            num=num/2;
        }
        //输出一个字符串中的每个字符。从右往左输出
        for(int i=bin.length()-1;i>=0;i-- ){
            System.out.print( bin.charAt(i) );
        }















    }
}
