package com.jc02.xieshuyuan;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月21日 - 18:55
 * |    @description   使用双重循环输出6种图形
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi13 {
    public static void shape1(){
        System.out.println("1• shape1");
        for(int a=0; a<10; a++){
            System.out.print("   ");
            for(int b=0; b<a; b++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println();
    }
    public static void shape2(){
        System.out.println("2• shape2");
        for(int a=10; a>0; a--){
            System.out.print("   ");
            for(int c=10-a; c>0; c--){
                System.out.print("  ");
            }
            for(int b=a; b>0; b--){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println();
    }
    public static void shape3(){
        System.out.println("3• shape3");
        for(int a=0; a<10; a++){
            System.out.print("   ");
            for(int b=10-a; b>0; b--){
                System.out.print("  ");
            }
            for(int c=0; c<a; c++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println();
    }
    public static void shape4(){
        System.out.println("4• shape4");
        for(int a=0; a<10; a++){
            for(int b=0; b<10-a; b++){
                System.out.print("  ");
            }
            for(int b=0; b<2*a-1; b++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println();
    }
    public static void shape5(){
        System.out.println("5• shape5");
        for(int a=0; a<8; a++){
            for(int b=0; b<9-a; b++){
                System.out.print("  ");
            }
            System.out.print("* ");
            for(int b=0; b<2*a-1; b++){
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println("");
        }
        System.out.print(" ");
        for(int b=0; b<17; b++){
            System.out.print(" ");
            System.out.print("*");
        }
        System.out.println();
    }
    public static void shape6(){
        System.out.println("6• shape6");
        for(int a=0; a<10; a++){
            for(int b=0; b<10-a; b++){
                System.out.print("  ");
            }
            for(int b=0; b<2*a-1; b++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for(int a=0; a<10; a++){
            for(int b=0; b<a; b++){
                System.out.print("  ");
            }
            for(int b=0; b<20-2*a-1; b++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        shape1();
        shape2();
        shape3();
        shape4();
        shape5();
        shape6();
    }
}
