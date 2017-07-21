package com.jc02.wuwenjie;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 　༺༺超༒神༻༻
 * |　@author 深圳合众艾特信息技术有限公司
 * |　@create 2017年07月21日 - 10:57
 * |    @description   编写程序FooBizBaz.java，
 * 从1循环到150并在每行打印一个值，另外在每个3的倍数行上打印出“foo”,
 * 在每个5的倍数行上打印“biz”,在每个7的倍数行上打印输出“baz”。
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi4 {
    public static void main(String[] args) {

        for (int i=1;i<=150;i++){
            System.out.print(i + "\t");
            if(  i %3==0){
                System.out.print("foo");
            }
            if(  i %5==0){
                System.out.print("biz");
            }
            if(  i %7==0){
                System.out.print("baz");
            }
            System.out.println("");
        }

    }
}
