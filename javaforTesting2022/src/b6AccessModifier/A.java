package b6AccessModifier;

//Access modifier in java Private,Public,Default,Protected
public class A {
	
	private int a;        //private accessibility 
	int b;               //default accessibility 
	protected int n;     //	protected accessibility 
	public int m;       //public accessibility 
	
	public void test_public() {
		System.out.println("value of a =" + a);
	}

	private void test_private() {                           //private method can not access out of class	
		System.out.println("value of a =" + a);
	}

   void test_default() {
		System.out.println("value of a =" + a);
	}

	protected void test_protected() {
		System.out.println("value of a =" + a);
	}

}
