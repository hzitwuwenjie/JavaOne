package com.jc02.wuwenjie;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 　༺༺超༒神༻༻
 * |　@author 深圳合众艾特信息技术有限公司
 * |　@create 2017年07月22日 - 11:46
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lx15 {
    public static void main(String[] args) {
        int num[] = {60, 85, 82, 99, 63, 65};
        //数组排序。
        //Arrays.sort(num);
        int temp = 0;
        //外层循环n-1,内层循环n-1-i,两两比较小靠前
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
        for (int n : num) {
            System.out.print(n + "\t");
        }
        Scanner input = new Scanner(System.in);
        System.out.println("请输入新的人的成绩");
        int number = input.nextInt();
        int index = 0; //存储新数字要放置的下标位置
        for (int i = 0; i < num.length; i++) {
            if (number < num[i]) {
                //确定要该数字要放置的下标位置
                index = i;
                break;
            }
        }
        //解决输入的数字大于最后一个数字的情况
        if(number>=num[num.length-1 ]){
            index=num.length;
        }

        //新建一个数字用来存储新的成绩
        int newScore[]=new int[num.length+1];
        for(int i=0;i<index;i++){
            newScore[i]=num[i];
        }
        newScore[index]=number;
       for(int i=index;i<num.length;i++){
            newScore[i+1 ]= num[i];
        }

        for(int score : newScore){
            System.out.print(score+"\t");
        }
    }
}
