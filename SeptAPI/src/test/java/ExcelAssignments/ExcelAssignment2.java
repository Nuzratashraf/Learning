package ExcelAssignments;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelAssignment2 {
//done	
	public void ReadDataBasedUponRow(int row) throws BiffException, IOException
	{
		File f= new File("../SeptAPI/Readass.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();
		int c=ws.getColumns();
		
		
		
		for(int i=0;i<r;i++)
		{
			 if(i==row)
			 {
			for(int j=0;j<c;j++)
			
					
					{
				Cell C1=ws.getCell(j, i)	;
				System.out.println(C1.getContents());
				}
				
		} 
		}
		
	}

	public static void main(String[] args) throws BiffException, IOException
	{
		
		ExcelAssignment2 ea=new ExcelAssignment2();
		ea.ReadDataBasedUponRow(2);
	}


}
