package com.jc02.wuwenjie;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 　༺༺超༒神༻༻
 * |　@author 深圳合众艾特信息技术有限公司
 * |　@create 2017年07月21日 - 14:28
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lx10 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int age=0; //用来存储客户的年龄
        int maxcount=0;
        int mincoun=0;
        for (int i = 1; i <=10 ; i++) {
            System.out.println("请输入第" +i+"位顾客的年龄");
            age=input.nextInt();
            if(age>30){
                maxcount++;
            }else if(age<30)
            {
                mincoun++;
            }

        }
        System.out.println("30岁以上的比例" + (maxcount/10.0)*100+"%");
        System.out.println("30岁以下的比例"+ (mincoun/10.0)*100+"%");

    }
}
