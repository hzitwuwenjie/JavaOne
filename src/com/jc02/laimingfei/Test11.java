package com.jc02.laimingfei;

/**
 * Created by ${赖明飞} .
 */
public class Test11 {

    public void Graphical(int size){
        for (int i = 1; i <size ; i++) {
            for (int j = 1; j <i+1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void Graphical2(int line,int number){
        for(int i=1;i<=line;i++){
            for(int j=number;j>i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public void Graphical3(int line ,int number){
        for (int i=1;i<=line;i++){
            for(int j=number;j>i;j--){
                System.out.print(" ");
            }
            for(int m=1;m<i+1;m++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void Graphical4(int line){
        for(int i=1;i<=line;i++){
            for(int j=line;j>i;j--){
                System.out.print(" ");
            }
            for(int m=1;m<i+1;m++){
                System.out.print("*");
            }
            for(int k=1;k<i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
    public void Graphical5(int line){
        for (int i = 0; i < line-1; i++) {
            for (int j = 0; j < line-1- i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            if (i==0) {}
            else{
                System.out.print("*");
            }
            System.out.println();
        }
        //输出最后一行
        for(int i=0;i<(line-1)*2;i++){
            System.out.print("*");
     }
    }
    public void Graphical6(){
        for(int i=1;i<=10;i++){
            for(int j=10;j>i;j--){
                System.out.print(" ");
            }
            for(int m=1;m<i+1;m++){
                System.out.print("*");
            }
            for(int k=1;k<i;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1;i<=10;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=10;k>i;k--){
                System.out.print("*");
            }
            for(int m=10;m>i-1;m--){
                System.out.print("*");
            }
            System.out.println("");
        }

    }


    public static void main(String[] args) {

       Test11 test=new Test11();
        System.out.println("第一题");
       test.Graphical(10);
        System.out.println("第二题");

       test.Graphical2(10,10);
        System.out.println("第三题");
       test.Graphical3(10,10);
        System.out.println("第四题");
       test.Graphical4(10);
        System.out.println("第五题");
       test.Graphical5(10);
        System.out.println("第六题");
        test.Graphical6();

    }
}
