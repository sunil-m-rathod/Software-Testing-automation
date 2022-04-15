package a6ConditionHandling;

public class LogicalANDandOR {

	public static void main(String[] args) {


	    //method which take 1 integer argument
	    //Number divisible by both 5 and 7, print (divisible by both)
		//number divisible by 5 only then print (divisible by 5 only)
		//number divisible by 7 only then print (divisible by 7 only)
		//if number is not divisible 5 nad 7 then print ( not divisible)

		LogicalANDandOR o= new LogicalANDandOR();
		o.Logical(35);
		
	}
	
	public void Logical(int a) {
		
		if(a%7==0 && a%5==0 ) {                      //logocal AND operator &&  for OR ||
			System.out.println("divisible by both");
		}
		else if(a%7==0) {
			System.out.println("divisible by 7 only");
		}
		else if(a%5==0) {
			System.out.println("divisible by 5 only");
		}
		else {
			System.out.println("not divisible");
		}
	}

}

