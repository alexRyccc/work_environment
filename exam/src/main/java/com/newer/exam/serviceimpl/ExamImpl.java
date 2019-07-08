package com.newer.exam.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.newer.exam.mapper.Exam3MapperYDH;
import com.newer.exam.mapper.Exam4MapperYDH;
import com.newer.exam.mapper.ExamMapper;
import com.newer.exam.mapper.ExcelMapper;
import com.newer.exam.pojo.Checkbox;
import com.newer.exam.pojo.Chpaper;
import com.newer.exam.pojo.Chpaper2;
import com.newer.exam.pojo.Gap;
import com.newer.exam.pojo.Gapaper;
import com.newer.exam.pojo.Gapaper2;
import com.newer.exam.pojo.Sgpaper;
import com.newer.exam.pojo.Sgpaper2;
import com.newer.exam.pojo.Single;
import com.newer.exam.service.IExam;
@Service("examService")
@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED) // Propagation事务传播行为
public class ExamImpl implements IExam {
	@Autowired
	ExamMapper exa =null;
	@Autowired
	ExcelMapper ecm=null;
	@Autowired
	Exam3MapperYDH exa3=null;
	
	@Autowired
	Exam4MapperYDH exa4=null;

	@Override
	public List<Single> query19da(Integer page) {
		
		return exa.query19da(page);
		
	}
	@Override
	public String checkquery(String sgwanswer, Integer sgwid) {
		
		return exa.checkquery(sgwanswer, sgwid);
	}
	@Override
	 @Transactional(propagation = Propagation.REQUIRED,
     isolation = Isolation.DEFAULT,
     rollbackFor = Exception.class)
	public void addsingle(Integer sgid, String sgname, String sgA, String sgB, String sgC, String sgD, String sgtype, String sgwanswer) {
		ecm.addsingle(sgid, sgname, sgA, sgB, sgC, sgD, sgtype);
		ecm.addsganswer(sgid, sgwanswer, sgid);
		
	}
	@Override
	public Integer querycount(String sgtype) {
		
		return exa.querycount(sgtype);
	}
	@Override
	public void ypdatepaper(String sg1t, Integer sg1ts, String sg1, String sg1s, Integer pid) {
		exa.ypdatepaper(sg1t, sg1ts, sg1, sg1s, pid);
		
	}
	@Override
	 @Transactional(propagation = Propagation.REQUIRED,
     isolation = Isolation.DEFAULT,
     rollbackFor = Exception.class)
	public void addcheck(Integer sgid, String sgname, String sgA, String sgB, String sgC, String sgD, String sgtype,
			String sgwanswer) {
		ecm.addcheck(sgid, sgname, sgA, sgB, sgC, sgD, sgtype);	
		ecm.addchanswer(sgid, sgwanswer, sgid);
		
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED,
    isolation = Isolation.DEFAULT,
    rollbackFor = Exception.class)
	public void addgap(Integer sgid, String sgname, String sgA,String sgtype) {
		ecm.addgap(sgid, sgname, sgA, sgtype);	
		ecm.addgapanswer(sgid, sgA, sgid);
		
	}
	
	@Override
	public List<Checkbox> query19daCh(Integer page) {
		// TODO Auto-generated method stub
		return exa.query19daCh(page);
	}
	@Override
	public String checkqueryCh(String chwanswer, Integer chwid) {
		// TODO Auto-generated method stub
		return exa.checkqueryCh(chwanswer, chwid);
	}
	@Override
	public Integer querycountCh(String chtype) {
		// TODO Auto-generated method stub
		return exa.querycountCh(chtype);
	}
	@Override
	public void chdatepaper(String ch1t, Integer ch1ts, String ch1, String ch1s, Integer pid) {
		exa.chdatepaper(ch1t, ch1ts, ch1, ch1s, pid);
		
	}
	
	@Override
	 @Transactional(propagation = Propagation.REQUIRED,
     isolation = Isolation.DEFAULT,
     rollbackFor = Exception.class)
	public void newpaper(Integer userid, String ptype) {
		exa.newpaper(userid, ptype);
		exa.newpaperch(userid, ptype);
		exa.newpapergp(userid, ptype);
		exa.newpaper2(userid, ptype);
		exa.newpaperch2(userid, ptype);
		exa.newpapergp2(userid, ptype);
		
	}
	@Override
	public Integer selectpid(Integer userid, String ptype) {
		return exa.selectpid(userid, ptype);
		
	}
	
