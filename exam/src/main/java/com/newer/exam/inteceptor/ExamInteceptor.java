package com.newer.exam.inteceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 拦截器
 * 
 * @author chenxian
 *
 */
@Component
public class ExamInteceptor implements HandlerInterceptor {
	private static final Logger log = LoggerFactory.getLogger(ExamInteceptor.class);

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if (request.getRequestURI().equals("/login.html")||request.getRequestURI().equals("/after/admin.html") || request.getRequestURI().equals("/main.html")
				|| request.getRequestURI().equals("/register.html") || request.getRequestURI().endsWith(".css")
				|| request.getRequestURI().endsWith(".js") || request.getRequestURI().endsWith(".jpg")
				|| request.getRequestURI().endsWith(".png") || request.getRequestURI().endsWith(".woff")
				|| request.getRequestURI().equals("/img")
				|| request.getRequestURI().equals("/head.html")
				|| request.getRequestURI().equals("/head2.html")
				|| request.getRequestURI().equals("/head3.html")
				|| request.getRequestURI().equals("/questionbank.html")
				|| request.getRequestURI().equals("/information.html")
				|| request.getRequestURI().equals("/js/jquery.serializejson.min.js")) {
			return true;
		}
		HttpSession session = request.getSession();
		Integer aid = (Integer) session.getAttribute("aid");
		Integer uid = (Integer) session.getAttribute("uid");
		String[] url=request.getRequestURI().split("/");
		
		if(url.length>1&&url[1].equals("after")) {
			if (aid == null&& !request.getRequestURI().equals("/after/admin.html")) {
				response.sendRedirect(request.getContextPath() + "/after/admin.html");
				return false;
			}
		}else{
			if (uid == null && !request.getRequestURI().equals("/login.html")) {
				response.sendRedirect(request.getContextPath() + "/login.html");
				return false;
			}
		}
		/* log.info("进入拦截器"); */
		// 拦截掉，不会进入控制器
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}
}
