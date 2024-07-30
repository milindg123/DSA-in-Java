/* Program to demonstrate the functions on the strings
 
  Functions on strings:
  
  1) Concatenation : Addition of two Strings
  2) Length() : used for to calculate the length of the strings
  3) charAt() : for printing the each of the character of the strings
  4) .compareTo() : For compare the two strings
 
 */

package org.ApnaCollege.Strings;

public class FunctionsOnStrings {

	public static void main(String[] args) {
		// Concatenation
		String firstName = "Pankaj";
		String lastName = "Ubale";
		String fullName = firstName + " "+ lastName;
		System.out.println(fullName);
		
		// length() function
		System.out.println(fullName.length());
		
		
		// charAt()
		for(int i=0; i<fullName.length(); i++) {
			System.out.println(fullName.charAt(i));
		}
		
		
		// .compareTo() --> it will return the +ve value
		String name1 = "Milind";
		String name2 = "Milind2";
		// case 3
//		1) s1 > s2  : return +ve value   //in Strings alphabetical order decide string is greater or not for ex. b>a   
//		2) s1 == s2 : return 0
//		3) s1 < s2  : return -ve value
		
		if(name1.compareTo(name2) == 0) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}

//		In some cases (==) will not 
		if(name1 == name2) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are not equal");
		}

	}

}
