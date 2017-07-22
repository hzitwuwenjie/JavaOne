package com.jc02.wuwenjie;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 　༺༺超༒神༻༻
 * |　@author 深圳合众艾特信息技术有限公司
 * |　@create 2017年07月21日 - 16:56
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lx13 {

    public static void main(String[] args) {

        //创造一个女友对象
        /*NvYou zhang=new NvYou();
        zhang.name="张敏";
        zhang.age=18;
        zhang.sayHi();*/


        int           a[]       =new int[10];     //创建了一个基本数据类型的数组
        NvYou meimei[]=new NvYou[10];   //创建了一个引用数据类型的数组

        for (int i = 0; i < meimei.length; i++) {
            meimei[i]=new NvYou();
            meimei[i].name="美女"+(i+1)+"号";
        }







    }






}
