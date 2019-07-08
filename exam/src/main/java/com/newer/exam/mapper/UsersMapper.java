package com.newer.exam.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.newer.exam.pojo.Users;

public interface UsersMapper {
	
	@Select("select `uid` from Users where (unum=#{username} or uphone=#{username} or email=#{username}) and upassword=#{password}")
	public Integer login(String username,String password);
	
	@Select("SELECT`uid`,`uNUM`,`uphone`,`email`,`uname` FROM `users` WHERE `uid`=#{uid}")
	public Users query(int uid);
	
	@Select("select COUNT(1) from Users where unum=#{num} or uphone=#{num} or email=#{num}")
	public int vernum(String num);
	
	@Update("UPDATE Users SET `unum`=#{unum},`email`=#{email},`uphone`=#{uphone},`uname`=#{uname},`upassword`=#{upassword} WHERE `uid` = #{uid}")
	public void upduser(Users user);
	
	@Insert("insert into Users(`unum`,`upassword`,`uphone`,`uname`,`email`) values(#{unum},#{upassword},#{uphone},#{uname},#{email})")
	public void inseuser(Users user);
	
	@Delete("DELETE FROM Users WHERE `uid` = #{uid}")
	public void deluser(int uid);

}
