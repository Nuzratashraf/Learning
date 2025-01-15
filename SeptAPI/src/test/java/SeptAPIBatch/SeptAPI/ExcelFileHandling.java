package SeptAPIBatch.SeptAPI;

import java.io.File;

import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelFileHandling {
	
public void readExcelData() throws BiffException, IOException, RowsExceededException, WriteException
	{
		File f= new File("../SeptAPI/inputnew.xls");
		Workbook wk=Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();
		int c=ws.getColumns();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
			Cell c1=ws.getCell(j,i);
			System.out.println(c1.getContents());
			}
		}
		
	}  


	
 /* public void readExcelData() throws BiffException ,IOException, RowsExceededException, WriteException
	{
		
		File f=new File("../SeptAPI/input.xls");
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("deepak", 0);
		for(int i=0;i<=5;i++)
				{
				for(int j=0;j<=5;j++)
				{
					Label L=new Label(j, i, "DC");
					ws.addCell(L);
				}
				
				}
		wk.write();
		wk.close();
		
		
		
	}  */

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		
		ExcelFileHandling e=new ExcelFileHandling();
		e.readExcelData();
		
		
		
		

	}

}
