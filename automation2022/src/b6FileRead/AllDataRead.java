package b6FileRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AllDataRead {

	public static void main(String[] args) throws IOException {


		String path=System.getProperty("user.dir");
		String final_path =path +"\\driver\\file.xlsx";
		
		
		
		File f=new File(final_path);         //provide path of file 
		FileInputStream fi=new FileInputStream(f);
//to display all data of excel,need to create array list Class
		
//if we want to display directly then below is not use	
		//ArrayList<String> key=new ArrayList();
		//ArrayList<String> value=new ArrayList();
	
		
		XSSFWorkbook workbook =new XSSFWorkbook(fi);   //Creating object to read excel file
	    XSSFSheet sheet = workbook.getSheet("sheet1");
	  
	    int n= sheet.getLastRowNum(); //show number of rows

	    for(int i=0;i<n;i++) {
	    	
	    	 
  //	    key.add(sheet.getRow(i).getCell(0).getStringCellValue();)
  //       value.(sheet.getRow(i).getCell(1).getStringCellValue();)
	    	
			 String str1= sheet.getRow(i).getCell(0).getStringCellValue(); //i th and 0 th cell value stored in arraylist 
			
			 String str2 =sheet.getRow(i).getCell(1).getStringCellValue(); //i th and 1 th cell value stored in arraylist 
			
			 System.out.println(str1+" : "+str2);
	    }
	    
	   //  System.out.println(key+" : "+value);
	   
		 
		
		
		
		
		
		
		
		
		
		

	}

}
