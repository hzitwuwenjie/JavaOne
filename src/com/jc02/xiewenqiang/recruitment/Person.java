package com.jc02.xiewenqiang.recruitment;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月25日 - 20:18
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Person implements SoftwareDesigning,Drive {
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
        System.out.println("有驾驶能力");
    }

    @Override
    public void programme() {
        System.out.println("有编程能力");
    }

    public String toString(){
        return name + "具有软件开发能力和驾驶能力";
    }
}
