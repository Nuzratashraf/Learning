package org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesHandle {
	
	public static Properties LoadProperties(String path) throws IOException
	{
		
		File f= new File(path);
		FileReader fr=new FileReader(f);
				
		Properties pr=new Properties();
		pr.load(fr);
		return pr;
		
	}

}
