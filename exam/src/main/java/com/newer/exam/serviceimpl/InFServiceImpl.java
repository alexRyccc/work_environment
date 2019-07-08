package com.newer.exam.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.newer.exam.mapper.InFormationMapper;
import com.newer.exam.pojo.Information;
import com.newer.exam.service.InforService;

@Service("infor")
@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED) // Propagation事务传播行为
public class InFServiceImpl implements InforService{
	@Autowired
	InFormationMapper inf;
	@Override
	public void InsertInformation(String ifname, Integer ifuid, Integer ifaid) {
		inf.InsertInformation(ifname, ifuid, ifaid);
		
		
	}
	@Override
	public List<Information> list(Integer ifuid) {
		
		return inf.list(ifuid);
	}

}
