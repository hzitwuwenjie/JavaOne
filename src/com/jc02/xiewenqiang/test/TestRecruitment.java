package com.jc02.xiewenqiang.test;

import com.jc02.xiewenqiang.recruitment.Company;
import com.jc02.xiewenqiang.recruitment.Person;

/**
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢文强　　　　　　                                                                 　|
 * |　@create 2017年07月25日 - 20:26
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestRecruitment {
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("张三");
        Company company =new Company();
        company.recruitDeveloper(person);
    }
}
