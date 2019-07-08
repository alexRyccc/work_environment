package com.newer.exam.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.newer.exam.mapper.InFormationMapper;
import com.newer.exam.pojo.Information;

public interface InforService {
	public void InsertInformation(String ifname,Integer ifuid,Integer ifaid);
	
	public List<Information> list(Integer ifuid);
}
