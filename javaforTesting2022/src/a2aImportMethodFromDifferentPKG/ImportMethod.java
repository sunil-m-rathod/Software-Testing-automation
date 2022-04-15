package a2aImportMethodFromDifferentPKG;

import a2Basic.ObjectCreate;//import file from different package 

 //import a2Basic.*;    //import file from different package (* indicate all file)


public class ImportMethod {

	public static void main(String[] args) {
		
		
				// Call method from different package and run
				// Need to import file as (Package name.classname)
				
		ObjectCreate a11 =new ObjectCreate();  
			  a11.Ram();                           // TO CALL Sam method 
			                                         
			  a11.Sam();                            // To call Ram method
				 
				
			}

		}
		 
	


