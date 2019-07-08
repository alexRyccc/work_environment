package com.newer.exam.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newer.exam.mapper.UsersMapper;
import com.newer.exam.pojo.Users;
import com.newer.exam.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Autowired
	private UsersMapper userMapper;

	@Override
	public Integer login(String username, String password) {
		// TODO Auto-generated method stub
		return userMapper.login(username, password);
	}

	@Override
	public void upduser(Users user) {
		// TODO Auto-generated method stub
		userMapper.upduser(user);
	}

	@Override
	public void deluser(int uid) {
		// TODO Auto-generated method stub
		userMapper.deluser(uid);
	}

	@Override
	public void inseuser(Users user) {
		// TODO Auto-generated method stub
		userMapper.inseuser(user);
	}

	@Override
	public int vernum(String num) {
		// TODO Auto-generated method stub
		return userMapper.vernum(num);
	}

	@Override
	public Users query(Integer uid) {
		// TODO Auto-generated method stub
		return userMapper.query(uid);
	}
}
