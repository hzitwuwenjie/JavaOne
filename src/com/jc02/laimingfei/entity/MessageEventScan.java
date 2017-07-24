package com.jc02.laimingfei.entity;

public class MessageEventScan extends MessageEvent{
	private String ticket;
	private String eventkey;
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public String getEventkey() {
		return eventkey;
	}
	public void setEventkey(String eventkey) {
		this.eventkey = eventkey;
	}
	

}