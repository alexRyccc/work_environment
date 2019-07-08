package com.newer.exam.service;

import com.newer.exam.pojo.Users;

public interface IUserService {
	public Integer login(String username,String password);
	
	public Users query(Integer uid);
	
	public int vernum(String num);
	
	public void upduser(Users user);
	
	public void inseuser(Users user);
	
	public void deluser(int uid);

}
