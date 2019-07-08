package com.newer.exam.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.newer.exam.pojo.Report;

public interface IExamYDH {
	public List<Report> queryReport(Integer userid);//查询考试成绩

	public Report queryReport2(Integer pid);
}
