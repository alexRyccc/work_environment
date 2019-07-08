package com.newer.exam.controller;

import java.util.Arrays;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.newer.exam.pojo.Users;
import com.newer.exam.serviceimpl.ExamImpl;

@RestController
@RequestMapping("/examp")
public class ExamPaperController {
	
	@Resource(name ="examService")
	private ExamImpl ex =null;
	
	@PostMapping("/check")
	public String check(@RequestParam(value ="dx", required = false) String dx,@RequestParam(value ="dux", required = false) 
	String dux,@RequestParam(value ="tk", required = false) String tk,HttpSession se,@RequestParam("time") Integer time ) {
		//System.out.println("dx:"+dx);
		
		//分数
		int grade=0;
		
		//得到试卷编号
		Integer user = (Integer) se.getAttribute("uid");
		int pid =getPid(user, "19da");
		String[] single = dx.split("_");

		//得到张卷子的单选 多选填空题目编号
		int[] sings =ex.titleSingle(pid).Title();
//		0--单选
//		1--A
//		2--D
//	
		System.out.println(Arrays.toString(sings));
	
		
		for (int i=1;i<single.length;i++) {
			System.out.println(i);
			ex.ypdatepaper2("sg"+i+"t", sings[i-1], "sg"+i, single[i], pid);//将题目键入试卷
			if(ex.judgesingle(sings[i-1]).equals(single[i])) {
				ex.upSinglePaper("sg"+i,"正确", pid);
				grade+=2;
			}else {
				ex.upSinglePaper("sg"+i, "错误", pid);
			}
	
			
		}
		//多选
		System.out.println("-----------------------------");
//		0--ABC
//		1--BCD
//		2--BCD
//		3--ABC
		String[] checkbox = dux.split("_");
		int[] cheak =ex.titleCh(pid).Title();
		for (int i=0;i<checkbox.length;i++) {//
			int j=i+1;
			
			ex.chdatepaper2("ch"+j+"t", cheak[i], "ch"+j, checkbox[i], pid);
			if(ex.judgecheck(cheak[i]).equals(checkbox[i])) {
				ex.upCheackPaper("ch"+j, "正确", pid);
				grade+=3;
			}else {
				ex.upCheackPaper("ch"+j, "错误", pid);
			}
		}
		System.out.println("-----------------------------");
		//填空
		
//		0--填空
//		1--全面从严治党
//		2--政治建设
//		3--路线建设
		
		String[] gap = tk.split("_");
		int[] gaps =ex.titileGap(pid).Title();//得到题号
		for (int i=1;i<gap.length;i++) {
			
			
			ex.gpdatepaper2("gp"+i+"t", gaps[i-1], "gp"+i, gap[i].replace(" ", ""), pid);//将题目键入试卷
			if(ex.judgegap(gaps[i-1]).equals(gap[i].replace(" ", ""))) {
				ex.upGapPaper("gp"+i, "正确", pid);
				grade+=4;
			}else {
				ex.upGapPaper("gp"+i, "错误", pid);
			}
		}
		System.out.println("-----------------------------");
		System.out.println("得分"+grade);
		 ex.insertReport(user, pid, grade, time,"标准考试");
		return "OK";
	}
	
	public  Integer getPid(Integer user,String ptype) {
	
		Integer pid =ex.selectpid(user, ptype);
		return pid;
	}
	
}
