package com.newer.exam.pojo;

import java.io.Serializable;

public class Chanswer implements Serializable {
	private Integer chwid;
	private String chwanswer;
	private Integer chid;
	public Integer getChwid() {
		return chwid;
	}
	public void setChwid(Integer chwid) {
		this.chwid = chwid;
	}
	public String getChwanswer() {
		return chwanswer;
	}
	public void setChwanswer(String chwanswer) {
		this.chwanswer = chwanswer;
	}
	public Integer getChid() {
		return chid;
	}
	public void setChid(Integer chid) {
		this.chid = chid;
	}
	@Override
	public String toString() {
		return "Chanswer [chwid=" + chwid + ", chwanswer=" + chwanswer + ", chid=" + chid + "]";
	}
	

}
