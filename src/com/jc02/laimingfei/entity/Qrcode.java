package com.jc02.laimingfei.entity;

public class Qrcode {
	private int seneid;
	private String type;
	private String qrcodeName;
	private String qrcodeurl;
	private int valdTime;
	private long fansCount;
	public int  getSeneid() {
		return seneid;
	}
	public void setSeneid(int seneid) {
		this.seneid = seneid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getQrcodeName() {
		return qrcodeName;
	}
	public void setQrcodeName(String qrcodeName) {
		this.qrcodeName = qrcodeName;
	}
	public String getQrcodeurl() {
		return qrcodeurl;
	}
	public void setQrcodeurl(String qrcodeurl) {
		this.qrcodeurl = qrcodeurl;
	}
	public int getValdTime() {
		return valdTime;
	}
	public void setValdTime(int valdTime) {
		this.valdTime = valdTime;
	}
	public long getFansCount() {
		return fansCount;
	}
	public void setFansCount(long fansCount) {
		this.fansCount = fansCount;
	}
	

}
