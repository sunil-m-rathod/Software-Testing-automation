package c4ExceptionInJava;

import java.util.Scanner;

public class ExceptionInJava {

	public static void main(String[] args) {
		
		
		
		int a,b,c=1;
		Scanner sc=new Scanner(System.in);           //creating object of scanner for taking input 
		
		System.out.println("Enter two numbers :");
		System.out.println("Enter a :");
		a=sc.nextInt();
		
		System.out.println("Enter b :");
		b=sc.nextInt();
		
	//try and catch block to handle exception	
		try
		{
			c=a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("Value of C :"+c);
		
		c=a+b;
		
		System.out.println("Addition :"+c);
	}

}