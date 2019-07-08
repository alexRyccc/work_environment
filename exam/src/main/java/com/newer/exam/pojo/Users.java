package com.newer.exam.pojo;

public class Users {
	private int uid;
	private String unum;
	private String upassword;
	private String uphone;
	private String uname;
	private String email;
	public Users() {
		super();
	}
	
	public Users(int uid, String unum, String upassword, String uphone, String uname, String email) {
		super();
		this.uid = uid;
		this.unum = unum;
		this.upassword = upassword;
		this.uphone = uphone;
		this.uname = uname;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Users [uid=" + uid + ", unum=" + unum + ", upassword=" + upassword + ", uphone=" + uphone + ", uname="
				+ uname + ", email=" + email + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUnum() {
		return unum;
	}
	public void setUnum(String unum) {
		this.unum = unum;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public String getUphone() {
		return uphone;
	}
	public void setUphone(String uphone) {
		this.uphone = uphone;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	

}
