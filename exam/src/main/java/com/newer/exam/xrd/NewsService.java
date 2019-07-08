package com.newer.exam.xrd;

import java.util.List;

public interface NewsService {

	public List<News> queryAll();
	
	public News queryUrl(int nid);
	
	public List<News> select(String testtype , String location , String ntype);
}
