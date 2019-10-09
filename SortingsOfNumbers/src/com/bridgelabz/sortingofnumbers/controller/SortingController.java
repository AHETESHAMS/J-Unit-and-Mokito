package com.bridgelabz.sortingofnumbers.controller;

import com.bridgelabz.sortingofnumbers.utility.SortingUtility;

public class SortingController 
{
	public void main(String []args)
	{
		int array[]= {5,4,3,7,2,1};
		new SortingUtility().bubbleSort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+",");
		}
		
		new SortingUtility().insertionSort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+",");
		}
	}
}
