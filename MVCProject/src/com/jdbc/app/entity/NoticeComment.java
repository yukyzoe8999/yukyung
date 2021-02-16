package com.jdbc.app.entity;

import java.util.Date;

public class NoticeComment {
	private	int id;
	private int mid;
	private String comment;
	private String write_id;
	private Date regdate;
	
	
	public NoticeComment(){
		
	}
	public NoticeComment(int id, int mid, String comment, String write_id, Date regdate) {
		this.id = id;
		this.mid = mid;
		this.comment = comment;
		this.write_id = write_id;
		this.regdate = regdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getWrite_id() {
		return write_id;
	}
	public void setWrite_id(String write_id) {
		this.write_id = write_id;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}


}
