package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment3 {
	
	public void WriteData(int n) throws IOException
	{
		
		int i;
		File f=new File("../project1/assinmenttext.txt");
		FileWriter fr=new FileWriter(f);
		BufferedWriter b=new BufferedWriter(fr);
		
	Scanner sc= new Scanner(System.in); 
	
	for(i=1;i<=n;i++)
	{
	System.out.println("Enter a string: ");  
	String str= sc.nextLine();                 
	
	b.write(str);
	b.newLine();
	
	}
	b.close();
}
	
	public static void main(String[] args) throws IOException {
		Assignment3 a=new Assignment3();
		a.WriteData(5);
	}
}