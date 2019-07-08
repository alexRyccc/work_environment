package com.newer.exam.mapper;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.newer.exam.pojo.Checkbox;
import com.newer.exam.pojo.Chpaper2;
import com.newer.exam.pojo.Gap;
import com.newer.exam.pojo.Gapaper2;
import com.newer.exam.pojo.Sgpaper2;
import com.newer.exam.pojo.Single;

public interface Exam3MapperYDH {
	
	
	//查询试卷单选题结果
	@Select("SELECT ds.uname,cs.renames,cs.grade,cs.rpdate,cs.rpmin,\r\n" + 
			"c.`sgname` AS sgname1,a.sg1t AS sg1t, c1.sgwanswer AS sgg1,a.sg1 AS sg1,b.sg1 AS sggg1,\r\n" + 
			"d.`sgname` AS sgname2,a.sg2t AS sg2t, d1.sgwanswer AS sgg2,a.sg2 AS sg2,b.sg2 AS sggg2,\r\n" + 
			"e.`sgname` AS sgname3,a.sg3t AS sg3t, e1.sgwanswer AS sgg3,a.sg3 AS sg3,b.sg3 AS sggg3,\r\n" + 
			"f.`sgname` AS sgname4,a.sg4t AS sg4t, f1.sgwanswer AS sgg4,a.sg4 AS sg4,b.sg4 AS sggg4,\r\n" + 
			"g.`sgname` AS sgname5,a.sg5t AS sg5t, g1.sgwanswer AS sgg5,a.sg5 AS sg5,b.sg5 AS sggg5,\r\n" + 
			"h.`sgname` AS sgname6,a.sg6t AS sg6t, h1.sgwanswer AS sgg6,a.sg6 AS sg6,b.sg6 AS sggg6,\r\n" + 
			"i.`sgname` AS sgname7,a.sg7t AS sg7t, i1.sgwanswer AS sgg7,a.sg7 AS sg7,b.sg7 AS sggg7,\r\n" + 
			"j.`sgname` AS sgname8,a.sg8t AS sg8t, j1.sgwanswer AS sgg8,a.sg8 AS sg8,b.sg8 AS sggg8,\r\n" + 
			"k.`sgname` AS sgname9,a.sg9t AS sg9t, k1.sgwanswer AS sgg9,a.sg9 AS sg9,b.sg9 AS sggg9,\r\n" + 
			"l.`sgname` AS sgname10,a.sg10t AS sg10t, l1.sgwanswer AS sgg10,a.sg10 AS sg10,b.sg10 AS sggg10,\r\n" + 
			"m.`sgname` AS sgname11,a.sg11t AS sg11t, m1.sgwanswer AS sgg11,a.sg11 AS sg11,b.sg11 AS sggg11,\r\n" + 
			"n.`sgname` AS sgname12,a.sg12t AS sg12t, n1.sgwanswer AS sgg12,a.sg12 AS sg12,b.sg12 AS sggg12,\r\n" + 
			"o.`sgname` AS sgname13,a.sg13t AS sg13t, o1.sgwanswer AS sgg13,a.sg13 AS sg13,b.sg13 AS sggg13,\r\n" + 
			"p.`sgname` AS sgname14,a.sg14t AS sg14t, p1.sgwanswer AS sgg14,a.sg14 AS sg14,b.sg14 AS sggg14,\r\n" + 
			"q.`sgname` AS sgname15,a.sg15t AS sg15t, q1.sgwanswer AS sgg15,a.sg15 AS sg15,b.sg15 AS sggg15\r\n" + 
			"FROM (psganswer a ,paper b )\r\n" + 
			"\r\n" + 
			"LEFT JOIN report cs ON cs.pid= b.pid\r\n" + 
			"LEFT JOIN users ds ON cs.userid =ds.uid\r\n" + 
			"LEFT JOIN single c ON c.`sgid` =a.sg1t\r\n" + 
			"LEFT JOIN single d ON d.sgid= a.sg2t\r\n" + 
			"LEFT JOIN single e ON e.sgid= a.sg3t\r\n" + 
			"LEFT JOIN single f ON f.sgid= a.sg4t\r\n" + 
			"LEFT JOIN single g ON g.sgid= a.sg5t\r\n" + 
			"LEFT JOIN single h ON h.sgid= a.sg6t\r\n" + 
			"LEFT JOIN single i ON i.sgid= a.sg7t\r\n" + 
			"LEFT JOIN single j ON j.sgid= a.sg8t\r\n" + 
			"LEFT JOIN single k ON k.sgid= a.sg9t\r\n" + 
			"LEFT JOIN single l ON l.sgid= a.sg10t\r\n" + 
			"LEFT JOIN single m ON m.sgid= a.sg11t\r\n" + 
			"LEFT JOIN single n ON n.sgid= a.sg12t\r\n" + 
			"LEFT JOIN single o ON o.sgid= a.sg13t\r\n" + 
			"LEFT JOIN single p ON p.sgid= a.sg14t\r\n" + 
			"LEFT JOIN single q ON q.sgid= a.sg15t\r\n" + 
			"LEFT JOIN sganswer c1 ON c1.`sgid` =a.sg1t\r\n" + 
			"LEFT JOIN sganswer d1 ON d1.sgid= a.sg2t\r\n" + 
			"LEFT JOIN sganswer e1 ON e1.sgid= a.sg3t\r\n" + 
			"LEFT JOIN sganswer f1 ON f1.sgid= a.sg4t\r\n" + 
			"LEFT JOIN sganswer g1 ON g1.sgid= a.sg5t\r\n" + 
			"LEFT JOIN sganswer h1 ON h1.sgid= a.sg6t\r\n" + 
			"LEFT JOIN sganswer i1 ON i1.sgid= a.sg7t\r\n" + 
			"LEFT JOIN sganswer j1 ON j1.sgid= a.sg8t\r\n" + 
			"LEFT JOIN sganswer k1 ON k1.sgid= a.sg9t\r\n" + 
			"LEFT JOIN sganswer l1 ON l1.sgid= a.sg10t\r\n" + 
			"LEFT JOIN sganswer m1 ON m1.sgid= a.sg11t\r\n" + 
			"LEFT JOIN sganswer n1 ON n1.sgid= a.sg12t\r\n" + 
			"LEFT JOIN sganswer o1 ON o1.sgid= a.sg13t\r\n" + 
			"LEFT JOIN sganswer p1 ON p1.sgid= a.sg14t\r\n" + 
			"LEFT JOIN sganswer q1 ON q1.sgid= a.sg15t\r\n" + 
			"\r\n" + 
			"WHERE a.pid =#{pid}\r\n" + 
			"AND a.pid =b.pid")
	public Sgpaper2 querypsg(@Param("pid")Integer pid);
	
