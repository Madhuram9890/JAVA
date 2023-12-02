package com.client;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.code.Product;
import com.code.utilproduct;

public class testerAPI {

	public static void main(String[] args) throws ParseException {
		
		List<Product> shop=new ArrayList<Product>();
		shop=utilproduct.getproducts();
		
//		for(Product l:shop)
//			System.out.println(l);
		
		shop.stream()
		.filter(p->p.getPrice()>60)
		.forEach(p->System.out.println(p));
		
		System.out.println("--------------------------------");
		shop.stream()
		.filter(p->p.getPname().toLowerCase().contains("s"))
		.forEach(a->System.out.println(a));
		
		
		shop.stream()
		.map(x->x.getPname())
		.forEach(q->System.out.println(q));

}
}
