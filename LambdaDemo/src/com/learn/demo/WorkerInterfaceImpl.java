package com.learn.demo;

public class WorkerInterfaceImpl {

	public static void execute(WorkerInterface iw)
	{
		iw.doSomeWork();
	}
	
	public static void main(String[] args) {
		execute( new WorkerInterface() {
			@Override
			public void doSomeWork(){
				System.out.println("Worker using Anonymous class");
			}
		});
	
	execute( () -> System.out.println("Worker Using lamda expression ") );
	
	new Thread (new Runnable(){
		public void run(){
			System.out.println("Start Thread");
		}
	}).start();
	
	new Thread (() -> System.out.println("start a new thread using lambda")).start();
	
	}
}
