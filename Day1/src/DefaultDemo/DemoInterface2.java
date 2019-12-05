package DefaultDemo;

public interface DemoInterface2 {
	public void hi();
	public default void print(){
		System.out.println("This is a sample program");
	}
}
