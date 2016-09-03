package assignment1.arrays;

public class StudentGradesArray {
	
	private double[] grades;
	
	public double[] getGrades() {
		return grades;
	}

	public void setGrades(double[] grades) {
		this.grades = grades;
	}

	public StudentGradesArray() {
		grades = new double[10];
	}
	
	public StudentGradesArray(int classSize) {
		grades = new double[classSize];
	}
	
	public StudentGradesArray(double[] grades) {
		this.grades = grades;
	}
	
	public double getMeanGrade() {
		double totalGrade = 0;
		for (int i = 0; i < grades.length; i++) {
			totalGrade += grades[i];
		}
		
		return grades.length == 0 ? 0 : totalGrade/(double)grades.length;
	}
	
	public double getGrade(int studentNo) {
		double returnValue = 0;
		if(studentNo > 0) {
			if(studentNo <= grades.length) {
				returnValue = grades[studentNo - 1];
			}
		}
		return returnValue;
	}
	
	public void addGrade(int studentNo, double grade) {
		if(studentNo > 0) {
			if(studentNo <= grades.length) {
				grades[studentNo - 1] = grade;
			}
		}
	}

}
