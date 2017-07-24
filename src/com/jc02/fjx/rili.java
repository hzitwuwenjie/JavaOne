package com.jc02.fjx;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 付嘉星　　(σ｀д′)σ　　　                                                                 　|
 * |　@author 都TM闪开，星爷要开始写程序了                                                   |
 * |　@create 2017年07月22日 - 16:49
 * |    @description   日历制作
 * +---------------------------------Oooo---------------------------------------+
 */
public class rili {
    int year;
    int   month;
    public boolean nian(int year){
        if (year%4==0 && year%100 !=0 || year%400==0)
            return true;
            else
            return false;
    }
    public  int yue (int year,int month){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
               return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
                case 2:
                   return nian(year)?29:28;
            default:
                        return -1;
        }

    }
    public int tian(int year,int month) {
        int sum = 0;
        for (int i = 1900; i < year; i++) {
            sum += nian(i) ? 366 : 365;
        }
        for(int j=1;j<month;j++){
            sum+=yue(year,j);
        }
        return sum;
    }
    public void shuchu(int year,int month){
        System.out.println("\t\t\t"+year+"年"+month+"月");
        System.out.println("***********************************");
        System.out.println("日\t一\t二\t三\t四\t五\t六\t");

    }
    }

