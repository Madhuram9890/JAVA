package BL;

public class Employee {
	private String name;
	private int empid;
	private static int id;
	protected double salary;
	
	static
	{
		id=10;
	}
	
	
	public double netsal()
	{
		return salary;
	}

	public Employee() {
		super();
		this.name="Akshay";
		this.salary=10000;
		empid=id++;
	}

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
		empid=id++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
	
	
	
	
	
}
