package com.newer.exam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.newer.exam.pojo.Single;
import com.newer.exam.pojo.Table;

public interface ExcelMapper {

	
	@Insert("INSERT INTO single (\r\n" + 
			"  `sgid`,\r\n" + 
			"  `sgname`,\r\n" + 
			"  `sgA`,\r\n" + 
			"  `sgB`,\r\n" + 
			"  `sgC`,\r\n" + 
			"  `sgD`,\r\n" + 
			"  `sgdate`,\r\n" + 
			"  `sgtype`\r\n" + 
			") \r\n" + 
			"VALUES\r\n" + 
			"  (\r\n" + 
			"   #{sgid} ,\r\n" + 
			"    #{sgname},\r\n" + 
			"    #{sgA},\r\n" + 
			"    #{sgB},\r\n" + 
			"    #{sgC},\r\n" + 
			"    #{sgD},\r\n" + 
			"    sysdate(),\r\n" + 
			"    #{sgtype}\r\n" + 
			"  )  ")
	public void  addsingle(@Param("sgid")Integer sgid,@Param("sgname")String sgname,@Param("sgA")String sgA,
			@Param("sgB")String sgB,@Param("sgC")String sgC,@Param("sgD")String sgD,
			@Param("sgtype")String sgtype);
	
	@Insert("INSERT INTO sganswer (`sgwid`, `sgwanswer`, `sgid`) \r\n" + 
			"VALUES (#{sgwid}, #{sgwanswer}, #{sgid})   ")
	public void addsganswer(@Param("sgwid")Integer sgwid,@Param("sgwanswer")String sgwanswer,@Param("sgid")Integer sgid);
	
	@Insert("INSERT INTO checkbox (\r\n" + 
			"  `chid`,\r\n" + 
			"  `chname`,\r\n" + 
			"  `chA`,\r\n" + 
			"  `chB`,\r\n" + 
			"  `chC`,\r\n" + 
			"  `chD`,\r\n" + 
			"  `chdate`,\r\n" + 
			"  `chtype`\r\n" + 
			") \r\n" + 
			"VALUES\r\n" + 
			"  (\r\n" + 
			"   #{sgid} ,\r\n" + 
			"    #{sgname},\r\n" + 
			"    #{sgA},\r\n" + 
			"    #{sgB},\r\n" + 
			"    #{sgC},\r\n" + 
			"    #{sgD},\r\n" + 
			"    sysdate(),\r\n" + 
			"    #{sgtype}\r\n" + 
			"  )  ")
	public void  addcheck(@Param("sgid")Integer sgid,@Param("sgname")String sgname,@Param("sgA")String sgA,
			@Param("sgB")String sgB,@Param("sgC")String sgC,@Param("sgD")String sgD,
			@Param("sgtype")String sgtype);
	
	@Insert("INSERT INTO chanswer (`chwid`, `chwanswer`, `chid`) \r\n" + 
			"VALUES (#{sgwid}, #{sgwanswer}, #{sgid})   ")
	public void addchanswer(@Param("sgwid")Integer sgwid,@Param("sgwanswer")String sgwanswer,@Param("sgid")Integer sgid);
	
	
	
	
	@Insert("INSERT INTO gap (\r\n" + 
			"  `gpid`,\r\n" + 
			"  `gpname`,\r\n" + 
			"  `gpA`,\r\n" + 
			"  `gpdate`,\r\n" + 
			"  `gptype`\r\n" + 
			") \r\n" + 
			"VALUES\r\n" + 
			"  (\r\n" + 
			"   #{sgid} ,\r\n" + 
			"    #{sgname},\r\n" + 
			"    #{sgA},\r\n" + 
			"    sysdate(),\r\n" + 
			"    #{sgtype}\r\n" + 
			"  )  ")
	public void  addgap(@Param("sgid")Integer sgid,@Param("sgname")String sgname,@Param("sgA")String sgA,
			@Param("sgtype")String sgtype);
	
	@Insert("INSERT INTO gpanswer (`gpwid`, `gpwanswer`, `gpid`) \r\n" + 
			"VALUES (#{sgwid}, #{sgwanswer}, #{sgid})   ")
	public void addgapanswer(@Param("sgwid")Integer sgwid,@Param("sgwanswer")String sgwanswer,@Param("sgid")Integer sgid);
	
	@Update(" CREATE TABLE `stp` (\r\n" + 
			"  `gpid` INT(10) NOT NULL AUTO_INCREMENT,\r\n" + 
			"  PRIMARY KEY (`gpid`)\r\n" + 
			") ENGINE=INNODB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 ")
	public void creatTable(); 
	
	@Update(" CREATE TABLE #{tablename} (\r\n" + 
			"  #{sgid} int(10) NOT NULL AUTO_INCREMENT,\r\n" + 
			"  #{sgname} varchar(300) DEFAULT NULL,\r\n" + 
			"  #{sgA} varchar(100) DEFAULT NULL,\r\n" + 
			"  #{sgB} varchar(100) DEFAULT NULL,\r\n" + 
			"  #{sgC} varchar(100) DEFAULT NULL,\r\n" + 
			"  #{sgD} varchar(100) DEFAULT NULL,\r\n" + 
			"  #{sgdate} date DEFAULT NULL,\r\n" + 
			"  #{sgtype} varchar(20) DEFAULT NULL,\r\n" + 
			"  PRIMARY KEY (#{sgid})\r\n" + 
			") ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8 ")
	public void createSingle(Table table);
} 
