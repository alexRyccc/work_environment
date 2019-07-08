package com.newer.exam.pojo;

import java.io.Serializable;

public class Gapaper implements Serializable {
	private Integer pid;
	private Integer userid;
	private String ptype;
	
	private Integer gp1t;
	private String gp1;
	private Integer gp2t;
	private String gp2;
	private Integer gp3t;
	private String gp3;
	private Integer gp4t;
	private String gp4;
	private Integer gp5t;
	private String gp5;
	
	public int[] Title() {
		return new int[] {gp1t,gp2t,gp3t,gp4t,gp5t};
	}
	
	public String toString() {
		return "Gapaper [pid=" + pid + ", userid=" + userid + ", ptype=" + ptype + ", gp1t=" + gp1t + ", gp1=" + gp1
				+ ", gp2t=" + gp2t + ", gp2=" + gp2 + ", gp3t=" + gp3t + ", gp3=" + gp3 + ", gp4t=" + gp4t + ", gp4="
				+ gp4 + ", gp5t=" + gp5t + ", gp5=" + gp5 + "]";
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
	
	

}
