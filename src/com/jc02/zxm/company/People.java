package com.jc02.zxm.company;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                                 　|
 * |　@author 江西财经大学
 * |　@express 版权所有，翻阅必究                                          |
 * |　@create 2017年07月25日 - 19:16
 * |    @description   人类
 * +---------------------------------Oooo---------------------------------------+
 */
public class People implements DriveCar,DevelopSoft {
    private int age;
    private String name;
@Override
    public void program(){
    System.out.println("有软件开发能力");
}
    @Override
    public void driveCar(){
        System.out.println("有驾驶能力");
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}