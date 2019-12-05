package newdemo;

import java.util.Optional;

public class MobileTesterWithOptional {
	
	public static void main(String[] args) {

//		ScreenResolution resolution = new ScreenResolution(750,1334);
//		DisplayFeatures dfeatures = new DisplayFeatures("4.7", resolution);
//		Mobile mobile = new Mobile(2015001, "Apple", "iPhone 6s", dfeatures);
		ScreenResolution screenResolution=new ScreenResolution(750,1224);
		DisplayFeatures displayFeatures=new DisplayFeatures("10", Optional.of(screenResolution));
		Mobile mobile=new Mobile(11220, "Apple", "iPhone 7 plus",Optional.of(displayFeatures) );
				
		MobileService mService = new MobileService();
		
		int mobileWidth = mService.getMobileScreenWidth(Optional.of(mobile));
		System.out.println("Apple iPhone 7 plus Screen Width = " + mobileWidth);
		
		 Mobile mobile2 = new Mobile(2015001, "Apple", "iPhone 6s", Optional.empty());       
		    int width2 = mService.getMobileScreenWidth(Optional.of(mobile2));
		    System.out.println("Apple iPhone 16s Screen Width = " + width2);
		
		

	}

}
  
