package utility;

import assignment1.arrays.StudentGrades;

public class ProjectUtility {

	public static double[] fillWithRandomGrades(double[] grades) {
		for(int i = 0; i < grades.length; i++) {
			grades[i] = (Math.random() * 50);
		}
		return grades;
	}
	
	

}
