package com.learn.samdemo;

public interface Demo2  {

	default public void m(){
		
	}
	
	default public void m2(){
		System.out.println("M2 in Demo2");
	};
}
