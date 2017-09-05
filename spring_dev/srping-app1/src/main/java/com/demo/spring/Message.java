package com.demo.spring;

public class Message {

	private String header; 
	private String body; 
	
	public Message()
	{}
	
	public Message(String Header, String Body)
	{
		this.header = Header;
		this.body = Body;
	}
	
	public String getHeader(){
		return this.header;
	}
	

	public String getBody(){
		return this.body;
	}	
}
