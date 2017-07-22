package com.jc02.yangyoufeng;
import java.util.Scanner;
/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 杨有峰　　　　　　                                                                 　|
 * |　@author ×××                                                   |
 * |　@create 2017年07月22日 - 10:18
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Paixu {
        public static void main(String[] args) {
            int array[]={99,85,82,63,60};
            Scanner input = new Scanner(System.in);
            insertion(array);
            System.out.println("升序排序：");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            System.out.print("请输入一个学员的成绩：");
            int score = input.nextInt();
            int array2[] = new int[array.length+1];
            for (int i = 0; i <array2.length-1 ; i++) {
                array2[i]=array[i];
            }
            array2[array2.length-1]=score;
            insertion2(array2);
            for (int i = 0; i <array2.length ; i++) {
                System.out.print(array2[i]+" ");
            }
        }
        public static void insertion(int num[]){//插入排序，升序
            for (int i = 1; i <num.length ; i++) {
                if (num[i]<num[i-1]){
                    int j=i-1;
                    int key = num[i];
                    while (j>=0&&num[j]>key){
                        num[j+1]=num[j];
                        j--;
                    }
                    num[j+1]=key;
                }
            }
        }
        public static void insertion2(int num[]){//插入排序，降序
            for (int i = 1; i <num.length ; i++) {
                if (num[i]>num[i-1]){
                    int j=i-1;
                    int key = num[i];
                    while (j>=0&&num[j]<key){
                        num[j+1]=num[j];
                        j--;
                    }
                    num[j+1]=key;
                }
            }
        }
}