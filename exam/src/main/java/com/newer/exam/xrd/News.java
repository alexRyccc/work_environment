package com.newer.exam.xrd;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class News implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private int nid;
	private String nname;
	private String testtype;
	private String location;
	@JsonFormat(pattern="yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date ndate;
	private String url;
	private String ntype;
	
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}

	public News(int nid, String nname, String testtype, String location, Date ndate, String url, String ntype) {
		super();
		this.nid = nid;
		this.nname = nname;
		this.testtype = testtype;
		this.location = location;
		this.ndate = ndate;
		this.url = url;
		this.ntype = ntype;
	}

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String getNname() {
		return nname;
	}

	public void setNname(String nname) {
		this.nname = nname;
	}

	public String getTesttype() {
		return testtype;
	}

	public void setTesttype(String testtype) {
		this.testtype = testtype;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getNdate() {
		return ndate;
	}

	public void setNdate(Date ndate) {
		this.ndate = ndate;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNtype() {
		return ntype;
	}

	public void setNtype(String ntype) {
		this.ntype = ntype;
	}
	
}
