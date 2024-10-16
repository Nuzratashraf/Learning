package assignment3;

public class Constructoreg {
	
	
	public Constructoreg()
	{
		this(60,20,80);
		System.out.println("default constructor");
		
	}
	
	public Constructoreg(int a)
	
	{
		this(20,30);
		System.out.println("one parameterized constructor");
		
	}
	public Constructoreg(int a,int b)
	{
		this();
		System.out.println("two parameterized constructor");
		
	}
	public Constructoreg(int a,int b,int c)
	{
		
		System.out.println("three parameterized constructor");
		
	}
	
	
	public static void main(String[] args) {
		
		
		Constructoreg two=new Constructoreg(20);
		
		
		

	}

}
