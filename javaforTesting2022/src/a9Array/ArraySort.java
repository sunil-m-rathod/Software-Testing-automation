package a9Array;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {


		

		int x[]= {23,345,24,78,34,1};
		
		Arrays.sort(x);
	for (int i=0;i<x.length;i++)          //Ascending
	{
		System.out.println(x[i]);
		
	}
		
		Arrays.sort(x);
		for(int i=x.length-1;i>=0;i--)          //descending 
		{
			System.out.println(x[i]);
			
			
		}
		
		
		
	}

}
