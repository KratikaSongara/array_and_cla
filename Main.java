package com.masai;

import java.util.Arrays;
import java.util.Scanner;

class Main{
	
	public static String reversString(String input){
		//write the logic
		String[] input2 = input.split("");
//		String[] new_input=new String[input.length()];
		String bag = "";
//		int j = 0;
		for(int i=input.length()-1; i>=0; i--) {
//			new_input[j]=input2[i];
			bag=bag+input2[i];
//			j++;
		}
//		return Arrays.toString(new_input);
		return bag;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to reverse");
		String orignalString = sc.next();
		String result = reversString(orignalString);
		System.out.println("Original String is :"+ orignalString);
		System.out.println("Reversed String is :"+ result);
	}
}


