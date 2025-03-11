package pkg





public class first {
	
	public def method1()
	{
		def a= 12;
		def b=23;
		def c=a+b;
		
		println "welcome to groovy";
		return c;
	}
public static void main(String[] args) {
	
	def ob=new first();
	ob.method1();
}
}
