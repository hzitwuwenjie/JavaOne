package com.jc02.xieshuyuan;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月21日 - 14:53
 * |    @description   判断月份的总天数
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi2 {
    public static void main(String[] args) {
        //请输入一个月份。然后计算该月份的天数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int month = input.nextInt();
        switch (month) {
            case 1:System.out.println("该月份31天"); break;
            case 2:System.out.println("该月份28天或29天"); break;
            case 3:System.out.println("该月份31天"); break;
            case 4:System.out.println("该月份30天"); break;
            case 5:System.out.println("该月份31天"); break;
            case 6:System.out.println("该月份30天"); break;
            case 7:System.out.println("该月份31天"); break;
            case 8:System.out.println("该月份31天"); break;
            case 9:System.out.println("该月份30天"); break;
            case 10:System.out.println("该月份31天"); break;
            case 11:System.out.println("该月份30天"); break;
            case 12:System.out.println("该月份31天"); break;
            default:System.out.println("月份无效"); break;
        }
    }
}
