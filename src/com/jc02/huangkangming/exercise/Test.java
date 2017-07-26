package com.jc02.huangkangming.exercise;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月25日 - 19:25
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test {
    public static void main(String[] args) {
        SoftwareCom softwareCom=new SoftwareCom();

        Person person=new Person("张三",22);

        softwareCom.recruitDeveloper(person);
        softwareCom.recruitDriver(person);
        System.out.println(person);

    }
}