package com.jc02.laimingfei;

/**
 * Created by ${赖明飞} .
 */
public class Array1 {
    public static void main(String[] args) {
        Pritimive pritimive=new Pritimive();
        boolean array[]=pritimive.getT();
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        array[0]=true;
        array[1]=true;
        array[2]=true;
        pritimive.setT(array);
        boolean arry[]=pritimive.getT();
        for(int i=0;i<pritimive.getT().length;i++){
            System.out.println(arry[i]);
        }



    }
}
