package DefaultDemo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoImpl1 d1=new DemoImpl1();
		DemoImpl2 d2=new DemoImpl2();
		d1.hello();
		d1.print();
		d2.hello();
		d2.print();
		DemoInterface.show();
	}

}
