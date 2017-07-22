package com.jc02.qinjiajun;

/**
 * 　　  　  　     \\\|///
 * 　　　 　    \\　.-.-　//
 * 　　　　　  　(　.@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 秦佳俊　　　　　　                                                                 　|
 * |　@author 江西财经大学软件工程                                                 |
 * |　@create 2017年07月22日 - 10:10
 * |    @description
 * +---------------------------------Oooo---------------------------------------+
 */

    public class a {
        public static void main(String[] args) {
            int[] b = {76,85,98,54,60};
            boom(b);
            insert(72, b);
            insert(100, b);

        }

        public static void insert(int a, int[] b) {
            int size = b.length;;
            int l = size;
            int[] c = new int[size + 1];
            for (int i = 0; i < size; i++) {
                if (a > b[i]) {
                    l = i;
                    break;
                }
            }
            for (int i = 0; i < l; i++) {
                c[i] = b[i];  //将比a小的前面的值放在新的数组c中
            }
            c[l] = a;//将a放在 l 的位置上
            for (int i = l; i < b.length; i++) {
                c[i + 1] = b[i];    //将比a大的值放在l位置后的数组c中
            }

            System.out.print("原数组 ：");
            for (int i = 0; i < b.length; i++) {
                System.out.print("\t"+b[i]);
            }

            System.out.println("\n");
            System.out.println("插入数字 ：\t" + a);
            System.out.println();
            System.out.print("插入后新数组 ：");
            for (int i = 0; i < c.length; i++) {
                System.out.print(" "+ c[i]);
            }
            System.out.println("\n");

        }
          public  static  void boom(int []b)
    {
        int temp;
        for (int i = 0; i <b.length-1 ; i++) {
            for (int j = 0; j < b.length-1; j++) {
                if(b[j]<b[j+1])
                {
                    temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }


    }
    }
