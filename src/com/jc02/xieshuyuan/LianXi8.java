package com.jc02.xieshuyuan;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月21日 - 15:20
 * |    @description   循环打印出由符号组成的菱形或直角三角形
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi8 {
    public static void main(String[] args) {
        angle();
        lingxing();
    }
    public  static void angle(){
        for(int a=0; a<10; a++){

            System.out.print("   ");
            for(int b=0; b<a; b++){
                System.out.print("+ ");//循环打印+
            }
            System.out.println("");
        }
    }
    public static void lingxing(){
        for(int a=0; a<10; a++)
        {
            for (int b=0; b<10-a; b++) {
                System.out.print("  ");
            }
            for (int b=0; b<2*a-1; b++) {
                System.out.print("+ ");
            }
            System.out.println("");
        }
        for(int a=0; a<10; a++)
        {
            for (int b=0; b<a; b++) {
                System.out.print("  ");
            }
            for (int b=0; b<20-2*a-1; b++) {
                System.out.print("+ ");
            }
            System.out.println("");
        }
    }
}
