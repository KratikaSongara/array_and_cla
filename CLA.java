package com.masai;

public class CLA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==1)
		{
			int prod = 1;
			int num = Integer.parseInt(args[0]);
			for(int i=1; i<=num; i++)
			{
				prod = prod*i;
			}
			System.out.println(prod);
		}
		
		else if(args.length==2)
		{
			int abs_diff;
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			abs_diff = Math.abs(num1-num2);
			
			int prod = 1;
			for(int j=1; j<=abs_diff; j++)
			{
				prod = prod*j;
			}
			System.out.println(abs_diff+"!");
		}
		
		else if(args.length>=3)
		{
			System.out.println("Error");
		}
	}
	
}
