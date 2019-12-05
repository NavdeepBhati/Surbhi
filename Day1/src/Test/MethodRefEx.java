package Test;

import java.util.Arrays;

public class MethodRefEx {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String [] stringArray= {"a","b","c","abc","xyz","a","Pooja","abc1","b","abc2"};

		Arrays.sort(stringArray, String::compareToIgnoreCase);
	}

}
