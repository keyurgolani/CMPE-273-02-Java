package utility;

import java.sql.Timestamp;
import java.util.Date;

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
	
	public static Timestamp getTimeStamp() {
		return new Timestamp(new Date().getTime());
	}

}
