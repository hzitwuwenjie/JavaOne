package com.jc02.zxm.company;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                                 　|
 * |　@author 江西财经大学
 * |　@express 版权所有，翻阅必究                                          |
 * |　@create 2017年07月25日 - 19:36
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class main {
    public static void main(String[] args) {

        People people=new People();
        SoftCompany company=new SoftCompany();
        people.setAge(20);
        people.setName("黎子");
        company.zhaoPing(people);
    }
}