package com.jc02.liuxueqin;/*
 *  +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 *  |　@author chs-大傻逼　　　　　　                                                                 　|　　　　　
 *  |　@author 17-7-20                                                  |
 *  |　@create 2017年07月22日 - 9:36　                    
 *  |    @description   数组插入算法　　　　　　　　　　　　　                                                              　
 *  +---------------------------------Oooo---------------------------------------+
 */

import java.util.Scanner;

public class LianXi12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int score[]={63,82,60,99,85};
        System.out.println("请输入新增成绩：");
        int num=input.nextInt();
        System.out.print("插入成绩的下标是：");
        int b=input.nextByte();
        score[score.length-1]=num;
        for(int i=0;i<=score.length;i--){
            if(score[i]>score[i-1]){
                int a=score[i];
                score[i]=score[i-1];
                score[i-1]=a;
            }else {
                break;
            }

        }
        System.out.println("插入后的成绩信息是：");
        for(int j=0;j<score.length;j++){
            System.out.print(score[j]+"\t");
        }

    }


}
