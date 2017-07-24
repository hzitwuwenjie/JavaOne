package com.jc02.zoudongping.calander;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 邹东平　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 9:07
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class MyCalander {
    int year;
    int month;
    /**
     * 根据输入的年份判断平年或闰年
     * @param year
     * @return
     */
    public boolean leapYear(int year){
        return year%4==0&&year%100!=0||year%400==0;
    }
    /**
     * 根据传入的年份和月份求出该月的总天数
     */
    public int getSumDays(int year,int month){
        switch (month){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:;
                return 31;
            case 4:case 6:case 9:case 11:
                return 30;
            case 2:
                return leapYear(year)?29:28;
            default:return -1;//表示一个错误的结果
        }
    }

    /**
     * 根据用户输入的年份和月份求出该月1号距离1900年经过了多少天
     * @param year
     * @param month
     * @return
     */
    public int getAllDays(int year,int month){
        int sum=0;
        for(int i=1900;i<year;i++){
            sum+=leapYear(i)?366:365;
        }
       // System.out.println(year+"年的1月1日距离1900年1月1日经过了"+sum+"天");
        //最后一年，每过一个月所增加的天数
        for(int i=1;i<month;i++)
        {
            sum+=getSumDays(year,i);
        }
       // System.out.println(year+"年的"+month+"月1日距离1900年1月1日经过了"+sum+"天");
        return sum;
    }

    /**
     * 根据传入的年份和月份输出日历
     * @param year
     * @param month
     */
    public void showCalander(int year,int month){
        int sumday = getAllDays(year, month);
        int kongge = sumday % 7 + 1;
        System.out.println();
        System.out.println("=====================================================");
        System.out.println("\t\t\t\t"+year+"年"+month+"月");
        System.out.println("=====================================================");
        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");
        for (int i = 0; i < kongge; i++) {
            System.out.print("\t\t");
        }
        if (kongge == 7) {
            System.out.println();
        }
        for (int i = 1; i <= getSumDays(year, month); i++) {
            System.out.print(i + "\t\t");
            if ((i + kongge) % 7 == 0) {
                System.out.println();
            }
        }
    }
}