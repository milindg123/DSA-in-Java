/* Program to demonstrate the Strings declaration

 
 
 	Strings : It is primitive data type
 	
 	Strings are immutable : once the string is created we can not modify, change the strings
 
 
 
 */


package org.ApnaCollege.Strings;

import java.util.Scanner;

public class StringsDeclaration {

	public static void main(String[] args) {
		// String declaration
		
		String name = "Milind";
		String fullName = "Milind Ghegadmal";
		String sentence = "Hello I am Comouter Engineer";
		
		
		//User input String
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		
//		String s1 = sc.next(); //It will print only single word of the string
		
		String s1 = sc.nextLine();
		System.out.println("You enter the string : " + s1);

	}

}
