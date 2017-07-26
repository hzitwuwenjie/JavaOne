package com.jc02.qinjiajun.Office;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月25日 - 19:14
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Human implements Programme,Drive {
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
    public String drive() {
       return "我是老司机！";
    }

    @Override
    public String programme() {
       return "我是程序猿！";
    }
}