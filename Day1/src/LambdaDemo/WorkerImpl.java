package LambdaDemo;

public class WorkerImpl  {

//	private TaskManager tm;
		
//	public WorkerImpl(TaskManager tm) {
//		
//		this.tm = tm;
//	}

	public static void doSomething(TaskManager tm){
		tm.doWork();
	}
	
	public static void main(String[] args) {
		doSomething(new TaskManager() {
			
			@Override
			public void doWork() {
				System.out.println("TaskManager invoked using anonymous class");
			}
		});
		
		doSomething(()->{System.out.println("TaskManager invoked using lambda expression");});
	
}
}