package RunnableLambdaDemo;

public class AnonymousClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread(()->System.out.println("A thread created and running")).start();
	}

}
