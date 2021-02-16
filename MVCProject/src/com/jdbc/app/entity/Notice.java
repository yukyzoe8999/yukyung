package com.jdbc.app.entity;

import java.util.Date;

public class Notice {
	int id;
	String title;
	String write_id;
	String content;
	Date regdate;
	int hit;
	String files;
	int count;
	boolean pub;
	

	//생성자
	public Notice() {
		
	}
	
	//생성자 오버라이드
	public Notice(int id, String title, String write_id, String content, Date regdate, int hit, String files,
			boolean pub) {
		this.id = id;
		this.title = title;
		this.write_id = write_id;
		this.content = content;
		this.regdate = regdate;
		this.hit = hit;
		this.files = files;
		this.pub = pub;
	}
	
	public Notice(String title, String write_id, String content) {
		this.title = title;
		this.write_id =write_id;
		this.content = content;
	}


	public Notice(int count) {
		this.count = count;
	}

	
	//get set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWrite_id() {
		return write_id;
	}
	public void setWrite_id(String write_id) {
		this.write_id = write_id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getFiles() {
		return files;
	}
	public void setFiles(String files) {
		this.files = files;
	}
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public boolean getPub() {
		return pub;
	}

	public void setPub(boolean pub) {
		this.pub = pub;
	}
}
