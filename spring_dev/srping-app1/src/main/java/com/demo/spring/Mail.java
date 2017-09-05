package com.demo.spring;

import java.util.ArrayList;

public class Mail {

	private String fromAddress;
	private ArrayList<String> toAddress;
	private Message message;
	public String getFromAddress() {
		return fromAddress;
	}
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}
	public ArrayList<String> getToAddress() {
		return toAddress;
	}
	public void setToAddress(ArrayList<String> toAddress) {
		this.toAddress = toAddress;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	
	
	
	
	
}
