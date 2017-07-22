package com.jc02.jiangzixu;

/**
 * Created by 姜子旭 on 2017/7/22.
 */
public class Array1 {
    public static void main(String[] args) {
        Pritimive object = new Pritimive();
        for (int i = 0; i <3 ; i++) {
            System.out.println(object.t[i]+" ");
        }
        Pritimive d = new Pritimive();
        for (int i = 0; i <3 ; i++) {
            d.t[i]=true;
        }
        for (int i = 0; i <3 ; i++) {
            System.out.println(d.t[i]+" ");
        }
    }
}
