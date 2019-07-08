package com.newer.exam.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Report implements Serializable {
	private Integer rpid;
	private Integer userid;
	private String name;//用户姓名
	private Integer pid;
	@JsonFormat(pattern="yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date rpdate;
	private Integer grade;
	@JsonFormat(pattern="HH:mm:ss")
	@DateTimeFormat(pattern="HH:mm:ss")
	private Date rpmin;//秒
	private String renames;//试卷题型
	
	private String ptype;//试卷类型
	@Override
	public String toString() {
		return "Report [rpid=" + rpid + ", userid=" + userid + ", name=" + name + ", pid=" + pid + ", redate=" + rpdate
				+ ", grade=" + grade + ", rpmin=" + rpmin + ", renames=" + renames + ", ptype=" + ptype + "]";
	}
	public Integer getRpid() {
		return rpid;
	}
	public void setRpid(Integer rpid) {
		this.rpid = rpid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public Date getRedate() {
		return rpdate;
	}
	public void setRedate(Date rpdate) {
		this.rpdate = rpdate;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	public Date getRpmin() {
		return rpmin;
	}
	public void setRpmin(Date rpmin) {
		this.rpmin = rpmin;
	}
	public String getRenames() {
		return renames;
	}
	public void setRenames(String renames) {
		this.renames = renames;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	
	
	
	
	

}
