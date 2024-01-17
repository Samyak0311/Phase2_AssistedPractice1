package dataDrivenTesting;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteTOExcel {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	XSSFWorkbook workbook = new XSSFWorkbook();
	
	 XSSFSheet sheet=  workbook.createSheet("SheettestData");
	
	 Object [][] data = {{"Name","Location"},
			 				{"Sonal","Gurgaon"},
	 						{"Ravi","Hyderabd"},
	 						{"Marc","London"},
	 						{"Peter","NewYork"}};
	
	 // see how many rows have to created to write the data
	 
	       int rows = data.length; //5
	       int col = data[0].length; // 2 columns
	
	 for(int r=0;r<rows;r++)
	 {
		XSSFRow row = sheet.createRow(r);
		
		for(int c=0;c<col;c++)
		{
			XSSFCell cell = row.createCell(c);
			// get data from the above array and write in to the cell
			
			Object cellvalue = data[r][c];
			
			// insert the value in the cell
			
			cell.setCellValue((String)cellvalue);
			
		}
		
		
	 }
	
	
	 // give the location of the excel
	
	 String excelfilepath = "D:\\Desktop\\SKILLS\\TESTING\\excel\\Registerdata.xlsx";
	
	 File excelPath = new File(excelfilepath);
	
	 FileOutputStream fos = new FileOutputStream(excelPath);
	
	 workbook.write(fos);
	
	 workbook.close();
	
	 System.out.println("Task completed");
	 }




}
