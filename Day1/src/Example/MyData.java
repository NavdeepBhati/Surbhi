package Example;

public interface MyData {
	 
    default public void print(String str) {
        if (!isNull(str))
            System.out.println("MyData Print::" + str);
    }
 
    static public boolean isNull(String str) {
        System.out.println("Interface Null Check");
 
        return str == null ? true : "".equals(str) ? true : false;
    }
     
}