package com.newer.exam.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.newer.exam.mapper.Exam5MapperYDH;
import com.newer.exam.pojo.Report;
import com.newer.exam.service.IExamYDH;
@Service("examServiceYDH")
@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED) // Propagation事务传播行为
public class ExamYDHImpl implements IExamYDH {
	@Autowired
	public Exam5MapperYDH ex;

	@Override
	public List<Report> queryReport(Integer userid) {
		
		return ex.queryReport(userid);
	}

	@Override
	public Report queryReport2(Integer pid) {
		
		return ex.queryReport2(pid);
	}

}
