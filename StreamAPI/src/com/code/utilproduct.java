package com.code;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class utilproduct {
	

	
	public static List<Product> getproducts() throws ParseException
	{
		List<Product> prdlist=new ArrayList<Product>();
		prdlist.add(new Product(10, "Rice", 70, "grains", "15/02/2023"));
		prdlist.add(new Product(11, "Sunflower", 500, "oil", "25/10/2023"));
		prdlist.add(new Product(12, "Wheat", 150, "grains", "03/11/2023"));
		prdlist.add(new Product(13, "Milk", 50, "bakery", "23/06/2023"));
		prdlist.add(new Product(14, "Cola", 50, "beverages", "07/12/2023"));
		
		return prdlist;
	}

}
