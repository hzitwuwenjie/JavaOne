package com.jc02.xieshuyuan;

import java.util.Scanner;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 谢树源　　　　　                                                                 　|
 * |　@author 深圳合众艾特信息技术有限公司                                                   |
 * |　@create 2017年07月22日 - 9:01
 * |    @description   数组练习1插入算法按降序插入学生成绩
 * +---------------------------------Oooo---------------------------------------+
 */
public class LianXi14 {
    public static void main(String[] args) {
        int[] arryscore={99,85,82,63,60};
        int[] arryscore1=new int[6];
        int num=0;
        System.out.println("请输入新增成绩：");
        Scanner input=new Scanner(System.in);
        int score=input.nextInt();
        for(int i=0; i<arryscore.length; i++){
            if(score<arryscore[i] && score>=arryscore[i+1]){
                num=i+1;
                for(int j=0;j<num;j++){
                    arryscore1[j]=arryscore[j];
                }
                arryscore1[num]=score;
                for(int k=num+1;k<arryscore1.length;k++){
                    arryscore1[k]=arryscore[k-1];
                }
            }else if(score>=arryscore[0]){
                arryscore1[0]=score;
                for(int k=1;k<arryscore1.length;k++) {
                    arryscore1[k] = arryscore[k-1];
                }
            }else if(score<arryscore[arryscore.length-1]){
                num=arryscore1.length-1;
                arryscore1[num]=score;
                for(int k=0;k<arryscore1.length-1;k++) {
                    arryscore1[k] = arryscore[k];
                }
                System.out.println("插入成绩的下标是："+num);
                for(int k=0;k<arryscore1.length;k++){
                    System.out.print(arryscore1[k]+"\t\t");
                } return;
            }
        }
        if(num>=0 && num<=6){
            System.out.println("插入成绩的下标是："+num);
            for(int i=0;i<arryscore1.length;i++){
                System.out.print(arryscore1[i]+"\t\t");
            }
        }else{
            System.out.println("新增的成绩比一组中六个同学都小，不用插入！");
        }
    }
}
