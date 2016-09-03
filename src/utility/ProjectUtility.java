package utility;

public class ProjectUtility {

	public static double[] fillWithRandomGrades(double[] grades, int upperBound) {
		for(int i = 0; i < grades.length; i++) {
			grades[i] = (Math.random() * upperBound);
		}
		return grades;
	}

	public static double[] fillWithFullGrades(double[] grades, int upperBound) {
		for(int i = 0; i < grades.length; i++) {
			grades[i] = upperBound;
		}
		return grades;
	}
	
	

}
