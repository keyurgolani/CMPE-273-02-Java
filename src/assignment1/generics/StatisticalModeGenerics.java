package assignment1.generics;

import java.util.HashMap;

import utility.StudentSample;

public class StatisticalModeGenerics {
	
	public static <E> E getMode(E[] genericArray) {
		HashMap<E, Integer> occuranceCounts = new HashMap<E, Integer>();
		int max = 1;
		E temp = genericArray[0];
		for (int i = 0; i < genericArray.length; i++) {
			if (occuranceCounts.get(genericArray[i]) != null) {
				int count = occuranceCounts.get(genericArray[i]);
				occuranceCounts.put(genericArray[i], ++count);
				if (count > max) {
					max = count;
					temp = genericArray[i];
				}
			} else {
				occuranceCounts.put(genericArray[i], 1);
			}
		}
		return temp;
	}
	
	public static void main(String[] args) {
		/*
		 * Topic: Generics in Java
		 * Problem: You want to define a function to find statistical mode of
		 * 		the given data values or collection of objects. Here the type
		 * 		of data doesn't matter and finding the mode would be the same
		 * 		procedure regardless the type of data in collection. Here, we
		 * 		don't want to define multiple functions for statistical mode
		 * 		for different data types and want a generic function that will
		 * 		work for any data type.
		 * Solution: Defining a method using Generics in Java defines a generic
		 * 		dummy data type in the function that treated as a valid data type
		 * 		while compiling the code and is binded to an existing data type
		 * 		while executing the code according to the data type of the argument
		 * 		it encounters.
		 */
		
		StudentSample student1 = new StudentSample("Keyur Golani", "010808525", "CMPE");
		StudentSample student2 = new StudentSample("Kalgi Bhatt", "01083758", "CMPE");
		StudentSample student3 = new StudentSample("Ved Vasavada", "010838933", "CMPE");
		StudentSample student4 = new StudentSample("Hardik Shah", "010832849", "CMPE");
		StudentSample[] intArray = {student1, student2, student1, student3, student4, student1,student2, student4, student2};
		StudentSample modeResult = StatisticalModeGenerics.getMode(intArray);
		System.out.println("---Mode---");
		System.out.println(modeResult);
	}

}
