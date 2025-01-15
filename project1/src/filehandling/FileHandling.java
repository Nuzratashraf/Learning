package filehandling;

import java.io.File;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class FileHandling 
{
	
	
	public void readFile() throws IOException {
		
    File f=new File("../project1/New Text Document.txt");
    FileWriter fw=new FileWriter(f);
    BufferedWriter fr=new BufferedWriter(fw);
    fr.write("cypress is also good");
    fr.newLine();
    fr.write("cypress also has demand");
    fr.close();
		/*FileReader fr=new FileReader(f);
		
		
		BufferedReader b=new BufferedReader(fr);
		String s;
		while((s=b.readLine())!=null)
			
		{
			System.out.println(s);
		}
		
		*/
		
		/*int a;
		
		while((a=fr.read())!=-1)
		{
			
			System.out.print((char)a);
		}
		*/
	}
		public static void main(String[] args) throws IOException
		{
			
			FileHandling f=new FileHandling();
			f.readFile();
	}

}

