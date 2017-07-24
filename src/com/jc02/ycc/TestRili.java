package com.jc02.ycc;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　    (.@.@)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学软件143                                                   |
 * |　@create 2017年07月24日 - 10:41
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class TestRili {
    public static void main(String[] args) {
        Rili m=new Rili();
        //获得当前时间的月份，月份从0开始所以结果要加1
        Scanner input=new Scanner(System.in);
        System.out.println("请输入年份：");
        int year=input.nextInt();
        //System.out.println("请输入月份：");
        int month=1;

        String msg="";
        do{
            m.showRili(year,month);
            System.out.println("\n请输入n继续显示下一个月，输入p显示上一个月,输入all显示全年日历");
            msg=input.next();
            if(msg.equalsIgnoreCase("n")){
                month++;
                if (month>12){
                    month=1;
                    year--;
                }
            }else if (msg.equalsIgnoreCase("p")){
                month--;
                if(month<1){
                    month=12;
                    year--;
                }
            }else if (msg.equalsIgnoreCase("all")){
                for (int i=1;i<=11;i++){
                    m.showRili(year,i);
                }
                month=12;
            }else {
                break;
            }

        }while (true);

    }
}
