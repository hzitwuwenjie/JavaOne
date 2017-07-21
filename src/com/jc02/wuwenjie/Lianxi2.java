package com.jc02.wuwenjie;

import java.util.Scanner;

/**
 * 　　  　  　            \\\|///
 * 　　　 　  　     \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 　༺༺超༒神༻༻
 * |　@author 深圳合众艾特信息技术有限公司
 * |　@create 2017年07月21日 - 9:53
 * |    @description   熟悉Switch
 * +---------------------------------Oooo---------------------------------------+
 */
public class Lianxi2 {

    public static void main(String[] args) {
        //请输入一个月份。然后计算该月份的天数
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个月份");
        int month=input.nextInt();

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("该月份31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("该月份30天");
                break;
            case 2:
                System.out.println("该月份28或者29天");
                break;
            default:
                System.out.println("月份无效");
                break;
        }
    }
}
