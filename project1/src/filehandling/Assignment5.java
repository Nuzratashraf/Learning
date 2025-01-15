package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assignment5 {
	
	public void ReadWrite() throws IOException   {
		
		File f1=new File("../project1/New Text Document.txt"); 
		FileReader fr1=new FileReader(f1);
		BufferedReader br1=new BufferedReader(fr1);
		String s;
		
		
		File f2=new File("../project1/assinmenttext.txt");
		FileWriter fr2=new FileWriter(f2);
		BufferedWriter br2=new BufferedWriter(fr2);
		
		while((s=br1.readLine())!=null)
		{
			br2.write(s);
			br2.newLine();
			
			
		}
		br2.close();
		
	}
	
	
	
	public static void main(String[] args) throws IOException {
		Assignment5 five=new Assignment5();
		five.ReadWrite();
	
	
	}

}
