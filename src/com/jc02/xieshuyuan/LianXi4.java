package com.jc02.xieshuyuan;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月21日 - 11:39
 * |    @description   for语句分别输出3、5、7的倍数行对应字符
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi4 {
    public static void main(String[] args) {
        /*for (int i=1;i<=150;i++){
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
        }*/
        for(int i=1;i<=150;i++){
            System.out.print(i);
            if (i%3==0){
                if(i%5==0){
                    if(i%7==0){
                        System.out.println("\tfoo\tbiz\tbaz");
                    }else System.out.println("\tfoo\tbiz");
                }else if(i%7==0) {
                    System.out.println("\tfoo\tbaz");
                }else System.out.println("\tfoo");
            }else if(i%5==0){
                if(i%7==0) {
                    System.out.println("\tbiz\tbaz");
                }else System.out.println("\tbiz");
            }else if(i%7==0){
                System.out.println("\tbaz");
            }else {
                System.out.println();
            }
        }
    }
}

