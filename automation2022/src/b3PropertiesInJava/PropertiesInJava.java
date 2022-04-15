package b3PropertiesInJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesInJava {

		
	public static void main(String[] args) throws IOException {
	
//file properties reduce same work, 		
		

      
		   File f=new File("C:\\Users\\sunil\\eclipse-workspace\\automation2022\\driver\\test.properties");
		   FileInputStream read=new FileInputStream(f);     //to read file java has class FileInputStream
		
		   Properties p=new Properties();
		   p.load(read);
		   
		  String str=p.getProperty("base_url");
		
		   System.out.println(str);
		   System.out.println(p.getProperty("usr"));
		   System.out.println(p.getProperty("pass"));
		   
		   FileOutputStream write=new   FileOutputStream(f);   //to change variable in properties
		   p.setProperty("usr","sunilrathod");
		   p.setProperty("pass","smr");
		   p.store(write, str);                              //to store 
		   
		   
		   
	}
  
}
