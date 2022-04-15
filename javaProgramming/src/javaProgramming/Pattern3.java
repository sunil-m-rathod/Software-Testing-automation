package javaProgramming;

public class Pattern3 {

	public static void main(String[] args) {
		
		
		int str=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=str;j++)
			{
				System.out.print("*");
				
			}
		
			System.out.println();
			
			if(i<=2)
			{
				str++;
			}
			else
			{
				str--;
			}
		}
		
		
		

	}

}
