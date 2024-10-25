package assignment3;

import java.util.Scanner;

public class Calculatoreg {
	
	float c,f,i;
float l;
	
	public float add(float a,float b)
	{
		c=a+b;
		return c;
		}
	public float sub(float d,float e)
	{
		f=d-e;
		return f;
	}
	public float mul(float g,float h)
	{
		i=g*h;;
		return i;
	}
	public float div(float j,float k)
	{
		l=j/k;
		return l;
	}
	
	/*
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
		float sum=op.add(x1,x2);
		float sum1 =op.add(sum,x3);
		float sub2=op.sub(sum1,x4);
		
		float mul1=op.mul(sub2,x5);
		float result=op.div(mul1,x6);
		System.out.println("result is "+result);
	
		}*/
		}
