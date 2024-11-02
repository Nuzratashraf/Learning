package assignment3;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {

		System.out.println("enter the values");
		Scanner s=new Scanner(System .in);
		int x1=s.nextInt();
		int x2=s.nextInt();
		int x3=s.nextInt();
		int x4=s.nextInt();
		int x5=s.nextInt();
		int x6=s.nextInt();
		
		Calculatoreg op=new Calculatoreg();
		float mul1=op.mul(x1,x2);
		float sub2=op.sub(mul1,x3);
		float mul2=op.mul(sub2,x4);
		float sum=op.add(mul2,x5);
		
		
		float result=op.div(sum,x6);
		System.out.println("result is "+result);
		System.out.println("checking 1");
		System.out.println("777ggg");
		

	}

}
