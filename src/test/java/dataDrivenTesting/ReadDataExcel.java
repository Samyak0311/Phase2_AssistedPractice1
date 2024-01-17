package dataDrivenTesting;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	// use Java and apache poi to read 	data from excel sheet and print on the console
		
	// 1. Set the path of excel sheet on your laptop
		
		String excelfilepath = "D:\\Desktop\\SKILLS\\TESTING\\excel\\testdata1.xlsx";
		
	// 2. Use java class to create an object that will store the above path
		
		File excelfile = new File(excelfilepath);
		
	// 3. Go to above location fetch the excel
		
		FileInputStream fis = new FileInputStream(excelfile);
		
	// 4.	Create an Object to read the excel -> Use Apache poi class
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
	// 5. From the workbook, fetch the sheet	
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
	//	6. Count the number of rows with data  in the sheet
		
		int rows= sheet.getLastRowNum();
		
		System.out.println("Number of rows in the sheet " + rows);
		
	// 7. Count number of columns with data
		
		// there is no method to count the number of columns
		
		// we need to use logic: go to 1st row, count the each cell with data => number of columns with data
		
	
	int col =	sheet.getRow(1).getLastCellNum();
		
	System.out.println("Number of columns in the sheet " + col);
		
		// 8. Go to each row, each column and get the cell data
		
		// write 2 for loop to go to every row , every cell and get data
		
	for	(int r =0;r<rows;r++)
	{
		XSSFRow row = sheet.getRow(r);
		
		// loop to go to each cell of the row
		
		for(int c=0; c<col;c++)
		{
			XSSFCell cell = row.getCell(c);
			
			CellType celltype = cell.getCellType();
			
			switch(celltype)
			{
			case STRING:	
			System.out.print(cell.getStringCellValue());	
			break;
			case NUMERIC:
			System.out.print(cell.getNumericCellValue());	
			break;
				
			}
			
			System.out.println(" ");
			
		}
		
		System.out.println("");
		
	}
		
		
	workbook.close();	
		
		
	}


}
