package b8FinalKeyword;

public class FinalizeKeyword4 {

	public static void main(String[] args) {
		
	//Finalize(); is method to remove the unused reference object.to free space.
	//it is done automatically 
	//make java memory efficient 
	//JVM done it automatically 
		
		FinalizeKeyword4 f1 =new FinalizeKeyword4();
		
		FinalizeKeyword4 f2 =new FinalizeKeyword4();
		
		f1=null;
		f2=null;
		
	}

}
