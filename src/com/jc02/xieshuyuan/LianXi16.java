package com.jc02.xieshuyuan;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月22日 - 15:36
 * |    @description   日历的制作
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi16 {
    public static class yearmonth{
        int year=0,moth=0;
    }
    public static void rili(int year,int month){
        yearmonth a=new yearmonth();
        a.year=year;
        a.moth=month;
        //先判断year是否是闰年
        boolean Renyear;//定义布尔类型true or false
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println("\n"+year+"是闰年");
            Renyear=true;
        }
        else{
            System.out.println("\n"+year+"是平年");
            Renyear=false;
        }
        //记录当月的天数
        int day=0;
        switch (month){
            case 1:day=31;break;
            //case 2:day=28 or 29;break;
            case 3:day=31;break;
            case 4:day=30;break;
            case 5:day=31;break;
            case 6:day=30;break;
            case 7:day=31;break;
            case 8:day=31;break;
            case 9:day=30;break;
            case 10:day=31;break;
            case 11:day=30;break;
            case 12:day=31;break;
            default:if(Renyear){
                day=29;
            }
            else{
                day=28;
            }
                break;
        }
        System.out.print(year+"年"+month+"月"+"有"+day+"天"+"\t");
        System.out.println(month+"月份的万年历如下：");
        //统计从1900年到指定日期的天数，1900年1月1日为星期一。
        int sum=0;
        //从1900年开始循环，循环次数是：指定年份—1900；
        for(int i=1900;i<year;i++){
            //判断是否是闰年
            if( (i%4==0 && i%100!=0) || (i%400==0) ){
                sum=sum+366;
            }
            else{
                sum=sum+365;
            }
        }
        //统计月份的天数
        for(int i=1;i<month;i++){
            //大月
            if(i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                sum=sum+31;
            }
            //小月
            else if(i==4||i==6||i==9||i==11){
                sum=sum+30;
            }
            //二月
            else {
                if(Renyear)
                    sum=sum+29;
                else
                    sum=sum+28;
            }
        }

        //该公式起始时间是1990年1月1日，且1月1日是星期一。
        int blank=sum%7+0;//blank开始输出的空格数 +1是从星期一开始；
        System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期天");

        int count=1;
        for(int i=0;i<blank;i++){
            System.out.print("\t\t");
            count++;
        }
        if(count>7){
            System.out.println("");
            count=1;
        }
        for(int j=1;j<=day;j++){
            if(count%7==0){
                System.out.print("\t"+j+"\n"); //控制换行
                count=1;
            }
            else{
                System.out.print("\t"+j+"\t");//控制加空格
                count++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("选择年份(注必须大于等于1900年):");
        int year=input.nextInt();
        int month=1;
        rili(year,month);
        System.out.println("\n选项：P\tN\tALL\t（P表示显示上一个月 | N表示显示下一个月 | ALL表示显示该年的所有月份）");
        String menu1="P";
        String menu2="N";
        String menu3="ALL";
        System.out.println("请输入以上三个选项来选择显示选项：");
        String menu=input.next();
        if(menu.equals(menu1)){
            year=year-1;
            month=12;
            System.out.println("\n"+year+"是平年");
            System.out.print(year+"年"+month+"月"+"有"+31+"天"+"\t");
            System.out.println(month+"月份的万年历如下：");
            int sum=31;
            int blank=sum%7+1;//blank开始输出的空格数 +1是从星期五开始；
            System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期天");

            int num=1;
            for(int i=0;i<blank;i++){
                System.out.print("\t\t");
                num++;
            }
            if(num>7){
                System.out.println("");
                num=1;
            }
            for(int i=1;i<=sum;i++){
                if(num%7==0){
                    System.out.print("\t"+i+"\n");//控制换行
                    num=1;
                }
                else{
                    System.out.print("\t"+i+"\t");
                    num++;
                }
            }
        }else if(menu.equals(menu2)){
            month=month+1;
            rili(year,month);
        }else if(menu.equals(menu3)){
            for(int k=1;k<=12;k++){
                month=k;
                rili(year,month);
            }
        }else{
            System.out.println("请正确输入这个三个选项：P\tN\tALL！");
        }
    }
}
