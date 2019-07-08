package com.newer.exam.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.newer.exam.pojo.Gap;
import com.newer.exam.pojo.LayuiSrc;
import com.newer.exam.pojo.Single;
import com.newer.exam.pojo.Users;
import com.newer.exam.serviceimpl.ExamImpl;
import com.newer.exam.serviceimpl.InFServiceImpl;
import com.newer.exam.util.ExcelUtil;

@RestController

public class ExcelController {
	
	@Resource(name ="examService")
	private ExamImpl ex =null;
	
	@Resource(name ="infor")
	private InFServiceImpl inf =null;
	
	ResourceBundle rb =ResourceBundle.getBundle("upload");
	
	
	@RequestMapping("exportExcel")
    public void export(HttpServletResponse response){
 
 
        List<Single> userList = ex.query19da(0);
        //导出操作
        ExcelUtil.exportExcel(userList,"用户信息","sheet1",Single.class,"testDATA.xls",response);
    }
 
    @RequestMapping("importExcel")
    public String importExcel(){
    	System.out.println("s");
    	
        String filePath = "C:\\testInfo.xls";
        //解析excel，
        List<Single> userList = ExcelUtil.importExcel(filePath,1,1,Single.class);
        //也可以使用MultipartFile,使用 FileUtil.importExcel(MultipartFile file, Integer titleRows, Integer headerRows, Class<T> pojoClass)导入
        System.out.println("导入数据一共【"+userList.size()+"】行");
        for (Single single : userList) {
        	System.out.println(single.toString());
        	ex.addsingle(single.getSgid(), single.getSgname(), single.getSga(), single.getSgb(), single.getSgc(), single.getSgd(), single.getSgtype(),single.getSgwanswer());
		}
       
        List<Single> userLists = ex.query19da(0);
        return userLists.toString();
 
    }
    
    @RequestMapping("importCheckExcel")
    public String importCheckExcel(){
        String filePath = "C:\\testCheck.xls";
        //解析excel，
        List<Single> userList = ExcelUtil.importExcel(filePath,1,1,Single.class);
        //也可以使用MultipartFile,使用 FileUtil.importExcel(MultipartFile file, Integer titleRows, Integer headerRows, Class<T> pojoClass)导入
        System.out.println("导入数据一共【"+userList.size()+"】行");
        for (Single single : userList) {
        	System.out.println(single.toString());
        	ex.addcheck(single.getSgid(), single.getSgname(), single.getSga(), single.getSgb(), single.getSgc(), single.getSgd(), single.getSgtype(),single.getSgwanswer());
		}
       
        List<Single> userLists = ex.query19da(0);
        return userLists.toString();
 
    }
    
    @RequestMapping("importGapExcel")
    public String importGapExcel(){
        String filePath = "C:\\testGap.xls";
        //解析excel，
        List<Gap> userList = ExcelUtil.importExcel(filePath,1,1,Gap.class);
        //也可以使用MultipartFile,使用 FileUtil.importExcel(MultipartFile file, Integer titleRows, Integer headerRows, Class<T> pojoClass)导入
        System.out.println("导入数据一共【"+userList.size()+"】行");
        for (Gap gap : userList) {
        	System.out.println(gap.toString());
        	ex.addgap(gap.getgpid(), gap.getgpname(), gap.getgpa(), gap.getgptype());}
       
        List<Single> userLists = ex.query19da(0);
        return userLists.toString();
 
    }

    
    @PostMapping("upload")
    public ResponseEntity<LayuiSrc> importc(@RequestParam(value="file") MultipartFile file,@RequestParam(value="title") String title
    		,@RequestParam(value="opt") String opt,HttpSession se){
    	String foldername=rb.getString("upload.folder");
    	File folder =new File(foldername);
    	Date date =new Date();
		long da =date.getTime();
		
    	File files=new File(folder,title+opt+da+".xls");
    	Integer user =(Integer) se.getAttribute("uid");
	
    	
    	inf.InsertInformation("用户新增数据库《"+title+"》【"+opt+"】已上传，正在审核中，请留意管理员通知", user, 1);
    	try (
				InputStream in = file.getInputStream(); 
				OutputStream out = new FileOutputStream(files);
			) {
				IOUtils.copyLarge(in, out);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	LayuiSrc lay =new LayuiSrc();
    	lay.setCode(0);
    	lay.setMsg("");
    	lay.setData("http://cdn.layui.com/123.jpg");
    	
   
    	  
    	ResponseEntity<LayuiSrc>  res=new ResponseEntity<LayuiSrc>(lay,HttpStatus.OK);
   
        return res;
 
    }

}
