package com.jc02.qinjiajun.Office;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月25日 - 19:30
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test {
    public static void main(String[] args) {
        Human h = new Designer();
        h.setAge(20);
        h.setName("张三");
        Office office = new Office();
        office.employee(h);

    }
}