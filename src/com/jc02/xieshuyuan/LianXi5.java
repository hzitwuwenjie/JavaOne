package com.jc02.xieshuyuan;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月21日 - 14:57
 * |    @description   累加1到100的偶数之和
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi5 {
    public static void main(String[] args) {

        int i=0;
        int sum=0;  //声明一个变量存储累加的和
        while(i<=100){
            sum=sum+i;
            i=i+2;
        }
        System.out.println("累加之和"+sum);
    }
}
