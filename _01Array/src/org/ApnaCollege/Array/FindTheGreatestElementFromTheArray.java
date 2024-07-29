//  Program to demonstrate for Finding the largest element in a given array

package org.ApnaCollege.Array;

public class FindTheGreatestElementFromTheArray {
	public static int maxElement(int arr[]) {
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[] = {2,5,7,8,9,35};
		
		int largest = maxElement(arr);
		System.out.println("Largest element is :" + largest);

	}

}
