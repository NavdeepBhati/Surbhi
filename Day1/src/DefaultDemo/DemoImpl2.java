package DefaultDemo;

public class DemoImpl2 implements DemoInterface, DemoInterface2 {

	@Override
	public void hello() {
		// TODO Auto-generated method stub
		System.out.println("Hello2");
	}
	
	@Override
	public void print() {
		System.out.println("Welcome from 2");
	}

	@Override
	public void hi() {
		// TODO Auto-generated method stub
		System.out.println("Hi");
	}


}
