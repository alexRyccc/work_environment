package com.newer.exam.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Checkbox implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int chid;
	private String chname;
	private String cha;
	private String chb;
	private String chc;
	private String chd;
	@JsonFormat(pattern="yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date chdate;
	private String chtype;
	private String chwanswer;

	public int getChid() {
		return chid;
	}

	public void setChid(int chid) {
		this.chid = chid;
	}

	public String getChname() {
		return chname;
	}

	public void setChname(String chname) {
		this.chname = chname;
	}

	public String getCha() {
		return cha;
	}

	public void setCha(String cha) {
		this.cha = cha;
	}

	public String getChb() {
		return chb;
	}

	public void setChb(String chb) {
		this.chb = chb;
	}

	public String getChc() {
		return chc;
	}

	public void setChc(String chc) {
		this.chc = chc;
	}

	public String getChd() {
		return chd;
	}

	public void setChd(String chd) {
		this.chd = chd;
	}

	public Date getChdate() {
		return chdate;
	}

	public void setChdate(Date chdate) {
		this.chdate = chdate;
	}

	public String getChwanswer() {
		return chwanswer;
	}

	public void setChwanswer(String chwanswer) {
		this.chwanswer = chwanswer;
	}

	public String getChtype() {
		return chtype;
	}

	public void setChtype(String chtype) {
		this.chtype = chtype;
	}
	
	

}
