package com.jdbc.app.entity;

import java.util.Date;

public class User {
	private String id;
	private String name;
	private String email;
	private String hp;
	private Date regdate;
	
	public User(String id, String name, String email, String hp, Date regdate) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.hp = hp;
		this.regdate = regdate;
	
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	

	
}
