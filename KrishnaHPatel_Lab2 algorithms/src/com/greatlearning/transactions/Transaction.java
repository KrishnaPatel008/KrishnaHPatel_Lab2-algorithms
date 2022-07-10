package com.greatlearning.transactions;

import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) throws Exception
	{

		System.out.println("Enter the size of Transaction Array");
		
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		
		int array[]=new int[size];
		
		System.out.println("Enter the values of Array");
		
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int target=sc.nextInt();
		

		while(target-- !=0)
		{
			int flag = 0;
			long target_value;
				
			System.out.println("Enter the value of target");
			target_value=sc.nextInt();
				
			long sum=0;
					
			for(int i=0;i<size;i++)
			{
				sum = sum + array[i];
					
				if(sum >= target_value)
				{
					System.out.println("Target achieved after " +(i+1) +" Transaction");
						
					flag = 1;
					break;
				}
			}
			
			if(flag == 0)
			{
				System.err.println("Given Target is not achieved");
			}
			}
			sc.close();
		}

	}


