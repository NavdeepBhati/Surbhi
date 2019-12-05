package newdemo1;

import java.util.*;
import java.util.stream.Collectors;

public class Ex01 {
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList = new ArrayList<Float>();  
        for(Product product: productsList){  
              // filtering data of list  
            if(product.price<30000){  
                productPriceList.add(product.price);    // adding price to a productPriceList  
            }  
        }  
        System.out.println(productPriceList); 
      
        List<Float> productPriceListNew= productsList.stream().filter(p -> p.getPrice() > 30000)
        					.map(Product::getPrice).collect(Collectors.toList());
        System.out.println("Printing prices greater than 30k");
        System.out.println(productPriceListNew);
        
        float minPrice= productsList.stream().map(Product::getPrice).min(Comparator.comparing(Float::valueOf)).get();
        System.out.println("Min price: "+ minPrice);
        float maxPrice= productsList.stream().map(Product::getPrice).max(Comparator.comparing(Float::valueOf)).get();
        System.out.println("Max price: "+ maxPrice);
    }  

}
