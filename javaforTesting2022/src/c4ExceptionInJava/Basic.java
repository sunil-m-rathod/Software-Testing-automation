package c4ExceptionInJava;

public class Basic {

	//error : syntax error	                                        :compile time check
	//exception :stop the execution or terminate the program        :at run time 
	
	//when got exception next line program not execute,Although the next line program will be correct
	//need to handle exception 
	
	
	
	/*  DIFFERENT EXCEPTION */
	
	//Arithmetic exception :/by zero
	//ArrayIndexoutofBoundException
	//FileNotFoundException
	//InterruptedException
	//IOException
	//NullPointerException
	//NoSuchElementException....when element not locate in selenium 
	//ElementNotInteractable....
	//ScriptTimeoutException
	
	
	//for Exception handling we have block called try catch
	//when catch block execute: when  thrown object of catch block and object from catch block are same 
	//if there is mismatch in exception then JVM will handle exception and terminate the execution
	//due to try and catch block,it goes on execute the next line 
	//when we don't know the name of exception then we put (Exception)catch block
	//there must be at least 1 catch block
	
	/*try 
	{
	
		statement  (may be exception come in statement) ;  object will be thrown will have exception	
			 	
	}
	catch (type of exception object) */
	
	
}
