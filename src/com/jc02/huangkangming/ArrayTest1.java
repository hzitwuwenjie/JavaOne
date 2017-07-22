package com.jc02.huangkangming;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月22日 - 9:05
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int [] arr={99,85,82,63,60};
        bubbleSort(arr);
        System.out.println("插入前的成绩信息为：");
        printArray(arr);
        System.out.println();

        System.out.println("请输入新增成绩：");
        int score=in.nextInt();
        int index=0;

        for (int i = 0; i <arr.length; i++)
        {
            if(score<arr[i])
            {
                index=i;
                break;
            }
            if(score>arr[arr.length-1])
            {
                index=arr.length;
            }
        }
        System.out.println("插入数据的下标为："+index);

        int [] arr2=new int[arr.length+1];

        for (int i = 0; i < index; i++)
        {
            arr2[i]=arr[i];
        }
        arr2[index]=score;
        for (int i = index; i <arr2.length-1 ; i++) {
            arr2[i+1]=arr[i];
        }
        printArray(arr2);
    }

   //打印数组
    public static void printArray(int [] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);
            if(i<arr.length-1)
            System.out.print(",");
        }
    }
    //冒泡排序
    public static void bubbleSort(int []arr){
        for (int i = 0; i <arr.length-1 ; i++)
        {
            for (int j = 0; j <arr.length-1-i ; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
