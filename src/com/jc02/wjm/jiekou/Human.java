package com.jc02.wjm.jiekou;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月25日 - 19:15
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Human implements SoftWare,Driver{
    private int age;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String work() {
        return("开发能力") ;
    }

    @Override
    public String drive() {
        return("驾驶能力");

    }
}
