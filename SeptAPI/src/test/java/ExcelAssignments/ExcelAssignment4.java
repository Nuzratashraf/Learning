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

public class ExcelAssignment4 {
	
	public void writeData() throws BiffException, IOException, RowsExceededException, WriteException
	{
		File f= new File("../SeptAPI/writeass.xls");
		
		WritableWorkbook wk=Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("sheet1", 0);
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=0;i<=5;i++)
				{
				for(int j=0;j<=5;j++)
				{
					System.out.println("Enter the values: ");
					String value=sc.next();
					Label L=new Label(j, i, value);
					ws.addCell(L);
				}
				
				}
		wk.write();
		wk.close();
		
	}  

	public static void main(String[] args) throws RowsExceededException, BiffException, WriteException, IOException {
		
		ExcelAssignment4 four=new ExcelAssignment4();
		four.writeData();
		
		
		
		

	}

}
