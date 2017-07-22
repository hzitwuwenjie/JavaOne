package com.jc02.yankaixin;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月21日 - 11:43
 * |  @description   求1到100之间所有偶数的和
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test05 {

    public static void main(String[] args) {

        int i=0;
        int sum=0;
        while(i<=100){
            sum=sum+i;
            i+=2;
        }
        System.out.println("1到100之间所有偶数的和为：" + sum);
    }
}
