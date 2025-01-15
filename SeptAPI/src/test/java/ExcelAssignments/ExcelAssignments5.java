package ExcelAssignments;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelAssignments5 {
	
	public void CopyPaste() throws BiffException, IOException, RowsExceededException, WriteException
	{
		File f= new File("../SeptAPI/writeass.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();
		int c=ws.getColumns();
		String s;
		for(int i=0;i<r;i++)
		{
			
			for(int j=0;j<c;j++)
			{
			Cell c1=ws.getCell(j,i);
			
			System.out.println( c1.getContents()); 
			
			}
		}
		
		File f1= new File("../SeptAPI/Readass.xls");
		
		WritableWorkbook wk1=Workbook.createWorkbook(f1);
		WritableSheet ws1=wk1.createSheet("sheet2", 0);
		
		
		
		for(int i=0;i<=5;i++)
				{
				for(int j=0;j<=5;j++)
				{
					

					Label L=new Label(j, i, );
					ws1.addCell(L);
				}
				
				}
		wk1.write();
		wk1.close();
		
		
	}
	

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		ExcelAssignments5 five=new ExcelAssignments5();
		five.CopyPaste();
		
		
	}

}
