package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:23　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

import java.util.UUID;

public class LinkMessage extends CommonMessage {
    private String title;	//消息标题
    private String description;	//消息描述
    private String url;	//消息链接
    public LinkMessage(){
        super("Link");
    }
    public void showxml(){
        System.out.println("<xml>");
        System.out.println(" <ToUserName>"+getToUserName()+" </ToUserName>");
        System.out.println(" <FromUserName>"+getFromUserName()+" </ToUserName>");
        System.out.println(" <CreateTime>"+ System.currentTimeMillis()+" </CreateTime>");
        System.out.println(" <Title>"+ getTitle()+" </Title>");
        System.out.println(" <Description>"+ getDescription()+" </Description>");
        System.out.println(" <Url>"+ getUrl()+" </Url>");
        System.out.println(" <MagType>"+ getMsgType()+" </MagType>");
        System.out.println(" <MsgId>"+ UUID.randomUUID()+" </MsgId>");
        System.out.println("</xml>");

    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

