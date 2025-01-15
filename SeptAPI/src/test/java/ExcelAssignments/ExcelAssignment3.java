package ExcelAssignments;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelAssignment3 {
	//done
	public void ReadDataBasedUponRange(int srow,int erow) throws BiffException, IOException
	{
		File f= new File("../SeptAPI/Readass.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int row=ws.getRows();
		int coloumn=ws.getColumns();
		
		
		
		for(int i=srow;i<erow;i++)
		{
			  
			for(int j=0;j<coloumn;j++)
			
					
					{
				Cell C=ws.getCell(j, i)	;
				System.out.println(C.getContents());
				
				}
				
		}
		
	}

	public static void main(String[] args) throws BiffException, IOException
	{
		
		ExcelAssignment3 ea=new ExcelAssignment3();
		ea.ReadDataBasedUponRange(2,5);
	}

}
