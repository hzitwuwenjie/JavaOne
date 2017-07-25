package com.jc02.xiongzairen.inface;

/**
 * 　　  　  　    可乐
 * 　　　 　  　   @yh@
 *
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 熊再仁　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月25日 - 19:18
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Man implements SoftWareDrive,SoftWareDevelopment{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private  String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;


    @Override
    public void delelopment() {

    }

    @Override
    public void drive() {

    }
    public String toString(){
        return name+"具有软件开发能力和驾驶能力";
    }
}
