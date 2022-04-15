package a6Switch;

public class SwitchInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwitchInJava s=new SwitchInJava();
		s.takeInputChar1('b', 'a');
		s.takeInputChar('b',3);
		
		   //s.takeInput(1);
	}
	
	public void takeInputChar1(char c,char d)
	{
		switch(c)
		{
			case 'A':
			case 'a':
				System.out.println("In case a");
				break;
			case 'b':
				System.out.println("In Case b");
				
				switch(d)
				{
				case 'a':
					System.out.println("In Case 1");
					break;
				case 'b':
					System.out.println("In Case 2");
					break;
				default:
					System.out.println("Default Case");
					break;
				}
				break;
			case '1':
				System.out.println("In Case 1");
				break;
			default:
				System.out.println("No option Found");
				break;
		}
	}
	
	public void takeInputChar(char c,int d)
	{
		switch(c)
		{
			case 'A':
			case 'a':
				System.out.println("In case a");
				break;
			case 'b':
				System.out.println("In Case b");
				
				switch(d)
				{
				case 1:
					System.out.println("In Case 1");
					break;
				case 2:
					System.out.println("In Case 2");
					break;
				default:
					System.out.println("Default Case");
					break;
				}
				break;
			case '1':
				System.out.println("In Case 1");
				break;
			default:
				System.out.println("No option Found");
				break;
		}
	}
	
	public void takeInput(int ch)
	{
		switch(ch)
		{
			case 1:
				System.out.println("In Case 1");
				break;
			case 2:
				System.out.println("In Case 2");
				break;
			default:
				System.out.println("Default Case");
				break;
		}
		System.out.println("Outside Switch");
	}
	
	
}
