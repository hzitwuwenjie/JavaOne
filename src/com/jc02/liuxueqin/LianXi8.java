package com.jc02.liuxueqin;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月21日 - 16:13　                    
 *  |    @description   对顾客进行年龄层次调查　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import java.util.Scanner;

public class LianXi8 {
    public static void main(String[] args) {
        int up=0;
        int down=0;
        for(int i=1;i<=10;i++){
            Scanner input=new Scanner(System.in);
            int num=input.nextInt();
            System.out.println("请输入第"+i+"位顾客的年龄："+num);
            if(num>30){
                up++;
            }else{
                down++;
            }
        }
        System.out.println("30岁以上的比例是："+up/10.0*100+"%");
        System.out.println("30岁以上的比例是："+down/10.0*100+"%");
    }
}
