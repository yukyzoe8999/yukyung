package com.today;

import java.util.Date;

public class Test {
	private int id;
	private String locname;
	private Date regdate;
	private String name;
	private String enemy;
	private String content;
	private int seq;
	private boolean mark;


	public Test() {
		
	}
	public Test(int id, String locname, Date regdate, String name, String enemy, String content, int seq, boolean mark) {
		this.id = id;
		this.locname = locname;
		this.regdate = regdate;
		this.name = name;
		this.enemy = enemy;
		this.content = content;
		this.seq = seq;
		this.mark = mark;
	}
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getLocname() {
		return locname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setLocname(String locname) {
		this.locname = locname;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEnemy() {
		return enemy;
	}
	public void setEnemy(String enemy) {
		this.enemy = enemy;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public boolean getMark() {
		return mark;
	}
	public void setMark(boolean mark) {
		this.mark = mark;
	}
	

}
