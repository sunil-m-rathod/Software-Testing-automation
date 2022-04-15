package c1Encapsulation;

public class Demo1 {

//first step :private data variable
	private int SSN;
	private String name;
	private int age;
	
	//GENERATE GETTER AND SETTER METHOD 
	//getter and setter method should be in Public in nature
	//Encapsulation is used to hide data
	//private variable is define.so out side of class will not access
	
	
	
	
	public static void main(String[] args) {

		Demo1 e=new  Demo1();
//set value
		e.setName("sunil rathod");
		e.setAge(26);
		e.setSSN(123456);
			
		System.out.println("name :"+e.getName());
		System.out.println("age :"+e.getAge());
		System.out.println("ssn :"+e.getSSN());
		
	}

	////GENERATE GETTER AND SETTER METHOD 
	
	public int getSSN() {
		return SSN;
	}

	public void setSSN(int sSN) {
		SSN = sSN;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
