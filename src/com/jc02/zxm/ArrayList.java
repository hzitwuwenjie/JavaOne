package com.jc02.zxm;

import java.util.Scanner;

/**
 * 　　  　  　      \\\|///
 * 　　　 　  　 \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo----------------------------------------------+
 * |　@author 曾宪明　　　　　　                                                  |
 * |　@author 江西财经大学                                                       |
 * |  @state 版权所有，不得外传                                                  |
 * |　@create 2017年07月22日 - 9:31　                           |
 * |    @description   插入一个成绩重新将数组降序排列　　　　　　　　　　　　　                   |
 * +---------------------------------Oooo--------------------------------------+
 */
public class ArrayList {
    public static void main(String[] args) {
        int a[]=new int[6];
        int cha=a.length;
        a[0]=99;
        a[1]=85;
        a[2]=82;
        a[3]=63;
        a[4]=60;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入新加的成绩：");
        int score=input.nextInt();
        for (int i=0;i<a.length;i++)
        {
            if(score>a[i])
            {
                cha=i;
                break;
            }
        }
        for (int i=a.length-1;i>cha;i--)
        {
            a[i]=a[i-1];
        }
        a[cha]=score;
        System.out.println("插入的下表为："+cha);
        System.out.println("排序后的数组为：");
        for (int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }


    }
}

