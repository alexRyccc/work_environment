package com.newer.exam.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.poi.ss.formula.functions.T;
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
import com.newer.exam.pojo.Gapaper;
import com.newer.exam.pojo.Single;
import com.newer.exam.pojo.Users;
import com.newer.exam.serviceimpl.ExamImpl;
import com.newer.exam.util.RandomTitle;
@RestController
@RequestMapping("/examy")
public class ExamControllerYDH1 {

	@Resource(name ="examService")
	private ExamImpl ex =null;
	
	@Autowired
	private RedisTemplate<String,Object> rt;
	
	private static final Logger log = LoggerFactory.getLogger(ExamController.class);
	static {
		
	}
	@GetMapping("/querysin/{sgtype}/{pages}")
	public ResponseEntity<List<Single>> querySin(@PathVariable("sgtype")String sgtype, @PathVariable("pages")Integer pages,HttpSession se) {
		RandomTitle rd =new RandomTitle();
		Integer user = (Integer) se.getAttribute("uid");

		ex.newpaper(user, sgtype);
		Integer pid  =ex.selectpid(user, sgtype);
		int count =	ex.querycount(sgtype);
	
		Set<Integer> set =rd.singleSet(count);
		
		int i=0;
		for (Integer integer : set) {
			i++;
			String sg1t = "sg"+i+"t";
			String sg ="sg"+i;
			ex.ypdatepaper(sg1t, integer, sg, "", pid);
			ex.ypdatepaper2(sg1t, integer, sg, "", pid);//将题目键入试卷
			//将填入答案数据加在这一行
			
		}
		
		List<Single> list=new ArrayList<>();
		for (Integer integer : set) { 
			Single single=ex.querySin(sgtype,integer);
			list.add(single);
			//System.out.println(list);
		
			/*
			 * Map<String,Set<Integer>> map =new HashMap<String,Set<Integer>>();
			 * map.put("single", set); Users users =(Users) se.getAttribute("user"); String
			 * user =users.getUid()+"";
			 */
			
		
			
		}
		
		ResponseEntity<List<Single>>  res=new ResponseEntity<List<Single>>(list,HttpStatus.OK);
		return res;
	}
	
	

	@GetMapping("/queryche/{chtype}/{pages}")
	public ResponseEntity<List<Checkbox>> queryChe(@PathVariable("chtype")String chtype, @PathVariable("pages")Integer pages,HttpSession se) {
		RandomTitle rd =new RandomTitle();
		int count =	ex.querycountCh(chtype);
		Set<Integer> set =rd.checkSet(count);
		Integer user = (Integer) se.getAttribute("uid");
		
		Integer pid  =ex.selectpid(user, chtype);
		int i=0;
		for (Integer integer : set) {
			i++;
			String sg1t = "ch"+i+"t";
			String sg ="ch"+i;
			ex.chdatepaper(sg1t, integer, sg, "", pid);
			ex.chdatepaper2(sg1t, integer, sg, "", pid);
			
		}
		
		List<Checkbox> list =new ArrayList<>();
		for (Integer integer : set) {
			Checkbox ch =ex.queryChe(chtype,integer);
			list.add(ch);
		}
	//	System.out.println(set.toString());
		ResponseEntity<List<Checkbox>> res=new ResponseEntity<List<Checkbox>>(list,HttpStatus.OK);
		return res;
	}
	
	@GetMapping("/querygap/{gptype}/{pages}")
	public ResponseEntity<List<Gap>> queryGap(@PathVariable("gptype")String gptype, @PathVariable("pages")Integer pages,HttpSession se) {
		RandomTitle rd =new RandomTitle();
		int count =	ex.querycountGp(gptype);
		Set<Integer> set =rd.gapSet(count);
	Integer user = (Integer) se.getAttribute("uid");

		Integer pid  =ex.selectpid(user, gptype);
		int i=0;
		for (Integer integer : set) {
			i++;
			String sg1t = "gp"+i+"t";
			String sg ="gp"+i;
			ex.gpdatepaper(sg1t, integer, sg, "", pid);
			ex.gpdatepaper2(sg1t, integer, sg, "", pid);
			
		}
		List<Gap> list =new ArrayList<>();
		for (Integer integer : set) {
			Gap gap =ex.queryGap(gptype,integer);
			list.add(gap);
		}
	//	System.out.println(set.toString());
		ResponseEntity<List<Gap>> res=new ResponseEntity<List<Gap>>(list,HttpStatus.OK);
		return res;
	}
	
	@GetMapping("/test")
	public void bsss() {
		Gapaper par =ex.titileGap(29);
		int[] tpar =par.Title();
		for (int i : tpar) {
			System.out.println( i);
		}
		
	}
}
