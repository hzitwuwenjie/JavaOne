package com.jc02.fjx;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月22日 - 10:36
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Pritimive {
     String name;
    int age;
    boolean [] t= new boolean[3];
        public  Pritimive(String name1,int age1){
            name=name1;
            age=age1;
            for(int i=0;i<3;i++){
          //     t[i] = true;
                System.out.println("t["+i+"]的值为："+t[i]);
            }
        }
}

