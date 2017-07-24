package com.jc02.liuxueqin;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月22日 - 9:36　                    
 *  |    @description   数组插入算法　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import java.util.Scanner;

public class LianXi12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int score[]={63,82,60,99,85};
        int a=0;
        //冒泡排序：外层循环n-1，内层循环n-1-i;两两比较小靠前
        for(int i=0;i<score.length-1;i++) {
            for (int j = 0; j < score.length - 1 - i; j++) {
                if (score[j] > score[j + 1]) {
                    a = score[j];
                    score[j] = score[j +1];
                    score[j + 1] = a;
                }
            }
        }
        for(int n:score){
            System.out.print(n + "\t");
        }
        System.out.println("请输入新增成绩：");
        int num=input.nextInt();
        int b=0;//储存新数字要放的下标的位置
        for (int i = 0; i <score.length ; i++) {
            if(num<score[i]){
                b=i;//确定新数字的插入后下标的位置
                break;
            }
        }
        //解决输入的数字大于最后一个数字的情况
        if(num>score[score.length-1]){
            b=score.length;
        }
        //新建一个数字用来存储新的成绩
        int newscore[]=new int[score.length+1];

        for (int i = 0; i < b; i++) {
            newscore[i]=score[i];
        }
        newscore[b]=num;
        for (int i=b;i<score.length;i++){
            newscore[i+1]=score[i];
        }
        for(int n:newscore){
            System.out.print(n+"\t");
        }
        }
    }



