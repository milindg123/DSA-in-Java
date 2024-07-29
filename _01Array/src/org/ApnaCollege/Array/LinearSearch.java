// Linear search Algorithm : Find the index of element in a given array

package org.ApnaCollege.Array;

public class LinearSearch {
	public static int LinearSearch(int numbers[], int key) {
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i] == key) { // Here key is nothing but the elements that we have to found
				return i;   
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int numbers[] = {1, 30, 45, 36, 79 ,50};
		int key = 36;
		
		int index = LinearSearch(numbers, key);
		
		if(index == -1) {
			System.out.println("key elements not found");
		}
		else {
			System.out.println("key elements found at index: " + index);
		}

	}

}
