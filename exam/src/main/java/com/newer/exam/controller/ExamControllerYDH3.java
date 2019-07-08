package com.newer.exam.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newer.exam.pojo.Report;
import com.newer.exam.pojo.Reportlayui;
//import com.newer.exam.serviceimpl.ExamImpl;
import com.newer.exam.serviceimpl.ExamYDHImpl;


@RestController
@RequestMapping("/exam33")
public class ExamControllerYDH3 {
	
	@Resource(name ="examServiceYDH")
	private ExamYDHImpl ex =null;


	Map<Integer,Set<Integer>> map =new HashMap<>();
	@Autowired
	private RedisTemplate<String,Object> rt;
	
	private static final Logger log = LoggerFactory.getLogger(ExamController.class);
	
	@GetMapping("/reports")
	public ResponseEntity<Reportlayui> query(HttpSession se){
		Integer user = (Integer) se.getAttribute("uid");
		Reportlayui rl=new Reportlayui();
		List<Report> list=ex.queryReport(user);
		rl.setData(list);
		rl.setCode("0");
		rl.setCount(0);
		rl.setMsg("");
		ResponseEntity<Reportlayui> res=new ResponseEntity<Reportlayui>(rl,HttpStatus.OK);
		return res;
		
	}
	
	@GetMapping("/reports/{pid}")
	public Report query2(@PathVariable("pid")Integer pid){

		return ex.queryReport2(pid);
		
	}
	
	
	

}
