package b6AccessModifier;

public class B {

	public static void main(String[] args) {
	
		A a1 = new A();
		//private method can not access in other class within same package 
		//Default method accessible	 in same package
		//only Public method is accessible, when we create object in other package (Private,Default,Protected not accessible)
		//When class is inheritance then Public and protected method is accessible	
		
		a1.test_default();
		a1.test_protected();
		a1.test_public();
		
		
	}

}
