package model;

public class Department {
	private int id;
	protected String name;
	int count;						//default
	public String companyName;
	
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(count);
		System.out.println(companyName);
	}
}
