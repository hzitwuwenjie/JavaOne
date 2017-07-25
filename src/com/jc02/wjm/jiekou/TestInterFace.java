package com.jc02.wjm.jiekou;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月25日 - 19:29
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestInterFace {
    public static void main(String[] args) {
        Human h=new Human();
        h.setName("万家明");
        Company c=new Company();
        c.human(h);

    }
}
