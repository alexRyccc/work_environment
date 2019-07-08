package com.newer.exam.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newer.exam.pojo.Information;
import com.newer.exam.pojo.Layui_Information;
import com.newer.exam.serviceimpl.InFServiceImpl;


@RestController
@RequestMapping("/infors")
public class InforController {
	@Resource(name ="infor")
	private InFServiceImpl inf =null;
	
	@Autowired
	private RedisTemplate<String,Object> rt;
	
	@GetMapping("table/{uid}")
	public ResponseEntity<Layui_Information> list(@PathVariable("uid")Integer uid){
		HashOperations<String, String, Object> map =rt.opsForHash();
		
		Layui_Information ass =  (Layui_Information) map.get("query", String.valueOf(uid));
		
			Layui_Information in =new Layui_Information();
			List<Information> lit =inf.list(uid);
			in.setData(lit);
			in.setCode("0");
			in.setMsg("");
			in.setCount(0);
			map.put("query", String.valueOf(uid), in);
			System.out.println("进入数据库");
			ResponseEntity<Layui_Information>   res= new ResponseEntity<Layui_Information> (in, HttpStatus.OK);
			
		
		
		
		
		return res;
		
	}
	
	
	
}
