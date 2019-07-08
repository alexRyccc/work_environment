package com.newer.exam.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class Table implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tablename;

	private int sgid;

	private String sgname;

	private String sga;

	private String sgb;

	private String sgc;

	private String sgd;
	@JsonFormat(pattern="yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date sgdate;
	
	private String sgtype;

	public String getTablename() {
		return tablename;
	}

	public void setTablename(String tablename) {
		this.tablename = tablename;
	}

	public int getSgid() {
		return sgid;
	}

	public void setSgid(int sgid) {
		this.sgid = sgid;
	}

	public String getSgname() {
		return sgname;
	}

	public void setSgname(String sgname) {
		this.sgname = sgname;
	}

	public String getSga() {
		return sga;
	}

	public void setSga(String sga) {
		this.sga = sga;
	}

	public String getSgb() {
		return sgb;
	}

	public void setSgb(String sgb) {
		this.sgb = sgb;
	}

	public String getSgc() {
		return sgc;
	}

	public void setSgc(String sgc) {
		this.sgc = sgc;
	}

	public String getSgd() {
		return sgd;
	}

	public void setSgd(String sgd) {
		this.sgd = sgd;
	}

	public Date getSgdate() {
		return sgdate;
	}

	public void setSgdate(Date sgdate) {
		this.sgdate = sgdate;
	}

	public String getSgtype() {
		return sgtype;
	}

	public void setSgtype(String sgtype) {
		this.sgtype = sgtype;
	}

	

	
	
}
