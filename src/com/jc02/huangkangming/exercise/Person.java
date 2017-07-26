package com.jc02.huangkangming.exercise;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月25日 - 19:14
 * |  @description   人类
 * +---------------------------------Oooo---------------------------------------+
 */
public class Person implements Drive, SoftwareDeve{
    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
    }

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
    public void driveCar() {
        System.out.println("驾驶能力");
    }

    @Override
    public void programming() {
        System.out.println("软件开发能力");
    }

    @Override
    public String toString() {
        return getName()+"具有软件开发能力和驾驶能力";
    }
}