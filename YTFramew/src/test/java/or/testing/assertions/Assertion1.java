package or.testing.assertions;

public class Assertion1 {

	public static Boolean assert1(int actual,int expected)
	{
	if(actual==expected)	
	{
		System.out.println("Status code is matching");
		return true;
	}
	else
	{
		System.out.println("Status code is not matching");
		return false;
	}
	}
}
