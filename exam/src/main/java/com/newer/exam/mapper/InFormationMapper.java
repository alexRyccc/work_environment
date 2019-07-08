package com.newer.exam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.newer.exam.pojo.Information;

public interface InFormationMapper {
	@Insert("INSERT INTO `exam`.`information` (`ifname`, `ifdate`, `ifuid`, `ifaid`,`iftype`) \r\n" + 
			"VALUES( #{ifname},   SYSDATE(),   #{ifuid},    #{ifaid},1 ) ")
	public void InsertInformation(@Param("ifname")String ifname,@Param("ifuid")Integer ifuid,
			@Param("ifaid")Integer ifaid);
	
	@Select("SELECT c.aname,a.ifname,a.ifuid,a.ifaid ,a.ifdate,b.uname  FROM information  a \r\n" + 
			"LEFT JOIN users b ON a.ifuid = b.uid LEFT JOIN administrator c ON a.ifaid =c.aid WHERE ifuid =#{ifuid} ")
	public List<Information> list(@Param("ifuid")Integer ifuid);
}
