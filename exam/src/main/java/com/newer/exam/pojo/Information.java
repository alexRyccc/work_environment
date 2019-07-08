package com.newer.exam.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Information implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer ifuid;
	private Integer ifaid;
	private String ifname;
	private String aname;
	private String uname;
	private Integer iftype;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date ifdate;
	public Integer getIfuid() {
		return ifuid;
	}
	public void setIfuid(Integer ifuid) {
		this.ifuid = ifuid;
	}
	public Integer getIfaid() {
		return ifaid;
	}
	public void setIfaid(Integer ifaid) {
		this.ifaid = ifaid;
	}
	public String getIfname() {
		return ifname;
	}
	public void setIfname(String ifname) {
		this.ifname = ifname;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Date getIfdate() {
		return ifdate;
	}
	public void setIfdate(Date ifdate) {
		this.ifdate = ifdate;
	}
	public Integer getIftype() {
		return iftype;
	}
	public void setIftype(Integer iftype) {
		this.iftype = iftype;
	}
	
	
}