	public void creatTable() {
		ecm.creatTable();
	}
	@Override
	public void gpdatepaper(String gp1t, Integer gp1ts, String gp1, String gp1s, Integer pid) {
		exa.gpdatepaper(gp1t, gp1ts, gp1, gp1s, pid);
		
	}
	@Override
	public List<Gap> query19daGp(Integer page) {
		// TODO Auto-generated method stub
		return exa.query19daGp(page);
	}
	@Override
	public Integer querycountGp(String gptype) {
		// TODO Auto-generated method stub
		return exa.querycountGp(gptype);
	}
	@Override
	public String checkqueryGp(String gpwanswer, Integer gpwid) {
		
		return exa.checkqueryGp(gpwanswer, gpwid);
	}
	@Override
	public Single querySingle(String sgtype,Integer sgid) {
		// TODO Auto-generated method stub
		return exa.querySingle(sgtype, sgid);
	}

	@Override
	public Single querySin(String sgtype,Integer sgid) {
		return exa3.querySin(sgtype,sgid);
	}
	@Override
	public Checkbox queryChe(String chtype,Integer chid) {
		
		return exa3.queryChe(chtype,chid);
	}
	@Override
	public Gap queryGap(String gptype,Integer gpid) {
		
		return exa3.queryGap(gptype,gpid);
	}
	@Override
	public Gapaper titileGap(Integer pid) {
		// TODO Auto-generated method stub
		return exa.titileGap(pid);
	}
	@Override
	public Sgpaper titleSingle(Integer pid) {
		// TODO Auto-generated method stub
		return exa.titleSingle(pid);
	}
	@Override
	public Chpaper titleCh(Integer pid) {
		
		return exa.titleCh(pid);
	}
	@Override
	public void upSinglePaper(String sg1, String sg1s, Integer pid) {
		exa.upSinglePaper(sg1, sg1s, pid);
		
	}
	@Override
	public void upCheackPaper(String ch1, String ch1s, Integer pid) {
		exa.upCheackPaper(ch1, ch1s, pid);
		
	}
	@Override
	public void upGapPaper(String gp1, String gp1s, Integer pid) {
		exa.upGapPaper(gp1, gp1s, pid);
		
	}
	@Override
	public String judgesingle(Integer sgwid) {
		// TODO Auto-generated method stub
		return exa.judgesingle(sgwid);
	}
	@Override
	public String judgecheck(Integer chwid) {
		// TODO Auto-generated method stub
		return exa.judgecheck(chwid);
	}
	@Override
	public String judgegap(Integer gpwid) {
		// TODO Auto-generated method stub
		return exa.judgegap(gpwid);
	}
	//查询试卷考试结果
		@Override
		public Sgpaper2 querypsg(Integer pid) {
			return exa3.querypsg(pid);
		}
		@Override
		public Chpaper2 querypch(Integer pid) {
			// TODO Auto-generated method stub
			return exa3.querypch(pid);
		}
		@Override
		public Gapaper2 querypgp(Integer pid) {
			// TODO Auto-generated method stub
			return exa3.querypgp(pid);
		}

		//回写试卷题目答案数据
		@Override
		public void ypdatepaper2(String sg1t, Integer sg1ts, String sg1, String sg1s, Integer pid) {
			exa4.ypdatepaper2(sg1t, sg1ts, sg1, sg1s, pid);
			
		}
		@Override
		public void chdatepaper2(String ch1t, Integer ch1ts, String ch1, String ch1s, Integer pid) {
			exa4.chdatepaper2(ch1t, ch1ts, ch1, ch1s, pid);
			
		}
		@Override
		public void gpdatepaper2(String gp1t, Integer gp1ts, String gp1, String gp1s, Integer pid) {
			exa4.gpdatepaper2(gp1t, gp1ts, gp1, gp1s, pid);
			
		}
		@Override
		public void newpaper2(Integer userid, String ptype) {
			exa.newpaper2(userid, ptype);
			
		}
		@Override
		public void newpaperch2(Integer userid, String ptype) {
			exa.newpaperch2(userid, ptype);
			
		}
		@Override
		public void newpapergp2(Integer userid, String ptype) {
			exa.newpapergp2(userid, ptype);
			
		}
		@Override
		public void insertReport(Integer userid, Integer pid, Integer grade, Integer rpmin,String renames) {
			exa.insertReport(userid, pid, grade, rpmin,renames);
			
		}

}
