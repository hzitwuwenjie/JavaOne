package com.jc02.wuwenjie.one;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 　༺༺超༒神༻༻
 * |　@author 深圳合众艾特信息技术有限公司
 * |　@create 2017年07月24日 - 9:04
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class MyCalander {

    int year;
    int month;


    /**
     * 计算传入进来的年份是不是闰年
     *
     * @param year
     * @return
     */
    public boolean leapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    /**
     * 根据传入的年份和月份求出该月的总天数
     *
     * @param year
     * @param month
     * @return
     */
    public int getSumDays(int year, int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return leapYear(year) ? 29 : 28;
            default:
                return 0;  //表示一个错误的结果
        }
    }

    /**
     * 根据用户插入的年份和月份求出该月1号距离1900年经过了多少天
     *
     * @param year
     * @param month
     * @return
     */
    public int getAllDays(int year, int month) {
        int sum = 0;
        //每过一年。增加年份所带来的天数
        for (int i = 1900; i < year; i++) {
            sum += leapYear(i) ? 366 : 365;
        }
        //最后一年，每过一个月所增加的天数
        for(int i=1;i<month;i++){
            sum+=getSumDays(year,i);
        }

        return sum;
    }


    /**
     *  根据传入的年份和月份输出日历
     */

    public void showCalander(int year,int month){
        int sumday = getAllDays(year, month);
        int kongge = sumday % 7 + 1;
        System.out.println("\n======================================================");
        System.out.println("\t\t\t\t" + year + "年" + month + "月");
        System.out.println("======================================================");
        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");
        for (int i = 0; i < kongge; i++) {
            System.out.print(" \t\t");
        }
        if (kongge == 7)
            System.out.println();
        for (int i = 1; i <= getSumDays(year, month); i++) {
            System.out.print(i + "\t\t");
            if ((i + kongge) % 7 == 0)
                System.out.println();
        }
    }


}
