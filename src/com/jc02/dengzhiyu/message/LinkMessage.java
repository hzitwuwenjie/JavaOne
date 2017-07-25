package com.jc02.dengzhiyu.message;/*
 *  |　@author 邓智宇　　　　　　                                                                 　　　　　
 *  |　@author 江西财经大学                                                   
 *  |　@create 2017年07月24日 - 16:23　                    
 *  |    @description   　　　　　　　　　　　　　                                                              　
 */

public class LinkMessage extends CommonMessage {
    private String title;	//消息标题
    private String description;	//消息描述
    private String url;	//消息链接
    public LinkMessage(){
        super("Link");
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

