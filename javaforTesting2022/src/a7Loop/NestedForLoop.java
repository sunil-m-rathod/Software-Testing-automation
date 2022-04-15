package a7Loop;

public class NestedForLoop {
	public static void main(String[] args) {
	
		//Nested For Loop
		
		for(int i=5;i>=1;i--)		//outer for loop
		{
			for(int j=1;j<=i;j++)	//inner for loop
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		for(int i=1;i<=5;i++)		//outer for loop
		{
			for(int j=5;j>=i;j--)	//inner for loop
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
		for(int i=1;i<=5;i++)		//outer for loop
		{
			for(int j=1;j<=i;j++)	//inner for loop
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		for(int i=5;i>=1;i--)		//outer for loop
		{
			for(int j=1;j<=5;j++)	//inner for loop
			{
				if(j>=i)
				{
					System.out.print(j+"");
				}
					
				else
				{
					System.out.print("");
				}
				
			}
			System.out.println("");
		}
	}
}
