package com.newer.exam.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newer.exam.pojo.Single;
import com.newer.exam.serviceimpl.ExamImpl;
import com.newer.exam.util.RandomTitle;

@RestController
@RequestMapping("/user")
public class UsertoExamController {
	
	@Resource(name ="examService")
	private ExamImpl ex =null;
	

	@GetMapping("usersign1")
	public void usersign1(HttpSession se) {
		ex.newpaper(1, "19da");//新建一个卷子
		Integer pid  =ex.selectpid(1, "19da");
		se.setAttribute("userid", 1);
		se.setAttribute("pid", pid);
		System.out.println("大成功");
	}
	@GetMapping("usersign2")
	public void usersign2(HttpSession se) {
		ex.newpaper(2, "19da");
		Integer pid  =ex.selectpid(2, "19da");
		se.setAttribute("userid", 2);
		se.setAttribute("pid", pid);
		System.out.println("2大成功");
	}
	@GetMapping("ttp")
	public ResponseEntity<List<Single>> ttp() {
		RandomTitle rd =new RandomTitle();
		Set<Integer> set =rd.checkSet(12);
		List<Single> list =new ArrayList<>();
		for (Integer integer : set) {
			list.add(ex.querySingle("19da", integer));
		}
		System.out.println(set.toString());
		ResponseEntity<List<Single>>  res=new ResponseEntity<List<Single>> (list, HttpStatus.OK);
		return res;
	}
	

}
