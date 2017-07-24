package com.jc02.wuwenjie.one;

import java.util.Date;

/**
 * 　　  　  　           \\\|///
 * 　　　 　  　   \\　.-.-　//
 * 　　　　　  　(　 .@.@　)
 * +-------oOOo-----( _ )-----oOOo--------------------------------------------+
 * |　@author 　༺༺超༒神༻༻
 * |　@author 深圳合众艾特信息技术有限公司
 * |　@create 2017年07月22日 - 15:03
 * |    @description   用户信息类
 * +---------------------------------Oooo---------------------------------------+
 */
public class Userinfo {

    private String name;
    private String pwd;
    private int age;
    private String realname;
    private String email;
    private String tel;
    private String code="1234";
    private String msgcode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsgcode() {
        return msgcode;
    }

    public void setMsgcode(String msgcode) {
        this.msgcode = msgcode;
    }

    public void setAge(int age){
        if(age<0 || age>100){
            System.out.println("您的年龄输入不合适");
        }else
        {
            this.age=age;  //如果正确的话就吧变量赋值给我的属性
        }
    }
    public int getAge(){

        Date d=new Date();
        if(d.getHours()<10)
               return age;
        else
            return 0;
    }














}
