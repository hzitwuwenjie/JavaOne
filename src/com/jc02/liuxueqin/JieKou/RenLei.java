package com.jc02.liuxueqin.JieKou;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月26日 - 8:33　                    
 *  |    @description   人类　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

public class RenLei implements RuanJianKaiFaJieKou,JiaShiJieKou{
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
    public void jiashi() {
        System.out.println("具有驾驶能力");
    }

    @Override
    public void biancheng() {
        System.out.println("具有编程能力");
    }

    public String toString(){
        return (name+"具有编程和驾驶能力");
    }
}
