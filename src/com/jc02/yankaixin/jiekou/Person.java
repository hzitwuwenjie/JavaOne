package com.jc02.yankaixin.jiekou;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月25日 - 19:20
 * |  @description   人类
 * +---------------------------------Oooo---------------------------------------+
 */
public class Person implements SoftwareDesigning,Drive{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void drive() {
        System.out.println(name + "具有驾驶能力");
    }

    @Override
    public void programme() {
        System.out.println(name + "具有编程能力");
    }

}
