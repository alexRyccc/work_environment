package com.newer.exam.pojo;


/*
 * 管理员
 * 
 * */
public class Administrator {
	private int aid;
	private String aname;
	private String apassword;
	private String arank; //管理员级别
	private String atype; //管理类型
	public Administrator() {
		super();
	}
	public Administrator(int aid, String aname, String apassword, String arank, String atype) {
		super();
		this.aid = aid;
		this.aname = aname;
		this.apassword = apassword;
		this.arank = arank;
		this.atype = atype;
	}
	@Override
	public String toString() {
		return "Administrator [aid=" + aid + ", aname=" + aname + ", apassword=" + apassword + ", arank=" + arank
				+ ", atype=" + atype + "]";
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getApassword() {
		return apassword;
	}
	public void setApassword(String apassword) {
		this.apassword = apassword;
	}
	public String getArank() {
		return arank;
	}
	public void setArank(String arank) {
		this.arank = arank;
	}
	public String getAtype() {
		return atype;
	}
	public void setAtype(String atype) {
		this.atype = atype;
	}
	
	
	
}
