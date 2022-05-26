package com.masai;

import java.util.Arrays;

public class EvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][3];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		for(int i=0; i<arr.length; i++)
		{
			int sum = 0;
			for(int j=0; j<arr[i].length; j++)
			{
				if(arr[j][i]%2==0)
				{
					sum = sum + arr[j][i];
				}
			}
			System.out.println(sum);
		}
	}

}
