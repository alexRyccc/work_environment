package com.newer.exam.util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomTitle {
	
	 public Set singleSet(int count) {
		 Set<Integer> set =new HashSet<>();
		 Random r = new Random();
		 while(set.size()!=15){//当set集合的size（大小）小于7时，继续执行循环
	            int a = r.nextInt(count)+1;//接收随机数对象
	            System.out.println(set.toString());
	            set.add(a);//添加随机数
	        } 
		 return set;
	 }
	 public Set checkSet(int count) {
		 Set<Integer> set =new HashSet<>();
		 Random r = new Random();
		 while(set.size()!=10){//当set集合的size（大小）小于7时，继续执行循环
	            int a = r.nextInt(count)+1;//接收随机数对象
	            set.add(a);//添加随机数
	        } 
		 return set;
	 }
	 public Set gapSet(int count) {
		 Set<Integer> set =new HashSet<>();
		 Random r = new Random();
		 while(set.size()!=5){//当set集合的size（大小）小于7时，继续执行循环
	            int a = r.nextInt(count)+1;//接收随机数对象
	            set.add(a);//添加随机数
	        } 

		 return set;
	 }
}