	//查询试卷多选题结果
	@Select("SELECT ds.uname,cs.renames,cs.grade,cs.rpdate,cs.rpmin,\r\n" + 
			"c.`chname` AS chname1,a.ch1t AS ch1t, c1.chwanswer AS chh1,a.ch1 AS ch1,b.ch1 AS chhh1,\r\n" + 
			"d.`chname` AS chname2,a.ch2t AS ch2t, d1.chwanswer AS chh2,a.ch2 AS ch2,b.ch2 AS chhh2,\r\n" + 
			"e.`chname` AS chname3,a.ch3t AS ch3t, e1.chwanswer AS chh3,a.ch3 AS ch3,b.ch3 AS chhh3,\r\n" + 
			"f.`chname` AS chname4,a.ch4t AS ch4t, f1.chwanswer AS chh4,a.ch4 AS ch4,b.ch4 AS chhh4,\r\n" + 
			"g.`chname` AS chname5,a.ch5t AS ch5t, g1.chwanswer AS chh5,a.ch5 AS ch5,b.ch5 AS chhh5,\r\n" + 
			"h.`chname` AS chname6,a.ch6t AS ch6t, h1.chwanswer AS chh6,a.ch6 AS ch6,b.ch6 AS chhh6,\r\n" + 
			"i.`chname` AS chname7,a.ch7t AS ch7t, i1.chwanswer AS chh7,a.ch7 AS ch7,b.ch7 AS chhh7,\r\n" + 
			"j.`chname` AS chname8,a.ch8t AS ch8t, j1.chwanswer AS chh8,a.ch8 AS ch8,b.ch8 AS chhh8,\r\n" + 
			"k.`chname` AS chname9,a.ch9t AS ch9t, k1.chwanswer AS chh9,a.ch9 AS ch9,b.ch9 AS chhh9,\r\n" + 
			"l.`chname` AS chname10,a.ch10t AS ch10t, l1.chwanswer AS chh10,a.ch10 AS ch10,b.ch10 AS chhh10\r\n" + 
			"\r\n" + 
			"FROM (pchanswer a ,paperch b )\r\n" + 
			"\r\n" + 
			"LEFT JOIN report cs ON cs.pid= b.pid\r\n" + 
			"LEFT JOIN users ds ON cs.userid =ds.uid\r\n" + 
			"LEFT JOIN checkbox c ON c.`chid` =a.ch1t\r\n" + 
			"LEFT JOIN checkbox d ON d.chid= a.ch2t\r\n" + 
			"LEFT JOIN checkbox e ON e.chid= a.ch3t\r\n" + 
			"LEFT JOIN checkbox f ON f.chid= a.ch4t\r\n" + 
			"LEFT JOIN checkbox g ON g.chid= a.ch5t\r\n" + 
			"LEFT JOIN checkbox h ON h.chid= a.ch6t\r\n" + 
			"LEFT JOIN checkbox i ON i.chid= a.ch7t\r\n" + 
			"LEFT JOIN checkbox j ON j.chid= a.ch8t\r\n" + 
			"LEFT JOIN checkbox k ON k.chid= a.ch9t\r\n" + 
			"LEFT JOIN checkbox l ON l.chid= a.ch10t\r\n" + 
			"LEFT JOIN chanswer c1 ON c1.`chid` =a.ch1t\r\n" + 
			"LEFT JOIN chanswer d1 ON d1.chid= a.ch2t\r\n" + 
			"LEFT JOIN chanswer e1 ON e1.chid= a.ch3t\r\n" + 
			"LEFT JOIN chanswer f1 ON f1.chid= a.ch4t\r\n" + 
			"LEFT JOIN chanswer g1 ON g1.chid= a.ch5t\r\n" + 
			"LEFT JOIN chanswer h1 ON h1.chid= a.ch6t\r\n" + 
			"LEFT JOIN chanswer i1 ON i1.chid= a.ch7t\r\n" + 
			"LEFT JOIN chanswer j1 ON j1.chid= a.ch8t\r\n" + 
			"LEFT JOIN chanswer k1 ON k1.chid= a.ch9t\r\n" + 
			"LEFT JOIN chanswer l1 ON l1.chid= a.ch10t\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"WHERE a.pid =#{pid}\r\n" + 
			"AND a.pid =b.pid ")
	public Chpaper2 querypch(@Param("pid")Integer pid);
	
