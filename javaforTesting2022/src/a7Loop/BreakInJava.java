package a7Loop;

public class BreakInJava {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Continue Statement");
		outer:for(int i=0;i<=2;i++)		//outer for loop
			  {
				System.out.println("i ="+i);
				for(int j=0;j<=2;j++)	//inner for loop
				{
					System.out.println("j= "+j);
					
					if(i==j)
					{
						System.out.println("Condition True");
						continue outer;
					}
				}
			}
		
		
		System.out.println("Break Statement");
		
outer:	for(int i=0;i<=2;i++)		//outer for loop
		{
			System.out.println("i ="+i);
			for(int j=0;j<=2;j++)	//inner for loop
			{
				System.out.println("j= "+j);
				
				if(i==j)
				{
					System.out.println("Condition True");
					break outer;
				}
			}
		}
	
	
	
}
}
