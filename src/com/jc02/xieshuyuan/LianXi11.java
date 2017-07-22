package com.jc02.xieshuyuan;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月21日 - 16:21
 * |    @description   实现一个数字转换成二进制形式输出（不能用binary函数）
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi11 {
    public static void main(String[] args) {
        System.out.print("请输入要转换成二进制的数字：");
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int s=0;
        String k="";
        //String b=Integer.toBinaryString(a);
        while (a >= 1) {
            s=a%2;
            a=a/2;
            k=k+s;
        }
        for(int i=k.length()-1; i>=0; i--)
        System.out.print(k.charAt(i));
    }
}
