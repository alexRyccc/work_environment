package com.newer.exam.xrd;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import io.lettuce.core.dynamic.annotation.Param;

public interface NewsMapper {

	@Select("select nid,nname,testtype,location,ndate,url,ntype from news order by ndate desc")
	public List<News> queryAll();
	
	@Select("select nid,nname,testtype,location,ndate,url,ntype from news where nid=#{nid}")
	public News queryUrl(int nid);
	
	public List<News> select(@Param("testtype")String testtype,@Param("location")String location,@Param("ntype")String ntype);
}
