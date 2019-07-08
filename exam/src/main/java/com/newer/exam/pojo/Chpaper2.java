package com.newer.exam.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Chpaper2 implements Serializable {
	private Integer pid;
	private Integer userid;
	private String ptype;
	
	private Integer grade;//分数
	
	private Integer ch1t;
	private String ch1;
	private String chh1;//正确答案
	private String chhh1;//正确或错误
	private String chname1;//题目
	
	private Integer ch2t;
	private String ch2;
	private String chh2;//正确答案
	private String chhh2;//正确或错误
	private String chname2;//题目
	
	private Integer ch3t;
	private String ch3;
	private String chh3;//正确答案
	private String chhh3;//正确或错误
	private String chname3;//题目
	
	private Integer ch4t;
	private String ch4;
	private String chh4;//正确答案
	private String chhh4;//正确或错误
	private String chname4;//题目
	
	private Integer ch5t;
	private String ch5;
	private String chh5;//正确答案
	private String chhh5;//正确或错误
	private String chname5;//题目
	
	private Integer ch6t;
	private String ch6;
	private String chh6;//正确答案
	private String chhh6;//正确或错误
	private String chname6;//题目
	
	private Integer ch7t;
	private String ch7;
	private String chh7;//正确答案
	private String chhh7;//正确或错误
	private String chname7;//题目
	
	private Integer ch8t;
	private String ch8;
	private String chh8;//正确答案
	private String chhh8;//正确或错误
	private String chname8;//题目
	
	private Integer ch9t;
	private String ch9;
	private String chh9;//正确答案
	private String chhh9;//正确或错误
	private String chname9;//题目
	
	private Integer ch10t;
	private String ch10;
	private String chh10;//正确答案
	private String chhh10;//正确或错误
	private String chname10;//题目
	

	@JsonFormat(pattern="yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date pdate;//日期


	@Override
	public String toString() {
		return "Chpaper2 [pid=" + pid + ", userid=" + userid + ", ptype=" + ptype + ", grade=" + grade + ", ch1t="
				+ ch1t + ", ch1=" + ch1 + ", chh1=" + chh1 + ", chhh1=" + chhh1 + ", chname1=" + chname1 + ", ch2t="
				+ ch2t + ", ch2=" + ch2 + ", chh2=" + chh2 + ", chhh2=" + chhh2 + ", chname2=" + chname2 + ", ch3t="
				+ ch3t + ", ch3=" + ch3 + ", chh3=" + chh3 + ", chhh3=" + chhh3 + ", chname3=" + chname3 + ", ch4t="
				+ ch4t + ", ch4=" + ch4 + ", chh4=" + chh4 + ", chhh4=" + chhh4 + ", chname4=" + chname4 + ", ch5t="
				+ ch5t + ", ch5=" + ch5 + ", chh5=" + chh5 + ", chhh5=" + chhh5 + ", chname5=" + chname5 + ", ch6t="
				+ ch6t + ", ch6=" + ch6 + ", chh6=" + chh6 + ", chhh6=" + chhh6 + ", chname6=" + chname6 + ", ch7t="
				+ ch7t + ", ch7=" + ch7 + ", chh7=" + chh7 + ", chhh7=" + chhh7 + ", chname7=" + chname7 + ", ch8t="
				+ ch8t + ", ch8=" + ch8 + ", chh8=" + chh8 + ", chhh8=" + chhh8 + ", chname8=" + chname8 + ", ch9t="
				+ ch9t + ", ch9=" + ch9 + ", chh9=" + chh9 + ", chhh9=" + chhh9 + ", chname9=" + chname9 + ", ch10t="
				+ ch10t + ", ch10=" + ch10 + ", chh10=" + chh10 + ", chhh10=" + chhh10 + ", chname10=" + chname10
				+ ", pdate=" + pdate + "]";
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


	public Integer getCh1t() {
		return ch1t;
	}


	public void setCh1t(Integer ch1t) {
		this.ch1t = ch1t;
	}


	public String getCh1() {
		return ch1;
	}


	public void setCh1(String ch1) {
		this.ch1 = ch1;
	}


	public String getChh1() {
		return chh1;
	}


	public void setChh1(String chh1) {
		this.chh1 = chh1;
	}


	public String getChhh1() {
		return chhh1;
	}


	public void setChhh1(String chhh1) {
		this.chhh1 = chhh1;
	}


	public String getChname1() {
		return chname1;
	}


	public void setChname1(String chname1) {
		this.chname1 = chname1;
	}


	public Integer getCh2t() {
		return ch2t;
	}


	public void setCh2t(Integer ch2t) {
		this.ch2t = ch2t;
	}


	public String getCh2() {
		return ch2;
	}


	public void setCh2(String ch2) {
		this.ch2 = ch2;
	}


	public String getChh2() {
		return chh2;
	}


	public void setChh2(String chh2) {
		this.chh2 = chh2;
	}


	public String getChhh2() {
		return chhh2;
	}


	public void setChhh2(String chhh2) {
		this.chhh2 = chhh2;
	}


	public String getChname2() {
		return chname2;
	}


	public void setChname2(String chname2) {
		this.chname2 = chname2;
	}


	public Integer getCh3t() {
		return ch3t;
	}


	public void setCh3t(Integer ch3t) {
		this.ch3t = ch3t;
	}


	public String getCh3() {
		return ch3;
	}


	public void setCh3(String ch3) {
		this.ch3 = ch3;
	}


	public String getChh3() {
		return chh3;
	}


	public void setChh3(String chh3) {
		this.chh3 = chh3;
	}


	public String getChhh3() {
		return chhh3;
	}


	public void setChhh3(String chhh3) {
		this.chhh3 = chhh3;
	}


	public String getChname3() {
		return chname3;
	}


	public void setChname3(String chname3) {
		this.chname3 = chname3;
	}


	public Integer getCh4t() {
		return ch4t;
	}


	public void setCh4t(Integer ch4t) {
		this.ch4t = ch4t;
	}


	public String getCh4() {
		return ch4;
	}


	public void setCh4(String ch4) {
		this.ch4 = ch4;
	}


	public String getChh4() {
		return chh4;
	}


	public void setChh4(String chh4) {
		this.chh4 = chh4;
	}


	public String getChhh4() {
		return chhh4;
	}


	public void setChhh4(String chhh4) {
		this.chhh4 = chhh4;
	}


	public String getChname4() {
		return chname4;
	}


	public void setChname4(String chname4) {
		this.chname4 = chname4;
	}


	public Integer getCh5t() {
		return ch5t;
	}


	public void setCh5t(Integer ch5t) {
		this.ch5t = ch5t;
	}


	public String getCh5() {
		return ch5;
	}


	public void setCh5(String ch5) {
		this.ch5 = ch5;
	}


	public String getChh5() {
		return chh5;
	}


	public void setChh5(String chh5) {
		this.chh5 = chh5;
	}


	public String getChhh5() {
		return chhh5;
	}


	public void setChhh5(String chhh5) {
		this.chhh5 = chhh5;
	}


	public String getChname5() {
		return chname5;
	}


	public void setChname5(String chname5) {
		this.chname5 = chname5;
	}


	public Integer getCh6t() {
		return ch6t;
	}


	public void setCh6t(Integer ch6t) {
		this.ch6t = ch6t;
	}


	public String getCh6() {
		return ch6;
	}


	public void setCh6(String ch6) {
		this.ch6 = ch6;
	}


	public String getChh6() {
		return chh6;
	}


	public void setChh6(String chh6) {
		this.chh6 = chh6;
	}


	public String getChhh6() {
		return chhh6;
	}


	public void setChhh6(String chhh6) {
		this.chhh6 = chhh6;
	}


	public String getChname6() {
		return chname6;
	}


	public void setChname6(String chname6) {
		this.chname6 = chname6;
	}


	public Integer getCh7t() {
		return ch7t;
	}


	public void setCh7t(Integer ch7t) {
		this.ch7t = ch7t;
	}


	public String getCh7() {
		return ch7;
	}


	public void setCh7(String ch7) {
		this.ch7 = ch7;
	}


	public String getChh7() {
		return chh7;
	}


	public void setChh7(String chh7) {
		this.chh7 = chh7;
	}


	public String getChhh7() {
		return chhh7;
	}


	public void setChhh7(String chhh7) {
		this.chhh7 = chhh7;
	}


	public String getChname7() {
		return chname7;
	}


	public void setChname7(String chname7) {
		this.chname7 = chname7;
	}


	public Integer getCh8t() {
		return ch8t;
	}


	public void setCh8t(Integer ch8t) {
		this.ch8t = ch8t;
	}


	public String getCh8() {
		return ch8;
	}


	public void setCh8(String ch8) {
		this.ch8 = ch8;
	}


	public String getChh8() {
		return chh8;
	}


	public void setChh8(String chh8) {
		this.chh8 = chh8;
	}


	public String getChhh8() {
		return chhh8;
	}


	public void setChhh8(String chhh8) {
		this.chhh8 = chhh8;
	}


	public String getChname8() {
		return chname8;
	}


	public void setChname8(String chname8) {
		this.chname8 = chname8;
	}


	public Integer getCh9t() {
		return ch9t;
	}


	public void setCh9t(Integer ch9t) {
		this.ch9t = ch9t;
	}


	public String getCh9() {
		return ch9;
	}


	public void setCh9(String ch9) {
		this.ch9 = ch9;
	}


	public String getChh9() {
		return chh9;
	}


	public void setChh9(String chh9) {
		this.chh9 = chh9;
	}


	public String getChhh9() {
		return chhh9;
	}


	public void setChhh9(String chhh9) {
		this.chhh9 = chhh9;
	}


	public String getChname9() {
		return chname9;
	}


	public void setChname9(String chname9) {
		this.chname9 = chname9;
	}


	public Integer getCh10t() {
		return ch10t;
	}


	public void setCh10t(Integer ch10t) {
		this.ch10t = ch10t;
	}


	public String getCh10() {
		return ch10;
	}


	public void setCh10(String ch10) {
		this.ch10 = ch10;
	}


	public String getChh10() {
		return chh10;
	}


	public void setChh10(String chh10) {
		this.chh10 = chh10;
	}


	public String getChhh10() {
		return chhh10;
	}


	public void setChhh10(String chhh10) {
		this.chhh10 = chhh10;
	}


	public String getChname10() {
		return chname10;
	}


	public void setChname10(String chname10) {
		this.chname10 = chname10;
	}


	public Date getPdate() {
		return pdate;
	}


	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}
	
	
	

}
