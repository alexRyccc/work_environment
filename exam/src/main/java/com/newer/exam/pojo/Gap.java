package com.newer.exam.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class Gap implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Excel(name = "题号", orderNum = "0")
	private int gpid;
	@Excel(name = "标题", orderNum = "1")
	private String gpname;
	@Excel(name = "选项A", orderNum = "2")
	private String gpa;
	@JsonFormat(pattern="yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date gpdate;
	@Excel(name = "发布类型", orderNum = "3")
	private String gptype;


	
	@Override
	public String toString() {
		return "Gap [gpid=" + gpid + ", gpname=" + gpname + ", gpa=" + gpa + ", gpdate=" + gpdate + ", gptype=" + gptype
				+ "]";
	}
	public int getgpid() {
		return gpid;
	}
	public void setgpid(int gpid) {
		this.gpid = gpid;
	}
	public String getgpname() {
		return gpname;
	}
	public void setgpname(String gpname) {
		this.gpname = gpname;
	}
	public String getgpa() {
		return gpa;
	}
	public void setgpa(String gpa) {
		this.gpa = gpa;
	}

	public Date getgpdate() {
		return gpdate;
	}
	public void setgpdate(Date gpdate) {
		this.gpdate = gpdate;
	}

	public String getgptype() {
		return gptype;
	}
	public void setgptype(String gptype) {
		this.gptype = gptype;
	}
	
	
}
