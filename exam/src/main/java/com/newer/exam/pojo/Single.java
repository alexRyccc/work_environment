package com.newer.exam.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class Single implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Excel(name = "题号", orderNum = "0")
	private int sgid;
	@Excel(name = "标题", orderNum = "1")
	private String sgname;
	@Excel(name = "选项A", orderNum = "2")
	private String sga;
	@Excel(name = "选项B", orderNum = "3")
	private String sgb;
	@Excel(name = "选项C", orderNum = "4")
	private String sgc;
	@Excel(name = "选项D", orderNum = "5")
	private String sgd;
	@JsonFormat(pattern="yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date sgdate;
	@Excel(name = "发布类型", orderNum = "6")
	private String sgtype;

	

	@Override
	public String toString() {
		return "Single [sgid=" + sgid + ", sgname=" + sgname + ", sga=" + sga + ", sgb=" + sgb + ", sgc=" + sgc
				+ ", sgd=" + sgd + ", sgdate=" + sgdate + ", sgtype=" + sgtype + ", sgwanswer=" + sgwanswer + "]";
	}
	@Excel(name = "答案", orderNum = "7")
	private String sgwanswer;
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
	public String getSgwanswer() {
		return sgwanswer;
	}
	public void setSgwanswer(String sgwanswer) {
		this.sgwanswer = sgwanswer;
	}
	public String getSgtype() {
		return sgtype;
	}
	public void setSgtype(String sgtype) {
		this.sgtype = sgtype;
	}
	
	
}
