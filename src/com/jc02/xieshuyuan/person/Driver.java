package com.jc02.xieshuyuan.person;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月25日 - 20:02
 * |    @description   司机类
 * +---------------------------------Oooo---------------------------------------+
 */
public class Driver extends Human{
    Drive drive=new Drive() {
        @Override
        public void drive() {
            System.out.println("具备有驾驶的能力！");
        }
    };
}
