package c4ExceptionInJava;

//for Buffered Reader need to import 
import java.io.BufferedReader;   
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ThrowsKeywordInJava {

	//Instead of Try and Catch block Throws used.Throws keyword are used for exception,we can provide multiple exception also \
	//throws not handle exception
	//throws keyword mostly used for Checked exception
	
	public static void main(String[] args) throws IOException {      //throws keyword mostly used for Checked exception
		

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //after scanner,BufferedReader is another method taking input from user
		System.out.println("Enter String :");
		String str=	br.readLine();			//checked exception
		
		//type checked and unchecked exception.if compiler recognize exception at the time of execution that is checked exception.
		//if compiler not recognize exception at the time of execution it is unchecked exception
		
		int a=Integer.parseInt(str);
		
		System.out.println("Entered String is:"+str);
		
		System.out.println("Test");
		
		
	}

}