package com.newer.exam.mapper;

import org.apache.ibatis.annotations.Select;

public interface AdminMapper {
	@Select("SELECT `aid` FROM `administrator` WHERE `aname`=#{name} and `apassword`=#{password}")
	public int adminlogin(String name,String password);
	
}
