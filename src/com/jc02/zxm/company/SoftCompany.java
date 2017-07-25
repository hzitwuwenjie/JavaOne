package com.jc02.zxm.company;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                                 　|
 * |　@author 江西财经大学
 * |　@express 版权所有，翻阅必究                                          |
 * |　@create 2017年07月25日 - 19:23
 * |    @description   软件公司类
 * +---------------------------------Oooo---------------------------------------+
 */
public class SoftCompany {
    public void zhaoPing(People people){
        System.out.println(people.getAge()+"岁的"+people.getName());
        people.program();
        people.driveCar();
    }
}