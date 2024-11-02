package package1;

public class Student {
	
	int rollNo;
	int age;
	
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	

	public static void main(String[] args) {
		System.out.println("debug starts");
		Student cd=new Student();
		cd.display1();
		cd.display2();
		cd.age=22;
		cd.rollNo=23;
		System.out.println("Age of the student is" + cd.age);
		System.out.println("Roll no of the student is" + cd.rollNo);
		
	

	}

}
