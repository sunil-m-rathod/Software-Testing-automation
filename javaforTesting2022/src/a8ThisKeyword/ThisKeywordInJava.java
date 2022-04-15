package a8ThisKeyword;

public class ThisKeywordInJava {

	
	int j;
	public static void main(String[] args) {
		
		
		ThisKeywordInJava cij=new ThisKeywordInJava();
		
		ThisKeywordInJava cij1=new ThisKeywordInJava();
		
		cij1.j=14;
		
		System.out.println(cij1.j);
		
		ThisKeywordInJava cij2=new ThisKeywordInJava(18);
		
	}

	public ThisKeywordInJava()	//Default Contructor
	{
		this.j=12;
		this.show();
	}
	
	public ThisKeywordInJava(int j)
	{
		this.j=j;
		this.show();
	}
	
	public void show()
	{
		System.out.println("Value of j :"+j);
	}
}
