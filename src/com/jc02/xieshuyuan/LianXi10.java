package com.jc02.xieshuyuan;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月21日 - 15:55
 * |    @description   顾客年龄层次调查，计算各年龄层次的比例
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi10 {
    public static void main(String[] args) {
        int numone=0;
        int numtwo=0;
        int numthree=0;
        for(int i=0; i<10; i++){
            System.out.print("请输入第"+(i+1)+"位顾客的年龄：");
            Scanner input=new Scanner(System.in);
            int age=input.nextInt();
            if(age<30){
                numone++;
            }else if(age>30){
                numtwo++;
            }else {
                numthree++;
            }
        }
        float ratio1=numone*10;
        float ratio2=numtwo*10;
        float ratio3=numthree*10;
        System.out.println("30岁以下的比例是："+ratio1+"%");
        System.out.println("30岁以上的比例是："+ratio2+"%");
        System.out.println("30岁的比例是："+ratio3+"%");
    }
}
