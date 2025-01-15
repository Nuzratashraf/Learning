package filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Assignment4 {
	
	public void WriteDataInRange(int a,int z) throws IOException
	{
		int i;
		File f=new File("../project1/New Text Document.txt");
		FileWriter fr=new FileWriter(f);
		BufferedWriter br=new BufferedWriter(fr);
		Scanner sc=new Scanner(System.in);
		for(i=1;i<=15;i++)
		{
		
			if((i>=a)&&(i<=z))
				{
			
					System.out.println("Enter the strings");
			
					String str=sc.nextLine();
					br.write(str);
					br.newLine();
			
				}
				
		
		}br.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		 Assignment4 four=new Assignment4();
		 four.WriteDataInRange(3, 7);
	}

}
