package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment1 {
	
	public void ReadData(int n) throws IOException
	{
		
		File f=new File("../project1/assignment2.txt");
		FileReader ff=new FileReader(f);
		BufferedReader a=new BufferedReader(ff);
	   
	    int i=0;
	    String s;
	    
	    while((s=a.readLine())!=null)
		{
	    	i++;
			if(i==n)
			{
				System.out.println(s);
			}
			
		
			}
	}
		
	    	
	public static void main(String[] args) throws IOException {
		
		Assignment1 s=new Assignment1();
		s.ReadData(3);
		
}

}
