package com.learn.streaming;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductImpl {

	public static List<Product> getProductList()
	{
		List<Product> pList = new ArrayList<>();
		
		pList.add(new Product("IBM",10,12.50,"EQTY"));
		pList.add(new Product("MSFT",20,14.50,"BOND"));
		pList.add(new Product("AMZN",30,18.50,"EQTY"));
		pList.add(new Product("GOOG",40,20.75,"EQTY"));
		pList.add(new Product("VMWARE",50,30.20,"EQTY"));
		pList.add(new Product("REDHAT",60,44.50,"BOND"));
		pList.add(new Product("WALMART",70,112.50,"WARRANT"));
		pList.add(new Product("HSBC",80,125.50,"WARRANT"));
		pList.add(new Product("BARC",90,30.50,"MUNIS"));
		pList.add(new Product("GS",100,60.80, "MUNIS"));
		
		return pList;
        
        
	}
	public static void main(String[] args) {
		
		
		double d = getProductList().stream().map(p->p.getPrice()).reduce(0.0,(a,b)->a+b);
		
		 Map<String, List<Double>> namesByCategory =
				 getProductList()
		                .stream()
		                .collect(
		                     Collectors.groupingBy(
		                         Product::getCategory,                      
		                         Collectors.mapping(
		                             Product::getValue,
		                             Collectors.toList())));
		 
		 List<Map.Entry<String, List<Double>>>
         namesByCategoryList = 
             new ArrayList<>(namesByCategory.entrySet());
                  
		 namesByCategoryList
         .stream()
         .forEach(e -> {
             System.out.println("Category: " + e.getKey());
             e.getValue()
                 .stream()
                 .forEach(f -> System.out.println(f)); });
		                     
		
	}

}
