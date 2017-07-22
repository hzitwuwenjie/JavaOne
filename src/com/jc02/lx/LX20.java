package com.jc02.lx;/**
 * Created by 响 on 2017/7/21.
 */

import java.util.Scanner;

/**
 * 　　  　  　     \\\|///
 * 　　　 　   　  \\ - -//
 * 　　　　　   　(　 @.@　)
 * +-------oOOo-----( v )-----oOOo--------------------------------------------+
 * |　@author Lee　　　　　　                                                                 　|
 * |　@author jxufe                                                   |
 * |　@create 2017年07月20日 - 10:23
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class LX20 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        double xia= 0 ;
        double shang= 0;
        for(int i= 0; i< 4; i++){
            System.out.println("请输入第"+(i+ 1)+"位顾客的年龄");
            int t= input.nextInt();
            if (t< 30)
                xia++;
            else
                shang++;
        }
        System.out.println("30岁以上的比例是 "+(shang/ 4* 100)+ "%\n30岁以下的比例是 "+(xia/ 4* 100)+ "%");
    }
}
