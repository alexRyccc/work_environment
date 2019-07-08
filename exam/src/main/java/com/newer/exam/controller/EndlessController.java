package com.newer.exam.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newer.exam.pojo.Checkbox;
import com.newer.exam.pojo.Single;
import com.newer.exam.pojo.Users;
import com.newer.exam.serviceimpl.ExamImpl;

@RestController
@RequestMapping("/endless")
public class EndlessController {
	
	@Resource(name ="examService")
	private ExamImpl ex =null;
	
	
	private static final Logger log = LoggerFactory.getLogger(EndlessController.class);

	
	@GetMapping("/infinites/{type}")
	public ResponseEntity<List<Single>> queyr(@PathVariable("type") String type,	HttpSession se){
		Integer count =ex.querycount(type);
		int page =(int)(0+Math.random()*(count-0+1));
		List<Single> list =new ArrayList<>();
		Single sg =ex.querySingle(type, page);
		list.add(sg);
		
				ResponseEntity<List<Single>>  res=new ResponseEntity<List<Single>>(list, HttpStatus.OK);
		
		return res;
	}
	
	@GetMapping("/infinitesch/{type}")
	public ResponseEntity<List<Checkbox>> queyrch(@PathVariable("type") String type,	HttpSession se){
		Integer count =ex.querycountCh(type);
		int page =(int)(0+Math.random()*(count-0+1));
		List<Checkbox> list =new ArrayList<>();
		Checkbox sg =ex.queryChe(type, page);
		list.add(sg);
		
				ResponseEntity<List<Checkbox>>  res=new ResponseEntity<List<Checkbox>>(list, HttpStatus.OK);
		
		return res;
	}
	
	@PostMapping("/check/{answer}/{pages}")
	public String query(@PathVariable("answer") String answer,@PathVariable("pages") Integer page,HttpSession se){
		String pid ="回答正确";

		if(ex.checkquery(answer, page)!=null) {		
			return pid;
		}		
			return "回答错误";
	}
	
	@PostMapping("/checkch/{check_val}/{pages}")
	public String querych(@PathVariable("check_val") String check_val,@PathVariable("pages") Integer page,HttpSession se){
		String pid ="回答正确";
		
		if(ex.checkqueryCh(check_val.replaceAll(",", ""), page)!=null) {	
			log.info("回答正确");
			return pid;
		}		
			return "回答错误";
	}
	
	@PostMapping("/submit/{index}/{point}/{sec}/{types}")
	public String endlesscheck(@PathVariable("index") Integer index,@PathVariable("point") Integer point,
			@PathVariable("sec") Integer sec,@PathVariable("types") String types,HttpSession se){
		Float percen =(float) (point*100/index-1);
		log.info("percen正确率:"+percen);
		log.info("sec:"+sec+"秒");
		Integer user = (Integer) se.getAttribute("uid");
		Integer pid  =ex.selectpid(user, types);
		ex.insertReport(user, pid, point, sec,"无尽单选");
		
			return "成功";
	}
	
	@PostMapping("/submitch/{index}/{point}/{sec}/{types}")
	public String endlesscheckch(@PathVariable("index") Integer index,@PathVariable("point") Integer point,
			@PathVariable("sec") Integer sec,@PathVariable("types") String types,HttpSession se){
		Float percen =(float) (point*100/index-1);
		log.info("percen正确率:"+percen);
		log.info("sec:"+sec+"秒");
		Integer user = (Integer) se.getAttribute("uid");
		Integer pid  =ex.selectpid(user, types);
		ex.insertReport(user, pid, point, sec,"地狱多选");
		
			return "成功";
	}
	
	
}
