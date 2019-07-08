package com.newer.exam.service;

import com.newer.exam.pojo.Users;

public interface UsersService {
	public Users login(String username,String password);
	
	public void upduser(Users user);
	
	public void inseuser(Users user);
	
	public void deluser(int uid);

}
