package com.jc02.fjx;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月21日 - 11:37
 * |    @description      foobozbaz程序
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi3 {
    public static void main(String[] args) {
          for (int i=1;i<=150;i++){
              if (i%3==0){
                  System.out.print("foo");
              }
              if (i%5==0){
                  System.out.print("biz");
              }
              if (i%7==0){
                  System.out.print("boz");
              }
              System.out.println(i);
          }
    }
}
