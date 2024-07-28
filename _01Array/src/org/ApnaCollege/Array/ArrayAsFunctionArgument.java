// Program to demonstrate the Arrays as Function Argument

//In this program update function is create and the array is passed as reference
// We can passed array as pass by reference in a main method
package org.ApnaCollege.Array;

public class ArrayAsFunctionArgument {
	
	public static void update(int marks[], int nonChangeable) { // Array as argument
		//here update the nonChangeable variable
		nonChangeable = 10;
		
		for(int i=0; i<marks.length; i++) {
			marks[i] = marks[i] + 1; //update marks by 1
		}
	}

	public static void main(String[] args) {
		int marks[] = {97, 98, 99}; //array creation
		int nonChangeable = 5;
		
		update(marks, nonChangeable); // function calling
		
		System.out.println(nonChangeable); // here print the nonChangeable variable but it will not change their value
		
		// print our marks
		for(int i=0; i<marks.length; i++) {
			System.out.println(marks[i] + " ");
		}
		System.out.println();
	}

}


