package com.jc02.huangkangming;

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
        selectSort(arr);
        System.out.println("插入前的成绩信息：");
        printArray(arr);

        System.out.println();

        System.out.println("请输入新增成绩：");
        int score=in.nextInt();

        int [] arr2=new int[arr.length+1];

        for (int i = 0; i <arr2.length-1 ; i++) {
            arr2[i]=arr[i];
        }
        arr2[arr2.length-1]=score;
        selectSort2(arr2);

        System.out.println("插入后的成绩信息");
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
    //选择排序(升序）
    public static void selectSort(int [] arr){
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i; j <arr.length ; j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    //选择排序(降序）
    public static void selectSort2(int [] arr){
        for (int i = 0; i < arr.length-1; i++)
        {
            for (int j = i; j <arr.length ; j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    //冒泡排序
    public static void bubbleSort(int []arr){
        for (int i = arr.length-1; i >0 ; i--) {
            for (int j = 0; j <i; j++)
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
