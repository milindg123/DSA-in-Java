package org.ApnaCollege.Strings;

public class SubstringsOfStrings {

	public static void main(String[] args) {
		//compare
		
		String sentence = "My name is Pankaj";
//		substring(beg index, end index);
		
		String name = sentence.substring(11, sentence.length());
		System.out.println(name); //Pankaj
		
		String name2 = sentence.substring(11);
		System.out.println(name2); //Pankaj
		
		String name3 = sentence.substring(0, sentence.length());
		System.out.println(name3); //My name is Panakj
		
		String name4 = sentence.substring(0, 11);
		System.out.println(name4); // My name is

	}

}
