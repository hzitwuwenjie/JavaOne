package com.jc02.fankelei;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 范珂磊　　　　　　                                                                 　|
 * |　@author 江西财经大学                                                   |
 * |　@create 2017年07月24日 - 10:19
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */
public class Can {

    int year;
    int month;
    public boolean panDuan(int year){
        if ((year%4==0&&year%100!=0)||year%400==0)
            return true;
        else
            return false;

    }
    public int days(int year,int month){
        switch (month){
            case 1:case 3:case 5:case 7:case 8:case 10:case 12:
                return 31;
            case 4:case 6:case 9:case 11:
                return 30;
            case 2:
                return panDuan(year)?29:28;
            default:
                return -1;

        }
    }
    public int sumDays(int year,int month){
        int sum=0;
        for(int i=1900;i<year;i++){
            int a=panDuan(year)?366:365;
            sum=sum+a;
        }
        for(int j=1;j<month;j++){
            int b=days(year,month);
            sum=sum+b;
        }
        return sum;
    }
    public void showCan(int year,int month){
        int sum=days(year,month);
        int kong=sum%7+1;
        System.out.println("\n======================================================");
        System.out.println("\t\t\t\t"+year+"年"+month+"月");
        System.out.println("======================================================");
        System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t");
        for (int i = 0; i < kong; i++) {
            System.out.print("\t\t");
        }
        if(kong==7)
            System.out.println();
        for (int i = 1; i <=days(year, month) ; i++) {
            System.out.print(i + "\t\t");
            if((i+kong)%7==0)
                System.out.println();
        }
    }
}
