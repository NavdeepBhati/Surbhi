package FunctionalDemo;

@FunctionalInterface
public interface Demo1 {

	public void m1();
	//public void m2();
	public String toString();
	public default String sayHello(String s){
		return "Welcome"+s;
	}
		
}


