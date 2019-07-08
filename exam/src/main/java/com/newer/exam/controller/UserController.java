package com.newer.exam.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newer.exam.pojo.Information;
import com.newer.exam.pojo.Layui_Information;
import com.newer.exam.pojo.Users;
import com.newer.exam.service.IUserService;
import com.newer.exam.serviceimpl.InFServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	@Resource(name = "userService")
	private IUserService us = null;

	@Resource(name ="infor")
	private InFServiceImpl inf =null;
	
	@Autowired
	private RedisTemplate<String,Object> rt;
	
	private static final Logger log = LoggerFactory.getLogger(ExamController.class);

	/**
	 * 登录	
	 * @param username
	 * @param password
	 * @param session
	 * @return
	 */
	@PostMapping("/login")
	public ResponseEntity<?> login(String username, String password,String save,HttpServletRequest request,HttpServletResponse response) {
		Integer uid=us.login(username, password);
		
		ResponseEntity<String> res;
		
		if(uid!=null) {
			if("on".equals(save)) {
				Cookie[] cookies=request.getCookies();
				for(Cookie cookie: cookies){
					cookie.setMaxAge(0);
					cookie.setPath("/");
					response.addCookie(cookie);
				}
				
				Cookie cookie = new Cookie("username",username);
				Cookie cookie2 = new Cookie("password",password);
				cookie.setMaxAge(60 * 60 * 10);// 设置cookie有效期，不设置有效期的话默认有效期为本次会话
				cookie.setPath("/");// 设置cookie保存路径
				cookie2.setMaxAge(60 * 60 * 10);
				cookie2.setPath("/");
				response.addCookie(cookie);// 存入cookie
				response.addCookie(cookie2);
			}
		
			request.getSession().setAttribute("uid", uid);
				HashOperations<String, String, Object> map =rt.opsForHash();
		
				Layui_Information in =new Layui_Information();
				List<Information> lit =inf.list(uid);
				in.setData(lit);
				in.setCode("0");
				in.setMsg("");
				in.setCount(0);
				map.put("query", String.valueOf(uid), in);
			
			res= new ResponseEntity<>("ok", HttpStatus.OK);
		}else {
			res = new ResponseEntity<>("fail", HttpStatus.OK);
		}
		
		return res;
	}
	
	@PostMapping("/loginout")
	public ResponseEntity<?> loginout(HttpServletRequest request, HttpServletResponse response) {
		request.getSession().invalidate();
		for (Cookie cookie : request.getCookies()) {
			cookie.setMaxAge(0);
			cookie.setPath("/");
			response.addCookie(cookie);
		}
		request.getSession().setAttribute("uid", -1);
		ResponseEntity<String> res = new ResponseEntity<>("ok", HttpStatus.OK);

		return res;
	}
	
	@PostMapping("/add")
	public ResponseEntity<?> adduser(Users user) {
		System.out.println(user.toString());
		ResponseEntity<String> res;
		try {
			us.inseuser(user);
			res= new ResponseEntity<>("ok", HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			res = new ResponseEntity<>("fail", HttpStatus.OK);
		}
		return res;
	}
	
	@GetMapping("/del")
	public ResponseEntity<?> deluser(int uid) {
		ResponseEntity<String> res;
		try {
			us.deluser(uid);
			res= new ResponseEntity<>("ok", HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			res = new ResponseEntity<>("fail", HttpStatus.OK);
		}
		return res;
	}
	
	@PostMapping("/upd")
	public ResponseEntity<?> upduser(Users user) {
		ResponseEntity<String> res;
		try {
			us.upduser(user);
			res= new ResponseEntity<>("ok", HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			res = new ResponseEntity<>("fail", HttpStatus.OK);
		}
		return res;
	}
	
	@GetMapping("/sess")
	public ResponseEntity<?> sess(HttpSession session){
		Integer uid=(Integer) session.getAttribute("uid");

		Users user=us.query(uid);
		ResponseEntity<Users> res= new ResponseEntity<>(user, HttpStatus.OK);
		return res;
	}
	
	@GetMapping("/vernum")
	public ResponseEntity<?> vernum(String num){
		System.out.println(num);
		
		int count=us.vernum(num);
		ResponseEntity<String> res;
		if(count==0) {
			res= new ResponseEntity<>("ok", HttpStatus.OK);
		}else {
			res= new ResponseEntity<>("fail", HttpStatus.OK);
		}
		
		return res;
	}
}
