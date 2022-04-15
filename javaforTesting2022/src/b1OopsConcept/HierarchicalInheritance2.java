package b1OopsConcept;

//Hierarchical Inheritance2 (CHILD 1) AND  HierarchicalInheritance(PARENT)

public class HierarchicalInheritance2  extends HierarchicalInheritance {

		public static void main(String[] args) {
			
			HierarchicalInheritance2 P =new HierarchicalInheritance2();
			
			P.BM();
			P.MM();
		}

		
		public void BM() {
			System.out.println("A CLASS BM METHOD");
		}
}

