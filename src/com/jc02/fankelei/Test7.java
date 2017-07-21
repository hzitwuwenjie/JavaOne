package com.jc02.fankelei;
import java.util.Scanner;
/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 11:54
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner  input=new Scanner(System.in);
        System.out.println("输入数字");
        int zhengshu=0;
        int fushu=0;
        int a;
       do
        {
            a=input.nextInt();
            if(a<0)
                fushu++;
            if(a>0)
                zhengshu++;
        } while (a !=0);
        System.out.println("正数个数为\t"+zhengshu);
        System.out.println("负数个数为\t"+fushu);


    }
}
