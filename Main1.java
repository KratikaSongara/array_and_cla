package com.masai1;

import java.util.Arrays;

public class Main{
	public int[] findAndReturnPrimeNumbers(int[] inputArray){
		int z=0;
		int[] secondArray = new int[inputArray.length];
		for(int i=0; i<inputArray.length; i++) {
			int count=0;
			for(int j=1; j<=inputArray[i]; j++) {
				if(inputArray[i]%j==0) {
					count++;
				}
			}
			if(count==2)
			{
				secondArray[z]=inputArray[i];
				z++;
			}
		}
		return secondArray;
		//write the logic to iterate through the supplied inputArray and
		//determine each element whether it is prime or not
		//create a second array of int
		//if any number is prime inside the inputArray then add that number inside the second
		//array
		//and return the second array
		//if no prime number is found then return the empty array.
	}

	public static void main(String[] args){
		Main obj = new Main();
		//Create the object of Main class
		int[] arr = {10,12,5,50,11,14,15};
		int[] x=obj.findAndReturnPrimeNumbers(arr);
		int count=0;

		for(int i=0; i<x.length; i++)
		{
			if(x[i]!=0)
			{
				System.out.println(x[i]);
			}
			else if(x[i]==0)
			{
				count++;
				if(count==x.length)
				{
					System.out.println("Prime number not found in the supplied Array");
				}
			}
		}
			
//			System.out.println(Arrays.toString(x));
//		}
		//on the object of Main class call the findAndReturnPrimeNumbers method
		//by supplying the following array as the parameter
//		int[] arr = {10,12,5,50,11,14,15};
		//print each element from the returned array of findAndReturnPrimeNumbers method
		//if findAndReturnPrimeNumbers method returns an empty array then print the following
//		message:
			// "Prime number not found in the supplied Array"
	}
}
