package com.gen;

public class Tester_gen {

	public static void main(String[] args) {
		
//		Genric<Integer> obj=new Genric<Integer>(10);
//		System.out.println(obj);
//		
//		Genric<String> obj1=new Genric<String>("JAVA");
//		System.out.println(obj1);
//		
		Generic2<Integer> o1=new Generic2<>(10,50);
		System.out.println(o1.add());
		Generic2<Double> o2=new Generic2<>(150.2,240.4);
		System.out.println(o2.add());
		Generic2<String> o3=new Generic2<>("abc","pqr");
		System.out.println(o3.add());
		//obj.setVar1(20);
		
		

	}

}
