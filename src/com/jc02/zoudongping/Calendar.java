package com.jc02.zoudongping;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月22日 - 15:30
 * |    @description   日历
 * +---------------------------------Oooo---------------------------------------+
 */
public class Calendar {
    int year;
    int month;
    int date;
    public void yiyue(int year){
        int h=year-1900;
        int l=h/100;
        int f=h/4;
        int d=366*(f-l)+(h-f+l)*365;
        int e=d%7;
        int[] m=new int[31+e];
        System.out.println(year+"年1月日历");
        for(int i=0;i<e;i++){
            m[i]=31-e+1+i;
            System.out.print(m[i]+" ");
        }
        for(int i=0;i<31;i++){
                m[e+i]=i+1;
            if((e+i)%7==0)
            System.out.println("");
            System.out.print(m[e + i]+" ");
        }
    }
}