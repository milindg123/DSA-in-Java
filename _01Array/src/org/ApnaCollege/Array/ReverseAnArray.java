// Question : Reverse an Array

package org.ApnaCollege.Array;

public class ReverseAnArray {
	public static void reverse(int arr[]) {
		int first =0, last = arr.length-1;
		
		while(first < last) {
			// swap
			int temp = arr[last];
			arr[last] = arr[first];
			arr[first] = temp;
			
			
			first++;  //front side of the array should be increased
			last--;   // from the n=back side of the array should decreased
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {2,4,6,7,9};
		
		reverse(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();


	}

}
