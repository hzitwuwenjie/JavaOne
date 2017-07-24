package com.jc02.wjm;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 万家明　　　　　                                                                 　|
 * |　@author 江西财经大学                                                  |
 * |　@create 2017年07月24日 - 10:16
 * |  @description   日历
 * +---------------------------------Oooo---------------------------------------+
 */
public class Calander {
    int year;
    int month;
    /*润年*/
    public boolean leapYear(int year){
        return year%4==0&&year%100!=0||year%400==0;
    }
    /*一个月多少天*/
    public int sumdays(int year,int month){
        switch (month){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                return 31;
            case 4:case 9:case 11:case 6:
                return  30;
            case 2:
                return leapYear(year)?29:28;
            default:
                return 0;
        }
    }
    /*输入年份,月至1900年一月的天数*/
    public int alldays(int year,int month){
        int sum=0;
        for(int i=1900;i<year;i++){
            sum+=leapYear(year)?366:365;
        }
        for(int i=1;i<month;i++){
            sum+=sumdays(year,i);
        }
        return sum;
    }
    public void showCalander(int year,int month){
        int days=alldays(year,month);
        int kg=days%7+1;
        System.out.println("\n******************************************");
        System.out.println(year+"年"+month+"月");
        System.out.println("******************************************");
        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
            for(int i=0;i<kg;i++)
            { System.out.print(" \t\t");}
            if (kg==7)
                System.out.println();
            for(int i=1;i<=sumdays(year,month);i++){
                System.out.print(i + "\t\t");
            if((i+kg)%7==0)
                System.out.println();
            }

    }
}
