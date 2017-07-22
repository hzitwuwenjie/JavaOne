package com.jc02.laimingfei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ${赖明飞} .
 */
public class SortAlgorithm {



   public  void insertSort(int[] array) {
       for(int i = 1; i < array.length; i++){
               int temp = array[i];
               int j = i - 1;
                for (; j >= 0 && array[j] > temp; j--) {
                   //将大于temp的值整体后移一个单位
                   array[j + 1] = array[j];
              }
             array[j + 1] = temp;
           }
       System.out.println(Arrays.toString(array) + " insertSort");
   }

    public static void main(String[] args) {
       SortAlgorithm sortAlgorithm=new SortAlgorithm();
        Scanner input=new Scanner(System.in);
        System.out.println("请输入数组大小");
        int number=input.nextInt();
        int array[]=new int[number];
        System.out.println("请输入数组");
        for(int i=0;i<array.length;i++){
        array[i]=input.nextInt();
        }
       sortAlgorithm.insertSort(array);

    }
}
