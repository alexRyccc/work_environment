package com.newer.exam.xrd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("newsSer")
public class NewsServiceImpl implements NewsService{

	@Autowired
	private NewsMapper news=null;
	@Override
	public List<News> queryAll() {
		List<News> list=news.queryAll();
		return list;
	}
	@Override
	public News queryUrl(int nid) {
		News ne=news.queryUrl(nid);
		return ne;
	}
	@Override
	public List<News> select(String testtype, String location, String ntype) {
		List<News> list=news.select(testtype, location, ntype);
		return list;
	}

}
