package Interface;

public abstract class Shape implements printable {
	
	public void print()
	{
		System.out.println("this is implemented menthod in shape");
	}
	
	public abstract void area();
	
}
