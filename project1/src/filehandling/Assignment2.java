package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment2 {
	
	
	
	

	public void ReadDataOfRange(int a,int z) throws IOException
	{
		int i=0;	
		File f=new File("../project1/assignment2.txt");
	     FileReader fr=new FileReader(f);
		  BufferedReader b=new BufferedReader(fr);
		  String s;
		  while((s=b.readLine())!=null)
		  {
			  i++;
			  if((i>=a)&&(i<=z))
			  {
				  System.out.println(s);
			  }
		  }
		    
		    	
		    	
	}
	
	
	public static void main(String[] args) throws IOException {
		
		
		Assignment2 rd=new Assignment2();
		rd.ReadDataOfRange(2,4);
	}

}
