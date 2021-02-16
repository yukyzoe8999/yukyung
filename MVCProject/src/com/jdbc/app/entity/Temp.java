package com.jdbc.app.entity;

public class Temp {
	private String date;
	private int temp;
	private String writer;
	

	public Temp(String date, int temp, String writer) {
		this.date = date;
		this.temp = temp;
		this.writer = writer;
	}
	
	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}
}
