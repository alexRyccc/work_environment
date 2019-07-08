package com.newer.exam.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newer.exam.pojo.Single;
import com.newer.exam.pojo.Users;
import com.newer.exam.serviceimpl.ExamImpl;

@RestController
@RequestMapping("/paper")
public class NewpaperController {

	@Resource(name ="examService")
	private ExamImpl ex =null;
	
	
	private static final Logger log = LoggerFactory.getLogger(NewpaperController.class);

	@PostMapping("/newpaper/{type}")
	public String queyr(@PathVariable("type") String type	,HttpSession se){
		Integer user = (Integer) se.getAttribute("uid");
		ex.newpaper(user, type);
		
		
		return "开始考试";
		
		
		
	}
}
