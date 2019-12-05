package com.learn.samdemo;

public interface Demo1 {
	
	static void m1(){
		System.out.println("M1 in Demo1");
	}
	
	default public void m2(){
		System.out.println("M2 in Demo1");
	};
}
