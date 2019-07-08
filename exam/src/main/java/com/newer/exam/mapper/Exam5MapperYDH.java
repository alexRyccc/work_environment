package com.newer.exam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.newer.exam.pojo.Report;

public interface Exam5MapperYDH {

	@Select("SELECT a.pid,a.rpid,b.uname as name,(CASE c.ptype WHEN '19da' THEN '十九大' ELSE 'null' END) ptype,\r\n" + 
			" a.rpdate,a.grade,a.`renames`,SEC_TO_TIME (a.`rpmin`) as rpmin FROM report a LEFT JOIN users b ON a.`userid`=b.`uid`\r\n" + 
			" LEFT JOIN psganswer c ON c.pid=a.pid WHERE a.`userid`=#{userid} ")
	public List<Report> queryReport(@Param("userid") Integer userid);
	
	@Select("SELECT b.uname as name,(CASE c.ptype WHEN '19da' THEN '十九大' ELSE 'null' END) ptype,\r\n" + 
			" a.rpdate,a.grade as grade,a.`renames`,SEC_TO_TIME (a.`rpmin`) as rpmin FROM report a LEFT JOIN users b ON a.`userid`=b.`uid`\r\n" + 
			" LEFT JOIN psganswer c ON c.pid=a.pid WHERE a.pid=#{pid} ")
	public Report queryReport2(@Param("pid") Integer pid);
	
	

}
