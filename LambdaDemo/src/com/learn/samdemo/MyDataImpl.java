package com.learn.samdemo;

public class MyDataImpl implements MyData {
	 
    //@Override
    public boolean isNull(String str) {
        System.out.println("Impl Null Check");
 
        return str == null ? true : false;
    }
     public boolean isnull2(String str){
         return MyData.isNull(str);
     }
    public static void main(String args[]){
        MyDataImpl obj = new MyDataImpl();
        obj.print("");
        obj.isNull("abc");
        obj.isnull2("user");
    }
}
