package com.newer.exam.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Gapaper2 implements Serializable {
	private Integer pid;
	private Integer userid;
	private String ptype;
	
	private Integer grade;//分数
	
	private Integer gp1t;
	private String gp1;
	private String gpp1;//正确答案
	private String gppp1;//正确或错误
	private String gpname1;//题目
	
	private Integer gp2t;
	private String gp2;
	private String gpp2;//正确答案
	private String gppp2;//正确或错误
	private String gpname2;//题目
	
	private Integer gp3t;
	private String gp3;
	private String gpp3;//正确答案
	private String gppp3;//正确或错误
	private String gpname3;//题目

	private Integer gp4t;
	private String gp4;
	private String gpp4;//正确答案
	private String gppp4;//正确或错误
	private String gpname4;//题目
	
	private Integer gp5t;
	private String gp5;
	private String gpp5;//正确答案
	private String gppp5;//正确或错误
	private String gpname5;//题目
	

	@JsonFormat(pattern="yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date pdate;


	@Override
	public String toString() {
		return "Gapaper2 [pid=" + pid + ", userid=" + userid + ", ptype=" + ptype + ", grade=" + grade + ", gp1t="
				+ gp1t + ", gp1=" + gp1 + ", gpp1=" + gpp1 + ", gppp1=" + gppp1 + ", gpname1=" + gpname1 + ", gp2t="
				+ gp2t + ", gp2=" + gp2 + ", gpp2=" + gpp2 + ", gppp2=" + gppp2 + ", gpname2=" + gpname2 + ", gp3t="
				+ gp3t + ", gp3=" + gp3 + ", gpp3=" + gpp3 + ", gppp3=" + gppp3 + ", gpname3=" + gpname3 + ", gp4t="
				+ gp4t + ", gp4=" + gp4 + ", gpp4=" + gpp4 + ", gppp4=" + gppp4 + ", gpname4=" + gpname4 + ", gp5t="
				+ gp5t + ", gp5=" + gp5 + ", gpp5=" + gpp5 + ", gppp5=" + gppp5 + ", gpname5=" + gpname5 + ", pdate="
				+ pdate + "]";
	}


	public Integer getPid() {
		return pid;
	}


	public void setPid(Integer pid) {
		this.pid = pid;
	}


	public Integer getUserid() {
		return userid;
	}


	public void setUserid(Integer userid) {
		this.userid = userid;
	}


	public String getPtype() {
		return ptype;
	}


	public void setPtype(String ptype) {
		this.ptype = ptype;
	}


	public Integer getGrade() {
		return grade;
	}


	public void setGrade(Integer grade) {
		this.grade = grade;
	}


	public Integer getGp1t() {
		return gp1t;
	}


	public void setGp1t(Integer gp1t) {
		this.gp1t = gp1t;
	}


	public String getGp1() {
		return gp1;
	}


	public void setGp1(String gp1) {
		this.gp1 = gp1;
	}


	public String getGpp1() {
		return gpp1;
	}


	public void setGpp1(String gpp1) {
		this.gpp1 = gpp1;
	}


	public String getGppp1() {
		return gppp1;
	}


	public void setGppp1(String gppp1) {
		this.gppp1 = gppp1;
	}


	public String getGpname1() {
		return gpname1;
	}


	public void setGpname1(String gpname1) {
		this.gpname1 = gpname1;
	}


	public Integer getGp2t() {
		return gp2t;
	}


	public void setGp2t(Integer gp2t) {
		this.gp2t = gp2t;
	}


	public String getGp2() {
		return gp2;
	}


	public void setGp2(String gp2) {
		this.gp2 = gp2;
	}


	public String getGpp2() {
		return gpp2;
	}


	public void setGpp2(String gpp2) {
		this.gpp2 = gpp2;
	}


	public String getGppp2() {
		return gppp2;
	}


	public void setGppp2(String gppp2) {
		this.gppp2 = gppp2;
	}


	public String getGpname2() {
		return gpname2;
	}


	public void setGpname2(String gpname2) {
		this.gpname2 = gpname2;
	}


	public Integer getGp3t() {
		return gp3t;
	}


	public void setGp3t(Integer gp3t) {
		this.gp3t = gp3t;
	}


	public String getGp3() {
		return gp3;
	}


	public void setGp3(String gp3) {
		this.gp3 = gp3;
	}


	public String getGpp3() {
		return gpp3;
	}


	public void setGpp3(String gpp3) {
		this.gpp3 = gpp3;
	}


	public String getGppp3() {
		return gppp3;
	}


	public void setGppp3(String gppp3) {
		this.gppp3 = gppp3;
	}


	public String getGpname3() {
		return gpname3;
	}


	public void setGpname3(String gpname3) {
		this.gpname3 = gpname3;
	}


	public Integer getGp4t() {
		return gp4t;
	}


	public void setGp4t(Integer gp4t) {
		this.gp4t = gp4t;
	}


	public String getGp4() {
		return gp4;
	}


	public void setGp4(String gp4) {
		this.gp4 = gp4;
	}


	public String getGpp4() {
		return gpp4;
	}


	public void setGpp4(String gpp4) {
		this.gpp4 = gpp4;
	}


	public String getGppp4() {
		return gppp4;
	}


	public void setGppp4(String gppp4) {
		this.gppp4 = gppp4;
	}


	public String getGpname4() {
		return gpname4;
	}


	public void setGpname4(String gpname4) {
		this.gpname4 = gpname4;
	}


	public Integer getGp5t() {
		return gp5t;
	}


	public void setGp5t(Integer gp5t) {
		this.gp5t = gp5t;
	}


	public String getGp5() {
		return gp5;
	}


	public void setGp5(String gp5) {
		this.gp5 = gp5;
	}


	public String getGpp5() {
		return gpp5;
	}


	public void setGpp5(String gpp5) {
		this.gpp5 = gpp5;
	}


	public String getGppp5() {
		return gppp5;
	}


	public void setGppp5(String gppp5) {
		this.gppp5 = gppp5;
	}


	public String getGpname5() {
		return gpname5;
	}


	public void setGpname5(String gpname5) {
		this.gpname5 = gpname5;
	}


	public Date getPdate() {
		return pdate;
	}


	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	
	

}