	//查询试卷填空题结果
	@Select("SELECT ds.uname,cs.renames,cs.grade,cs.rpdate,cs.rpmin,\r\n" + 
			"c.`gpname` AS gpname1,a.gp1t AS gp1t, c1.gpwanswer AS gpp1,a.gp1 AS gp1,b.gp1 AS gppp1,\r\n" + 
			"d.`gpname` AS gpname2,a.gp2t AS gp2t, d1.gpwanswer AS gpp2,a.gp2 AS gp2,b.gp2 AS gppp2,\r\n" + 
			"e.`gpname` AS gpname3,a.gp3t AS gp3t, e1.gpwanswer AS gpp3,a.gp3 AS gp3,b.gp3 AS gppp3,\r\n" + 
			"f.`gpname` AS gpname4,a.gp4t AS gp4t, f1.gpwanswer AS gpp4,a.gp4 AS gp4,b.gp4 AS gppp4,\r\n" + 
			"g.`gpname` AS gpname5,a.gp5t AS gp5t, g1.gpwanswer AS gpp5,a.gp5 AS gp5,b.gp5 AS gppp5\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"FROM (pgpanswer a ,papergp b )\r\n" + 
			"\r\n" + 
			"LEFT JOIN report cs ON cs.pid= b.pid\r\n" + 
			"LEFT JOIN users ds ON cs.userid =ds.uid\r\n" + 
			"LEFT JOIN gap c ON c.`gpid` =a.gp1t\r\n" + 
			"LEFT JOIN gap d ON d.gpid= a.gp2t\r\n" + 
			"LEFT JOIN gap e ON e.gpid= a.gp3t\r\n" + 
			"LEFT JOIN gap f ON f.gpid= a.gp4t\r\n" + 
			"LEFT JOIN gap g ON g.gpid= a.gp5t\r\n" + 
			"\r\n" + 
			"LEFT JOIN gpanswer c1 ON c1.`gpid` =a.gp1t\r\n" + 
			"LEFT JOIN gpanswer d1 ON d1.gpid= a.gp2t\r\n" + 
			"LEFT JOIN gpanswer e1 ON e1.gpid= a.gp3t\r\n" + 
			"LEFT JOIN gpanswer f1 ON f1.gpid= a.gp4t\r\n" + 
			"LEFT JOIN gpanswer g1 ON g1.gpid= a.gp5t\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"\r\n" + 
			"WHERE a.pid =#{pid}\r\n" + 
			"AND a.pid =b.pid ")
	public Gapaper2 querypgp(@Param("pid")Integer pid);
	
	//查询试卷三种题目
	@Select("SELECT a.sgid,a.sgname,a.sga,a.sgb,a.sgc,a.sgd,a.sgdate,b.sgwanswer,a.sgtype FROM single a LEFT JOIN sganswer b ON a.sgid = b.sgid WHERE a.sgtype =#{sgtype} and a.sgid =#{sgid}  ")
	public Single querySin(@Param("sgtype")String sgtype,@Param("sgid")Integer sgid );
	
	@Select("SELECT a.chid,a.chname,a.cha,a.chb,a.chc,a.chd,a.chdate,b.chwanswer,a.chtype FROM checkbox a LEFT JOIN chanswer b ON a.chid = b.chid WHERE a.chtype =#{chtype} and a.chid =#{chid}   ")
	public Checkbox queryChe(@Param("chtype")String chtype,@Param("chid")Integer chid );

	@Select("SELECT a.gpid,a.gpname,a.gpa,a.gpdate,a.gptype,b.gpwanswer FROM gap a left join gpanswer b on a.gpid=b.gpid WHERE a.gptype =#{gptype} and a.gpid =#{gpid} ")
	public Gap queryGap(@Param("gptype")String gptype,@Param("gpid")Integer gpid);
	

}
