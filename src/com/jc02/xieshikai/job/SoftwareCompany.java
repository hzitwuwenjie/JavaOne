package com.jc02.xieshikai.job;

/**
 * 丑的人还在沉睡~~~
 * 　　 ⊂⌒／ヽ-、＿_
 * 　／⊂_/＿＿＿＿ ／
 * 　￣￣￣￣￣￣￣
 * +----------------------------Ψ(￣∀￣)Ψ--------------------------+
 * |　@author 谢士凯　^_^　                                                                 　|
 * |　@adress 江西财经大学
 * |　@create 2017年07月25日 - 19:32
 * |  @description   软件公司类
 * +-------------（づ￣3￣）づ╭❤～------╭∩╮（￣▽￣）╭∩╮ ---------+
 */
public class SoftwareCompany {
    String skill;
    public String hiring(Human man){
        if(man.program().equals("programmer")&&man.drive().equals("driver"))
            return man.getName()+",具有软件开发能力和驾驶能力";
        else
            return "";
    }
}
