package com.newer.exam.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import com.newer.exam.service.IUserService;
import com.newer.exam.util.SpringUtils;



/**
 * Servlet Filter implementation class MyFilter
 */
public class ExamFilter implements Filter {
    /**
     * Default constructor. 
     */
    public ExamFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		Cookie[] cookies = req.getCookies();
		
    	Object obj=req.getSession().getAttribute("member");
    	if(obj==null&&cookies!=null) {
    		 String username = null;
	         String password = null;
    		 for (Cookie cookie:cookies){
    			 String name=cookie.getName();
  	        	 String value=cookie.getValue();
  	        	 
  	        	 if("username".equals(name)) {
  	        		 username=value;
  	        	 }
  	        	 
  	        	 if("password".equals(name)){
  	        		 password=value;
				 }
    		 }

    		 if(username!=null&&password!=null) {
    			 IUserService us=(IUserService) SpringUtils.getBean("userService");
    			 Integer uid=us.login(username, password);
    			 if(uid!=null) {
    				 System.out.println("用户已自动登录");
    			 }
    			 req.getSession().setAttribute("uid", uid);
    		 }
    	}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
