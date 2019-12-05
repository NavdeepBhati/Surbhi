package Example;
public class MyDataImpl implements MyData {
 
	//@Override
    public boolean isNull(String str) {
        System.out.println("Impl Null Check");
 
        return str == null ? true : false;
    }
     public boolean isnull2(String str){
    	 return MyData.isNull(str);
     }
     
     @Override
    public void print(String str) {
    	System.out.println("Local method called");
    	MyData.super.print("a");
    }
     
  
     
    public static void main(String args[]){
        MyDataImpl obj = new MyDataImpl();
        obj.print("");
        obj.isNull("abc");
        obj.isnull2("user");
    }
}
