package a6Switch;

public class SwitchInJava2 {

	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SwitchInJava2 s=new SwitchInJava2();
		s.grade(75);
		//s.takePercentage(39);
	}
	
	public void grade(int per)
	{
		int num=0;
		
		if(per>=75)
		{
			num=1;
		}
		else if(per>=60)
		{
			num=2;
		}
		else if(per>=40)
		{
			num=3;
		}
		else if(per>=0)
		{
			num=4;
		}
		else
		{
			num=5;
		}
		
		switch(num)
		{
			case 1:
				System.out.println("Distinction");
				break;
			case 2:
				System.out.println("First Class");
				break;
			case 3:
				System.out.println("Second Class");
				break;
			case 4:
				System.out.println("Fail");
				break;
			default:
				System.out.println("Please Enter valid choice");
				break;
		}
		
		
	}
	
	public void takePercentage(int per)
	{
		int ch=per/10;
		switch(ch)
		{
			case 10:
			case 9:
			case 8:
			case 7:
				System.out.println("Distintion");
				break;
			case 6:
				System.out.println("First Class");
				break;
			case 5:
			case 4:
				System.out.println("Second Class");
				break;
			default:
				System.out.println("Fail");
				break;
		}
		System.out.println("Outside Switch");
	}
	
}
