package com.newer.exam.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Sgpaper2 implements Serializable {
	private Integer pid;
	private Integer userid;
	private String ptype;
	
	private Integer grade;//分数
	
	private Integer sg1t;//
	private String sg1;//用户答案
	private String sgg1;//正确答案
	private String sggg1;//正确或错误
	private String sgname1;//单选题题目
	
	private Integer sg2t;
	private String sg2;
	private String sgg2;//正确答案
	private String sggg2;//正确或错误
	private String sgname2;//单选题题目
	
	private Integer sg3t;
	private String sg3;
	private String sgg3;//正确答案
	private String sggg3;//正确或错误
	private String sgname3;//单选题题目
	
	private Integer sg4t;
	private String sg4;
	private String sgg4;//正确答案
	private String sggg4;//正确或错误
	private String sgname4;//单选题题目
	
	private Integer sg5t;
	private String sg5;
	private String sgg5;//正确答案
	private String sggg5;//正确或错误
	private String sgname5;//单选题题目
	
	private Integer sg6t;
	private String sg6;
	private String sgg6;//正确答案
	private String sggg6;//正确或错误
	private String sgname6;//单选题题目
	
	private Integer sg7t;
	private String sg7;
	private String sgg7;//正确答案
	private String sggg7;//正确或错误
	private String sgname7;//单选题题目
	
	private Integer sg8t;
	private String sg8;
	private String sgg8;//正确答案
	private String sggg8;//正确或错误
	private String sgname8;//单选题题目
	
	private Integer sg9t;
	private String sg9;
	private String sgg9;//正确答案
	private String sggg9;//正确或错误
	private String sgname9;//单选题题目
	
	private Integer sg10t;
	private String sg10;
	private String sgg10;//正确答案
	private String sggg10;//正确或错误
	private String sgname10;//单选题题目
	
	private Integer sg11t;
	private String sg11;
	private String sgg11;//正确答案
	private String sggg11;//正确或错误
	private String sgname11;//单选题题目
	
	private Integer sg12t;
	private String sg12;
	private String sgg12;//正确答案
	private String sggg12;//正确或错误
	private String sgname12;//单选题题目
	
	private Integer sg13t;
	private String sg13;
	private String sgg13;//正确答案
	private String sggg13;//正确或错误
	private String sgname13;//单选题题目
	
	private Integer sg14t;
	private String sg14;
	private String sgg14;//正确答案
	private String sggg14;//正确或错误
	private String sgname14;//单选题题目
	
	private Integer sg15t;
	private String sg15;
	private String sgg15;//正确答案
	private String sggg15;//正确或错误
	private String sgname15;//单选题题目
	
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date pdate;//日期


	@Override
	public String toString() {
		return "Sgpaper2 [pid=" + pid + ", userid=" + userid + ", ptype=" + ptype + ", grade=" + grade + ", sg1t="
				+ sg1t + ", sg1=" + sg1 + ", sgg1=" + sgg1 + ", sggg1=" + sggg1 + ", sgname1=" + sgname1 + ", sg2t="
				+ sg2t + ", sg2=" + sg2 + ", sgg2=" + sgg2 + ", sggg2=" + sggg2 + ", sgname2=" + sgname2 + ", sg3t="
				+ sg3t + ", sg3=" + sg3 + ", sgg3=" + sgg3 + ", sggg3=" + sggg3 + ", sgname3=" + sgname3 + ", sg4t="
				+ sg4t + ", sg4=" + sg4 + ", sgg4=" + sgg4 + ", sggg4=" + sggg4 + ", sgname4=" + sgname4 + ", sg5t="
				+ sg5t + ", sg5=" + sg5 + ", sgg5=" + sgg5 + ", sggg5=" + sggg5 + ", sgname5=" + sgname5 + ", sg6t="
				+ sg6t + ", sg6=" + sg6 + ", sgg6=" + sgg6 + ", sggg6=" + sggg6 + ", sgname6=" + sgname6 + ", sg7t="
				+ sg7t + ", sg7=" + sg7 + ", sgg7=" + sgg7 + ", sggg7=" + sggg7 + ", sgname7=" + sgname7 + ", sg8t="
				+ sg8t + ", sg8=" + sg8 + ", sgg8=" + sgg8 + ", sggg8=" + sggg8 + ", sgname8=" + sgname8 + ", sg9t="
				+ sg9t + ", sg9=" + sg9 + ", sgg9=" + sgg9 + ", sggg9=" + sggg9 + ", sgname9=" + sgname9 + ", sg10t="
				+ sg10t + ", sg10=" + sg10 + ", sgg10=" + sgg10 + ", sggg10=" + sggg10 + ", sgname10=" + sgname10
				+ ", sg11t=" + sg11t + ", sg11=" + sg11 + ", sgg11=" + sgg11 + ", sggg11=" + sggg11 + ", sgname11="
				+ sgname11 + ", sg12t=" + sg12t + ", sg12=" + sg12 + ", sgg12=" + sgg12 + ", sggg12=" + sggg12
				+ ", sgname12=" + sgname12 + ", sg13t=" + sg13t + ", sg13=" + sg13 + ", sgg13=" + sgg13 + ", sggg13="
				+ sggg13 + ", sgname13=" + sgname13 + ", sg14t=" + sg14t + ", sg14=" + sg14 + ", sgg14=" + sgg14
				+ ", sggg14=" + sggg14 + ", sgname14=" + sgname14 + ", sg15t=" + sg15t + ", sg15=" + sg15 + ", sgg15="
				+ sgg15 + ", sggg15=" + sggg15 + ", sgname15=" + sgname15 + ", pdate=" + pdate + "]";
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


	public Integer getSg1t() {
		return sg1t;
	}


	public void setSg1t(Integer sg1t) {
		this.sg1t = sg1t;
	}


	public String getSg1() {
		return sg1;
	}


	public void setSg1(String sg1) {
		this.sg1 = sg1;
	}


	public String getSgg1() {
		return sgg1;
	}


	public void setSgg1(String sgg1) {
		this.sgg1 = sgg1;
	}


	public String getSggg1() {
		return sggg1;
	}


	public void setSggg1(String sggg1) {
		this.sggg1 = sggg1;
	}


	public String getSgname1() {
		return sgname1;
	}


	public void setSgname1(String sgname1) {
		this.sgname1 = sgname1;
	}


	public Integer getSg2t() {
		return sg2t;
	}


	public void setSg2t(Integer sg2t) {
		this.sg2t = sg2t;
	}


	public String getSg2() {
		return sg2;
	}


	public void setSg2(String sg2) {
		this.sg2 = sg2;
	}


	public String getSgg2() {
		return sgg2;
	}


	public void setSgg2(String sgg2) {
		this.sgg2 = sgg2;
	}


	public String getSggg2() {
		return sggg2;
	}


	public void setSggg2(String sggg2) {
		this.sggg2 = sggg2;
	}


	public String getSgname2() {
		return sgname2;
	}


	public void setSgname2(String sgname2) {
		this.sgname2 = sgname2;
	}


	public Integer getSg3t() {
		return sg3t;
	}


	public void setSg3t(Integer sg3t) {
		this.sg3t = sg3t;
	}


	public String getSg3() {
		return sg3;
	}


	public void setSg3(String sg3) {
		this.sg3 = sg3;
	}


	public String getSgg3() {
		return sgg3;
	}


	public void setSgg3(String sgg3) {
		this.sgg3 = sgg3;
	}


	public String getSggg3() {
		return sggg3;
	}


	public void setSggg3(String sggg3) {
		this.sggg3 = sggg3;
	}


	public String getSgname3() {
		return sgname3;
	}


	public void setSgname3(String sgname3) {
		this.sgname3 = sgname3;
	}


	public Integer getSg4t() {
		return sg4t;
	}


	public void setSg4t(Integer sg4t) {
		this.sg4t = sg4t;
	}


	public String getSg4() {
		return sg4;
	}


	public void setSg4(String sg4) {
		this.sg4 = sg4;
	}


	public String getSgg4() {
		return sgg4;
	}


	public void setSgg4(String sgg4) {
		this.sgg4 = sgg4;
	}


	public String getSggg4() {
		return sggg4;
	}


	public void setSggg4(String sggg4) {
		this.sggg4 = sggg4;
	}


	public String getSgname4() {
		return sgname4;
	}


	public void setSgname4(String sgname4) {
		this.sgname4 = sgname4;
	}


	public Integer getSg5t() {
		return sg5t;
	}


	public void setSg5t(Integer sg5t) {
		this.sg5t = sg5t;
	}


	public String getSg5() {
		return sg5;
	}


	public void setSg5(String sg5) {
		this.sg5 = sg5;
	}


	public String getSgg5() {
		return sgg5;
	}


	public void setSgg5(String sgg5) {
		this.sgg5 = sgg5;
	}


	public String getSggg5() {
		return sggg5;
	}


	public void setSggg5(String sggg5) {
		this.sggg5 = sggg5;
	}


	public String getSgname5() {
		return sgname5;
	}


	public void setSgname5(String sgname5) {
		this.sgname5 = sgname5;
	}


	public Integer getSg6t() {
		return sg6t;
	}


	public void setSg6t(Integer sg6t) {
		this.sg6t = sg6t;
	}


	public String getSg6() {
		return sg6;
	}


	public void setSg6(String sg6) {
		this.sg6 = sg6;
	}


	public String getSgg6() {
		return sgg6;
	}


	public void setSgg6(String sgg6) {
		this.sgg6 = sgg6;
	}


	public String getSggg6() {
		return sggg6;
	}


	public void setSggg6(String sggg6) {
		this.sggg6 = sggg6;
	}


	public String getSgname6() {
		return sgname6;
	}


	public void setSgname6(String sgname6) {
		this.sgname6 = sgname6;
	}


	public Integer getSg7t() {
		return sg7t;
	}


	public void setSg7t(Integer sg7t) {
		this.sg7t = sg7t;
	}


	public String getSg7() {
		return sg7;
	}


	public void setSg7(String sg7) {
		this.sg7 = sg7;
	}


	public String getSgg7() {
		return sgg7;
	}


	public void setSgg7(String sgg7) {
		this.sgg7 = sgg7;
	}


	public String getSggg7() {
		return sggg7;
	}


	public void setSggg7(String sggg7) {
		this.sggg7 = sggg7;
	}


	public String getSgname7() {
		return sgname7;
	}


	public void setSgname7(String sgname7) {
		this.sgname7 = sgname7;
	}


	public Integer getSg8t() {
		return sg8t;
	}


	public void setSg8t(Integer sg8t) {
		this.sg8t = sg8t;
	}


	public String getSg8() {
		return sg8;
	}


	public void setSg8(String sg8) {
		this.sg8 = sg8;
	}


	public String getSgg8() {
		return sgg8;
	}


	public void setSgg8(String sgg8) {
		this.sgg8 = sgg8;
	}


	public String getSggg8() {
		return sggg8;
	}


	public void setSggg8(String sggg8) {
		this.sggg8 = sggg8;
	}


	public String getSgname8() {
		return sgname8;
	}


	public void setSgname8(String sgname8) {
		this.sgname8 = sgname8;
	}


	public Integer getSg9t() {
		return sg9t;
	}


	public void setSg9t(Integer sg9t) {
		this.sg9t = sg9t;
	}


	public String getSg9() {
		return sg9;
	}


	public void setSg9(String sg9) {
		this.sg9 = sg9;
	}


	public String getSgg9() {
		return sgg9;
	}


	public void setSgg9(String sgg9) {
		this.sgg9 = sgg9;
	}


	public String getSggg9() {
		return sggg9;
	}


	public void setSggg9(String sggg9) {
		this.sggg9 = sggg9;
	}


	public String getSgname9() {
		return sgname9;
	}


	public void setSgname9(String sgname9) {
		this.sgname9 = sgname9;
	}


	public Integer getSg10t() {
		return sg10t;
	}


	public void setSg10t(Integer sg10t) {
		this.sg10t = sg10t;
	}


	public String getSg10() {
		return sg10;
	}


	public void setSg10(String sg10) {
		this.sg10 = sg10;
	}


	public String getSgg10() {
		return sgg10;
	}


	public void setSgg10(String sgg10) {
		this.sgg10 = sgg10;
	}


	public String getSggg10() {
		return sggg10;
	}


	public void setSggg10(String sggg10) {
		this.sggg10 = sggg10;
	}


	public String getSgname10() {
		return sgname10;
	}


	public void setSgname10(String sgname10) {
		this.sgname10 = sgname10;
	}


	public Integer getSg11t() {
		return sg11t;
	}


	public void setSg11t(Integer sg11t) {
		this.sg11t = sg11t;
	}


	public String getSg11() {
		return sg11;
	}


	public void setSg11(String sg11) {
		this.sg11 = sg11;
	}


	public String getSgg11() {
		return sgg11;
	}


	public void setSgg11(String sgg11) {
		this.sgg11 = sgg11;
	}


	public String getSggg11() {
		return sggg11;
	}


	public void setSggg11(String sggg11) {
		this.sggg11 = sggg11;
	}


	public String getSgname11() {
		return sgname11;
	}


	public void setSgname11(String sgname11) {
		this.sgname11 = sgname11;
	}


	public Integer getSg12t() {
		return sg12t;
	}


	public void setSg12t(Integer sg12t) {
		this.sg12t = sg12t;
	}


	public String getSg12() {
		return sg12;
	}


	public void setSg12(String sg12) {
		this.sg12 = sg12;
	}


	public String getSgg12() {
		return sgg12;
	}


	public void setSgg12(String sgg12) {
		this.sgg12 = sgg12;
	}


	public String getSggg12() {
		return sggg12;
	}


	public void setSggg12(String sggg12) {
		this.sggg12 = sggg12;
	}


	public String getSgname12() {
		return sgname12;
	}


	public void setSgname12(String sgname12) {
		this.sgname12 = sgname12;
	}


	public Integer getSg13t() {
		return sg13t;
	}


	public void setSg13t(Integer sg13t) {
		this.sg13t = sg13t;
	}


	public String getSg13() {
		return sg13;
	}


	public void setSg13(String sg13) {
		this.sg13 = sg13;
	}


	public String getSgg13() {
		return sgg13;
	}


	public void setSgg13(String sgg13) {
		this.sgg13 = sgg13;
	}


	public String getSggg13() {
		return sggg13;
	}


	public void setSggg13(String sggg13) {
		this.sggg13 = sggg13;
	}


	public String getSgname13() {
		return sgname13;
	}


	public void setSgname13(String sgname13) {
		this.sgname13 = sgname13;
	}


	public Integer getSg14t() {
		return sg14t;
	}


	public void setSg14t(Integer sg14t) {
		this.sg14t = sg14t;
	}


	public String getSg14() {
		return sg14;
	}


	public void setSg14(String sg14) {
		this.sg14 = sg14;
	}


	public String getSgg14() {
		return sgg14;
	}


	public void setSgg14(String sgg14) {
		this.sgg14 = sgg14;
	}


	public String getSggg14() {
		return sggg14;
	}


	public void setSggg14(String sggg14) {
		this.sggg14 = sggg14;
	}


	public String getSgname14() {
		return sgname14;
	}


	public void setSgname14(String sgname14) {
		this.sgname14 = sgname14;
	}


	public Integer getSg15t() {
		return sg15t;
	}


	public void setSg15t(Integer sg15t) {
		this.sg15t = sg15t;
	}


	public String getSg15() {
		return sg15;
	}


	public void setSg15(String sg15) {
		this.sg15 = sg15;
	}


	public String getSgg15() {
		return sgg15;
	}


	public void setSgg15(String sgg15) {
		this.sgg15 = sgg15;
	}


	public String getSggg15() {
		return sggg15;
	}


	public void setSggg15(String sggg15) {
		this.sggg15 = sggg15;
	}


	public String getSgname15() {
		return sgname15;
	}


	public void setSgname15(String sgname15) {
		this.sgname15 = sgname15;
	}


	public Date getPdate() {
		return pdate;
	}


	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

	
}
