package com.jc02.yankaixin.test;

import com.jc02.yankaixin.jiekou.Person;
import com.jc02.yankaixin.jiekou.SoftwareCompany;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月25日 - 19:26
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test03 {

    public static void main(String[] args) {

        Person p = new Person();
        p.setName("严凯新");
        p.setAge(22);
        SoftwareCompany.recruitDeveloper(p);
    }
}
