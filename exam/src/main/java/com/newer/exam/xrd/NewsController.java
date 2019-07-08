package com.newer.exam.xrd;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsController {

	@Resource(name = "newsSer")
	private NewsService ns=null;
	
	@Autowired
	private RedisTemplate<String,Object> rt;
	
	@GetMapping("/news")
	public List<Object>  queryAll(){
		ListOperations<String, Object> lists =rt.opsForList();
		if(lists.size("news")<1) {
			List<News> list=ns.queryAll();
			for (News news : list) {
				lists.leftPushAll("news", news);
			}
			
			Long size =lists.size("news");
			List<Object> lista =lists.range("news", 0, size);
			return lista;
		}else {
			Long size =lists.size("news");
			List<Object> lista =lists.range("news", 0, size);
			System.out.println("不进入");
			return lista;
		}
		
		
		
	
	}
	
	@GetMapping("/news/jump")
	public News queryUrl(String nid) {
		int id=Integer.parseInt(nid);
		News a=ns.queryUrl(id);
		return a;
	}
	
	@GetMapping("/news/select")
	public List<News> select(String testtype,String location,String ntype){
		if("不限".equals(testtype)) {
			testtype=null;
		}
		if("不限".equals(location)) {
			location=null;
		}
		if("不限".equals(ntype)) {
			ntype=null;
		}
		List<News> list=ns.select(testtype, location, ntype);
		return list;
	}
}
