package com.jc02.xiongzairen;

import java.util.Scanner;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 11:53
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int fushu=0;
        int zhengshu=0;
        System.out.println("请输入数字：");
        int i;
        do{
            i=input.nextInt();
           if(i<0) {
               fushu=fushu+1;
           }
            else if(i>0){
               zhengshu=zhengshu+1;
           }
        }while(i!=0);
        System.out.println("负数数量为："+fushu);
        System.out.println("正数数量为："+zhengshu);
    }
}
