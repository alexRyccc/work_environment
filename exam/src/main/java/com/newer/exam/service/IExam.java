package com.newer.exam.service;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.newer.exam.pojo.Checkbox;
import com.newer.exam.pojo.Chpaper;
import com.newer.exam.pojo.Chpaper2;
import com.newer.exam.pojo.Gap;
import com.newer.exam.pojo.Gapaper;
import com.newer.exam.pojo.Gapaper2;
import com.newer.exam.pojo.Sgpaper;
import com.newer.exam.pojo.Sgpaper2;
import com.newer.exam.pojo.Single;

public interface IExam {
	
	
	
	
	public void  addsingle(Integer sgid,String sgname,String sgA,
			String sgB,String sgC,String sgD,
			String sgtype,String sgwanswer);//新增单选题目
	

	//public void addsganswer(Integer sgwid,String sgwanswer,Integer sgid);//新增答案
	
	public void  addcheck(Integer sgid,String sgname,String sgA,
			String sgB,String sgC,String sgD,
			String sgtype,String sgwanswer);//新增题目
	
	public void newpaper( Integer userid, String ptype);//新增试卷
	public void newpaper2(Integer userid, String ptype);						
	public void newpaperch2( Integer userid, String ptype);			
	public void newpapergp2( Integer userid, String ptype);
	
	
	
	public void ypdatepaper(String sg1t, Integer sg1ts,
			 String sg1, String sg1s, Integer pid);//单选试卷
	public void chdatepaper( String ch1t,Integer ch1ts,
			String ch1,String ch1s, Integer pid); //多选试卷
	
	public void gpdatepaper( String gp1t, Integer gp1ts,
			 String gp1, String gp1s, Integer pid);//填空试卷
	

	
	
	
		public String checkquery(String sgwanswer,Integer sgwid);//在单选题答案	
		public String checkqueryCh(String chwanswer,Integer chwid);//多选答案
		public String checkqueryGp(String gpwanswer, Integer gpwid);//填空答案
	
		public Integer querycount (String sgtype);//单选题目呀数量
		public Integer querycountCh (String chtype);//多选题目数量
		public Integer querycountGp ( String gptype);//填空题目数量

		
		
		public List<Single> query19da(Integer page); //从单选题中选择十九大题目
		public List<Checkbox> query19daCh(Integer page);	//分页查询多选题目
		public List<Gap> query19daGp(Integer page);//填空分页查询
	 
	
		
		
		 public Integer selectpid ( Integer userid,String ptype);//定位试卷 需要 试卷类型\用户ID
		 
			public Single querySingle(String sgtype,Integer sgid);//寻找单选题
			
			 public Single querySin(String sgtype,Integer sgid);// 查三种题目的题目
			 public Checkbox queryChe(String chtype,Integer chid);
			 public Gap queryGap(String gptype,Integer gpid);
			 
	/* ——————————————————六月28号完成———————————————————————————————————————— */
			 
			 public Gapaper titileGap(Integer pid);//寻找出试卷时候放进去的填空题题号
			 public Sgpaper titleSingle(Integer pid);//寻找出试卷时候放进去的单选题号
			 public Chpaper titleCh(Integer pid);//寻找出试卷时候放进去的多选题号
	
			
				public void upSinglePaper( String sg1, String sg1s,Integer pid);	//根据题目填答案--单选				
				public void upCheackPaper(String ch1, String ch1s, Integer pid);//根据题目填答案--多选				
				public void upGapPaper(String gp1, String gp1s, Integer pid);//根据题目填答案--填空
	
				
		
				public String judgesingle(Integer sgwid);//根据题号得到答案		
				public String judgecheck( Integer chwid);				
				public String judgegap(Integer gpwid);
				
				 public Sgpaper2 querypsg(Integer pid);//查询试卷三种题目的考试成绩
				 public Chpaper2 querypch(Integer pid);
				 public Gapaper2 querypgp(Integer pid);
				 
				 public void ypdatepaper2(String sg1t, Integer sg1ts,
						 String sg1, String sg1s, Integer pid);//填充单选试卷数据结果
				public void chdatepaper2( String ch1t,Integer ch1ts,
						String ch1,String ch1s, Integer pid); //填充多选试卷校验数据结果
				
				public void gpdatepaper2( String gp1t, Integer gp1ts,
						 String gp1, String gp1s, Integer pid);//填充填空试卷数据结果
				
	
				
				
				public void insertReport(Integer userid, Integer pid, Integer grade,Integer rpmin,String renames);//统计分数、得到试卷
			    
}

