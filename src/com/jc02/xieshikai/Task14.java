package com.jc02.xieshikai;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年07月22日 - 9:21
 * |  @description   数组练习1-插入排序
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class Task14 {
    public static void main(String[] args) {
        int arr[]=new int[6];
        arr[0]=99;
        arr[1]=85;
        arr[2]=82;
        arr[3]=63;
        arr[4]=60;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        System.out.print("五人成绩升序排序：");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] +" ");
        }
        System.out.print("\n请输入新增成绩：");
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        arr[0]=num;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == num)
                System.out.print("插入成绩的下标:" + j);
        }
        System.out.print("\n六人成绩降序排序：");
        for (int j = 0; j < arr.length; j++) {
              System.out.print(arr[j]+" ");
        }
    }
}