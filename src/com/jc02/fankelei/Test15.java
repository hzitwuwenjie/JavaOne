package com.jc02.fankelei;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月22日 - 9:25
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Test15 {
    public static void main(String[] args) {
        int score[] = new int[6];
        score[0] = 99;
        score[1] = 85;
        score[2] = 82;
        score[3] = 63;
        score[4] = 60;
        int t = 0;
        int l = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = (i + 1); j < 5; j++) {
                if (score[j] < score[i]) {
                    t = score[i];
                    score[i] = score[j];
                    score[j] = t;
                }

            }


        }
        for (int z = 0; z < 5; z++) {
            System.out.println(score[z]);
        }
        Scanner input = new Scanner(System.in);
        System.out.println("输入一个成绩");
        int c = input.nextInt();
        for (int i = 0; i < 5; i++) {
            for (int j = (i + 1); j < 5; j++) {
                if (score[j] > score[i]) {
                    t = score[i];
                    score[i] = score[j];
                    score[j] = t;
                }

            }


        }

        score[5] = c;
        for (int i = 4; i >= 0; i--) {
            if (c > score[i]) {
                l=score[i];
                score[i]=c;
                score[i+1]=l;


            }
            else
                break;


        }

        System.out.print("插入成绩后为 ");
        for (int g = 0; g < score.length; g++)
            System.out.print("\t" + score[g]);


    }
}

