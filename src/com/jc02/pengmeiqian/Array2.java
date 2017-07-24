package com.jc02.pengmeiqian;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 　　  　  　       \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　   　 (　 .@.@ 　)
 * +-------oOOo-----( ~ )-----oOOo--------------------------------------+
 * |　   @author 彭美倩
 * |   　@author 江西财经大学
 * |   　@create 2017年07月22日 - 11:23
 * |    @description
 * +---------------------------------Oooo-----------------------------+
 */
public class Array2 {
    public static void main(String[] args) {
        int[] scores=new int[6];
        scores[0]=99;
        scores[1]=85;
        scores[2]=82;
        scores[3]=63;
        scores[4]=60;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入新增成绩：");
        int num=input.nextInt();
        int index=0;//保存新增成绩
        for(int i=0;i<scores.length;i++){
            if (num>scores[i]){
                index=i;
                break;
            }
        }
        for(int j=scores.length-1;j>index;j--){
            scores[j]=scores[j-1];
        }
        scores[index]=num;
        Arrays.sort(scores);
        for(int k=0;k<scores.length;k++) {
            System.out.print(scores[k]+"\t");
        }
    }
}
