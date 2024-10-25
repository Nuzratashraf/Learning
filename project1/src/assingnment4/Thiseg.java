package assingnment4;

public class Thiseg {
	
	
	public void method()
	{
		this.method3(2,3,4);
		System.out.println("default");
	}
	
	public void method1(int a)
	
	{
		this.method2(33,66);
		System.out.println("one parameterized");
	}
	public void method2(int a,int b)
	{
		this.method();
		System.out.println("two parameterized");
	}
	public void method3(int a,int b,int c)
	{
		System.out.println("three parameterized");
	
	}
	
	public void method4(int a,int b,int c,int d)
	{
		this.method1(30);
		System.out.println("four parameterized");
	}
	
	

	public static void main(String[] args) {
		
		Thiseg op=new Thiseg();
		
		op.method4(5,4,3,8);
		
				
		

	}

}
