package com.newer.exam;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.Filter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.newer.exam.filter.ExamFilter;
import com.newer.exam.inteceptor.ExamInteceptor;

@MapperScan(basePackages = "com.newer.exam" )
@SpringBootApplication
public class ExamApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		HandlerInterceptor handler = new ExamInteceptor();
		registry.addInterceptor(handler).addPathPatterns("/**").excludePathPatterns("/admin/**","/user/**","/news/**");
	}
	/**
	 * 创建过滤器
	 * 
	 * @return
	 */
	@Bean
	public FilterRegistrationBean<Filter> createFilter() {
		// 创建Filter实例
		ExamFilter filter = new ExamFilter();

		FilterRegistrationBean<Filter> frb = new FilterRegistrationBean<Filter>();
		frb.setFilter(filter);

		List<String> urlPatterns = new ArrayList<>();
		urlPatterns.add("/*");

		frb.setUrlPatterns(urlPatterns);
		return frb;
	}
}
