package com.jc02.huangkangming;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 黄康明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月22日 - 12:02
 * |  @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class ArrayTools {
    //选择排序
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
    //冒泡排序
    public static void bubbleSort(int []arr){
        /*for (int i = arr.length-1; i >0 ; i--) {
            for (int j = 0; j <i; j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }*/
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