package com.jc02.wuwenjie;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 　༺༺超༒神༻༻
 * |　@author 深圳合众艾特信息技术有限公司
 * |　@create 2017年07月21日 - 13:45
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lx8 {
    public static void main(String[] args) {
        two();
    }

    public  static void one(){
        for(int i=0;i<10;i++){
            System.out.print("   ");
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void two(){
        for(int i=0;i<10;i++)
        {
            for (int j = 0; j <10-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <2*i-1 ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int i=0;i<10;i++)
        {
            for (int j = 0; j <i ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <20-2*i-1 ; j++) {
                    System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
