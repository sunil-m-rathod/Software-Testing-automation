package c8MAP;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {

//key and value pair store 
		
	
		HashMap<String,Integer> map=new HashMap();     //Key And Value pair
		
		 //when key is same,It will take updated value
		//map contains unique keys		
		 //key and value pair is know as entry
		
//to add::put 
		
		map.put("Sunil", 10);                      //when key is same,It will take updated value.
		map.put("Sunil",20 );                    
		map.put("Ram", 30);                      
		map.put("Ajay", 40);
		map.put("Vijay", 40);
System.out.println(map);
		
		boolean z=map.containsKey("Ram");    //containkey is method used for value is avaiable or not.if avaiable it will TRUE otherwise FALSE
		
System.out.println("value of z ="+ z );		

		
         Integer a=map.get("Sunil");          //get method is used for,It will return value for given Key.

System.out.println("Key of Sunil="+a);

      map.remove("Sunil");

System.out.println("map after remove="+map);

		
	}

}
