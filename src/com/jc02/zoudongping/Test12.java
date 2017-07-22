package com.jc02.zoudongping;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月21日 - 16:51
 * |    @description   数组
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test12 {
    public static void main(String[] args) {
        int a[]=new int[10];//声明了一个整数类型的数组，数组的大小为10.
        int l=a.length;
        int[] s;
        s=new int[10];
        System.out.println("数组的长度"+l);
        for (int i=0;i<a.length;i++){
            a[i]=i;
            s[i]=2*i;
            System.out.println(a[i]);
            System.out.println(s[i]);
        }
    }
}