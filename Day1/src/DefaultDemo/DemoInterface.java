package DefaultDemo;

@FunctionalInterface
public interface DemoInterface {

	public void hello();
	public default void print(){
		System.out.println("Welcome to the program");
	}
	
	static public void show(){
		System.out.println("Do not change this message");
	}
}

