package a6ConditionHandling;

public class CheckEvenAndOdd {

	public static void main(String[] args) {
		
		//take 1 integer argument
		//if number is negative we need to print as "Negative number"
		//if number is zero we need to print as zero
		//if number is Positive we need to print as "Positive number"
		//is number is positive check even and odd
	
		CheckEvenAndOdd G = new CheckEvenAndOdd();
		G.Numb(-5);
		
	}

	public void Numb(int a) {
		
		if(a<0) {
			
			System.out.println("Negative number");
		}
		else if(a==0) {
			System.out.println("zero number");		
		}
		
		else if(a%2==0) {
			
			System.out.println("positive even number");		
		}

		else{
			
			System.out.println("positive Odd number");		
		}
			
		
	}
}
