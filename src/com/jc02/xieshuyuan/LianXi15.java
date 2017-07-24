package com.jc02.xieshuyuan;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月22日 - 10:20
 * |    @description   数组练习（检验基本数据类型数组创建时的自动赋值）
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi15 {
    public static class Pritimive{
        boolean[] t=new boolean[3];
    }
    public static void main(String[] args) {
        class Arr1{
            boolean a1,a2,a3;
            public void Arr1(){
                Pritimive d=new Pritimive();
                Random random=new Random();
                d.t[0]=random.nextBoolean();
                d.t[1]=random.nextBoolean();
                d.t[2]=random.nextBoolean();
                System.out.println("t的三个元素自动赋值为："+d.t[0]+"\t"+d.t[1]+"\t"+d.t[2]);
            }
            public void Arr1(boolean a1,boolean a2,boolean a3){
                Pritimive d=new Pritimive();
                this.a1=a1; this.a2=a2; this.a2=a2;
                d.t[0]=a1;
                d.t[1]=a2;
                d.t[2]=a3;
                System.out.println("t的三个元素手动输入为："+d.t[0]+"\t"+d.t[1]+"\t"+d.t[2]);
            }
        }
        try{
            System.out.println("请输入三个元素Boolean类型值：");
            Scanner input1=new Scanner(System.in);
            boolean e1=input1.nextBoolean();
            Scanner input2=new Scanner(System.in);
            boolean e2=input2.nextBoolean();
            Scanner input3=new Scanner(System.in);
            boolean e3=input3.nextBoolean();
            Arr1 s=new Arr1();
            s.Arr1(); //自动赋值三个boolean元素
            s.Arr1(e1,e2,e3); //手动输入三个boolean元素
        }catch (InputMismatchException e){
            System.out.println("出现异常，原因是输入的值不是布尔值，请输入Boolean类型值！");
            throw e;
        }
    }
}
