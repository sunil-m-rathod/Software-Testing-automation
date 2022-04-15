package c2WrapperClass;

public class WrapperClassInJava {

	public static void main(String[] args) {
	
		//converted data type into classes to make java 100% Object oriented 
		//wrapper classes is the classes,we are able to stored data type as object
		
		/* Data type and wrapper class name
		 int.....Integer
		 float......Float
		 double.....Double
		 char.......Character
		 boolean....Boolean*/
		
		// string is not data type, it is class 
		
		String str="Hello";
		System.out.println(str);
		
		int j=10;
		Integer i=new Integer(10); //value stored in object
		String str1=i.toString();  //integer Value convert in string
		
		Integer k=new Integer(10);
		String str2=k.toString();
		
		String str3=str1+str2;
		
		System.out.println(str3);
		
		
		Double d=new Double(45.34);
		int n=d.intValue();               //convert double into int
		System.out.println("Value n : "+n);
		
		Character c=new Character('A');
		n=c.valueOf(c);
		System.out.println("Value of c:"+n);
		
	}

}