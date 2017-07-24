package com.jc02.fjx;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月24日 - 10:24
 * |    @description   日历测试
 * +---------------------------------Oooo---------------------------------------+
 */
public class riliceshi {
    public static void main(String[] args) {
        String b="";
        rili m = new rili();
        Scanner w =new Scanner(System.in);
        System.out.print("请输入一个年份：");
        int a= w.nextInt() ;
        int month=1;
        m.shuchu(a,month);
        System.out.print("\n输入n显示下一个月日历，输入p显示上一个月日历，输入all可显示全年日历:");
        b =w.next();
        do{
        if(b.equalsIgnoreCase("n")) {
            month++;
            if(month>12){
                month=1;a++;
            }

        }
       else if(b.equalsIgnoreCase("p")) {
            month--;
            if(month<1){
                month=12;a--;
                }
           }else if(b.equalsIgnoreCase("all")){
                for(int i=0;i<=11;i++){
                     m.shuchu(a,month);
            }
            month=12;
        }
            else
            break;
        }while (true);
    }
}
