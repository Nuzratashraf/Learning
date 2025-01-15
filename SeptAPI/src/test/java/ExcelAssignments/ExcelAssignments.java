package ExcelAssignments;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelAssignments {
//assignment 1.......	done
	public void ReadDataBasedRowNoAndColoumnNo(int row,int coloumn) throws BiffException, IOException
	{
	File f=new File("../SeptAPI/Readass.xls");
	Workbook wk=Workbook.getWorkbook(f);
	Sheet ws=wk.getSheet(0);
	
	Cell c1=ws.getCell(coloumn, row);
	System.out.println(c1.getContents());


	}
	
	
		
	

	public static void main(String[] args) throws BiffException, IOException
	{
		ExcelAssignments ea=new ExcelAssignments();
		ea.ReadDataBasedRowNoAndColoumnNo(3,1);
		
		
		
	}

}
