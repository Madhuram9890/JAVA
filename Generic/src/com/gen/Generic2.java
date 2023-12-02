package com.gen;

public class Generic2 <T extends Object>{
	
	private T a;
	private T b;
	
	public Generic2(T a, T b) {
		super();
		this.a = a;
		this.b = b;
	}

	public T add()
	{
		if(a instanceof Integer)
		{
			 return (T) (Integer) ((int)a+(int)b);  
		}
		else if(a instanceof Double)
		{
			return (T) (Double) ((double)a + (double)b); 
		}
		else if(a instanceof String)
		{
			return (T)  (a.toString()+ b.toString()); 
		}
		return null;
		
	}

}
