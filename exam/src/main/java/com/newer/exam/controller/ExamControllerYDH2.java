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
import com.newer.exam.pojo.Chpaper;
import com.newer.exam.pojo.Chpaper2;
import com.newer.exam.pojo.Gap;
import com.newer.exam.pojo.Gapaper;
import com.newer.exam.pojo.Gapaper2;
import com.newer.exam.pojo.Sgpaper;
import com.newer.exam.pojo.Sgpaper2;
import com.newer.exam.pojo.Single;
import com.newer.exam.pojo.Users;
import com.newer.exam.serviceimpl.ExamImpl;

@RestController
@RequestMapping("/exam22")
public class ExamControllerYDH2 {
	@Resource(name ="examService")
	private ExamImpl ex =null;


	Map<Integer,Set<Integer>> map =new HashMap<>();
	@Autowired
	private RedisTemplate<String,Object> rt;
	
	private static final Logger log = LoggerFactory.getLogger(ExamController.class);
	
	
	
	//查询试卷单选题结果
	@GetMapping("/19da1/{pid}")
	public Sgpaper2 querypsg(@PathVariable("pid")Integer pid){
		
		return ex.querypsg(pid);
		
	}
	
	//查询试卷多选题结果
	@GetMapping("/19da2/{pid}")
	public Chpaper2 querypch(@PathVariable("pid")Integer pid) {
	
		return ex.querypch(pid);
		
	}
	
	//查询试卷填空题结果
	@GetMapping("/19da3/{pid}")
	public Gapaper2 querypgp(@PathVariable("pid")Integer pid) {
		
		return ex.querypgp(pid);
		
	}
	

}
