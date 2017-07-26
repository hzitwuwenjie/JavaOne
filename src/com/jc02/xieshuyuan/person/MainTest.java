package com.jc02.xieshuyuan.person;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月25日 - 20:21
 * |    @description   测试入口
 * +---------------------------------Oooo---------------------------------------+
 */
public class MainTest {
    public static void main(String[] args) {
        Programmer programmer=new Programmer();
        programmer.drive.drive();
        programmer.program.program();
        Driver driver=new Driver();
        driver.drive.drive();
        Company company=new Company();
        System.out.println(company.recruit(programmer));
    }
}
