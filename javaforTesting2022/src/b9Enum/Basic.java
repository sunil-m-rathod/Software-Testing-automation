package b9Enum;


public class Basic {

	
public enum month{January,February,March,April,May,June};  //pre define set of values(user only select this values)
	                                                       
	public static void main(String[] args) {
		
		
		month n=month.April;
		
		switch(n)
		{
			case January:
				System.out.println("Selected Month is January");
				break;
			case April:
				System.out.println("Selected Month is April");
				break;
		default: System.out.println("option not avaiable");
			break;
		}
	}

}

