package com.jc02.ycc;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　    (.@.@)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 了了yc　　　　　　                                                                 　|
 * |　@author 江西财经大学软件143                                                   |
 * |　@create 2017年07月24日 - 10:37
 * |    @description   日历
 * +---------------------------------Oooo---------------------------------------+
 */
public class Rili {
    int year;
    int month;

    //计算传入进来的年份是不是闰年
    public boolean leapYear(int year){

        return(year%4==0 && year%100!=0 ||year%400==0);
    }

    public int getSumDays(int year,int month){
        switch (month){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                return 31;
            case 4:case 6:case 9:case 11:
                return 30;
            case 2:
                return leapYear(year) ?29:28;
            default:
                return -1;  //表示一个错误的结果
        }

    }

    public int getAlldays(int year,int month){
        int sum=0;
        //每过一年增加的年份和天数
        for (int i=1900;i<year;i++){
            sum+=leapYear(i)?366:365; //调用函数判断是366天还是365天；
        }
        //System.out.println(year+"年的1月1日距离1900年1月1日经过了"+sum+"天");
        //最后一年每过一个月增加的天数
        for (int i=1;i<month;i++){
            sum+=getSumDays(year,i); //

        }
        //System.out.println(year+"年的"+month+"月1日距离1900年1月1日经过了"+sum+"天");
        return sum;
    }

    public void showRili(int year,int month){
        int sumday=getAlldays(year,month);
        int kongge=sumday %7 + 1;

        System.out.println("\n========================================");
        System.out.println("\t\t\t\t"+year+"年"+month+"月");
        System.out.println("\n========================================");
        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");
        for (int i = 0; i <kongge ; i++) {
            System.out.print("\t\t");
        }
        if(kongge==7)
            System.out.println();

        for (int i = 1; i <=getSumDays(year,month) ; i++) {

            System.out.print(i+"\t\t");
            if((i+kongge)%7==0)  //实现
                System.out.println();
        }

    }


}
