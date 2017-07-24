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
        a[0]=85;
        a[1]=99;
        a[2]=82;
        a[3]=63;
        a[4]=60;
        int temp=0;
        for(int i=0;i<a.length-1;i++)//对数组进行重新进行降序排列
        {
            for (int j=0;j<a.length-i-1;j++)
            {
                if (a[j]<a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for (int n:a){
            System.out.print(n + "\t");
        }//从小到大输出原数组
        Scanner input=new Scanner(System.in);
        System.out.println();
        System.out.println("请输入新加的成绩：");
        int score=input.nextInt();
        for (int i=0;i<a.length;i++)//找到要插入的位置
        {
            if(score>a[i])
            {
                cha=i;
                break;
            }
        }
        for (int i=a.length-1;i>cha;i--)//将后面的数往后移动
        {
            a[i]=a[i-1];
        }
        a[cha]=score;
        System.out.println("插入的下表为："+cha);
        System.out.println("排序后的数组为：");
        for (int i=0;i<a.length;i++)//输出新数组
        {
            System.out.print(a[i]+"\t");
        }


    }
}

