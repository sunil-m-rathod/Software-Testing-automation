package b1OopsConcept;

public class Cinheritance extends Ainheritance {            //c child  of Class A

	public static void main(String[] args) {
		
		
	//B class..>A class..>C class  MILTI LEVEL INHERITANCE
		
		Cinheritance O = new Cinheritance();
			O.dislay();                       //A method
			O.show();                         //B method
			O.raw();                          //c method
		
		
		}
	
		public void raw() {
			
			System.out.println("CLASS C method raw");
			
		}
				
		
}


