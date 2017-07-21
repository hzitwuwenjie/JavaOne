package com.jc02.lx;/**
 * Created by 响 on 2017/7/21.
 */

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
public class July21c {
    public static void main(String[] args) {
        for (int i=1; i<150; i++){
            System.out.print(i);
            if (i%3== 0)
                System.out.println("foo");
            else if(i%5== 0)
                System.out.println("biz");
            else if(i%7== 0)
                System.out.println("baz");
            else
                System.out.print("\n");
        }
    }
}
