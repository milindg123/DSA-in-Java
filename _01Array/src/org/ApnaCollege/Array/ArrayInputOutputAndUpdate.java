package org.ApnaCollege.Array;

import java.util.Scanner;

public class ArrayInputOutputAndUpdate {

	public static void main(String[] args) {
		
		// creation of array
		int marks[] = new int[3];
		
//		-------------------------------------------------------------------------------------
		
		// Array Input
		marks[0] = 90;
		marks[1] = 85;
		marks[2] = 80;
		
//		----------------------------------------------------------------------------------------
		
//		System.out.println(marks);  // output : Garbage value
		
//		----------------------------------------------------------------------------------------------------
		//Array Output
//		System.out.println(marks[0]); //90
//		System.out.println(marks[1]); //85
//		System.out.println(marks[2]); //80
		
//		------------------------------------------------------------------------------------------------------
		
		//For doing a single statement for every element of the array is not possible 
//		therefore we directly print the array by using for loop
		
		//Loop for array output
		for(int i=0; i<3; i++) {
			System.out.println(marks[i]);
		}
		
		
//		*********************************************************************************************************************-
		
		System.out.println("Program from taken array elements as user input");
			Scanner sc = new Scanner(System.in);
			
			//Array input
			System.out.println("Enter the size of the array");
			int size = sc.nextInt();
			
			int numbers[] = new int[size];
			for(int i=0; i<size; i++) {
				numbers[i] = sc.nextInt();
			}
			
			
			//Array output
			System.out.println("The array output is : ");
			for(int i=0; i<size; i++) {
				System.out.println(numbers[i]);
			}
		

	}

}
