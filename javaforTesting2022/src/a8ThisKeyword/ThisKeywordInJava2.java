package a8ThisKeyword;

public class ThisKeywordInJava2 {

	
	int j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisKeywordInJava2 cij=new ThisKeywordInJava2();
		
		//ThisKeywordInJava2 cij1=new ThisKeywordInJava2(18);
		
	}
	
//	public ThisKeywordInJava2(B b2)
	{
		System.out.println("In This Class Constructor ");
//		b2.n=34;
	}

	public ThisKeywordInJava2()	//Default Contructor
	{
		this(34);
		this.show();
	}
	
	public ThisKeywordInJava2(int j)
	{
		this.j=j;
		this.show();
	}
	
	public void show()
	{
		System.out.println("Value of j :"+j);
		show2(this);
	}
	
	public void show2(ThisKeywordInJava2 cij3)
	{
		System.out.println("Test Method");
	}
}
