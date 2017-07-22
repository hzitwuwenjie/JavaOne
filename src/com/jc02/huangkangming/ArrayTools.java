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
    public void selectSort(int [] arr){
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
    public  void bubbleSort(int []arr){
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
    public   void insertSort(int arr[]) {
        for(int i=1;i<arr.length;i++)
        {
            int insertVal=arr[i];
            int index=i-1;
            while(index>=0 && insertVal<arr[index])
            {
                arr[index+1]=arr[index];
                index--;
            }
            arr[index+1]=insertVal;
        }
    }
}