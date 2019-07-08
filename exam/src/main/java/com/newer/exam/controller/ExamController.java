package com.newer.exam.controller;

import java.util.HashMap;
import java.util.HashSet;
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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newer.exam.pojo.Checkbox;
import com.newer.exam.pojo.Gap;
import com.newer.exam.pojo.Single;
import com.newer.exam.pojo.Users;
import com.newer.exam.serviceimpl.ExamImpl;

@RestController
@RequestMapping("/exam")
public class ExamController {

	@Resource(name ="examService")
	private ExamImpl ex =null;

//	;
	Map<Integer,Set<Integer>>map =new HashMap<>();
	@Autowired
	private RedisTemplate<String,Object> rt;
	
	private static final Logger log = LoggerFactory.getLogger(ExamController.class);
	//单选
	@GetMapping("/19datest/{type}")
	public ResponseEntity<List<Single>> queyr(@PathVariable("type") String type	,HttpSession se){
		Integer count =ex.querycount(type);
		Integer user = (Integer) se.getAttribute("uid");
		
	

		int page =(int)(0+Math.random()*(count-0+1));
		
		
		if(!map.containsKey(user)) {
			Set <Integer>set =new HashSet<>();
			map.put(user,set );
		}
		int i=0;
		while(map.get(user).contains(page)) {
			i++;
			page =(int)(0+Math.random()*(count-0+1));
			System.out.println();
			System.out.println("循环"+i+"次");
			if(i>100)break;
			System.out.println("当前页码page:"+page);
		}
		i=0;
		map.get(user).add(page);
		System.out.println(map.toString());
		List<Single> list =ex.query19da(page);
		while(list.isEmpty()) {
			list =ex.query19da(page);
		}
	ResponseEntity<List<Single>>  res=new ResponseEntity<List<Single>> (list, HttpStatus.OK);
		
		return res;
	}
	
	@PostMapping("/check/{answer}/{pages}/{type}")
	public String query(@PathVariable("answer") String answer,@PathVariable("pages") String pages,@PathVariable("type") String type,HttpSession se){
		String pid ="回答正确";
		Integer user = (Integer) se.getAttribute("uid");
		int size =map.get(user).size();//得到用户所答的第几道题
		Integer pids  =ex.selectpid(user, type);
		
		String sgt = "sg"+size+"t";
		String sg ="sg"+size;
		int page =Integer.parseInt(pages);
	
		if(ex.checkquery(answer, page)!=null) {
			
			ex.ypdatepaper(sgt, page, sg, "正确", pids);
			
			return pid;
		}
		
		ex.ypdatepaper(sgt, page, sg, "错误", pids);
		ex.ypdatepaper2(sgt, page, sg, answer, pids);	
			return "回答错误";
	}
	
	//多选
	@GetMapping("/19datest2/{type}")
	public ResponseEntity<List<Checkbox>> queyr2(@PathVariable("type") String type	,HttpSession se){
		Integer count =ex.querycountCh(type);
		int page =(int)(0+Math.random()*(count-0+1));
		Integer user = (Integer) se.getAttribute("uid");
	
	
		user =100000+user;
		if(!map.containsKey(user)) {
			Set <Integer>set =new HashSet<>();
			map.put(user,set );
		}
		int i=0;
		while(map.get(user).contains(page)) {
			i++;
			page =(int)(0+Math.random()*(count-0+1));
			System.out.println();
			System.out.println("循环"+i+"次");
			if(i>100)break;
		}

		i=0;
		map.get(user).add(page);
		System.out.println(map.toString());
		List<Checkbox> list =ex.query19daCh(page);
		while(list.isEmpty()) {
			list =ex.query19daCh(page);
		}
	ResponseEntity<List<Checkbox>>  res=new ResponseEntity<List<Checkbox>> (list, HttpStatus.OK);
		
		return res;
	}
	
	@PostMapping("/check2/{answer}/{pages}/{type}")
	public String query2(@PathVariable("answer") String answer,@PathVariable("pages") Integer page,@PathVariable("type") String type,HttpSession se){
		String pid ="回答正确";
		Integer user = (Integer) se.getAttribute("uid");
		user =100000+user;
		int size =map.get(user).size();
	
		String sgt = "ch"+size+"t";
		String sg ="ch"+size;
		answer =answer.replaceAll(",", "");

		Integer pids  =ex.selectpid(user, type);
			
		if(ex.checkqueryCh(answer, page)!=null) {
			
			ex.chdatepaper(sgt, page, sg, "正确", pids);
			return pid;
		}
		
		ex.chdatepaper(sgt, page, sg, "错误", pids);
		ex.chdatepaper2(sgt, page, sg, answer, pids);
			return "回答错误";
	}
	
	
	
	
	
	//填空
	@GetMapping("/19gaptest/{type}")
	public ResponseEntity<List<Gap>> queyrGap(@PathVariable("type") String type,	HttpSession se){
		Integer count =ex.querycountGp(type);
		Integer user = (Integer) se.getAttribute("uid");
	
		int page =(int)(0+Math.random()*(count-0+1));
	
		user =200000+user;
		if(!map.containsKey(user)) {
			Set <Integer>set =new HashSet<>();
			map.put(user,set );
		}
		int i=0;
		while(map.get(user).contains(page)) {
			i++;
			page =(int)(0+Math.random()*(count-0+1));
			System.out.println();
			System.out.println("循环"+i+"次");
			if(i>100)break;
		}
		i=0;
		map.get(user).add(page);
		
		List<Gap> list =ex.query19daGp(page);
		while(list.isEmpty()) {
			list =ex.query19daGp(page);
		}
	ResponseEntity<List<Gap>>  res=new ResponseEntity<List<Gap>> (list, HttpStatus.OK);
		
		return res;
	}
	
	@PostMapping("/checkgap/{answer}/{pages}/{type}")
	public String querygap(@PathVariable("answer") String answer,@PathVariable("pages") Integer page,@PathVariable("type") String type,HttpSession se){
		String pid ="回答正确";
		Integer user = (Integer) se.getAttribute("uid");
		user =200000+user;
		int size =map.get(user).size();
		Integer pids  =ex.selectpid(user, type);
	
		String sgt = "gp"+size+"t";
		String sg ="gp"+size;
	System.out.println(sgt);
	System.out.println(sg);
		if(ex.checkqueryGp(answer, page)!=null) {
			
			ex.gpdatepaper(sgt, page, sg, "正确", pids);
			return pid;
		}
		
		ex.gpdatepaper(sgt, page, sg, "错误", pids);
		ex.gpdatepaper2(sgt, page, sg, answer, pids);	
			return "回答错误";
	}
}
