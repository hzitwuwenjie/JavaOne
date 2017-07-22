package com.jc02.yankaixin;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 严凯新　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                |
 * |　@create 2017年07月22日 - 9:06
 * |  @description   降序排列，增加成绩，并保持降序
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[]{85,95,82,60,63};
        bubbleSort(array);
        showArray(array);
        System.out.println();
        System.out.println("请输入新增成绩：");
        int i = input.nextInt();
        int[] newArray = insertArray(array,i);
        System.out.println("插入后的成绩信息是：");
        showArray(newArray);
    }

    public static void bubbleSort(int[] array){    //冒泡排序
        int temp;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[j]>array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void showArray(int[] array){   //显示数组内容
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] insertArray(int[] array,int n){
        int [] newArray = new int[array.length+1];
        int num=0;  //定义下标
        if(n>array[0]){
            newArray[0] = n;
            for (int j = 1; j < newArray.length; j++)
                newArray[j] = array[j-1];
            num = 0;
        }
        else if(n<array[array.length-1]){
            newArray[newArray.length-1] = n;
            for (int j = 0; j < newArray.length-1; j++)
                newArray[j] = array[j];
            num = array.length;
        }
        else{
            for (int i = 0; i < array.length; i++) {
                if(n<=array[i] && n>=array[i+1]){
                    for (int j = 0; j < i+1; j++)
                        newArray[j] = array[j];
                    newArray[i+1] = n;
                    for (int k = i+2; k < newArray.length; k++)
                        newArray[k] = array[k-1];
                    num = i+1;
                    break;
                }
            }
        }
        System.out.println("插入成绩下标是：" + num);
        return newArray;
    }
}
