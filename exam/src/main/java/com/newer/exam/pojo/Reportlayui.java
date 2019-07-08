package com.newer.exam.pojo;

import java.io.Serializable;
import java.util.List;



public class Reportlayui implements Serializable {
	private List<Report> data;
	private Integer count;
	private String msg;
	private String code;
	@Override
	public String toString() {
		return "Reportlayui [data=" + data + ", count=" + count + ", msg=" + msg + ", code=" + code + "]";
	}
	public List<Report> getData() {
		return data;
	}
	public void setData(List<Report> data) {
		this.data = data;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	

}
