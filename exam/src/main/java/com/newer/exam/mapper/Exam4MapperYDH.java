package com.newer.exam.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.newer.exam.pojo.Checkbox;
import com.newer.exam.pojo.Gap;
import com.newer.exam.pojo.Single;

public interface Exam4MapperYDH {
	@Select("SELECT a.sgid,a.sgname,a.sga,a.sgb,a.sgc,a.sgd,a.sgdate,b.sgwanswer,a.sgtype FROM single a LEFT JOIN sganswer b ON a.sgid = b.sgid WHERE a.sgtype ='19da' LIMIT #{page} ,1  ")
	public List<Single> query19da(@Param("page")Integer page);
	
	@Select("SELECT a.chid,a.chname,a.cha,a.chb,a.chc,a.chd,a.chdate,b.chwanswer,a.chtype FROM checkbox a LEFT JOIN chanswer b ON a.chid = b.chid WHERE a.chtype ='19da' LIMIT #{page} ,1  ")
	public List<Checkbox> query19daCh(@Param("page")Integer page);
	
	@Select("SELECT gpid,gpname,gpa,gpdate,gptype FROM gap  WHERE gptype ='19da' LIMIT #{page} ,1  ")
	public List<Gap> query19daGp(@Param("page")Integer page);
	
	@Select(" SELECT 1 FROM sganswer WHERE sgwanswer =#{sgwanswer}  AND  sgwid =#{sgwid}  ")
	public String checkquery(@Param("sgwanswer") String sgwanswer,@Param("sgwid") Integer sgwid);
	
	@Select("SELECT COUNT(1) FROM single WHERE sgtype =#{sgtype} ")
	public Integer querycount (@Param("sgtype") String sgtype);
	

	
	@Select(" SELECT 1 FROM chanswer WHERE chwanswer =#{chwanswer}  AND  chwid =#{chwid}  ")
	public String checkqueryCh(@Param("chwanswer") String chwanswer,@Param("chwid") Integer chwid);
	
	@Select("SELECT COUNT(1) FROM checkbox WHERE chtype =#{chtype} ")
	public Integer querycountCh (@Param("chtype") String chtype);
	
	@Select("SELECT COUNT(1) FROM gap WHERE gptype =#{gptype} ")
	public Integer querycountGp (@Param("gptype") String gptype);
	
	
	
	
	@Insert(" INSERT INTO `exam`.`paper` ( `userid`, `ptype`) VALUES ( #{userid}, #{ptype})  ")
	public void newpaper(@Param("userid") Integer userid,@Param("ptype") String ptype);
	
	@Insert(" INSERT INTO `exam`.`paperch` ( `userid`, `ptype`) VALUES ( #{userid}, #{ptype})  ")
	public void newpaperch(@Param("userid") Integer userid,@Param("ptype") String ptype);
	
	@Insert(" INSERT INTO `exam`.`papergp` ( `userid`, `ptype`) VALUES ( #{userid}, #{ptype})  ")
	public void newpapergp(@Param("userid") Integer userid,@Param("ptype") String ptype);
	
    @Select(" SELECT pid FROM paper WHERE userid =#{userid} AND ptype =#{ptype} ORDER BY pid DESC LIMIT 0,1 ")
    public Integer selectpid (@Param("userid") Integer userid,@Param("ptype") String ptype);
    
    @Select(" SELECT 1 FROM gpanswer WHERE gpwanswer =#{gpwanswer}  AND  gpwid =#{gpwid}  ")
	public String checkqueryGp(@Param("gpwanswer") String gpwanswer,@Param("gpwid") Integer gpwid);
    
    @Select("SELECT a.sgid,a.sgname,a.sga,a.sgb,a.sgc,a.sgd,a.sgdate,b.sgwanswer,a.sgtype FROM single a LEFT JOIN sganswer b ON a.sgid = b.sgid WHERE a.sgtype =#{sgtype} and a.sgid=#{sgid}  ")
	public Single querySingle(@Param("sgtype")String sgtype,@Param("sgid")Integer sgid);

    
    @Update("UPDATE  psganswer SET   ${sg1t} =  #{sg1ts} , ${sg1} = #{sg1s}  WHERE pid = #{pid} ")
	public void ypdatepaper2(@Param("sg1t") String sg1t,@Param("sg1ts") Integer sg1ts,
			@Param("sg1") String sg1,@Param("sg1s") String sg1s,@Param("pid") Integer pid);
	
	@Update("UPDATE  pchanswer SET   ${ch1t} =  #{ch1ts} , ${ch1} = #{ch1s}  WHERE pid = #{pid} ")
	public void chdatepaper2(@Param("ch1t") String ch1t,@Param("ch1ts") Integer ch1ts,
			@Param("ch1") String ch1,@Param("ch1s") String ch1s,@Param("pid") Integer pid);
	
	@Update("UPDATE  pgpanswer SET   ${gp1t} =  #{gp1ts} , ${gp1} = #{gp1s}  WHERE pid = #{pid} ")
	public void gpdatepaper2(@Param("gp1t") String gp1t,@Param("gp1ts") Integer gp1ts,
			@Param("gp1") String gp1,@Param("gp1s") String gp1s,@Param("pid") Integer pid);
	

}
