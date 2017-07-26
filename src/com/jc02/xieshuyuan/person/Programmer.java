package com.jc02.xieshuyuan.person;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月25日 - 20:10
 * |    @description   程序员类
 * +---------------------------------Oooo---------------------------------------+
 */
public class Programmer extends Human{
    public Programmer(){
        super("谢树源",23);
    }
    Program program=new Program() {
        public void program() {
            System.out.println(getName()+"具备有编程的能力！");
        }
    };
    Drive drive=new Drive() {
        public void drive() {
            System.out.println(getName()+"具备有驾驶的能力！");
        }
    };
}
