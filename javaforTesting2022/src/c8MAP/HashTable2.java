package c8MAP;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTable2 {

	public static void main(String[] args) {

//it is similar to hash map, but Hash table is synchronized
//store value on the basis on key and value pair		
//key...>object...>hashCode....>value	
		
		
		Hashtable map=new Hashtable();     
		
		//to add::put 
				
				map.put("Sunil", 10);                      //when key is same,It will take updated value.
				map.put("Sunil",20 );                     
				map.put("Ram", 30);
				map.put("Ajay", 40);
		
	//create clone copy or shallow copy 	
		
	Hashtable map1=new Hashtable(); 
	
	map1=(Hashtable)map.clone();
	
	
	System.out.println(map);
	System.out.println(map1);
	
	map.clear();
	
	System.out.println(map);
	System.out.println(map1);
	}

}
