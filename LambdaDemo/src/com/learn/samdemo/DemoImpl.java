package com.learn.samdemo;

class DemoImpl implements Demo1, Demo2 {

	@Override
	public void m() {
		// TODO Auto-generated method stub
	}

	/*@Override
	public void m1() {
		// TODO Auto-generated method stub
	}*/

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		Demo1.super.m2();
	}

	public void test()
	{
		Demo2.super.m2();
	}
	
	public static void main(String[] args) {
		new DemoImpl().m2();
		new DemoImpl().test();
		Demo1.m1();
	
	}
}
