package com.jc02.qinjiajun.Office;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月25日 - 19:23
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Office {
    public void employee(Human h) {
        System.out.println("公司招聘中...");
        System.out.println("成功招聘"+ h.getName() + "\t他"+h.getAge()+"\t他的宣言是："+h.programme()+h.drive());
    }
}